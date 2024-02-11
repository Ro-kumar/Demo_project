package com.techvista.demoapps.Activity.maps;

import static com.techvista.demoapps.Activity.maps.LocationActivityNew.autocomplete;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;


import com.techvista.demoapps.Activity.MainActivity;
import com.techvista.demoapps.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocationActivityNew extends AppCompatActivity {
    ListView list_view;
    String intent_type;
    ImageView back;
    public static ArrayList<String> listLocation;
    LinearLayout loc_visible;
    TextView saved_location;
    String locationIntent;
    LinearLayout current_location;
    EditText autocomplete_location;
    private static final String PLACES_API_BASE = "https://maps.googleapis.com/maps/api/place";
    private static final String TYPE_AUTOCOMPLETE = "/autocomplete";
    private static final String OUT_JSON = "/json";
    //private static final String API_KEY = "AIzaSyDlOKb0OWi2BleDAKMVaISDoE0O5y805rY";
    private static final String API_KEY = "AIzaSyAS6_Ij7aKRcpHn2Hg3PgDzW6u67zlR8S8";
    GooglePlacesAutocompleteAdapter dataAdapter;
    UserDetails userDetails;
    public static PF300kfjs3 profsession;
    String strlat = "", strlong = "", strfinaladdress = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(
                R.layout.autocomplete_location);

        locationIntent = getIntent().getStringExtra("Address");


        profsession = new PF300kfjs3(this);
        userDetails = new UserDetails(getApplicationContext());
        // getSupportActionBar().hide();
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        listLocation = new ArrayList<String>();
        autocomplete_location = (EditText) findViewById(R.id.edit_location);
        back = (ImageView) findViewById(R.id.back);
        saved_location = (TextView) findViewById(R.id.saved_location);
        current_location = findViewById(R.id.current_location);
        loc_visible = (LinearLayout) findViewById(R.id.loc_visible);
        list_view = (ListView) findViewById(R.id.list_view);
        loc_visible.setVisibility(View.VISIBLE);
        list_view.setVisibility(View.INVISIBLE);
        if (profsession.GetSharedPreferences(PF300kfjs3.KEY_selected_address).equalsIgnoreCase("")) {
            saved_location.setVisibility(View.GONE);
        } else {
            saved_location.setVisibility(View.VISIBLE);
            saved_location.setText(profsession.GetSharedPreferences(PF300kfjs3.KEY_selected_address));
        }
        dataAdapter = new GooglePlacesAutocompleteAdapter(LocationActivityNew.this, R.layout.location_text_row);
        list_view.setAdapter(dataAdapter);
        list_view.setTextFilterEnabled(true);
        list_view.setOnItemClickListener(auto_complte_clik);
        current_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("Latitude", "CurrentLocation");
                returnIntent.putExtra("Longitude", "CurrentLocation");
                returnIntent.putExtra("Address", "CurrentLocation");
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

                Intent intent = new Intent(LocationActivityNew.this, Activity_Map2.class);
                Bundle extra = new Bundle();
                extra.putString("Latitude", "CurrentLocation");
                extra.putString("Longitude", "CurrentLocation");
                extra.putString("Address", "CurrentLocation");
                intent.putExtras(extra);
                startActivity(intent);

            }
        });
        saved_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        autocomplete_location.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                dataAdapter.getFilter().filter(s.toString());
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activity_Map2.class);
                i.putExtra("Address", "CurrentLocation");
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }

    AdapterView.OnItemClickListener auto_complte_clik = new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //  Toast.makeText(getApplicationContext(), "Click", Toast.LENGTH_SHORT).show();
            String address = (String) parent.getItemAtPosition(position);
            getLatitudeLongitude(address);
        }

    };

    public void getLatitudeLongitude(String address) {
        double longitude = 0;
        double latitude = 0;
        Geocoder coder = new Geocoder(LocationActivityNew.this);
        try {
            ArrayList<Address> adresses = (ArrayList<Address>) coder.getFromLocationName(address, 1);
            for (Address add : adresses) {
                if (add != null) {
                    longitude = add.getLongitude();
                    latitude = add.getLatitude();
                    Log.d("LATLONG", latitude + "--" + longitude);
                } else {
                    Log.d("LATLONG", latitude + "" + longitude);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (longitude != 0 || latitude != 0) {
            Intent returnIntent = new Intent();
            returnIntent.putExtra("Latitude", "" + latitude);
            returnIntent.putExtra("Longitude", "" + longitude);
            returnIntent.putExtra("Address", address);
            setResult(Activity.RESULT_OK, returnIntent);
//------------------------
            String zip_code = "";
            Geocoder geocoder = new Geocoder(getApplicationContext(), Locale.getDefault());
            try {
                List<Address> listAddresses = geocoder.getFromLocation(latitude, longitude, 1);
                if (null != listAddresses && listAddresses.size() > 0) {
                    zip_code = listAddresses.get(0).getPostalCode();
                    // zipcode = zip_code;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


            strlat = latitude + "";
            strlong = longitude + "";
            strfinaladdress = address;
//
//            if(Helper.locationfrom.equalsIgnoreCase("splash")){
//

            profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_latitude, strlat);
            profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_longitute, strlong);
            profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_address, strfinaladdress);
//
//            if (Helper.locationfrom.equalsIgnoreCase("MapAct")) {
//                if (profsession.GetSharedPreferences(PF300kfjs3.isfrom_locne).equalsIgnoreCase("MapAct")) {

//                        HomeFragment.lat = strlat;
//                        HomeFragment.longs = strlong;
//                        HomeFragment.strcompleteaddress = strfinaladdress;

                    profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_latitude, strlat);
                    profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_longitute, strlong);
                    profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_address, strfinaladdress);


//                    if (locationIntent.equals("searchlocation")) {
//                        Intent intent = new Intent(getApplicationContext(), LocationAlertActivity.class);
//                        intent.putExtra("Auth", "splase");
//                        startActivity(intent);
//                        LocationAlertActivity.activity.finish();
//
//
//                    } else if (locationIntent.equals("chefdtails")){
//                        Intent intent = new Intent(getApplicationContext(), ChefDetailsActivity.class);
//                        intent.putExtra("Auth", "chefdetails");
//                        startActivity(intent);
//                        MainActivity.activity.finish();
                    } else {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.putExtra("Auth", "login");
                        startActivity(intent);
//                        MainActivity.activity.finish();
                    }


//                        MapActivity.activity.lat=strlat;
//                        MapActivity.strgpslong=strlong;
//                        MapActivity.strfinalgpsaddress=strfinaladdress;

//                }
//
//            } else {
//                String locationfrom = Helper.locationfrom;
//            }



    }

    public static ArrayList autocomplete(String input) {
        ArrayList resultList = null;
        StringBuilder sb = new StringBuilder(PLACES_API_BASE + TYPE_AUTOCOMPLETE + OUT_JSON);

        //AIzaSyCg8EXVdaRIvpSnPB-6vG3LeARsjUvBuzM
        sb.append("?key=" + "AIzaSyDTAyrOge4-B9kR32N5dfAQoNBJrD5bUeg");
        //      sb.append("&components=country:ar");
        try {
            sb.append("&input=" + URLEncoder.encode(input, "utf8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        HttpHandler sh = new HttpHandler();
        try {
            String json = sh.makeServiceCall(sb.toString());
            final String responsex = new String(json);
            Log.d("Amnn", responsex);
            JSONObject jsonObject = new JSONObject(responsex);
            JSONArray predsJsonArray = jsonObject.getJSONArray("predictions");
            resultList = new ArrayList(predsJsonArray.length());
            for (int i = 0; i < predsJsonArray.length(); i++) {
                resultList.add(predsJsonArray.getJSONObject(i).getString("description"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    @Override
    public void onBackPressed() {


        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(), Activity_Map2.class);
        i.putExtra("Address", "CurrentLocation");
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

    class GooglePlacesAutocompleteAdapter extends ArrayAdapter implements Filterable {
        private ArrayList<String> resultList;

        public GooglePlacesAutocompleteAdapter(Context context, int textViewResourceId) {
            super(context, textViewResourceId);
            resultList = new ArrayList<String>();
        }

        @Override
        public int getCount() {
            if (resultList != null)
                return resultList.size();
            else
                return 0;
        }

        @Override
        public String getItem(int index) {
            return resultList.get(index).toString();
        }

        @Override
        public Filter getFilter() {
            Filter filter = new Filter() {
                @Override
                protected FilterResults performFiltering(CharSequence constraint) {
                    FilterResults filterResults = new FilterResults();
                    if (constraint != null) {
                        resultList = autocomplete(constraint.toString());
                        filterResults.values = resultList;
                        filterResults.count = resultList.size();
                    }
                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {
                    if (results != null && results.count > 0) {
                        loc_visible.setVisibility(View.INVISIBLE);
                        list_view.setVisibility(View.INVISIBLE);
                        notifyDataSetChanged();
                    } else {
                        notifyDataSetInvalidated();
                    }
                }
            };
            return filter;
        }
    }
}



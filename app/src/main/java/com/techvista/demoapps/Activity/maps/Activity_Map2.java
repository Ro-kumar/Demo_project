package com.techvista.demoapps.Activity.maps;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Html;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputEditText;
import com.techvista.demoapps.Activity.MainActivity;
import com.techvista.demoapps.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Activity_Map2 extends AppCompatActivity implements View.OnClickListener, OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener, MapWrapperLayout.OnDragListener {
    public static Activity_Map2 exc;
    String lat;
    String lngit;
    private GoogleMap mMap;
    LocationRequest mLocationRequest;
    GoogleApiClient mGoogleApiClient;
    //  me.zhanghai.android.materialprogressbar.MaterialProgressBar progressReview;
    CustomMapFragment mapFragment;
    // TextView txtlocal,txtoutstation;
    public static String zipcode;
    // EditText drop;
    String chipType = "";
    String addressId = "";
    TextInputEditText complete_address;
    TextInputEditText fooler_opstionl;
    TextInputEditText nearby;
    MaterialButton btn_sign_up;
    DisplayMetrics displayMetrics;
    //RelativeLayout bottom_sheet;
//    Double latit = 26.875136311860395, longit = 81.00289113500979;
    Double latit = 0.0, longit = 0.0;
    // Double latit=0.0, longit=0.0;
    LinearLayout linearlayout;
    String locationIntent;
    // ImageView imgmeanu;
    int isloadfirst = 0;
    String strlat = "", strlong = "";
    Button save_process;
    String extra_address;
    String AddressValue = "";
    String intent_type;
    private GoogleMap.OnCameraIdleListener onCameraIdleListener;
    private static final int REQUEST_CODE = 999;
    private View mMarkerParentView;
    private ImageView mMarkerImageView;
    private int imageParentWidth = -1;
    private int imageParentHeight = -1;
    private int imageHeight = -1;
    private int centerX = -1;
    private int centerY = -1;
    UserDetails userDetails;
    PF300kfjs3 profsession;
    TrackGPS gps;
    //RelativeLayout icbooking,ictab,rlals,rlbls,rlgpt,rlmortury,rlfeeze,rlbike,rlair,rlmedicab,rlactiva;
    View mapView;
    RelativeLayout rlbikeoval, rlcabairoval, rlalsoval, rlblsoval;
    //Button btnbooknow;
    LinearLayout lnmybooking;
    ImageView imgdashboard;
    RelativeLayout rlsearch;
    TextInputEditText etsearch;
    TextView txtaddyouraddress;

    MaterialButton txtusethislocation;
    public static TextView txtaddressnew;
    LinearLayout lnbottomloc;

    public static String strfinaladdress = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userDetails = new UserDetails(getApplicationContext());
        setContentView(R.layout.activity__map2);

        locationIntent = getIntent().getStringExtra("location");

        profsession = new PF300kfjs3(this);

        profsession.SetSharedPreferences(PF300kfjs3.isfrom_locnew, "map2");
        // imgmeanu = (ImageView) findViewById(R.id.imgmeanu);
        ImageView ic_back = findViewById(R.id.back);
        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        rlsearch = (RelativeLayout) findViewById(R.id.rlsearch);
        lnbottomloc = (LinearLayout) findViewById(R.id.lnbottomloc);
        etsearch = findViewById(R.id.etsearch);
        txtaddyouraddress = (TextView) findViewById(R.id.txtaddyouraddress);
        txtaddressnew = (TextView) findViewById(R.id.txtaddressnew);
        txtusethislocation = findViewById(R.id.txtusethislocation);

        /*txtaddyouraddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                profsession.SetSharedPreferences(PF300kfjs3.KEY_selectedaddress,strfinaladdress);
                Intent i=new Intent(Activity_Map2.this,Activity_Add_New_Address.class);
                startActivity(i);
                finish();
            }
        });
*/
        txtusethislocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_latitude, strlat);
                profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_longitute, strlong);
                profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_address, strfinaladdress);

                // addaddress
//                if (Helper.locationfrom.equalsIgnoreCase("MapAct")) {
//                    if (profsession.GetSharedPreferences(PF300kfjs3.isfrom_locne).equalsIgnoreCase("MapAct")) {

                        profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_latitude, strlat);
                        profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_longitute, strlong);
                        profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_address, strfinaladdress);

                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                        MainActivity.activity.finish();


//                    }
//
//                } else {
//                    String locationfrom = Helper.locationfrom;
//
//                    Toast.makeText(getApplicationContext(), "" + locationfrom, Toast.LENGTH_SHORT).show();
//                }


            }
        });

        exc = this;
        gps = new TrackGPS(this);
        profsession = new PF300kfjs3(this);
//        extra_address = getIntent().getExtras().getString("Address");

        displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        initViews();
        initListeners();
        //     progressReview.setVisibility(View.VISIBLE);
//        linearlayout = (LinearLayout) findViewById(R.id.linearlayout);

        txtaddressnew.setText("Identifying Location...");
        mapFragment = (CustomMapFragment) getFragmentManager().findFragmentById(R.id.map1);
        mapFragment.getMapAsync(Activity_Map2.this);
        mapView = mapFragment.getView();
        configureCameraIdle();

        ;
        etsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Map2.this, LocationActivityNew.class);
//                intent.putExtra("Address", extra_address);
                startActivityForResult(intent, 201);
                finish();
            }
        });


    }

    private void configureCameraIdle() {
        onCameraIdleListener = new GoogleMap.OnCameraIdleListener() {
            @Override
            public void onCameraIdle() {

                LatLng latLng = mMap.getCameraPosition().target;
                Geocoder geocoder = new Geocoder(Activity_Map2.this);

                try {
                    List<Address> addressList = geocoder.getFromLocation(latLng.latitude, latLng.longitude, 1);
                    if (addressList != null && addressList.size() > 0) {
                        String locality = addressList.get(0).getAddressLine(0);
                        String country = addressList.get(0).getCountryName();
                        if (!locality.isEmpty() && !country.isEmpty())
                            System.out.println(locality + " AAAAAAAA  " + country);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        };
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);

        imageParentWidth = mMarkerParentView.getWidth();
        imageParentHeight = mMarkerParentView.getHeight();
        imageHeight = mMarkerImageView.getHeight();
        centerX = imageParentWidth / 2;
        centerY = (imageParentHeight / 2) + (imageHeight / 2);
    }

    @Override
    public void onDrag(MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
            Projection projection = (mMap != null && mMap.getProjection() != null) ? mMap.getProjection()
                    : null;
            //
            if (projection != null) {
                LatLng centerLatLng = projection.fromScreenLocation(new Point(
                        centerX, centerY));
                updateLocation(centerLatLng);


            }
        }
    }

    private void updateLocation(LatLng centerLatLng) {
        if (centerLatLng != null) {
            Geocoder geocoder = new Geocoder(Activity_Map2.this,
                    Locale.getDefault());

            List<Address> addresses = new ArrayList<Address>();
            try {
                addresses = geocoder.getFromLocation(centerLatLng.latitude,
                        centerLatLng.longitude, 1);
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (addresses != null && addresses.size() > 0) {

                String addressIndex0 = (addresses.get(0).getAddressLine(0) != null) ? addresses
                        .get(0).getAddressLine(0) : null;
                String addressIndex1 = (addresses.get(0).getAddressLine(1) != null) ? addresses
                        .get(0).getAddressLine(1) : null;
                String addressIndex2 = (addresses.get(0).getAddressLine(2) != null) ? addresses
                        .get(0).getAddressLine(2) : null;
                String addressIndex3 = (addresses.get(0).getAddressLine(3) != null) ? addresses
                        .get(0).getAddressLine(3) : null;

                String completeAddress = addressIndex0 + "," + addressIndex1;

                if (addressIndex2 != null) {
                    completeAddress += "," + addressIndex2;
                }
                if (addressIndex3 != null) {
                    completeAddress += "," + addressIndex3;
                }
                if (completeAddress != null) {
                    txtaddressnew.setText(completeAddress);
                    strfinaladdress = completeAddress;
                    setAddress(centerLatLng.latitude, centerLatLng.longitude);
                    userDetails.setLatitude("" + centerLatLng.latitude);
                    userDetails.setLongitude("" + centerLatLng.longitude);
                    System.out.println("Animesh GGGG " + centerLatLng.latitude + " -- " + centerLatLng.longitude);
                }
            }
        }
    }


    private void initViews() {

        mMarkerParentView = findViewById(R.id.marker_view_incl);
        mMarkerImageView = (ImageView) findViewById(R.id.marker_icon_view);
        //  mMarkerParentView.getLayoutParams().height = (int) (displayMetrics.heightPixels / 1.7);
    }

    private void getdefaultloca(double latitude, double longitude) {
        CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(latitude, longitude));
        CameraUpdate zoom = CameraUpdateFactory.zoomTo(15);
        mMap.moveCamera(center);
        mMap.animateCamera(zoom);
                      /*  MarkerOptions marker = new MarkerOptions().position(new LatLng(location.latitude, location.longitude)).title("Mark");
                        mMap.addMarker(marker);*/
        setAddress(latitude, longitude);
        getLoc();
    }

    private void getLoc() {
        SingleShotLocationProvider.requestSingleUpdate(getApplicationContext(),
                new SingleShotLocationProvider.LocationCallback() {
                    @Override
                    public void onNewLocationAvailable(SingleShotLocationProvider.GPSCoordinates location) {
                        Log.d("Location", "my location is " + location.latitude);
                        lat = "" + location.latitude;
                        lngit = "" + location.longitude;
                        latit = (double) location.latitude;
                        longit = (double) location.longitude;
                        userDetails.setLatitude("" + latit);
                        userDetails.setLongitude("" + longit);
                        CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(location.latitude, location.longitude));
                        CameraUpdate zoom = CameraUpdateFactory.zoomTo(15);
                        mMap.moveCamera(center);
                        mMap.animateCamera(zoom);
                      /*  MarkerOptions marker = new MarkerOptions().position(new LatLng(location.latitude, location.longitude)).title("Mark");
                        mMap.addMarker(marker);*/
                        setAddress((double) location.latitude, (double) location.longitude);
                        Log.e("WERS", lat + "," + lngit);
                    }
                });

    }


    public void getZipCode(Double Latitude, Double Longitude) {
        Geocoder geocoder = new Geocoder(getApplicationContext(), Locale.getDefault());
        try {
            List<Address> listAddresses = geocoder.getFromLocation(Latitude, Longitude, 1);
            if (null != listAddresses && listAddresses.size() > 0) {
                String zip_code = listAddresses.get(0).getPostalCode();
                zipcode = zip_code;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static boolean isLocationEnabled(Context context) {
        int locationMode = 0;
        String locationProviders;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            try {
                locationMode = Settings.Secure.getInt(context.getContentResolver(), Settings.Secure.LOCATION_MODE);

            } catch (Settings.SettingNotFoundException e) {
                e.printStackTrace();
                return false;
            }

            return locationMode != Settings.Secure.LOCATION_MODE_OFF;

        } else {
            locationProviders = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
            return !TextUtils.isEmpty(locationProviders);
        }


    }

    public void setAddress(Double Latitude, Double Longitude) {
        Geocoder geocoder = new Geocoder(getApplicationContext(), Locale.getDefault());
        latit = Latitude;
        longit = Longitude;
        //  Toast.makeText(getApplicationContext(), "" + Latitude + "---" + Longitude, Toast.LENGTH_SHORT).show();
        try {
            List<Address> listAddresses = geocoder.getFromLocation(Latitude, Longitude, 1);
            if (null != listAddresses && listAddresses.size() > 0) {
                String state = listAddresses.get(0).getAdminArea();
                String zip_code = listAddresses.get(0).getPostalCode();
                String locality = listAddresses.get(0).getLocality();
                String subLocality = listAddresses.get(0).getSubLocality();
                String addressLine = listAddresses.get(0).getAddressLine(0);
                if (addressLine != null) {

                    Log.e("addresslinegggg", "" + addressLine + ", " + subLocality + ", " + locality + "," + state + "," + zip_code);

                    strfinaladdress = "" + subLocality + ", " + locality + ", " + state + ", " + zip_code;
                    txtaddressnew.setText("" + addressLine + ", " + subLocality + ", " + locality + ", " + state + ", " + zip_code);

                    profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_pincode, zip_code);
                    strlat = Latitude + "";
                    strlong = Longitude + "";

                } else {
                    strfinaladdress = "" + subLocality + ", " + locality + ", " + state + ", " + zip_code;
                    txtaddressnew.setText(subLocality + ", " + locality + ", " + state + ", " + zip_code);

                    profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_pincode, zip_code);
                    strlat = Latitude + "";
                    strlong = Longitude + "";


                }
                userDetails.setCity(subLocality);
                zipcode = zip_code;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initListeners() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.getUiSettings().setZoomControlsEnabled(false);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);

        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setRotateGesturesEnabled(true);
        mMap.setIndoorEnabled(true);
        mMap.setBuildingsEnabled(false);
        mMap.getUiSettings().setZoomGesturesEnabled(true);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED) {
                buildGoogleApiClient();
                mMap.setMyLocationEnabled(true);

                View locationButton = ((View) mapView.findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2"));
                // and next place it, on bottom right (as Google Maps app)
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)
                        locationButton.getLayoutParams();
                // position on right bottom
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, 0);
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
                layoutParams.setMargins(0, 0, 30, 400);

            }
        } else {
            buildGoogleApiClient();
            mMap.setMyLocationEnabled(true);

            View locationButton = ((View) mapView.findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2"));
            // and next place it, on bottom right (as Google Maps app)
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)
                    locationButton.getLayoutParams();
            // position on right bottom
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, 0);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
            layoutParams.setMargins(0, 0, 30, 400);

        }


//        if (!extra_address.equalsIgnoreCase("CurrentLocation")) {
        CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(latit, longit));
        CameraUpdate zoom = CameraUpdateFactory.zoomTo(16);
        mMap.moveCamera(center);
        mMap.animateCamera(zoom);
//        } else if (!extra_address.equalsIgnoreCase("searchlocation")) {
//            CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(latit, longit));
//            CameraUpdate zoom = CameraUpdateFactory.zoomTo(16);
//            mMap.moveCamera(center);
//            mMap.animateCamera(zoom);
//        }
        mapFragment.setOnDragListener((MapWrapperLayout.OnDragListener) Activity_Map2.this);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {
                showRationale(Activity_Map2.this);
            } else {

                if (isLocationEnabled(Activity_Map2.this)) {
                    getLoc();
                } else {
                    gps.showSettingsAlert();
                }
                // do request the permission
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 8);
            }
        } else {
            getdefaultloca(0, 0);
        }
    }

    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
        mGoogleApiClient.connect();
    }


//    @RequiresApi(api = Build.VERSION_CODES.S)
//    @Override
//    public void onConnected(@Nullable Bundle bundle) {
//        mLocationRequest = new LocationRequest();
//        mLocationRequest.setInterval(1000);
//        mLocationRequest.setFastestInterval(1000);
//        mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
//        if (ContextCompat.checkSelfPermission(this,
//                Manifest.permission.ACCESS_FINE_LOCATION)
//                == PackageManager.PERMISSION_GRANTED) {
//            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
//        }
//    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }


    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    protected void onResume() {
        super.onResume();

        if (isloadfirst != 0) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                        Manifest.permission.ACCESS_FINE_LOCATION)) {
                    showRationale(Activity_Map2.this);
                } else {

                    if (isLocationEnabled(Activity_Map2.this)) {
                        getLoc();
                    } else {
                        gps.showSettingsAlert();
                    }
                    // do request the permission
                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 8);
                }
            }

        } else {
            isloadfirst++;
        }

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.d("CODE", resultCode + "<<");

        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 201: {
                if (resultCode == RESULT_OK) {
                    String latitudes = data.getStringExtra("Latitude");
                    if (latitudes.equalsIgnoreCase("CurrentLocation")) {
                        getLoc();
                    } else {
                        latit = (Double.parseDouble(data.getStringExtra("Latitude")));
                        longit = (Double.parseDouble(data.getStringExtra("Longitude")));
                        userDetails.setLatitude("" + latit);
                        userDetails.setLongitude("" + longit);
                        getZipCode(latit, longit);
                        String zip_code = "";
                        Geocoder geocoder = new Geocoder(getApplicationContext(), Locale.getDefault());
                        try {
                            List<Address> listAddresses = geocoder.getFromLocation(latit, longit, 1);
                            if (null != listAddresses && listAddresses.size() > 0) {
                                zip_code = listAddresses.get(0).getPostalCode();
                                // zipcode = zip_code;
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        strfinaladdress = data.getStringExtra("Address");
                        txtaddressnew.setText(data.getStringExtra("Address"));

                        profsession.SetSharedPreferences(PF300kfjs3.KEY_selected_pincode, zip_code);

                        strlat = latit + "";
                        strlong = longit + "";

                        CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(latit, longit)).zoom(15).bearing(0).tilt(45).build();
                        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                    }

                }
            }

            case 202: {
                if (resultCode == RESULT_OK) {
                    String latitudes = data.getStringExtra("Latitude");
                    if (latitudes.equalsIgnoreCase("CurrentLocation")) {
                        //getLocDrop();
                    } else {
                        latit = (Double.parseDouble(data.getStringExtra("Latitude")));
                        longit = (Double.parseDouble(data.getStringExtra("Longitude")));
                        userDetails.setLatitude("" + latit);
                        userDetails.setLongitude("" + longit);
                        getZipCode(latit, longit);
                        // drop.setText(data.getStringExtra("Address"));
                        CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(latit, longit)).zoom(15).bearing(0).tilt(45).build();
                        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                    }

                }

            }

            break;
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            //Start your code
            getLoc();

        } else {
        }
    }


    private void showRationale(final Activity act) {
        String strDeleteMessage = "Delete successfully";

        final View dialogView = LayoutInflater.from(act).inflate(R.layout.dialog_fragment, null);

        final AlertDialog storageRationaleAlert = new AlertDialog.Builder(act).create();
        storageRationaleAlert.setView(dialogView, 0, 0, 0, 0);
        storageRationaleAlert.setCanceledOnTouchOutside(false);
        TextView mDialogTitle = (TextView) dialogView.findViewById(R.id.dialog_title);
        TextView mDialogDetails = (TextView) dialogView.findViewById(R.id.dialog_details);
        mDialogDetails.setVisibility(View.VISIBLE);
        Button mCancelButton = (Button) dialogView.findViewById(R.id.cancel_btn);
        Button mOkButton = (Button) dialogView.findViewById(R.id.ok_btn);
        mOkButton.setText("Continue");

        mDialogDetails.setText(Html.fromHtml(strDeleteMessage));

        final Activity activity = act;
        mOkButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                storageRationaleAlert.dismiss();
                //Ask for GPS permission
            }
        });

        mCancelButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                storageRationaleAlert.dismiss();
                //Show permission snackbar
            }
        });

        storageRationaleAlert.show();
    }


}


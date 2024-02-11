package com.techvista.demoapps.Activity

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.techvista.demoapps.Activity.maps.Activity_Map2
import com.techvista.demoapps.Activity.maps.Helper
import com.techvista.demoapps.Activity.maps.PF300kfjs3
import com.techvista.demoapps.Adapter.CategoryAdapter
import com.techvista.demoapps.Helper.GetDataService
import com.techvista.demoapps.Helper.RetrofitClintanse
import com.techvista.demoapps.Model.Product
import com.techvista.demoapps.R
import com.techvista.demoapps.databinding.ActivityMainBinding
import dmax.dialog.SpotsDialog
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response
import java.io.IOException

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private lateinit var profSession: PF300kfjs3
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var geocoder: Geocoder
    private val locationPermissionCode = 1


                    val productList: MutableList<Product> = ArrayList()

    companion object {
        lateinit var activity: Activity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        activity = this

        category()


        binding.location.setOnClickListener {
            requestLocationPermission()
        }
        binding.search.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {

                Log.e("kdnlknnl",s.toString())
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                Log.e("kdnlknnl",s.toString())
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                var subTitle=s.toString()
                if (subTitle.length > 5) {

                    val filteredList = productList.filter { it.title == subTitle }

                    categoryFliter(filteredList.toMutableList())


                }


            }
        })




        profSession = PF300kfjs3(applicationContext)
        Helper.locationfrom = "MapAct"
        Activity_Map2.strfinaladdress =
            profSession.GetSharedPreferences(PF300kfjs3.KEY_selected_address)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(applicationContext)
        geocoder = Geocoder(applicationContext)



        if (profSession.GetSharedPreferences(PF300kfjs3.KEY_selected_address).equals("")) {
        } else {
            binding.addressName.text =
                profSession.GetSharedPreferences(PF300kfjs3.KEY_selected_address)
                    .replace("null,", "")
        }


    }


    private fun requestLocationPermission() {
        val permission = Manifest.permission.ACCESS_FINE_LOCATION
        if (ContextCompat.checkSelfPermission(
                this,
                permission
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(permission), locationPermissionCode)
        } else {
//            Toast.makeText(applicationContext, "Permission already granted", Toast.LENGTH_SHORT)
//                .show()
            // Permission already granted
            fetchLastLocation()
        }
    }

    private fun fetchLastLocation() {
//        Toast.makeText(applicationContext, "sfdsd", Toast.LENGTH_SHORT).show()
        val i = Intent(this@MainActivity, Activity_Map2::class.java)
        startActivity(i)
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            fusedLocationClient.lastLocation
                .addOnSuccessListener { location ->
                    if (location != null) {
                        val latitude = location.latitude
                        val longitude = location.longitude

                        try {

                            val addresses: List<Address> =
                                geocoder.getFromLocation(latitude, longitude, 1) as List<Address>
                            if (addresses.isNotEmpty()) {
                                val i = Intent(this@MainActivity, Activity_Map2::class.java)
                                startActivity(i)
//                                Toast.makeText(
//                                    applicationContext,
//                                    "Permission work",
//                                    Toast.LENGTH_SHORT
//                                ).show()
                            } else {
                                // Handle the case when no address is found
                                Toast.makeText(
                                    applicationContext,
                                    "Permission not work",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        } catch (e: IOException) {
                            // Handle the exception

                            Log.e("sdffjk",e.toString())
                            Toast.makeText(
                                applicationContext,
                                "ex_dsfdffd" + e.toString(),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    } else {
                        // Handle the case when location is null
                    }
                }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == locationPermissionCode) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted
                fetchLastLocation()
            } else {
                // Permission denied
                // Handle the case when the user denies the permission
            }
        }
    }


    private fun category() {
//        val productList: MutableList<Product> = ArrayList()
        productList.clear()

        val loadingBar: SpotsDialog = SpotsDialog(this@MainActivity, R.style.Custom)
        loadingBar.setCancelable(false)
        loadingBar.show()
        val getDataService: GetDataService =
            RetrofitClintanse.getInstance()!!.create(GetDataService::class.java)
        val call: Call<JsonObject> =
            getDataService.products()
        call.enqueue(object : retrofit2.Callback<JsonObject> {
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {

                try {
                    Log.e("product_res", response.body().toString())

                    val jsonObject = JSONObject(Gson().toJson(response.body()))

                    if (response.isSuccessful) {
                        val jsonArray = jsonObject.getJSONArray("products")
                        for (i in 0 until jsonArray.length()) {
                            val product: Product = Gson().fromJson(
                                jsonArray.getString(i).toString(),
                                Product::class.java
                            )
                            productList.add(product)
                            var selectedCategory = "laptops"


                        }

                        val adpter8 = CategoryAdapter(
                            applicationContext, productList
                        )
                        val gridLayoutManager8 =
                            GridLayoutManager(applicationContext, 2)
                        binding.categoryRv.layoutManager = gridLayoutManager8
                        binding.categoryRv.setHasFixedSize(true)
                        binding.categoryRv.itemAnimator = DefaultItemAnimator()
                        binding.categoryRv.adapter = adpter8

                    loadingBar.dismiss()
                    }else{
                        loadingBar.dismiss()
                    }

                } catch (e: Exception) {
                    Log.e("product_error", e.toString())
                    loadingBar.dismiss()

                }
            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                loadingBar.dismiss()


            }

        })
    }


    private fun categoryFliter(prdoctlist: MutableList<Product>) {
        val loadingBar: SpotsDialog = SpotsDialog(this@MainActivity, R.style.Custom)
        loadingBar.setCancelable(false)
        loadingBar.show()
        val getDataService: GetDataService =
            RetrofitClintanse.getInstance().create(GetDataService::class.java)
        val call: Call<JsonObject> =
            getDataService.products()
        call.enqueue(object : retrofit2.Callback<JsonObject> {
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {

                try {
                    Log.e("productdd_res", response.body().toString())

                    val jsonObject = JSONObject(Gson().toJson(response.body()))
                    if (response.isSuccessful) {

                        val jsonArray = jsonObject.getJSONArray("products")
                        for (i in 0 until jsonArray.length()) {
                            val product: Product = Gson().fromJson(
                                jsonArray.getString(i).toString(),
                                Product::class.java
                            )
                            prdoctlist.add(product)

                        }
                        binding.categoryRv.visibility=View.GONE

                        val adpter8 = CategoryAdapter(
                            applicationContext, prdoctlist
                        )
                        val gridLayoutManager8 =
                            GridLayoutManager(applicationContext, 2)
                        binding.categorysearchRv.layoutManager = gridLayoutManager8
                        binding.categorysearchRv.setHasFixedSize(true)
                        binding.categorysearchRv.itemAnimator = DefaultItemAnimator()
                        binding.categorysearchRv.adapter = adpter8

                    loadingBar.dismiss()

                    } else {
                        loadingBar.dismiss()
                    }
                } catch (e: Exception) {
                    Log.e("product_error", e.toString())
                    loadingBar.dismiss()

                }
            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                loadingBar.dismiss()


            }

        })
    }
}



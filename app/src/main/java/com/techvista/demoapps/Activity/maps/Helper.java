package com.techvista.demoapps.Activity.maps;


import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;

import androidx.fragment.app.Fragment;

import org.json.JSONArray;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Helper {


	public static String selectedsearchtype="normal";

	public static String currentpage="0";

	public static Fragment selectedfrag=null;
	public static String resumefrom="home";
	public static String isapplypromo="false";
	public static String isfinsih="home";
	public static String locationfrom="MapAct";
	public static String current_page="";

	public static String isaddresslistfrom="cart";
//public static Fragment selectedfrag=null;
    public static int frommenu=0;
    public static String for_vendor_profile_from="Home";
	public static int selectedpos=0;

	public static String drop_latitude="";
	public static String drop_longitude="";
	public static String drop_address="";
	public static String drop_isdrop="";
	public static double latitude=0;
	public static File actualImage2=null;
	public static File actualImage1=null;
	public static File actualImage3=null;
	public static File actualImage4=null;
	public static File actualImage=null;
	public static File actualQrCode=null;
	public static File actualAdditionNational=null;
	public static File actualNationalId=null;
	public static double longitude=0;
	public static int selectedcityimage;
	public static int isvarificaiton=0;
	public static String currentaddress="";
	public static String open_page="homepage";
	public static String searchtext="";
	public static HashMap<String,String> cmap=new HashMap<String,String>();
	public static String searchsection="0";
	public static String Key_banner_id="Key_banner_id";
	public static String Key_banner_link="Key_banner_link";
	public static String Key_banner_sno="Key_banner_sno";
	public static String Key_banner_image="Key_banner_image";
	public static String Key_banner_type="Key_banner_type";
	public static String Key_select_state_name="Key_select_state_name";
	public static String Key_select_state_value="Key_select_state_value";
	public static String selected_name="selected_name";
	public static String selected_emailid="selected_emailid";
	public static String selected_mobile_number="selected_mobile_number";
	public static String selected_password="selected_password";
	public static String selected_referalcode="selected_referalcode";
	public static String selected_gps_address="selected_gps_address";
	public static String selected_gps_lat="selected_gps_lat";
	public static String selected_gps_long="selected_gps_long";
	public static String selected_location_type="selected_location_type";
	public static String selected_contact_name="selected_contact_name";
	public static String selected_city="selected_city";
	public static String selected_houseno="selected_houseno";
	public static String selected_street_name="selected_street_name";
	public static String selected_landmark="selected_landmark";
	public static String selected_selected_addressid="selected_selected_addressid";

	public static ArrayList<HashMap<String, String>> arr_all_product=new ArrayList<HashMap<String, String>>();
	public static HashMap<String, String> mbdeliveyboynewOrderdetailsList = new HashMap<String, String>();
    public static JSONArray jsonArraydetailslist=new JSONArray();








	public static String Key_order_amount="Key_order_amount";
	public static String Key_product_name="Key_product_name";
	public static String Key_resion_name="Key_resion_name";
	public static String Key_resion_id="Key_resion_id";
	public static String Key_id="Key_id";
	public static String Key_unit="Key_unit";
	public static String Key_product_code="Key_product_code";
	public static String Key_max_order_capacity="Key_max_order_capacity";
	public static String Key_mrp="Key_mrp";
	public static String Key_selling_price="Key_selling_price";
	public static String Key_gst = "Key_gst";
	public static String Key_image_1="Key_image_1";
	public static String Key_image_2="Key_image_2";
	public static String Key_image_3="Key_image_3";
	public static String Key_image_4="Key_image_4";
	public static String Key_basic_details="Key_basic_details";
	public static String Key_item_height="Key_item_height";
	public static String Key_item_width="Key_item_width";
	public static String Key_item_length="Key_item_length";
	public static String Key_item_weigth="Key_item_weigth";
	public static String Key_item_vendor_pin_code ="Key_item_vendor_pin_code";
	public static String Key_google_account_name ="Key_google_account_name";
	public static String Key_google_account_phote ="";
	public static String Key_google_account_email ="Key_google_account_email";
	public static String Key_google_account_id ="0";
	public static String Key_is_form_page ="Key_is_form_page";


	public static String Key_item_status="Key_item_status";
	public static String Key_vendor_id="Key_vendor_id";
	public static String Key_added_id="Key_added_id";
	public static String Key_cat_id="Key_cat_id";
	public static String Key_cat_icon="Key_cat_icon";
	public static String Key_cat_name="Key_cat_name";
	public static String Key_sub_cat_id="Key_sub_cat_id";
	public static String Key_sub_cat_name="Key_sub_cat_name";
	public static String Key_sub_cat_image="Key_sub_cat_image";
	public static String Key_stock="Key_stock";
	public static String Key_gst_id="Key_gst_id";
	public static String Key_gst_display="Key_gst_display";
	public static String Key_hsn="Key_hsn";
	public static String is_from_page="from_page";
	public static String Key_service_id="Key_service_id";
	public static String Key_service_name="Key_service_name";
	public static JSONArray Key_package_list=null;
	public static String Key_category_name="Key_category_name";
	public static String Key_sub_category_name="Key_sub_category_name";
	public static String Key_service_image="Key_service_image";
	public static String Key_oderlist_booking_id="Key_oderlist_booking_id";
	public static String Key_oderlist_user_id="Key_oderlist_user_id";
	public static String Key_oderlist_user_name="Key_oderlist_user_name";
	public static String Key_oderlist_user_mobile="Key_oderlist_user_mobile";
	public static String Key_oderlist_payment_mode="Key_oderlist_payment_mode";
	public static String Key_oderlist_completed_date="Key_oderlist_completed_date";
	public static String Key_oderlist_total_item="Key_oderlist_total_item";
	public static String Key_oderlist_discount="Key_oderlist_discount";
	public static String Key_oderlist_user_email="Key_oderlist_user_email";
	public static String Key_oderlist_booking_lat="Key_oderlist_booking_lat";
	public static String Key_oderlist_booking_long="Key_oderlist_booking_long";
	public static String Key_oderlist_print_bill="Key_oderlist_print_bill";
	public static String Key_oderlist_delivery_address="Key_oderlist_delivery_address";
	public static String Key_oderlist_booking_time="Key_oderlist_booking_time";
	public static String Key_oderlist_delivery_timeslot="Key_oderlist_delivery_timeslot";
	public static String Key_oderlist_placed_time="Key_oderlist_placed_time";
	public static String Key_oderlist_accept_time="Key_oderlist_accept_time";
	public static String Key_oderlist_shiping_time="Key_oderlist_shiping_time";
	public static String Key_oderlist_completed_time="Key_oderlist_completed_time";
	public static String Key_oderlist_remark="Key_oderlist_remark";
	public static String Key_oderlist_state_name="Key_oderlist_state_name";
	public static String Key_oderlist_city_name="Key_oderlist_city_name";
	public static String Key_oderlist_average_rating="Key_oderlist_average_rating";
	public static String Key_oderlist_review_username="Key_oderlist_review_username";
	public static String Key_oderlist_review_date_time="Key_oderlist_review_date_time";
	public static String Key_oderlist_review_comment="Key_oderlist_review_comment";
	public static String Key_oderlist_review_user_image="Key_oderlist_review_user_image";
	public static String Key_oderlist_rating_status="Key_oderlist_rating_status";
	public static String Key_oderlist_display_booking_id="Key_oderlist_display_booking_id";
	public static String Key_oderlist_address_id="Key_oderlist_address_id";
	public static String Key_oderlist_pickup_otp="Key_oderlist_pickup_otp";
	public static String Key_oderlist_complete_otp="Key_oderlist_complete_otp";
	public static String Key_oderlist_productlist1="Key_oderlist_productlist1";
	public static String Key_oderlist_total_save="Key_oderlist_total_save";
	public static String Key_oderlist_total_item_price="Key_oderlist_total_item_price";
	public static String Key_oderlist_delivery_charge="Key_oderlist_delivery_charge";
	public static String Key_oderlist_total_amount="Key_oderlist_total_amount";
	public static String Key_oderlist_pay_by_promo="Key_oderlist_pay_by_promo";
	public static String Key_oderlist_pay_by_wallet="Key_oderlist_pay_by_wallet";
	public static String Key_oderlist_pay_online="Key_oderlist_pay_online";
	public static String Key_oderlist_pay_by_cash="Key_oderlist_pay_by_cash";
	public static String Key_oderlist_skip_for_pay="Key_oderlist_skip_for_pay";
	public static String Key_oderlist_gst_amount="Key_oderlist_gst_amount";
	public static String Key_oderlist_booking_status="Key_oderlist_booking_status";
	public static String Key_oderlist_is_complete_enable="is_complete_enable";


	public static String Key_productlist_orderhistory_id="Key_productlist_orderhistory_id";
	public static String Key_productlist_orderhistory_stock="Key_productlist_orderhistory_stock";
	public static String Key_productlist_orderhistory_booking_id="Key_productlist_orderhistory_booking_id";
	public static String Key_productlist_orderhistory_item_id="Key_productlist_orderhistory_item_id";
	public static String Key_productlist_orderhistory_status="Key_productlist_orderhistory_status";
	public static String Key_productlist_orderhistory_product_name="Key_productlist_orderhistory_product_name";
	public static String Key_productlist_orderhistory_product_basic_details="Key_productlist_orderhistory_product_basic_details";
	public static String Key_productlist_orderhistory_image="Key_productlist_orderhistory_image";
	public static String Key_productlist_orderhistory_mrp="Key_productlist_orderhistory_mrp";
	public static String Key_productlist_orderhistory_selling="Key_productlist_orderhistory_selling";
	public static String Key_productlist_orderhistory_qty="Key_productlist_orderhistory_qty";
	public static String Key_productlist_orderhistory_total_amt="Key_productlist_orderhistory_total_amt";
	public static String Key_productlist_orderhistory_added_time="Key_productlist_orderhistory_added_time";
	public static String Key_productlist_orderhistory_vendor_id="Key_productlist_orderhistory_vendor_id";
	public static String Key_productlist_orderhistory_vendor_lat="Key_productlist_orderhistory_vendor_lat";
	public static String Key_productlist_orderhistory_vendor_long="Key_productlist_orderhistory_vendor_long";
	public static String Key_productlist_orderhistory_vendor_name="Key_productlist_orderhistory_vendor_name";
	public static String Key_productlist_orderhistory_vendor_mobile="Key_productlist_orderhistory_vendor_mobile";
	public static String Key_productlist_orderhistory_vendor_address="Key_productlist_orderhistory_vendor_address";
	public static String Key_productlist_orderhistory_placed_time="Key_productlist_orderhistory_placed_time";
	public static String Key_productlist_orderhistory_accept_time="Key_productlist_orderhistory_accept_time";
	public static String Key_productlist_orderhistory_start_time="Key_productlist_orderhistory_start_time";
	public static String Key_productlist_orderhistory_complete_time="Key_productlist_orderhistory_complete_time";
	public static String Key_productlist_orderhistory_delivery_charge="Key_productlist_orderhistory_delivery_charge";
	public static String Key_productlist_orderhistory_gst="Key_productlist_orderhistory_gst";
	public static String Key_productlist_orderhistory_review_username="Key_productlist_orderhistory_review_username";
	public static String Key_productlist_orderhistory_review_user_image="Key_productlist_orderhistory_review_user_image";
	public static String Key_productlist_orderhistory_review_date_time="Key_productlist_orderhistory_review_date_time";
	public static String Key_productlist_orderhistory_review_comment="Key_productlist_orderhistory_review_comment";
	public static String Key_productlist_orderhistory_review_star_rating="Key_productlist_orderhistory_review_star_rating";
	public static String Key_productlist_orderhistory_review_status="Key_productlist_orderhistory_review_status";
	public static String Key_productlist_orderhistory_job_id="Key_productlist_orderhistory_job_id";
	public static String Key_productlist_orderhistory_is_selected="Key_productlist_orderhistory_is_selected";
	public static String Key_productlist_job_id="Key_productlist_job_id";

	public static String Key_select_drop_id="Key_select_drop_id";
	public static String Key_select_drop_value="Key_select_drop_value";

	public static String Key_address_id="Key_address_id";
	public static String Key_transaction_id="Key_transaction_id";
	public static String Key_wallet_amt="Key_wallet_amt";
	public static String Key_description="Key_description";
	public static String Key_gps_address="Key_gps_address";
	public static String Key_contact_name="Key_contact_name";
	public static String Key_city="city";
	public static String Key_house_no="house_no";
	public static String Key_walletoperation="walletoperation";
	public static String Key_trdatetime="trdatetime";
	public static String Key_street_name="street_name";
	public static String Key_phone_no="phone_no";
	public static String Key_landmark="landmark";
	public static String Key_address_type="address_type";
	public static String Key_address_lat="address_lat";
	public static String Key_address_long="Key_address_long";
	public static String Key_Category_name="Key_Category_name";
	public static String Key_Category_name_ar="Key_Category_name_ar";
	public static String Key_title_en="title_en";
	public static String Key_offer_id="offer_id";
	public static String Key_offer_distance="offer_distance";
	public static String Key_coupan_code="coupan_code";
	public static String Key_discount_percent="discount_percent";
	public static String Key_category_id="Key_category_id";
	public static String Key_service_label="Key_service_label";
	public static String Key_package_name_en="Key_package_name_en";
	public static String Key_duration_label_en="Key_duration_label_en";
	public static String Key_package_about_en="Key_package_about_en";
	public static String Key_duration_in_days="duration_in_days";
	public static String Key_no_of_time="no_of_time";
	public static String Key_parts_material_status="parts_material_status";
	public static String Key_review_en="Key_review_en";
	public static String Key_sub_category_id="Key_sub_category_id";
	public static String Key_status="status";
	public static String Key_price="Key_price";
	public static String Key_cart_count="Key_cart_count";
	public static String Key_is_select="Key_is_select";
	public static String Key_sno="Key_sno";
	public static String Key_cat_image="Key_cat_image";
	public static String Key_user_name="Key_user_name";
	public static String Key_rating="Key_rating";
	public static String Key_service_provider_id="service_provider_id";
	public static String Key_start_price="start_price";
	public static String Key_sub_category_name_en="sub_category_name_en";
	public static String Key_category_name_en="category_name_en";
	public static String Key_provider_name="Key_provider_name";
	public static String Key_is_selected="Key_is_selected";
	public static String Key_provider_address_en="Key_provider_address_en";
	public static String Key_provider_about_en="Key_provider_about_en";
	public static String Key_provider_lat="Key_provider_lat";
	public static String Key_provider_long="Key_provider_long";
	public static String Key_provider_total_ratings="Key_provider_total_ratings";
	public static String Key_provider_rating="Key_provider_rating";
	public static String Key_provider_id="Key_provider_id";
	public static String Key_distance="Key_distance";
	public static String Key_token_creat="token_creat";
	public static String Key_provider_mobile_number="Key_provider_mobile_number";
	public static String Key_provider_status="Key_provider_status";
	public static String Key_provider_register_date_time="Key_provider_register_date_time";
	public static String Key_provider_category_id="Key_provider_category_id";
	public static String Key_provider_category_name="Key_provider_category_name";
	public static String Key_provider_image="Key_provider_image";
	public static String Key_busy_status="Key_busy_status";
	public static String Key_slot_label="Key_slot_label";



	public static  String selected_company_name = "company_name";
	public static  String selected_dropid = "selected_dropid";
	public static  String selected_crno = "selected_crno";
	public static  String selected_username = "selected_username";
	public static  String selected_commobileno = "selected_commobileno";
	public static  String selected_finaladdress = "selected_finaladdress";
	public static  String selected_useremailid = "selected_useremailid";
	public static  String selected_strcopassword = "selected_strcopassword";
	public static  String selected_selectedlat = "selected_selectedlat";
	public static  String selected_selectedlong = "selected_selectedlong";
	public static  String selected_type = "selected_type";







	public static Spanned stripHtml(String html) {
		if (!TextUtils.isEmpty(html)) {
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
				return Html.fromHtml(html, Html.FROM_HTML_MODE_COMPACT);
			} else {
				return Html.fromHtml(html);
			}
		}
		return null;
	}


//
//
//	public static void customalert(String Msg, Activity act)
//	{
//
//		final Dialog dialog = new Dialog(act);
//		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//
//		dialog.setContentView(R.layout.custom_msg);
//		TextView text = dialog.findViewById(R.id.AlertMsgtextview);
//		text.setText(Msg);
//
//		TextView dialogButton = dialog.findViewById(R.id.AlertMsgOk);
//		dialogButton.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//
//				dialog.dismiss();
//			}
//		});
//
//
//		dialog.show();
//	}
//
//
//	public static void customalerterror(String Msg, Activity act)
//	{
//
//		final Dialog dialog = new Dialog(act);
//		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//
//
//		dialog.setContentView(R.layout.customalertnewmsg);
//		TextView text = dialog.findViewById(R.id.txtmessage);
//		text.setText(Msg);
//
//		TextView dialogButton = dialog.findViewById(R.id.btnno);
//		dialogButton.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//
//				dialog.dismiss();
//			}
//		});
//
//
//		dialog.show();
//	}
//





	public static ArrayList<HashMap<String, String>> arealist=new ArrayList<HashMap<String, String>>();


	public static ArrayList<HashMap<String, String>> ARrAllitemlist=new ArrayList<HashMap<String, String>>();
	public static HashMap<String, String> selectedrestmap=new HashMap<String, String>();

	public static String[] restareaArr={};
	public static int Selectedgrocerytab=0;
	public static String Selectedsectionname="";




}

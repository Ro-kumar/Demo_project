package com.techvista.demoapps.Activity.maps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


@SuppressLint("CommitPrefEdits")
public class PF300kfjs3 {
    // Shared Preferences
    SharedPreferences pref;

    // Editor for Shared preferences
    Editor editor;

    // Context
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Sharedpref file name
    private String FACEBOOKTOKEN="facebookToken";

    private String FACEBOOKEXPIRE="facebookExpire";

    private String IS_GOOGLELOGIN="IS_GOOGLELOGIN";

    private static final String PREF_NAME = "Boosterprefrence_pharmacy";

      public static final String KEY_login        = "login";

    public static final String KEY_abcd        = "abcd";
    public static final String KEY_dcba        = "dcba";
    public static final String KEY_UE8N20       = "UE8N20";
    public static final String KEY_xxhco8729        = "xxhco8729";
    public static final String KEY_AV15M        = "AV15M";
    public static final String KEY_0Y8KF       = "0Y8KF";
    public static final String KEY_xx8723        = "xx8723";
    public static final String KEY_xx9820        = "xx9820";

    public static final String KEY_S2FPK2        = "S2FPK2";
    public static final String KEY_U15QO        = "U15QO";

    public static final String KEY_xxfcrc8756        = "xxfcrc8756";
    public static final String KEY_xxfgvdl8757       = "xxfgvdl8757";
    public static final String KEY_xxfgvc8758      = "xxfgvc8758";
    public static final String KEY_xxordh8763      = "xxordh8763";
    public static final String KEY_xxghlt8728        = "xxghlt8728";
    public static final String KEY_xxhgr8728        = "xxhgr8728";
    public static final String KEY_xxord8762        = "xxord8762";
    public static final String KEY_POE8K        = "POE8K";
    public static final String KEY_ZNX3D        = "ZNX3D";
    public static final String KEY_UMT2X        = "UMT2X";
    public static final String KEY_F2FLP        = "F2FLP";
    public static final String KEY_KDFKD49        = "KDFKD49";
    public static final String KEY_xxcmb8726        = "xxcmb8726";
    public static final String KEY_xxords8764        = "xxords8764";
    public static final String KEY_xxordm8766        = "xxordm8766";
    public static final String KEY_xxvpos8769        = "xxvpos8769";
    public static final String KEY_xxfpcs8783        = "xxfpcs8783";
    public static final String KEY_xxfpcs8784        = "xxfpcs8784";
    public static final String KEY_xxfpcs8807        = "xxfpcs8807";
    public static final String KEY_xxfpcs8808        = "xxfpcs8808";
    public static final String KEY_xxfsoh8782        = "xxfsoh8782";
    public static final String KEY_selected_sub_cat_id        = "selected_sub_cat_id";
    public static final String KEY_selected_service_id        = "selected_service_id";
    public static final String KEY_Selected_order_booking_status        = "Selected_order_booking_status";
    public static final String KEY_selected_message        = "selected_message";
    public static final String KEY_selected_vendor_support_mobileno        = "selected_vendor_support_mobileno";
    public static final String KEY_selected_vendor_support_emailid        = "selected_vendor_support_emailid";
    public static final String KEY_selected_order        = "selected_order";
    public static final String Key_farmer_world_exithome       = "exithome";
    public static final String Key_selected_cat_id       = "Key_selected_cat_id";
    public static final String Key_selected_cat_name       = "Key_selected_cat_name";
    public static final String Key_selected_provider_category_id       = "Key_selected_provider_category_id";
    public static final String Key_selected_provider_id       = "Key_selected_provider_id";
    public static final String Key_selected_provider_category_name      = "Key_selected_provider_category_name";
    public static final String Key_selected_provider_name      = "Key_selected_provider_name";
    public static final String Key_selected_provider_rating      = "Key_selected_provider_rating";
    public static final String Key_selected_provider_address      = "Key_selected_provider_address";
    public static final String Key_selected_provider_about      = "Key_selected_provider_about";
    public static final String Key_selected_provider_image      = "Key_selected_provider_image";
    public static final String Key_order_sequence      = "order_sequence";

    public static final String KEY_xxccb8731        = "xxccb8731";
    public static final String KEY_xxgcb8732        = "xxgcb8732";
    public static final String KEY_xxgvasc8733        = "xxgvasc8733";
    public static final String KEY_xxohs8768        = "xxohs8768";
    public static final String KEY_selectedisfrom_order        = "selectedisfrom_order";
    public static final String KEY_Selected_item_id        = "Selected_item_id";
    public static final String KEY_select_neworder        = "KEY_select_neworder";
    public static final String KEY_mb_login_location_status        = "KEY_mb_login_location_status";
    public static final String KEY_mb_login_location_message        = "KEY_mb_login_location_message";
    public static final String KEY_mb_login_location_dllat        = "KEY_mb_login_location_dllat";
    public static final String KEY_mb_login_location_dllong        = "KEY_mb_login_location_dllong";
    public static final String key_selected_bottom_image        = "key_selected_bottom_image";
    public static final String KEY_selected_subcategory_id        = "KEY_selected_subcategory_id";


    public static final String KEY_5F1T4        = "5F1T4";
    public static final String isfrom_locne        = "isfrom_locne";
    public static final String Key_selected_booking_status        = "Key_selected_booking_status";

    public static final String KEY_JA60O        = "JA60O";
    public static final String KEY_xxfgpvw8759        = "xxfgpvw8759";
    public static final String KEY_HL2CZ        = "HL2CZ";
    public static final String KEY_8LXUR        = "8LXUR";
    public static final String KEY_xxfsga8760        = "xxfsga8760";
    public static final String KEY_8LXUR2        = "8LXUR2";
    public static final String KEY_20KBG        = "20KBG";
    public static final String KEY_CWESK        = "CWESK";
    public static final String KEY_xxfpcs8796        = "xxfpcs8796";
    public static final String KEY_xxordd8765        = "xxordd8765";
    public static final String KEY_G7140        = "G7140";
    public static final String KEY_8XQYT        = "8XQYT";
    public static final String KEY_YTSXK        = "YTSXK";
    public static final String KEY_status        = "status";
    public static final String KEY_3TKFZ        = "3TKFZ";
    public static final String KEY_DR9LZ        = "DR9LZ";
    public static final String KEY_M3DFZ        = "M3DFZ";
    public static final String KEY_TAN4Z        = "TAN4Z";

    public static final String KEY_DWLSP        = "DWLSP";
    public static final String KEY_YJNET        = "YJNET";
    public static final String KEY_LNGKR        = "LNGKR";
    public static final String KEY_xxhpdl8768        = "xxhpdl8768";
    public static final String KEY_3OZ4Q       = "3OZ4Q";
    public static final String KEY_xx8722        = "xx8722";
    public static final String KEY_xx8725        = "xx8725";
    public static final String KEY_xx8724        = "xx8724";
    public static final String KEY_xxgm8727        = "xxgm8727";
    public static final String KEY_xxhpdl8769       = "xxhpdl8769";
    public static final String KEY_xxordos8767        = "xxordos8767";
    public static final String KEY_xxhpdl8772        = "xxhpdl8772";
    public static final String KEY_LPOZM        = "LPOZM";
    public static final String KEY_CLLSP       = "CLLSP";


    public static final String KEY_S2FPK        = "S2FPK";
    public static final String Key_is_from_page        = "is_from_page";
    public static final String KEY_HC9SP        = "HC9SP";
    public static final String KEY_9LSTK        = "9LSTK";
    public static final String KEY_NJL6T       = "NJL6T";
    public static final String KEY_U15QOBN       = "U15QOBN";
    public static final String KEY_UCHP9       = "UCHP9";
    public static final String KEY_N9YFG      = "N9YFG";
    public static final String KEY_A2G3F    = "A2G3F";
    public static final String KEY_P94TK    = "P94TK";
    public static final String KEY_S6C8W    = "S6C8W";
    public static final String KEY_UP8KH   = "UP8KH";
    public static final String KEY_FDG4B   = "FDG4B";
    public static final String KEY_D8L3C   = "D8L3C";
    public static final String KEY_LADK5 = "LADK5";
    public static final String KEY_W9NTK = "W9NTK";
    public static final String KEY_MK34K = "MK34K";
    public static final String KEY_xxgrssc8734= "xxgrssc8734";
    public static final String KEY_total_item_price        = "KEY_total_item_price";
    public static final String KEY_total_amount        = "KEY_total_amount";
    public static final String KEY_pay_by_promo        = "KEY_pay_by_promo";
    public static final String KEY_pay_by_online        = "KEY_pay_by_online";
    public static final String KEY_skip_for_pay        = "KEY_skip_for_pay";
    public static final String KEY_xxgric8735        = "xxgric8735";
    public static final String KEY_xxrscrc8736        = "xxrscrc8736";
    public static final String KEY_xxbcc8737        = "xxbcc8737";
    public static final String KEY_xxbcr8738        = "xxbcr8738";
    public static final String KEY_xxfsga8761        = "xxfsga8761";
    public static final String KEY_xxecc8739        = "xxecc8739";
    public static final String KEY_xxecrc8740        = "xxecrc8740";
    public static final String KEY_xxgcc8741       = "xxgcc8741";
    public static final String KEY_xxggjlc8742        = "xxggjlc8742";
    public static final String KEY_xxgilc8743       = "xxgilc8743";
    public static final String KEY_xxfcc8744        = "xxfcc8744";
    public static final String KEY_xxfcic8745       = "xxfcic8745";
    public static final String KEY_xxghb8730      = "xxghb8730";
    public static final String KEY_xxfcrc8746        = "xxfcrc8746";
    public static final String KEY_or_selectedsection        = "or_selectedsection";
    public static final String KEY_or_selectedsection_name        = "or_selectedsection_name";
    public static final String KEY_selected_latitude        = "or_selected_latitude";
    public static final String KEY_selected_longitute        = "or_selected_longitute";
    public static final String KEY_addr_latitude        = "addr_latitude";
    public static final String KEY_addr_longitude        = "addr_longitude";
    public static final String KEY_addr_gps_address        = "addr_gps_address";
    public static final String KEY_selected_sharemessage        = "selected_sharemessage";
    public static final String KEY_selected_finaladdress        = "selected_finaladdress";
    public static final String KEY_selected_referral_amount        = "referral_amount";
    public static final String KEY_selected_signup_amount        = "selected_signup_amount";
    public static final String KEY_selected_booking_id        = "selected_booking_id";
    public static final String KEY_selected_addon_id        = "selected_addon_id";
    public static final String KEY_selected_disable_status        = "selected_disable_status";
    public static final String KEY_selected_share_message2        = "selected_share_message2";
    public static final String KEY_selected_share_message        = "selected_share_message";
    public static final String KEY_selected_address        = "selected_address";
    public static final String KEY_selected_item_id        = "selected_item_id";
    public static final String isfrom_locnew       = "isfrom_locnew";
    public static final String KEY_selected_pincode        = "or_selected_pincode";
    public static final String KEY_my_referral_code        = "my_referral_code";
    public static final String KEY_isfilter        = "isfilter";
    public static final String KEY_filterstate        = "filterstate";
    public static final String KEY_filterdistrict        = "filterdistrict";
    public static final String KEY_filtercity        = "filtercity";
    public static final String KEY_filteristrending        = "filteristrending";
   // public static final String KEY_otp        = "otp";
    public static final String KEY_device_token        = "device_token";

    public static final String KEY_generete_slip_orderhistory_message        = "generete_slip_orderhistory_message";
    public static final String KEY_generete_slip_orderhistory_filename        = "generete_slip_orderhistory_filename";
    public static final String KEY_generete_slip_orderhistory_s3path        = "generete_slip_orderhistory_s3path";


    public static final String KEY_selectedpromocode        = "selectedpromocode";
    public static final String KEY_selectedpromo_promo_message        = "selectedpromo_promo_message";
    public static final String KEY_selectedpromo_promo_success_message        = "KEY_selectedpromo_promo_success_message";
    public static final String KEY_selectedpromo_discount        = "KEY_selectedpromo_discount";
    public static final String KEY_selectedpromo_discount_mode        = "KEY_selectedpromo_discount_mode";
    public static final String KEY_selectedpromo_status        = "KEY_selectedpromo_status";
    public static final String KEY_selectedpromo_sno        = "KEY_selectedpromo_sno";
    public static final String KEY_selectedpromo_added_date_time        = "KEY_selectedpromo_added_date_time";
    public static final String KEY_selectedpromo_minimumorder        = "KEY_selectedpromo_minimumorder";
    public static final String KEY_selectedpromo_upto_discount        = "KEY_selectedpromo_upto_discount";
    public static final String KEY_selectedpromocodeid        = "selectedpromocodeid";
    public static final String KEY_selectedpromocodestatus        = "selectedpromocodestatus";
    public static final String KEY_selected_language        = "selected_language";
    public static final String KEY_selected_productlist_orderhistory_id        = "selected_productlist_orderhistory_id";

    public static final String KEY_selectedbooking_id       = "selectedbooking_id";
    public static final String KEY_selecteddisplaybookingid= "selecteddisplaybookingid";

    public static final String Key_select_item_cat_id       = "select_item_cat_id";
    public static final String KEY_fs_selectedpromo_minorder        = "fs_selectedpromo_minorder";
    public static final String KEY_fs_status        = "fs_status";


    public static final String KEY_Selectedorder_deliverycharege       = "selectedorder_deliverycharege";

    public static final String KEY_minorder       = "minorder";
    public static final String KEY_minordermessage       = "minordermessage";
    public static final String KEY_minordermessagecongratulation      = "minordermessagecongratulation";

    public static final String KEY_Selectedorder_deliverycharegeorg       = "selectedorder_deliverycharegeorg";
    public static final String KEY_Selectedorder_walletpercent       = "Selectedorder_walletpercent";
    public static final String KEY_deliverychargemsg      = "deliverychargemsg";



    public static final String KEY_selectedpromo_offinorder_rs        = "selectedpromooffinorderrs";
    public static final String KEY_selectedpromo_offinorder_rs_server        = "selectedpromooffinorderrs_server";
    public static final String KEY_totalorder        = "totalorder";

    public static final String KEY_searchtype        = "searchtype";
    public static final String KEY_selectedpromo_offinorder_in        = "selectedpromooffinorderin";
    public static final String KEY_selectedpromo_addtowallate_rs        = "selectedpromoaddtowalleters";

    public static final String KEY_selectedpromo_addtowallate_in        = "selectedpromoaddtowalletein";
    public static final String KEY_selectedpromo_discount_upto        = "selectedpromo_discount_upto";


    public static final String KEY_selectedcityid        = "selectectedcityid";
    public static final String KEY_select_fragmentchangepage        = "KEY_select_fragmentchangepage";
    public static final String Key_selected_jsonpacakge        = "Key_selected_jsonpacakge";
    public static final String Key_aboutuslink        = "Key_aboutuslink";
    public static final String Key_faqlink        = "Key_faqlink";
    public static final String Key_tmclink        = "Key_tmclink";





    public static final String KEY_VRN            = "VRN";
    public static final String KEY_UPDT        = "UPDT";

    public static final String KEY_newversion        = "newversion";
    public static final String KEY_address_id        = "address_id";
    public static final String KEY_Lastupdateon        = "Lastupdateon";
    public static final String KEY_messageupdate        = "messageupdate";
    public static final String KEY_PT4LV        = "PT4LV";

    public static final String KEY_selectedzipcode        = "selectedzipcode";


    public static final String KEY_fs_selectedpromocodeid        = "fs_selectedpromocodeid";
    public static final String KEY_fs_selectedpromocode        = "fs_selectedpromocode";
    public static final String KEY_lastloadedid        = "KEY_lastloadedid";


    public static final String KEY_fs_selectedpromo_addtowallate_rs        = "fs_selectedpromo_addtowallate_rs";
    public static final String KEY_fs_selectedpromo_offinorder_rs        = "fs_selectedpromo_offinorder_rs";
    public static final String KEY_fs_selectedpromo_offinorder_rs_server        = "fs_selectedpromo_offinorder_rs_server";
    public static final String KEY_fs_selectedpromo_addtowallate_in        = "fs_selectedpromo_addtowallate_in";
    public static final String KEY_fs_selectedpromo_offinorder_in        = "fs_selectedpromo_offinorder_in";



    public static final String KEY_selected_property_type_id       = "ap_selected_property_type_id";
    public static final String KEY_selected_property_id      = "ap_selected_property_id";

    public static final String KEY_selected_budget_from       = "ap_selected_budget_from";
    public static final String KEY_selected_budget_to       = "ap_selected_budget_to";

    public static final String KEY_select_cat_id ="select_cat_id";
    public static final String KEY_select_cat_name ="select_cat_name";
    public static final String KEY_select_is_new_arrivals ="select_is_new_arrivals";
    public static final String KEY_select_is_popular ="select_is_popular";
    public static final String KEY_select_is_offer ="select_is_offer";

    public static final String KEY_selected_city_id       = "ap_selected_city_id";
    public static final String KEY_selected_area_id      = "ap_selected_area_id";
    public static final String KEY_selected_property_type_features_id      = "ap_selected_property_type_features_id";

    public static final String KEY_selected_task_id        = "selected_task_id";
    public static final String KEY_selected_vertual_id        = "selected_vertual_id";
    public static final String KEY_selected_single_all        = "selected_single_all";
    public static final String KEY_refersharediscription        = "pl_refersharediscription";
    public static final String KEY_referimageurl        = "pl_referimageurl";
    public static final String KEY_refertitle       = "pl_refertitle";
   // public static final String KEY_searchtype        = "searchtype";
    public static final String KEY_selectedgpscity        = "selectectedgpscity";
    public static final String KEY_selectedcity     = "selectectedcity";
   // public static final String KEY_ID               = "ormidcustomer_id";
   public static final String Key_selectedrestmap="selectedrestmap";
    public static final String KEY_remark            ="remark";
   // public static final String KEY_selectedcityid        = "selectectedcityid";
    public static final String KEY_selectedareaid        = "selectectedareaid";
    public static final String KEY_selectedarea        = "selectectedarea";
    public static final String KEY_selectedlat     = "selectectedlat";
    public static final String KEY_selected_cat_id     = "selectected_cat_id";

    public static final String KEY_selectedlong     = "selectectedlong";
    public static final String KEY_selectedcityname     = "selectectedcityname";

    public static final String KEY_selectedaddress  = "selectectedaddress";
    public static final String KEY_selectedaddress_status  = "selectedaddress_status";
    public static final String KEY_selectedrestaurant_id  = "selectedrestaurant_id";

    public static final String KEY_selectedrestaurant_name  = "selectedrestaurant_name";
    public static final String KEY_selectedrestaurant_lat  = "selectedrestaurant_lat";
    public static final String KEY_selectedrestaurant_long  = "selectedrestaurant_long";




    public static final String KEY_Selectedorder_itemprice        = "selectedorderitemprice";
    public static final String KEY_Selectedorder_promodiscount       = "selectedorderpromodiscount";

    public static final String KEY_Selectedorder_payonline       = "selectedorderpayonline";
    public static final String KEY_Selectedorder_billingurl       = "selectedorderbillingurle";
    public static final String KEY_Selectedorder_orderedproducts       = "selectedorderorderedproducts";
    public static final String KEY_selectedbookingid="bookingidselected";

    public static final String KEY_Selectedorder_totalpayableamount        = "selectedordertotalpayableamount";
    public static final String KEY_Selectedorder_skipforpay        = "selectedorderskipforpay";
    public static final String KEY_selected_max_order_message        = "selected_max_order_message";
    public static final String KEY_selected_max_order_cap        = "selected_max_order_cap";
    public static final String KEY_selected_total_order_gst        = "KEY_selected_total_order_gst";
    public static final String KEY_selected_total_delivery_charge        = "KEY_selected_total_delivery_charge";
    public static final String KEY_Selectedorder_skipforpay_without_wallet        = "selectedorderskipforpaywithoutwallet";

    public static final String KEY_Selectedorder_totalitemprice        = "selectedordertotalitemprice";
    public static final String KEY_Selectedorder_paybyhungryymoney        = "selectedorderpaybyhungryymoney";
    public static final String KEY_Selectedorder_paypramotionalwallet        = "selectedorderpaybypromotionalcash";

/*
    public static final String KEY_selectedpromo_offinorder_rs        = "selectedpromooffinorderrs";
    public static final String KEY_selectedpromo_offinorder_rs_server        = "selectedpromooffinorderrs_server";

    public static final String KEY_selectedpromo_offinorder_in        = "selectedpromooffinorderin";
    public static final String KEY_selectedpromo_addtowallate_rs        = "selectedpromoaddtowalleters";

    public static final String KEY_selectedpromo_addtowallate_in        = "selectedpromoaddtowalletein";

    public static final String KEY_selectedpromocode        = "selectedpromocode";
    public static final String KEY_selectedpromocodeid        = "selectedpromocodeid";
    public static final String KEY_selectedpromocodestatus        = "selectedpromocodestatus";
*/


    public static final String KEY_gpslocation        = "gpslocation";
    public static final String KEY_bonanzamsg       = "bonanzamsg";
    public static final String KEY_selected_booking_lat   = "selected_booking_lat";
    public static final String KEY_selected_booking_long  = "selected_booking_long";
    public static final String KEY_selected_address_id  = "selected_address_id";
    public static final String KEY_selected_display_address  = "selected_display_address";
    public static final String KEY_selected_booking_address  = "selected_booking_address";
    public static final String KEY_selected_booking_address_id  = "selected_booking_address_id";
    public static final String KEY_selected_booking_remark = "selected_booking_remark";
    public static final String KEY_selectedtimeslot   = "selectectedtimeslot";
    public static final String KEY_selected_promo_id        = "selected_promo_id";
    public static final String KEY_selected_promo_code        = "selected_promo_code";
    public static final String KEY_selected_prmo_message        = "selected_prmo_message";
    public static final String KEY_selected_add_to_wallete_rs        = "selected_add_to_wallete_rs";
    public static final String KEY_selected_off_in_order_rs        = "selected_off_in_order_rs";
    public static final String KEY_selected_add_to_wallate_in        = "selected_add_to_wallate_in";
    public static final String KEY_bonanzastatus       = "bonanzastatus";
    public static final String KEY_bonanzaamt       = "bonanzaamt";
    public static final String KEY_bonanzaamtapplied       = "bonanzaamtapplied";
    public static final String KEY_selected_off_in_order_in        = "selected_off_in_order_in";
    public static final String KEY_selected_promo_image        = "selected_promo_image";
    public static final String KEY_selected_promo_status      = "selected_promo_status";
    public static String KEY_first_name="first_name";
    public static String KEY_age="medi_age";
    public static String KEY_sex="medi_sex";
    public static String isloadpopup="isloadpopup";
    public static String KEY_sno="sno";
    public static String KEY_create_date="create_date";

    public static String KEY_image_pharmacyklick="KEY_image_pharmacyklick";
    public static String KEY_certificate="certificate";
    public static String KEY_type="KEY_type";
    public static String KEY_address="medi_address";
    public static String KEY_profile_image="KEY_profile_image";
    public static String KEY_token_for_after_login="KEY_token_for_after_login";
    public static String KEY_booking_id="KEY_booking_id";
    public static String KEY_city="medi_city";
    public static String KEY_state="medi_state";
    public static String KEY_country="medi_country";
    public static String KEY_contactno="medi_contactno";
    public static final String KEY_selected_promo_type        = "selected_promo_type";
    public static final String KEY_selected_minimumorder       = "selected_minimumorder";
    public static final String KEY_IS_FILE_FROM       = "KEY_IS_FILE_FROM";

    public static final String KEY_selected_isapplypromo      = "selected_isapplypromo";

    public static final String KEY_selected_paybypromocode        = "selected_paybypromocode";
    public static final String KEY_selected_paybywallet        = "selected_paybywallet";

    public static final String KEY_selected_total_item_amount        = "selected_total_item_amount";
    public static final String KEY_selected_grand_total        = "selected_total_grand_total";
    public static final String KEY_selected_skip_for_pay        = "selected_skip_for_pay";
    public static final String KEY_refermessage       = "pl_refermessage";

    public static final String KEY_selected_vendor_id = "selected_vendor_id";

    public static final String KEY_selected_vendor_name        = "selected_vendor_name";
    public static final String KEY_selected_vendor_address        = "selected_vendor_address";
    public static final String KEY_selected_vendor_email        = "selected_vendor_email";
    public static final String KEY_selected_vendor_mobile        = "selected_vendor_mobile";
    public static final String KEY_selected_vendor_lat        = "selected_vendor_lat";
    public static final String KEY_selected_vendor_long       = "selected_vendor_long";
    public static final String KEY_selected_vendor_image        = "selected_vendor_image";
    public static final String KEY_selected_vendor_opentime        = "selected_vendor_opentime";
    public static final String KEY_selected_vendor_closingtime        = "selected_vendor_closingtime";
    public static final String KEY_selected_vendor_working_hour        = "selected_vendor_working_hour";
    public static final String selected_item_id        = "selected_item_id";
    public static final String selected_cat_id        = "selected_cat_id";
    public static final String selected_cat_name        = "selected_cat_name";

    public static final String selected_subcat_id        = "selected_subcat_id";
    public static final String selected_subcat_category        = "selected_subcat_category";

    public static final String KEY_coursebooking_booking_id        = "coursebooking_booking_id";
    public static final String KEY_doctor_booking_id        = "doctor_booking_id";
    public static final String KEY_onlineform_booking_id        = "onlineform_booking_id";
    public static final String KEY_user_id        = "pl_user_id";
    public static final String KEY_user_name        = "KEY_user_name";
    public static final String KEY_selected_username        = "KEY_selected_username";
    public static final String KEY_selected_mobileno        = "KEY_selected_mobileno";
    public static final String KEY_selected_emailid        = "KEY_selected_emailid";
    public static final String KEY_selected_location        = "KEY_selected_location";
    public static final String Key_before_token_id        = "Key_before_token_id";
    public static final String KEY_state_id        = "KEY_state_id";
    public static final String KEY_user_mobile        = "KEY_user_mobile";
    public static final String KEY_recharge_id       = "KEY_recharge_id";
    public static final String KEY_recharge_amt       = "KEY_recharge_amt";
    public static final String Key_total_review        = "Key_total_review";


    public static final String KEY_city_name        = "KEY_city_name";
    public static final String KEY_area_name        = "KEY_area_name";
    public static final String KEY_email_id        = "KEY_email_id";
    public static final String KEY_location_name        = "KEY_location_name";
    public static final String KEY_gps_location        = "KEY_gps_location";
    public static final String KEY_gps_gps_lat        = "KEY_gps_gps_lat";
    public static final String KEY_provider_long        = "KEY_provider_long";
    public static final String KEY_provider_total_ratings        = "KEY_provider_total_ratings";
    public static final String KEY_provider_rating        = "KEY_provider_rating";
    public static final String KEY_provider_name        = "KEY_provider_name";
    public static final String KEY_provider_address        = "KEY_provider_address";
    public static final String KEY_provider_about        = "KEY_provider_about";
    public static final String KEY_provider_lat        = "KEY_provider_lat";
    public static final String KEY_item_count        = "KEY_item_count";
    public static final String KEY_item_id        = "KEY_item_id";
    public static final String KEY_total_order_amt        = "KEY_total_order_amt";
    public static final String KEY_total_order_qty        = "KEY_total_order_qty";
    public static final String KEY_gps_gps_long        = "KEY_gps_gps_long";
    public static final String KEY_state_name        = "KEY_state_name";
    public static final String Key_total_wallet_balance        = "Key_total_wallet_balance";
    public static final String KEY_provider_image        = "KEY_provider_image";


    public static final String KEY_addproperty_property_id       = "addproperty_property_id";
    public static final String KEY_request_callback_id        = "pl_request_callback_id";
    public static final String KEY_name        = "pl_name";
    public static final String KEY_last_name        = "pl_last_name";
    public static final String KEY_ref_status        = "ref_status";
    public static final String KEY_id        = "KEY_id";
    public static final String KEY_select_rating        = "select_rating";
    public static final String KEY_select_radius        = "select_radius";
    public static final String KEY_from        = "pl_from";

    public static final String KEY_payment_id        = "pl_payment_id";

    public static final String KEY_paymentmode        = "pl_paymentmode";
    public static final String KEY_transaction_id        = "pl_transaction_id";

    //medhabazzardeliveryboy

    public static final String KEY_login_status        = "login_status";
    public static final String KEY_message =   "message";
    public static final String KEY_dl_id        = "dl_id";
    public static final String KEY_dl_name       = "dl_name";
    public static final String KEY_dl_mobile       = "dl_mobile";
    public static final String KEY_dl_address       = "dl_address";
    public static final String KEY_dl_email       = "dl_email";
    public static final String KEY_dl_password       = "dl_password";
    public static final String KEY_dl_status       = "dl_status";
    public static final String KEY_dl_open       = "dl_open";
    public static final String KEY_dllat       = "dllat";
    public static final String KEY_dllong       = "dllong";
    public static final String KEY_dl_devicetoken       = "dl_devicetoken";
    public static final String KEY_city_id      = "city_id";
    public static final String KEY_area_id        = "KEY_area_id";
    public static final String KEY_account_no        = "account_no";
    public static final String KEY_bank_name        = "KEY_bank_name";
    public static final String KEY_ifsc_code        = "ifsc_code";
    public static final String KEY_adlhar_no       = "adlhar_no";
    public static final String KEY_dl_image       = "dl_image";
    public static final String KEY_mb_current_lat  = "mb_current_lat";
    public static final String KEY_mb_current_long  = "mb_current_long";



    //master page Api
    public static final String KEY_masterpage_message = "message";
    public static final String KEY_masterpage_status = "status";
    public static final String KEY_masterpage_dl_id = "dl_id";
    public static final String KEY_masterpage_dl_name = "dl_name";
    public static final String KEY_masterpage_dl_mobile = "dl_mobile";
    public static final String KEY_masterpage_dl_address = "dl_address";
    public static final String KEY_masterpage_dl_email = "dl_email";
    public static final String KEY_masterpage_dl_password = "dl_password";
    public static final String KEY_masterpage_dl_status = "dl_status";
    public static final String KEY_masterpage_dl_open = "dl_open";
    public static final String KEY_masterpage_dllat = "dllat";
    public static final String KEY_masterpage_dllong = "dllong";
    public static final String KEY_masterpage_dl_devicetoken = "dl_devicetoken";
    public static final String KEY_masterpage_city_id = "city_id";
    public static final String KEY_masterpage_area_id = "area_id";
    public static final String KEY_masterpage_account_no = "account_no";
    public static final String KEY_masterpage_bank_name = "bank_name";
    public static final String KEY_masterpage_ifsc_code = "ifsc_code";
    public static final String KEY_masterpage_adlhar_no = "adlhar_no";
    public static final String KEY_masterpage_dl_image = "dl_image";
    public static final String KEY_masterpage_pendingorder = "pendingorder";
    public static final String KEY_masterpage_proceedingorder = "proceedingorder";
    public static final String KEY_masterpage_completedorder = "completedorder";
    public static final String Key_selected_neworder_booking_id = "Key_neworder_booking_id";


    //

    public static final String KEY_selected_recharge_amt        = "pl_selected_recharge_amt";

 //   public static final String KEY_email        = "pl_email";
    public static final String KEY_wallet_balance        = "wallet_balance";
    public static final String KEY_otp_status        = "KEY_otp_status";
    public static final String KEY_delivery_range        = "KEY_delivery_range";
    public static final String KEY_bank_account_no        = "KEY_bank_account_no";
    public static final String KEY_bank_ifsc_code        = "KEY_bank_ifsc_code";

    public static final String KEY_bank_branch        = "KEY_bank_branch";
    public static final String KEY_bank_account_holder_name        = "KEY_bank_account_holder_name";
    public static final String KEY_message_notes        = "message_notes";
    public static final String KEY_vendor_register_date        = "KEY_vendor_register_date";
    public static final String KEY_vendor_register_bank_passwbook        = "KEY_vendor_register_bank_passwbook";
    public static final String KEY_vendor_pin_code        = "KEY_vendor_pin_code";
    public static final String KEY_vendor_id        = "KEY_vendor_id";
    public static final String KEY_venndor_name        = "KEY_venndor_name";
    public static final String KEY_vendor_name        = "KEY_vendor_name";
    public static final String KEY_vendor_mobile        = "KEY_vendor_mobile";
    public static final String KEY_vendor_email_id        = "KEY_vendor_email_id";
    public static final String KEY_vendor_image        = "KEY_vendor_image";
    public static final String KEY_vendor_lat        = "KEY_vendor_lat";
    public static final String KEY_vendor_long        = "KEY_vendor_long";
    public static final String KEY_vendor_gps_address        = "KEY_vendor_gps_address";
    public static final String KEY_vendor_password        = "KEY_vendor_password";
    public static final String KEY_vendor_status        = "KEY_vendor_status";
    public static final String KEY_gstn        = "KEY_gstn";
    public static final String KEY_vendor_owner_name        = "KEY_vendor_owner_name";
    public static final String KEY_vendor_adhar_card        = "KEY_vendor_adhar_card";
    public static final String KEY_promotional_balance        = "promotional_balance";
    public static final String KEY_mobile        = "pl_mobile";
    public static final String KEY_permanant_address       = "pl_permanant_address";
    public static final String KEY_designation        = "pl_designation";
    public static final String KEY_roltype        = "pl_roltype";
    public static final String KEY_createdateadmin        = "pl_createdateadmin";


    public static final String KEY_Servingstatus       = "servingstatus";
    public static final String KEY_Servingmessage       = "servingmessage";
    public static final String KEY_url       = "KEY_url";
    public static final String KEY_sharmsg        = "sharemsg";


    public static final String KEY_password        = "pl_password";
    public static final String KEY_fullname_pharmacyclick        = "KEY_fullname_pharmacyclick";
    public static final String KEY_email        = "KEY_email";
    public static final String KEY_search        = "pl_search";
    public static final String KEY_devicetoken        = "pl_devicetoken";
    public static final String KEY_create_dateuser        = "pl_create_dateuser";
   // public static final String KEY_username        = "pl_username";
    public static final String KEY_user_status        = "pl_user_status";
    public static final String KEY_register_date        = "KEY_register_date";
    public static final String KEY_login_device        = "KEY_login_device";
    public static final String KEY_device_id        = "KEY_device_id";
    public static final String KEY_parent_referral_code        = "parent_referral_code ";
    public static final String KEY_parent_referral_id        = "KEY_parent_referral_id ";
    public static final String KEY_referral_status        = "KEY_referral_status ";
    public static final String KEY_google_id        = "google_id ";
    public static final String KEY_otp_code        = "pl_otp_code";
    public static final String KEY_gst_certificate        = "gst_certificate";
    public static final String KEY_pan_card_photo        = "pan_card_photo";
    public static final String KEY_mobile_number        = "mobile_number";
    public static final String KEY_owner_mobile        = "owner_mobile";
    public static final String KEY_smsUrlc        = "smsUrlc";
    public static final String KEY_myreferralcode        = "myreferralcode";
    public static final String KEY_mypromocode        = "pl_mypromocode";
    public static final String KEY_parent_promocode        = "pl_parentpromocode";
    public static final String KEY_user_image        = "pl_user_image";
    public static final String Key_selected_package_name        = "Key_selected_package_name";
    public static final String Key_selected_package_id        = "Key_selected_package_id";
    public static final String Key_selected_date        = "Key_selected_date";
    public static final String Key_provider_status       = "Key_provider_status";
    public static final String Key_selected_time        = "Key_selected_time";
    public static final String Key_total_service_amt       = "Key_total_service_amt";
    public static final String Key_service_date_time       = "Key_service_date_time";
    public static final String Key_order_id       = "Key_order_id";
    public static final String Key_support_mobile       = "Key_support_mobile";
    public static final String Key_whatsapp_number      = "Key_whatsapp_number";
    public static final String Key_support_email      = "Key_support_email";
    public static final String Key_msg     = "Key_msg";
    public static final String Key_total_vat_amt       = "Key_total_vat_amt";
    public static final String Key_to_pay_amt      = "Key_to_pay_amt";
    public static final String Key_wallet_balance      = "Key_wallet_balance";
    public static final String Key_paid_by_wallet  = "Key_paid_by_wallet";
    public static final String Key_is_wallet_selected  = "Key_is_wallet_selected";
    public static final String Key_total_discount       = "Key_total_discount";
    public static final String Key_add_contact_name      = "Key_add_contact_name";
    public static final String Key_add_phone_no      = "Key_add_phone_no";
    public static final String Key_address_label      = "Key_address_label";
    public static final String Key_address_status      = "Key_address_status";
    public static final String Key_coupan_code      = "Key_coupan_code";

    public static final String KEY_login_verification_status       = "pl_login_verification_status";
   // public static final String KEY_wallet_amt        = "pl_wallet_amt";

    public static final String KEY_total_match        = "pl_total_match";
    public static final String KEY_totalkill        = "pl_totalkill";
    public static final String KEY_totalearn        = "pl_totalearn";

    public static final String KEY_ownrefrellcode       = "ownrefrellcode";

    public static final String KEY_parentreferralcode       = "parentreferralcode";

    public static final String KEY_pramotionalbalance       = "pramotionalbalance";
    public static final String KEY_selectedbookingurl="selectedbookingurl";
    public static final String KEY_dob        = "pl_dob";
    public static final String KEY_gender        = "pl_gender";


    public static final String KEY_selectedmatch_entryfees        = "pl_selectedmatch_entryfees";
    public static final String KEY_selectedmatch_id        = "pl_selectedmatch_id";


    // Constructor
    public PF300kfjs3(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }



    public String GetSharedPreferences(String Keytag) {
        SharedPreferences SP = PreferenceManager
                .getDefaultSharedPreferences(_context);
        return SP.getString(Keytag, "");

    }

    public void SetSharedPreferences(String Keytag, String KeyValue) {
        SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(_context);
        Editor spe = prefs.edit();
        spe.putString(Keytag, KeyValue);
        spe.commit();
    }


    public String GC(String KeyValue) {
        SharedPreferences SP = PreferenceManager
                .getDefaultSharedPreferences(_context);
        return PC(SP.getString(KeyValue, "")) ;

    }
    public String PC(String KeyValue) {

        return KeyValue+ PCC.JC37E();

    }

    public  void saveMap(String key, Map<String, String> inputMap){
        SharedPreferences pSharedPref = PreferenceManager
                .getDefaultSharedPreferences(_context);
        if (pSharedPref != null){
            JSONObject jsonObject = new JSONObject(inputMap);
            String jsonString = jsonObject.toString();
            Editor editor = pSharedPref.edit();
            editor.remove(key).commit();
            editor.putString(key, jsonString);
            editor.commit();
        }
    }

    public HashMap<String, String> loadMap(String key){
        HashMap<String, String> outputMap = new HashMap<String, String>();
        SharedPreferences pSharedPref = PreferenceManager
                .getDefaultSharedPreferences(_context);
        try{
            if (pSharedPref != null){
                String jsonString = pSharedPref.getString(key, (new JSONObject()).toString());
                JSONObject jsonObject = new JSONObject(jsonString);
                Iterator<String> keysItr = jsonObject.keys();
                while(keysItr.hasNext()) {
                    String k = keysItr.next();
                    String v = (String) jsonObject.get(k);
                    outputMap.put(k,v);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return outputMap;
    }
	 public boolean CheckInternet(Context con) {
	 		boolean flag = false;

	 		if (isNetworkAvailable()) {
	 			flag = true;

	 		} else {

	 			/*AlertDialogMsg obAlertDialogMsg = new AlertDialogMsg(_context,
	 					"Check Internet");*/
	 			//obAlertDialogMsg.show();

	 			flag = false;
	 		}
	 		return flag;

	 	}
	     public boolean isNetworkAvailable() {
	 		ConnectivityManager cm = (ConnectivityManager) _context.getSystemService(Context.CONNECTIVITY_SERVICE);

	 		NetworkInfo wifiNetwork = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
	 		if (wifiNetwork != null && wifiNetwork.isConnected()) {
	 			return true;
	 		}

	 		NetworkInfo mobileNetwork = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
	 		if (mobileNetwork != null && mobileNetwork.isConnected()) {
	 			return true;
	 		}

	 		NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
	 		if (activeNetwork != null && activeNetwork.isConnected()) {
	 			return true;
	 		}

	 		return false;
	 	}
    public void isGoogleLogin(boolean isGoogle){
        // Storing login value as TRUE
        editor.putBoolean(IS_GOOGLELOGIN, isGoogle);
    }

    public boolean isGoogleLogin()
    {
        return pref.getBoolean(IS_GOOGLELOGIN,false);
    }

    public String getFacebookToken() {
        // TODO Auto-generated method stub
        return pref.getString(FACEBOOKTOKEN, null);
    }

    public long getFacebookExpire() {
        // TODO Auto-generated method stub
        return pref.getLong(FACEBOOKEXPIRE, 0);
    }


    public void setFacebookToken(String token, long expire){
        // Storing login value as TRUE

        editor.putString(FACEBOOKTOKEN, token);
        editor.putLong(FACEBOOKEXPIRE, expire);
        // commit changes
        editor.commit();
    }


    public void logout() {
        editor.clear();
        editor.apply();
        editor.commit();
    }
}

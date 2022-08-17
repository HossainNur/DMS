package com.inovex.bikroyik.utils;

public class ApiConstants {

    private static final String BASE_URL = "https://pos.ahrintl-pvt.com";
    private static final String BASE_LOCAL_URL = "http://192.168.212.38:8000";

    public static final String GET_CLIENT_IMAGE_BASE_URL = BASE_LOCAL_URL+"/api/client-image/";
    public static final String CLIENT_LIST_URL = BASE_LOCAL_URL+"/api/client-list/";
    public static final String DUE_LIST = BASE_LOCAL_URL+"/api/due-list";
    public static final String PRODUCT_IMAGE_BASE_LINK = BASE_LOCAL_URL+"/api/download/";
    public static final String ORDER_SUBMIT = BASE_LOCAL_URL+"/api/get-order";
    public static final String DUE_PAYMENT = BASE_LOCAL_URL+"/api/due-payment";
    public static final String MOBILE_BANKING_PAYMENTS = BASE_LOCAL_URL+"/api/payment-methods/";//SUBSCRIBER_ID


    public static final String LOGIN_URL = BASE_LOCAL_URL+"/api/login-data";
    public static final String CLIENT_CREATE = BASE_URL+"/api/client-create";
    public static final String PRODUCT_LIST = BASE_LOCAL_URL+"/api/product-list/";
    public static final String DISCOUNT_LIST = BASE_LOCAL_URL+"/api/discount-list/";
    public static final String TAX_LIST = BASE_LOCAL_URL+"/api/vat-list/";
}

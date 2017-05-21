package com.secreal.iaktraining.config;

/**
 * Created by secreal on 5/21/2017.
 * saya ulong :)
 */

public class Constant {
    final public static String BASE_URL="http://api.openweathermap.org/data/2.5/forecast/";
    final public static String LocationLat = "?lat=-6.1877386&lon=106.7400824";
    final public static String Unit = "&units=metric";
    final public static String API_KEY = "&APPID=9ed2257682b1d9a2eb66c15047e1bfdd";

    final public static String fullUrl = BASE_URL + LocationLat + Unit + API_KEY;
}

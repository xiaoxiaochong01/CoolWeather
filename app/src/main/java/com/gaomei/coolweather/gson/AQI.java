package com.gaomei.coolweather.gson;

/**
 * Created by gaomei on 2018/1/12.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}

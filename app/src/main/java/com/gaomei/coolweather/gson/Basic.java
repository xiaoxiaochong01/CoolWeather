package com.gaomei.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gaomei on 2018/1/12.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}

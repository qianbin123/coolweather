package com.coolweather.android.gson;

/**
 * Created by qianbin on 2018/1/27.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String api;

        public String pm25;
    }
}

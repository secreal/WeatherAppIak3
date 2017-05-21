package com.secreal.iaktraining.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by secreal on 5/21/2017.
 * saya ulong :)
 */

public class WeatherModel {
    private String time;
    private String dayDate;
    private int maxTemp;
    private int minTemp;
    private String status;
    private String city;
    private String country;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        SimpleDateFormat formatDefault = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat formatTimeCustom = new SimpleDateFormat("hh:mm");

        Date timeFormat = null;
        try {
            timeFormat = formatDefault.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        time = formatTimeCustom.format(timeFormat);
        this.time = time;
    }

    public String getDayDate() {
        return dayDate;
    }

    public void setDayDate(String dayDate) {
        this.dayDate = dayDate;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

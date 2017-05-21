package com.secreal.iaktraining.models;

/**
 * Created by secreal on 5/21/2017.
 * saya ulong :)
 */

public class WeatherModelList {
    private String time;
    private String status;
    private double tempMax;
    private double tempMin;

    public WeatherModelList(String time, String status, double tempMax, double tempMin) {
        this.time = time;
        this.status = status;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }
}

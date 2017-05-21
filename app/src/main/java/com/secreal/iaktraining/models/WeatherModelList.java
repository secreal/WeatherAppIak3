package com.secreal.iaktraining.models;

/**
 * Created by secreal on 5/21/2017.
 * saya ulong :)
 */

public class WeatherModelList {
    private String time;
    private String status;
    private int tempMax;
    private int tempMin;

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

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }
}

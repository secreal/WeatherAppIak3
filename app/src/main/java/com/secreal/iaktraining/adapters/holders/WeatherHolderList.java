package com.secreal.iaktraining.adapters.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.secreal.iaktraining.R;
import com.secreal.iaktraining.models.WeatherModelList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by secreal on 5/21/2017.
 * saya ulong :)
 */

public class WeatherHolderList extends RecyclerView.ViewHolder{

    @BindView(R.id.iconMiniList) ImageView iconMiniList;
    @BindView(R.id.timeList) TextView timeList;
    @BindView(R.id.statusList) TextView statusList;
    @BindView(R.id.maxTempList) TextView maxTempList;
    @BindView(R.id.minTempList) TextView minTempList;


    public WeatherHolderList(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void updateUI(WeatherModelList weatherList){
        if(weatherList.getStatus().equals("Clear")) iconMiniList.setImageResource(R.drawable.sun_mini);
        else if(weatherList.getStatus().equals("Rain")) iconMiniList.setImageResource(R.drawable.rain_mini);
        else if(weatherList.getStatus().equals("Clouds")) iconMiniList.setImageResource(R.drawable.cold_mini);
        timeList.setText(weatherList.getTime());
        statusList.setText(weatherList.getStatus());
        maxTempList.setText(String.valueOf(weatherList.getTempMax()));
        minTempList.setText(String.valueOf(weatherList.getTempMin()));
    }
}

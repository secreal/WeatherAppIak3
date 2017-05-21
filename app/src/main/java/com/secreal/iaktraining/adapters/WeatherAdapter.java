package com.secreal.iaktraining.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.secreal.iaktraining.R;
import com.secreal.iaktraining.adapters.holders.WeatherHolderList;
import com.secreal.iaktraining.models.WeatherModelList;

import java.util.ArrayList;

/**
 * Created by secreal on 5/21/2017.
 * saya ulong :)
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherHolderList>{


    private ArrayList<WeatherModelList> mWeatherModelLists;
    public WeatherAdapter(ArrayList<WeatherModelList> weatherModelLists) {
        this.mWeatherModelLists = weatherModelLists;
    }

    @Override
    public WeatherHolderList onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_weather_list, parent, false);

        return new WeatherHolderList(card);
    }

    //masukin data
    @Override
    public void onBindViewHolder(WeatherHolderList holder, int position) {
        WeatherModelList weatherModelList = mWeatherModelLists.get(position);
        holder.updateUI(weatherModelList);
    }

    //berapa datanya
    @Override
    public int getItemCount() {
        return mWeatherModelLists.size();
    }
}

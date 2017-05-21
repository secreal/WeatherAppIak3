package com.secreal.iaktraining.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.secreal.iaktraining.R;
import com.secreal.iaktraining.ui.fragment.WeatherFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportFragmentManager().beginTransaction().add(R.id.fragmentWeather, new WeatherFragment()).commit();
        FragmentManager fragmentManager = getSupportFragmentManager();
        WeatherFragment weatherFragment = (WeatherFragment) fragmentManager.findFragmentById(R.id.fragmentWeather);
        if(weatherFragment == null){
            weatherFragment = WeatherFragment.newInstance("", "");
            fragmentManager.beginTransaction().add(R.id.fragmentWeather, weatherFragment).commit();
        }

    }
}

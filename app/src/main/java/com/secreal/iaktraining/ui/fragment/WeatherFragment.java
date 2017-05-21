package com.secreal.iaktraining.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.secreal.iaktraining.R;
import com.secreal.iaktraining.config.Constant;
import com.secreal.iaktraining.models.WeatherModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeatherFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeatherFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private  WeatherModel weatherModel = new WeatherModel();
    @BindView(R.id.txTime) TextView txTime;
    @BindView(R.id.txTanggal) TextView txTanggal;
    @BindView(R.id.txMaxTemp) TextView txMaxTemp;
    @BindView(R.id.txMinTemp) TextView txMinTemp;
    @BindView(R.id.txStatus) TextView txStatus;
    @BindView(R.id.txKota) TextView txKota;
    @BindView(R.id.imgUtama) ImageView imgUtama;
    @BindView(R.id.imgCuaca) ImageView imgCuaca;
    public WeatherFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WeatherFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WeatherFragment newInstance(String param1, String param2) {
        WeatherFragment fragment = new WeatherFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_weather, container, false);
        ButterKnife.bind(this, rootView);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, Constant.fullUrl, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                JSONObject cityObject = null;
                JSONArray listArray = null;
                JSONObject jsonIndex0 = null;
                try {
                    cityObject = response.getJSONObject("city");
                    listArray = response.getJSONArray("list");
                    jsonIndex0 = listArray.getJSONObject(0);

                    weatherModel.setCity(cityObject.getString("name"));
                    weatherModel.setTime(jsonIndex0.getString("dt_txt"));


                    txKota.setText(weatherModel.getCity());
                    txTime.setText(weatherModel.getTime());

                    Log.d("List ", String.valueOf(listArray));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
                Volley.newRequestQueue(getContext()).add(jsonObjectRequest);
        return rootView;
    }

}

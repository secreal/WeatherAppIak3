package com.secreal.iaktraining.adapters.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.secreal.iaktraining.R;

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
}

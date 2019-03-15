package com.example.android.sunshine.utilities;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.sunshine.R;

import java.util.List;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {
    private String[] mWeatherData;

    public ForecastAdapter() {

    }

    public void setWeatherData(String[]  weatherData)
    {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_forecast, viewGroup, true);
        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastAdapterViewHolder forecastAdapterViewHolder, int i) {

    }

    @Override
    public void onBindViewHolder(@NonNull ForecastAdapterViewHolder holder, int position, @NonNull List<Object> payloads) {
        holder.mWeatherTextView.setText(payloads.get(position).toString());
    }

    @Override
    public int getItemCount() {
        if(mWeatherData!=null)
        {
            return mWeatherData.length;
        }
        else
        {
            return  0;
        }
    }


    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
        }
    }
}


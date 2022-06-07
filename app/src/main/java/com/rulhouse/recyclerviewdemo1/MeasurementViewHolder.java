package com.rulhouse.recyclerviewdemo1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MeasurementViewHolder extends RecyclerView.ViewHolder {
    private TextView tempTextView;
    private TextView timeTextView;

    public MeasurementViewHolder(@NonNull View itemView) {
        super(itemView);

        tempTextView = itemView.findViewById(R.id.temp);
        timeTextView = itemView.findViewById(R.id.time);
    }

    void setMeasurement(Measurement measurement) {
        tempTextView.setText(measurement.getTemp().toString());
        timeTextView.setText(measurement.getTimeStamp().toString());
    }
}

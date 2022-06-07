package com.rulhouse.recyclerviewdemo1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MeasurementsAdapter extends RecyclerView.Adapter<MeasurementViewHolder> {
    ArrayList<Measurement> measurements = new ArrayList<Measurement>();

    @NonNull
    @Override
    public MeasurementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MeasurementViewHolder(
                LayoutInflater.from(
                        parent.getContext()
                ).inflate(
                        R.layout.measurement_item,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull MeasurementViewHolder holder, int position) {
        holder.setMeasurement(measurements.get(position));
    }

    @Override
    public int getItemCount() {
        if (this.measurements == null) {
            return 0;
        } else {
            return this.measurements.size();
        }
    }

    public void addMeasurement(Measurement measurement) {
        this.measurements.add(measurement);
//        notifyItemChanged(getItemCount() - 1);
        notifyDataSetChanged();
    }
}

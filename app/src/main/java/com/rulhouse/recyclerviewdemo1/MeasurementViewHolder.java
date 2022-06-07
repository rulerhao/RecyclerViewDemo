package com.rulhouse.recyclerviewdemo1;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MeasurementViewHolder extends RecyclerView.ViewHolder {
    private ViewHolderListener myListener;
    interface ViewHolderListener {
        void onDelete(int index);
    }
    void setMyListener(ViewHolderListener myListener) {
        this.myListener = myListener;
    }

    private TextView tempTextView;
    private TextView timeTextView;
    private Button deleteButton;

    public MeasurementViewHolder(@NonNull View itemView, ViewHolderListener listener) {
        super(itemView);

        myListener = listener;

        tempTextView = itemView.findViewById(R.id.temp);
        timeTextView = itemView.findViewById(R.id.time);
        deleteButton = itemView.findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(deleteButtonClickListener);
    }

    void setMeasurement(Measurement measurement, int index) {
        tempTextView.setText(measurement.getTemp().toString());
        timeTextView.setText(measurement.getTimeStamp().toString());
    }

    View.OnClickListener deleteButtonClickListener = v -> {
        myListener.onDelete(getAdapterPosition());
    };
}

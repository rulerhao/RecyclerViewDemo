package com.rulhouse.recyclerviewdemo1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    MeasurementsAdapter adapter;
    Button addButton;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.add_measurement);
        addButton.setOnClickListener(listener);;

        adapter = new MeasurementsAdapter();

        recyclerView = findViewById(R.id.measurementList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    View.OnClickListener listener = v -> {
        adapter.addMeasurement(new Measurement(36.5f + adapter.getItemCount(), System.currentTimeMillis()));
    };
}
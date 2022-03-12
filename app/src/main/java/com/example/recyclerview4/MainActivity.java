package com.example.recyclerview4;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.리사이클러뷰);

        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        timeAdapter adapter = new timeAdapter();

        adapter.addItem(new time(60, 30, 10, 2));
        adapter.addItem(new time(30, 120, 120, 1));
        adapter.addItem(new time(200, 900, 120, 4));
        adapter.addItem(new time(400, 1800, 180, 3));


    }
}
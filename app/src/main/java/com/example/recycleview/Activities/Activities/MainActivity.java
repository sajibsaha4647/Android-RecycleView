package com.example.recycleview.Activities.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview.R;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    int images [] = {
            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,
    };

    String [] title,discript;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecycleViewId);

        title = getResources().getStringArray(R.array.country_name);
        discript = getResources().getStringArray(R.array.country_details);

    }
}
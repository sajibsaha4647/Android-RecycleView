package com.example.recycleview.Activities.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.recycleview.Activities.Myadaptar.MyListAdaptar;
import com.example.recycleview.R;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    int images [] = {
            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,
    };

    String [] title,discript;
    MyListAdaptar myListAdaptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecycleViewId);
        title = getResources().getStringArray(R.array.country_name);
        discript = getResources().getStringArray(R.array.country_details);
        myListAdaptar = new MyListAdaptar(this,title,discript,images);

        recyclerView.setAdapter(myListAdaptar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myListAdaptar.setOnItemClickListener(new MyListAdaptar.Clicklistener() {
            @Override
            public void onItemClick(int Position, View view) {
                Toast.makeText(MainActivity.this,title[Position],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onItemLongClick(int Position, View view) {
                Toast.makeText(MainActivity.this,title[Position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
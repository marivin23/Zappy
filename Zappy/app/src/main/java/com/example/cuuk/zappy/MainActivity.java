package com.example.cuuk.zappy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> raws = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raws.add("Lol");
        raws.add("clacl");
        raws.add("Cacat");
        raws.add("Cacat");
        raws.add("Cacat");
        raws.add("Cacat");

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        RecyclerView rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(gridLayoutManager);
        rv.setAdapter(new RecyclerAdapter(raws, this));

    }
}

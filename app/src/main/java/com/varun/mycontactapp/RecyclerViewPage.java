package com.varun.mycontactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerViewPage extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[],s2[],s3[],s4[];
    int images[] = {R.drawable.businessman,R.drawable.butcher,R.drawable.chief,R.drawable.chinese,
            R.drawable.cowboy,R.drawable.editor,R.drawable.graphicdesigner,R.drawable.homeless,R.drawable.man,R.drawable.trainers};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerviewpage);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Contact_name);


        MyAdapter myAdapter = new MyAdapter(this, s1, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
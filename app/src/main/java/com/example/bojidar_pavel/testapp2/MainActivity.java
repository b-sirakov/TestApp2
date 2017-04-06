package com.example.bojidar_pavel.testapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bojidar_pavel.testapp2.model.Goat;
import com.example.bojidar_pavel.testapp2.model.MyRecylcerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    List<Goat> goats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goats=new ArrayList<Goat>();
        for(int i=0;i<100;i++){
            goats.add(new Goat("Penka",i,R.drawable.img1));
        }
        rv= (RecyclerView) findViewById(R.id.goats_list);
        MyRecylcerViewAdapter myRecylcerViewAdapter=new MyRecylcerViewAdapter(this,goats);

        rv.setAdapter(myRecylcerViewAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));


    }
}

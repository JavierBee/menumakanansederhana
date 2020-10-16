package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[],s2[],s3[];

    int imges[]={R.drawable.groza,R.drawable.hot_cake,R.drawable.karitaco,R.drawable.metostorayaki,R.drawable.pasta,
        R.drawable.pizza,R.drawable.ramen,R.drawable.soup,R.drawable.vegetabel,R.drawable.taco_sushi,R.drawable.noodle_soup};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 =getResources().getStringArray(R.array.makanan);
        s2 =getResources().getStringArray(R.array.harga);
        s3 =getResources().getStringArray(R.array.deskripsion);


        recyclerView =findViewById(R.id.recyclerview);

        MyAdapter myAdapter =new MyAdapter(this,s1,s2,s3,imges);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
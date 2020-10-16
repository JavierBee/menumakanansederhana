package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {


    ImageView gambarutama;
    TextView judul,harga,deskripsi;

    String data1,data2,data3;
    int images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        gambarutama =findViewById(R.id.thegambar);
        judul = findViewById(R.id.judul);
        harga = findViewById(R.id.price);
        deskripsi=findViewById(R.id.deskripsi);

        getData();
        setData();

    }


    private void getData()
    {
        if(getIntent().hasExtra("myimage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data3")&&getIntent().hasExtra("data2"))
        {
            data1 =getIntent().getStringExtra("data1");
            data2 =getIntent().getStringExtra("data2");
            data3 =getIntent().getStringExtra("data3");
            images =getIntent().getIntExtra("myimage",1);
        }
        else
        {
            Toast.makeText(this,"tidak ada data",Toast.LENGTH_SHORT).show();
        }

    }

    private void setData()
    {
        judul.setText(data1);
        harga.setText(data2);
        deskripsi.setText(data3);
        gambarutama.setImageResource(images);
    }
}
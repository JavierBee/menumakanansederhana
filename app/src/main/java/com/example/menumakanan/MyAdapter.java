package com.example.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[];
    String data2[];
    String data3[];
    int images[];
    Context context;

    public MyAdapter(Context ct,String s1[],String s2[],String s3[],int img[])
    {
    context=ct;
    data1=s1;
    data2=s2;
    data3=s3;
    images=img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.menu,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
    holder.text1.setText(data1[position]);
    holder.text2.setText(data2[position]);
    holder.text3.setText(data3[position]);
    holder.myimage.setImageResource(images[position]);

    holder.mainlayout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent =new Intent(context,Activity2.class);
            intent.putExtra("data1",data1[position]);
            intent.putExtra("data2",data2[position]);
            intent.putExtra("data3",data3[position]);
            intent.putExtra("myimage",images[position]);
            context.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text1,text2,text3;
        ImageView myimage;
        ConstraintLayout mainlayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        text1 =itemView.findViewById(R.id.makanan);
        text2 =itemView.findViewById(R.id.harga);
        text3 = itemView.findViewById(R.id.deskrip);
        myimage =itemView.findViewById(R.id.gambar);
        mainlayout = itemView.findViewById(R.id.mainLayout);

        }
    }
}

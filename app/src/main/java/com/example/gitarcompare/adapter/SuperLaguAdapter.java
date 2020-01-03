package com.example.gitarcompare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gitarcompare.R;
import com.example.gitarcompare.models.chart;

import java.util.List;

public class SuperLaguAdapter extends RecyclerView.Adapter<SuperLaguAdapter.MyViewHolder> {
    List<chart> laguList;

    public SuperLaguAdapter(List<chart> laguList) {
        this.laguList = laguList;
    }

    @NonNull
    @Override
    public SuperLaguAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View LaguView = layoutInflater.inflate(R.layout.item_lagu,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(LaguView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SuperLaguAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return (laguList != null)?laguList.size():0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageView foto_lagu = itemView.findViewById(R.id.foto_lagu);
            TextView judul = itemView.findViewById(R.id.judul);
            TextView penyanyi = itemView.findViewById(R.id.penyanyi);
        }
    }
}

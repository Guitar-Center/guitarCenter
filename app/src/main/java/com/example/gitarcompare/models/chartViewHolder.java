package com.example.gitarcompare.models;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gitarcompare.R;

public class chartViewHolder extends RecyclerView.ViewHolder {

    public TextView tvJudul;
    public TextView tvPenyanyi;
    public ImageView ivGambar;
    public TextView btnLagu;

    public chartViewHolder(@NonNull View itemView) {
        super(itemView);
        tvJudul = itemView.findViewById(R.id.judul);
        tvPenyanyi = itemView.findViewById(R.id.penyanyi);
        ivGambar = itemView.findViewById(R.id.foto_lagu);
        btnLagu = itemView.findViewById(R.id.button);
    }

    public void bindToChart(chart Chart, View.OnClickListener onClickListener){
        tvJudul.setText(Chart.judul);
        tvPenyanyi.setText(Chart.penyanyi);
        ivGambar.setImageResource(Integer.parseInt(Chart.gambar));
        btnLagu.setOnClickListener(onClickListener);
    }

}

package com.example.project1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project1.R;
import com.example.project1.models.Pengeluaran;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class pengeluaranAdapter extends RecyclerView.Adapter<pengeluaranAdapter.MyViewHolder> {
    List<Pengeluaran> pengeluaranList;

    public pengeluaranAdapter(List<Pengeluaran> pengeluaranList) {
        this.pengeluaranList = pengeluaranList;
    }

    @Override
    public pengeluaranAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //object context diambil dari parent
        Context context = parent.getContext();
        //object context digunakan untuk membuat object layoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate  layout ( mengubungkan adapter dengan layout)
        View pengeluaranView = layoutInflater.inflate(R.layout.item_listpengeluaran,parent,false);
        //object superHeroView digunakan untuk membuat object viewHolder
        MyViewHolder viewHolder = new MyViewHolder(pengeluaranView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull pengeluaranAdapter.MyViewHolder holder, int position) {
        //ambil satu item hero
        Pengeluaran pengeluaran = pengeluaranList.get(position);
        holder.pengeluaranName.setText(pengeluaran.getNamaPengeluaran());
        holder.jmlhPengeluaran.setText(String.valueOf(pengeluaran.getJumlahPengeluaran()));
    }

    @Override
    public int getItemCount() {
        return pengeluaranList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView pengeluaranName,jmlhPengeluaran;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            pengeluaranName = itemView.findViewById(R.id.txt_namaPengeluaran);
            jmlhPengeluaran = itemView.findViewById(R.id.txt_jmlhPengeluaran);
        }
    }
}

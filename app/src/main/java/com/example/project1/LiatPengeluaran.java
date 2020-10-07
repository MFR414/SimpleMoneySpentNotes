package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.example.project1.adapters.pengeluaranAdapter;
import com.example.project1.models.Pengeluaran;

import java.util.ArrayList;
import java.util.List;

public class LiatPengeluaran extends AppCompatActivity {
    //instansiasi Recyclerview
    RecyclerView rvPengeluaran;
    //instansiasi list superhero
    List<Pengeluaran> listPengeluaran = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //make activity fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);

        //Hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_liat_pengeluaran);
        listPengeluaran = MainMenu.listPengeluaran;
        //menyambungkan rvSuperHero ke layout
        rvPengeluaran = findViewById(R.id.rv_listPengeluaran);
        //Instansiasi Adapter
        pengeluaranAdapter adapter = new pengeluaranAdapter(listPengeluaran);
        //set adapter dan layoutmanager
        rvPengeluaran.setAdapter(adapter);
        rvPengeluaran.setLayoutManager(new LinearLayoutManager(this));
    }
}
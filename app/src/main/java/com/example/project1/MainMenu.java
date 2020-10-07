package com.example.project1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.project1.models.Pengeluaran;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {
    public static List<Pengeluaran> listPengeluaran = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //make activity fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main_menu);

        //Hide the action bar
        getSupportActionBar().hide();
    }

    public void tmbhPengeluaran(View view) {
        Intent intent= new Intent(MainMenu.this,tambahPengeluaran.class);
        startActivityForResult(intent,99);
    }

    public void liatListPengeluaran(View view) {
        Intent intent= new Intent(MainMenu.this,LiatPengeluaran.class);
        startActivity(intent);
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//
//        if (requestCode != 99 || resultCode != RESULT_OK) {
//            Pengeluaran pengeluaran = getIntent().getParcelableExtra("dataPengeluaran");
//            if(listPengeluaran.size() == 0) {
//                listPengeluaran.add(pengeluaran);
////                Log.e("dataNama","Data0: "+listPengeluaran.get(0).getNamaPengeluaran());
////                Log.e("dataJumlah","Data0: "+listPengeluaran.get(0).getJumlahPengeluaran());
//            }
//            else if(listPengeluaran.size() !=0) {
//                for(int i=0;i<listPengeluaran.size();i++){
//                    listPengeluaran.add(listPengeluaran.size(),pengeluaran);
////                    Log.e("dataNama","Data"+i+": "+listPengeluaran.get(i).getNamaPengeluaran());
////                    Log.e("dataJumlah","Data"+i+": "+listPengeluaran.get(i).getJumlahPengeluaran());
//                }
//            }
//        }else{
//            super.onActivityResult(requestCode, resultCode, data);
//        }
//    }
}
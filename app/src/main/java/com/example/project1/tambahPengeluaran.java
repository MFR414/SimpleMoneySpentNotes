package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project1.models.Pengeluaran;

public class tambahPengeluaran extends AppCompatActivity {
    EditText namaPengeluaran,jmlhPengeluaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //make activity fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_tambah_pengeluaran);

        //Hide the action bar
        getSupportActionBar().hide();

        namaPengeluaran = findViewById(R.id.edt_namaPengeluaran);
        jmlhPengeluaran = findViewById(R.id.edt_jumlahPengeluaran);
    }

    public void simpanPengeluaran(View view) {
        String namaPengeluaranText = namaPengeluaran.getText().toString();
        String jmlhPengeluaranText = jmlhPengeluaran.getText().toString();

        if(isAngka(jmlhPengeluaranText)){
            MainMenu.listPengeluaran.add(new Pengeluaran(namaPengeluaranText,Integer.parseInt(jmlhPengeluaranText)));
            Toast.makeText(this, "Data Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
            Intent main = new Intent(this,MainMenu.class);
            startActivity(main);
            finish();
        }else{
            Toast.makeText(this, "Jumlah Pengeluaran Harus Angka", Toast.LENGTH_SHORT).show();
        }

    }

    private boolean isAngka(String jmlhPengeluaranText) {
        //parse dari kelas double
        try {
            Double.parseDouble(jmlhPengeluaranText);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
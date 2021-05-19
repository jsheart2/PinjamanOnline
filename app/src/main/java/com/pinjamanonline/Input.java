package com.pinjamanonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;




public class Input extends AppCompatActivity {

    TextView name, tempat, telpon, gaji, pinjaman;
    EditText nama, tinggal, phone, nmrktp, salary, modal, id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        // Text //
        name     = findViewById(R.id.txtname);
        tempat   = findViewById(R.id.txttinggal);
        telpon   = findViewById(R.id.txthp);
        gaji     = findViewById(R.id.txtomzet);
        pinjaman = findViewById(R.id.txtpinjaman);

        // Edit Text //
        nama     = findViewById(R.id.edtname);
        tinggal  = findViewById(R.id.edttinggal);
        phone    = findViewById(R.id.edtphone);
        nmrktp   = findViewById(R.id.edtktp);
        salary   = findViewById(R.id.edtgaji);
        modal    = findViewById(R.id.edtpinjaman);

    }



    public void kembali(View view)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }

    public void process(View view)
    {
        id       = findViewById(R.id.edtid);
        nama     = findViewById(R.id.edtname);
        tinggal  = findViewById(R.id.edttinggal);
        phone    = findViewById(R.id.edtphone);
        nmrktp   = findViewById(R.id.edtktp);
        salary   = findViewById(R.id.edtgaji);
        modal    = findViewById(R.id.edtpinjaman);

        String nomerurut   = id.getText().toString().trim();
        String namapemohon = nama.getText().toString().trim();
        String alamat      = tinggal.getText().toString().trim();
        String telepon     = phone.getText().toString().trim();
        String KTP         = nmrktp.getText().toString().trim();
        String duit        = salary.getText().toString().trim();
        String pinjaman    = modal.getText().toString().trim();

        dataholder obj         = new dataholder(namapemohon,alamat,telepon,KTP,duit,pinjaman);
        FirebaseDatabase db    = FirebaseDatabase.getInstance();
        DatabaseReference node = db.getReference("Data Peminjam");

        node.child(nomerurut).setValue(obj);

        id.setText("");
        nama.setText("");
        tinggal.setText("");
        phone.setText("");
        nmrktp.setText("");
        salary.setText("");
        modal.setText("");
        Toast.makeText(getApplicationContext(), "Data Sudah Di Tambahkan", Toast.LENGTH_LONG).show();
    }
}
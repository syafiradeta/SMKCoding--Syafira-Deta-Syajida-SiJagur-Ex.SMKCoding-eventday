package com.rizki.gurukudev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nama, nik, alamat, usia, institusi;
    TextView hnama, hnik, halamat, humur, hinstitusi;
    Button btnsimpan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.name);
        nik = (EditText) findViewById(R.id.input_nis);
        alamat = (EditText) findViewById(R.id.input_kelas);
        usia = (EditText) findViewById(R.id.input_Jam);
        institusi = (EditText) findViewById(R.id.input_Mapel);
        hnama = (TextView) findViewById(R.id.hasil_nama);
        hnik = (TextView) findViewById(R.id.hasil_nik);
        halamat= (TextView) findViewById(R.id.hasil_alamat);
        humur= (TextView) findViewById(R.id.hasil_umur);
        hinstitusi= (TextView) findViewById(R.id.hasil_institusi);
        btnsimpan = (Button) findViewById(R.id.simpan_button);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namae, alam, usi, institus;
                String nomorik;

                namae = nama.getText().toString().trim();
                alam = alamat.getText().toString().trim();
                usi = usia.getText().toString().trim();
                institus = institusi.getText().toString().trim();

                nomorik = nik.getText().toString().trim();

                hnama.setText(namae);
                hnik.setText(nomorik);
                halamat.setText(alam);
                humur.setText(usi);
                hinstitusi.setText(institus);
            }
        });
    }
}

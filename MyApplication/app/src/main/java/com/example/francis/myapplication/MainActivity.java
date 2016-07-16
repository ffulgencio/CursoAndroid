package com.example.francis.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre =  (EditText) findViewById(R.id.edNombre);
        Button boton1 = (Button) findViewById(R.id.btnGuardar);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), getResources().getString(R.string.txtNombre), Toast.LENGTH_SHORT).show();
            }
        });

        boton1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                nombre.setText("Ramon Capota");

                return false;
            }
        });

    }
}

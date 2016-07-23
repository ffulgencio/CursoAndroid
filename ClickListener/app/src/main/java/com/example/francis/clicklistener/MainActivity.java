package com.example.francis.clicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton2 = (Button) findViewById(R.id.button2);
        //Especificar
       // boton2.setOnClickListener(this);

        Button boton3 = (Button) findViewById(R.id.button3);
       // boton3.setOnClickListener(this);
    }

    public void ClickXML(View v){
        Toast.makeText(getApplicationContext(),"Click XML",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button2) {
            Toast.makeText(getApplicationContext(), "Interfaz", Toast.LENGTH_SHORT).show();
        }
        if (view.getId()==R.id.button3) {
            Toast.makeText(getApplicationContext(), "Has presionado el boton 3", Toast.LENGTH_SHORT).show();
        }
    }
}

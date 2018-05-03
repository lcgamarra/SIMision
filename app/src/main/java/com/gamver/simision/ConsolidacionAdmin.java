package com.gamver.simision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConsolidacionAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consolidacion_admin);
    }

    public void misConsolidacionesClick(View v){

        Intent intent = new Intent(this, MisConsolidaciones.class);
        startActivity(intent);
    }

    public void asignarConsolidadorClick(View v){

        Intent intent = new Intent(this, AsignarConsolidador.class);
        startActivity(intent);
    }

}

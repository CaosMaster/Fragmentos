package com.example.dm2.aplicacionconfragmentos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dm2 on 10/11/2017.
 */

public class Detalle_Activity extends AppCompatActivity {
    public static final String EXTRA_TEXTO="com.example.dm2.aplicacionconfragmentos.EXTRA_TEXTO";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        FragmentDetalle detalle = (FragmentDetalle) getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);
        detalle.mostrarDetalle(getIntent().getStringExtra(this.EXTRA_TEXTO));
    }
}

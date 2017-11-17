package com.example.dm2.aplicacionconfragmentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.dm2.aplicacionconfragmentos.FragmentListado.SubHeroesListener;

public class MainActivity extends AppCompatActivity implements SubHeroesListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Log.i("AAA", "aaaa");

        FragmentListado frgListado = (FragmentListado) getSupportFragmentManager().findFragmentById(R.id.FrgListado);
        frgListado.setSubHeroesListener(this);

    }
    public void onSubheroeSeleccionado(SubHeroe sh) {
        boolean haydetalle = (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)!=null);
        if(haydetalle){
            ((FragmentDetalle) getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)).mostrarDetalle(sh.getSubpoder());

        }
        else{
            Intent i = new Intent(this, Detalle_Activity.class);
            i.putExtra(Detalle_Activity.EXTRA_TEXTO, sh.getSubpoder());
            startActivity(i);
        }
    }
}

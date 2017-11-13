package com.example.dm2.aplicacionconfragmentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.dm2.aplicacionconfragmentos.FragmentListado.SubHeroesListener;

public class MainActivity extends AppCompatActivity implements SubHeroesListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentListado frgListado = (FragmentListado) getSupportFragmentManager().findFragmentById(R.id.FrgListado);
        frgListado.setSubHeroesListener(this);

    }

    @Override
    public void onSubheroeSeleccionado(SubHeroe sh) {
        boolean haydetalle = (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)!=null);
        if(haydetalle){
            ((FragmentDetalle) getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)).mostrarDetalle(sh.getSubpoder());
        }
    }
}

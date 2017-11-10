package com.example.dm2.aplicacionconfragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by dm2 on 10/11/2017.
 */

public class FragmentDetalle extends Fragment {

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return  inflater.inflate(R.layout.fragment_detalle, container, false);

    }

    public void mostrarDetalle(String texto){
        TextView txtDetalle = (TextView)getView().findViewById(R.id.txtDetalle);
        txtDetalle.setText(texto);
    }
}

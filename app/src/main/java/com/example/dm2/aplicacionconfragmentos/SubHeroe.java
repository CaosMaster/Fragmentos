package com.example.dm2.aplicacionconfragmentos;

import java.io.Serializable;

/**
 * Created by dm2 on 08/11/2017.
 */

public class SubHeroe implements Serializable {
    private String nombre, nombreReal, subpoder, motivacion, archienemigo;

    public SubHeroe(String nombre, String nombreReal, String subpoder, String motivacion, String archienemigo) {
        this.nombre = nombre;
        this.nombreReal = nombreReal;
        this.subpoder = subpoder;
        this.motivacion = motivacion;
        this.archienemigo = archienemigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getSubpoder() {
        return subpoder;
    }

    public void setSubpoder(String subpoder) {
        this.subpoder = subpoder;
    }

    public String getMotivacion() {
        return motivacion;
    }

    public void setMotivacion(String motivacion) {
        this.motivacion = motivacion;
    }

    public String getArchienemigo() {
        return archienemigo;
    }

    public void setArchienemigo(String archienemigo) {
        this.archienemigo = archienemigo;
    }
}

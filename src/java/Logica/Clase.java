/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author cruz jonathan
 */
public abstract class Clase {
    
    protected String poder;
    protected Capas capa;
    protected Sombrero sombrero;
    protected Escudos escudo;
    protected String rutaimagen;

    public String getRutaimagen() {
        return rutaimagen;
    }
    
    
    

 

    public void setCapa(Capas capa) {
        this.capa = capa;
    }

    public void setSombrero(Sombrero sombrero) {
        this.sombrero = sombrero;
    }

    public void setEscudo(Escudos escudo) {
        this.escudo = escudo;
    }

    public String getPoder() {
        return poder;
    }

    public Capas getCapa() {
        return capa;
    }

    public Sombrero getSombrero() {
        return sombrero;
    }

    public Escudos getEscudo() {
        return escudo;
    }
    
    
    
    
    public abstract void poderes();
}

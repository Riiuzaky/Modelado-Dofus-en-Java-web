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
public class SomberoDelGultar extends Sombrero {

    public SomberoDelGultar() {
        this.rutaimagen="sombrerodegultar.png";
        this.efecto="Da mas 220 de Vitalidad y Otroga el titulo de: Asessino";
    }

    
    
    @Override
    public void efectos() {
        this.efecto="Da mas 220 de Vitalidad y Otroga el titulo de: Asessino";
    }
    
}

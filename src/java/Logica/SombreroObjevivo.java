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
public class SombreroObjevivo extends Sombrero{

    public SombreroObjevivo() {
        this.rutaimagen="sombreroobjevivo.jpg";
        this.efecto="Da mas 100 de vitalidad";
    }

    
    
    @Override
    public void efectos() {
       this.efecto="Da mas 100 de vitalidad";
    }
    
}

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
public class SombreroDelRobleblando extends Sombrero{

    public SombreroDelRobleblando() {
        this.rutaimagen="sombrerodelrobleblando.png";
        this.efecto="Da mas 160 de vitalidad";
    }

    
    
    @Override
    public void efectos() {
        this.efecto="Da mas 160 de vitalidad";
    }
    
}

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
public class CapaDeVeloTinta extends Capas{

    public CapaDeVeloTinta() {
        this.rutaimagen="capavelotinta.png";
        this.efecto="Añade 180 puntos de vitalidad";
    }

    
    
    
    
    @Override
    public void efectos() {
        this.efecto="Añade 180 puntos de vitalidad";
    }
    
}

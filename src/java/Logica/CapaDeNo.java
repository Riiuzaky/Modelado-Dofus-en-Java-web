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
public class CapaDeNo extends Capas{

    public CapaDeNo() {
        this.rutaimagen="capano.png";
         this.efecto="Añade 90 Puntos de Vitalidad";
    }

    
    
    @Override
    public void efectos() {
        this.efecto="Añade 90 Puntos de Vitalidad";
    }
    
}

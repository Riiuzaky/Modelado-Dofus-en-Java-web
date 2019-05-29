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
public abstract class Capas {
    protected String rutaimagen;
    public String efecto;

    public String getRutaimagen() {
        return rutaimagen;
    }

    public String getEfecto() {
        return efecto;
    }
    
    
    
    
    public abstract void efectos(); 
    
}

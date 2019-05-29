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
public class EscudoDelCapitanAmakna extends Escudos {

    public EscudoDelCapitanAmakna() {
        this.rutaimagen="escudodelcapitanamakna.png";
        this.efecto="Da mas 80 de escudo";
    }

    
    
    @Override
    public void efectos() {
        this.efecto="Da mas 80 de escudo";
    }
    
}

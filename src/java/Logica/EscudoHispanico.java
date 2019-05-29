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
public class EscudoHispanico  extends Escudos{

    public EscudoHispanico() {
        this.rutaimagen="escudohispanico.png";
         this.efecto="Da mas 100 de escudo y otorga el titulo Caballero hispanico";
    }
    
    

    @Override
    public void efectos() {
        
        this.efecto="Da mas 100 de escudo y otorga el titulo Caballero hispanico";
    }
    
}

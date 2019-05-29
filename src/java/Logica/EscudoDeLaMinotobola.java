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
public class EscudoDeLaMinotobola extends Escudos  {

    public EscudoDeLaMinotobola() {
        this.rutaimagen="escudodelaminotobola.jpg";
        this.efecto="Da mas 60 de escudo y otorga el titulo de Nawidista grandilocuente";
    }

    
    @Override
    public void efectos() {
        this.efecto="Da mas 60 de escudo y otorga el titulo de Nawidista grandilocuente";
    }
    
}

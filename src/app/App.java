/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import entidad.Cine;
import entidad.Espectador;
import java.util.ArrayList;
import servicio.CineServicio;

/**
 *
 * @author JUAN VILCHEZ
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineServicio cs = new CineServicio();
        Cine c = cs.crearCine();
        
        for(int i=0; i<8;i++){
            for(int j=0; j<6; j++){
                System.out.print("["+c.getSala()[i][j].getUbicacion()+"]");
            }
            System.out.println("");
        }
        
        for(String aLibre: c.getDisponible()){
            System.out.print("["+aLibre+"]");
        }
        
        ArrayList<Espectador> e = cs.crearListaEspectador();
        
        for(Espectador es: e){
            System.out.println(es.toString().toString());
        }
        
        cs.validarListaEspectadores(e, c);
        
        for(int i=0; i<8;i++){
            for(int j=0; j<6; j++){
                System.out.print("["+c.getSala()[i][j].getUbicacion()+"]");
            }
            System.out.println("");
        }
        
        for(int i=0; i<8;i++){
            for(int j=0; j<6; j++){
                System.out.println(c.getSala()[i][j].toString());
            }
            System.out.println("");
        }
    }
    
    
    
}

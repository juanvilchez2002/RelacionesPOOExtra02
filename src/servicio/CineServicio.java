
package servicio;

import entidad.Asientos;
import entidad.Cine;
import entidad.Espectador;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;


public class CineServicio {
    
    Scanner consola = new Scanner(System.in);
    
    ArrayList<Espectador> espectador;
    Cine cine;
    
    public CineServicio(){
        espectador= new ArrayList();
        cine = new Cine();
    }
    
    public Cine crearCine(){
        //info de la pelicula y precio
        cine.setPelicula(new Pelicula("Dune", 215, 18, "No me acuerdo"));
        cine.setPrecio(25000);
        
        //creando la matriz de los asientos
        Asientos[][] sala = new Asientos[8][6];
        ArrayList<String> libres = new ArrayList();
        
        for(int i=0; i<=7; i++){
            for(int j=0; j<=5; j++){
                int aux = 8-i;
                String ubi = String.valueOf(aux);
                switch(j){
                    case 0: ubi=ubi.concat("A");
                    break;
                    case 1: ubi=ubi.concat("B");
                    break;
                    case 2: ubi=ubi.concat("C");
                    break;
                    case 3: ubi=ubi.concat("D");
                    break;
                    case 4: ubi=ubi.concat("E");
                    break;
                    case 5: ubi=ubi.concat("F");
                    break;
                    default:
                        System.out.println("Error en asiento");
                    
                }
                sala[i][j]= new Asientos(null, ubi);
                libres.add(ubi);
            }
        }
        cine.setSala(sala);
        cine.setDisponible(libres);
        
        return cine;
    }
    
    public ArrayList<Espectador> crearListaEspectador(){
        
        //creamos un nro aleatorio de posibles espectadores
        int cantidad = (int)(Math.random()*48)+15;
        
        for(int i=0; i<cantidad; i++){
            espectador.add(new Espectador(String.valueOf(i+1), (int)(Math.random()*(65-10)+10), (int)(Math.random()*(40000-15000)+15000)));
        }
        
        System.out.println("Cantidad: "+espectador.size());
        return espectador;
    }
    
    public void validarListaEspectadores(ArrayList<Espectador> espectador, Cine cine){
    
        for(Espectador espec: espectador){
            //validamos que se tenga la edad minima, dinero para pagar y exista asientos disponibles
            if(espec.getEdad()>= cine.getPelicula().getEdadMin() && espec.getDinero()>=cine.getPrecio() && cine.getDisponible().size()>0){
                espec.setDinero((int) (espec.getDinero()-cine.getPrecio())); // actualizamos el monto del espectador
                
                //ubicacion de la sala
                int pos = (int)(Math.random() * cine.getDisponible().size());
                String ubicacion = cine.getDisponible().get(pos);
                cine.getDisponible().remove(pos);
                
                Asientos auxiliar[][] = cine.getSala();
                for(int i=0; i<8; i++){
                    for(int j=0; j<6; j++){
                        if(auxiliar[i][j].getUbicacion().equalsIgnoreCase(ubicacion)){
                            auxiliar[i][j].setE(espec);
                            auxiliar[i][j].setUbicacion(ubicacion.concat(" X"));
                        }
                    }
                }
            }
        }
        
    }
}

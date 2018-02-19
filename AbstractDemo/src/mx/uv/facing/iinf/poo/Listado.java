package mx.uv.facing.iinf.poo;

import java.util.ArrayList;

public class Listado {
    ArrayList<ProfesorInterino> listadoInterinos = new ArrayList<> ();
    ArrayList<ProfesorTitular> listadoTitulares = new ArrayList<> ();
    
    public void addProfesorInterino (ProfesorInterino interino) {
        listadoInterinos.add (interino);
    }
    
    public void addProfesorTitular (ProfesorTitular titular) {
        listadoTitulares.add (titular);
    }
    
    
    public void addProfesor (Profesor p) {
       if (p instanceof ProfesorTitular)
           listadoTitulares.add ((ProfesorTitular) p);
       else
           listadoInterinos.add ((ProfesorInterino) p);
           
    }
    
    void mostrarInterinos () {
        for (ProfesorInterino item: listadoInterinos) {
            System.out.println (item);
        }
    }
    
    void mostrarTitulares () {
        for (Object item: listadoTitulares) {
            System.out.println (item);
        }
    }
    
}

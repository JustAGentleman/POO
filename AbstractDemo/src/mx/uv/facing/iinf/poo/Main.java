package mx.uv.facing.iinf.poo;

import mx.uv.facing.iinf.base.EntryPoint;

public class Main {
    public static void main (String [] args) {  
        ProfesorInterino i1 = new ProfesorInterino ();
        i1.setNombre ("Perla");
        i1.setApellidos ("Avendaño");
        i1.setEdad (29);        
        
        ProfesorTitular p1 = new ProfesorTitular ();
        p1.setNombre ("Karina");
        p1.setApellidos ("Trinidad");
        p1.setEdad (28);
        
        Listado listado = new Listado ();
        listado.addProfesorInterino (i1);
        listado.addProfesorTitular (p1);
        
        listado.mostrarInterinos ();
        
        float foo = EntryPoint.calcularNomina ();
        System.out.println (foo);
    }
}

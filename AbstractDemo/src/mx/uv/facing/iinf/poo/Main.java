package mx.uv.facing.iinf.poo;

import java.util.Calendar;

public class Main {
    public static void main (String [] args) {
        Listado listado = new Listado ();
        
        Calendar calendar = Calendar.getInstance ();
        
        calendar.set(2018, 1, 16);
                
        ProfesorInterino pi = new ProfesorInterino (calendar.getTime ());
        pi.setNombre ("Luis Felipe");
        pi.setApellidos ("Marín Urías");
        pi.setEdad (35);
        
        listado.addProfesorInterino (pi);
        
        calendar.set(2018, 2, 1);
        
        pi = new ProfesorInterino (calendar.getTime ());
        pi.setNombre ("Carlos Arturo");
        pi.setApellidos ("Cerón");
        pi.setEdad (35);
        
        listado.addProfesorInterino (pi);
        
        calendar.set(2018, 2, 1);

        pi = new ProfesorInterino (calendar.getTime ());
        pi.setNombre ("José Manuel");
        pi.setApellidos ("Cartas Sánchez");
        pi.setEdad (38);

        listado.addProfesorInterino (pi);

        calendar.set(2018, 2, 16);
        
        pi = new ProfesorInterino (calendar.getTime ());
        pi.setNombre ("Arturo");
        pi.setApellidos ("Madrid Gil");
        pi.setEdad (48);

        listado.addProfesorInterino (pi);
        
        ProfesorTitular pt = new ProfesorTitular ();
        pt.setNombre ("Diana Ivette");
        pt.setApellidos ("Montejo Arroyo");
        pt.setEdad (30);

        listado.addProfesorTitular (pt);

        pt = new ProfesorTitular ();
        pt.setNombre ("Ileana");
        pt.setApellidos("Saenz");
        pt.setEdad (40);
        
        listado.addProfesorTitular (pt);
        
        pt = new ProfesorTitular ();
        pt.setNombre ("Sonia");
        pt.setApellidos("González");
        pt.setEdad (38);
        
        listado.addProfesorTitular (pt);
        
        pt = new ProfesorTitular ();
        pt.setNombre ("Martha");
        pt.setApellidos("Fierro");
        pt.setEdad (40);
        
        listado.addProfesorTitular (pt);

        pt = new ProfesorTitular ();
        pt.setNombre ("Esther");
        pt.setApellidos("Narvaez");
        pt.setEdad (37);
        
        listado.addProfesorTitular (pt);
        
        pt = new ProfesorTitular ();
        pt.setNombre ("Abigail");
        pt.setApellidos("Zamora");
        pt.setEdad (40);
        
        listado.addProfesor (pt);
        
        listado.mostrarInterinos ();
        listado.mostrarTitulares ();
      
    }
}

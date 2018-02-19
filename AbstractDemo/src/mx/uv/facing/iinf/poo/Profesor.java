package mx.uv.facing.iinf.poo;

public abstract class Profesor extends Persona {    
    private String idProfesor;

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }
    
    public Profesor () {}
    
    public Profesor (String id, String n, String a, int e) {
        this.idProfesor = id;
        
        super.setNombre(n);
        super.setApellidos (a);
        super.setEdad (e);
    }
    
    public void mostrarDatos () {
        
    }
    
    @Override
    public String toString () {
        return String.format ("Profesor %s %s Edad %d", getNombre (), getApellidos (), getEdad ());
    }
    
    public abstract float importeNomina ();
    
}

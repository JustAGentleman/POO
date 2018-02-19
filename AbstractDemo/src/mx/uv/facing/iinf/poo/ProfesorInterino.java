package mx.uv.facing.iinf.poo;

import java.util.Date;

public class ProfesorInterino extends Profesor {
    private Date fechaInicioInterinato;
    
    public ProfesorInterino (Date fecIniInter) {
        fechaInicioInterinato = fecIniInter;
    }
    
    public ProfesorInterino (String n, String a, int e, Date fecIniInter) {
        super.setNombre(n);
        super.setApellidos(a);
        super.setEdad(e);
        
        fechaInicioInterinato = fecIniInter;
    }
    
    @Override
    public float importeNomina () {
        return 100.0f;
    }
  
}

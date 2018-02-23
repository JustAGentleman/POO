
package mx.uv.facing.iinf.poo;

public class Main {

    public static void main(String[] args) {
        ObjectTupla [] otVector = {
            new ObjectTupla ("Santiago Bernabéu", 125000),
            new ObjectTupla ("Camp Nou", 159000),
            new ObjectTupla ("Old Trafford", 95000)
        };
        
        GenericTupla [] gtVector = {
            new GenericTupla<> ("Santiago Bernabéu", 125000),
            new GenericTupla<> ("Camp Nou", 159000),
            new GenericTupla<> ("Old Trafford", 165000.00)
        };

        System.out.println (String.format ("Object\n\tEstadio con mayor capacidad: %s", estadioMayorCapacidad (otVector)));
        System.out.println (String.format ("Object\n\tEstadio con mayor capacidad: %s", estadioMayorCapacidadGeneric (gtVector)));
    }
        
    public static String estadioMayorCapacidad (ObjectTupla [] estadios) {
        int foo = -1;
        String result = "";
        
        for (int i = 0; i < estadios.length; i++) {
            int bar = (int) estadios [i].getSecond (); //casting from object to int
            if (bar > foo) {
                result = estadios [i].getFirst ().toString ();
                foo = (int) estadios [i].getSecond ();
            }
        }
        
        return result;
    }
  
    public static String estadioMayorCapacidadGeneric (GenericTupla [] estadios) {
        int foo = -1;
        String result = "";
        
        for (int i = 0; i < estadios.length; i++) {
            int bar = getIntegerPart ((Number) estadios [i].getValue ());
            if (bar > foo) {
                result = estadios [i].getKey ().toString ();
                foo = getIntegerPart ((Number) estadios [i].getValue ());
            }
        }
        
        return result;
    }
    
    static int getIntegerPart (Number n) {
        return n.intValue ();
    }
}

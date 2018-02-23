package mx.uv.facing.iinf.poo;

import java.util.ArrayList;

public class Utilities {
    
    public static <T> void fill (ArrayList<T> list, T val) {
        for (int i = 0; i < list.size (); i++) {
            list.set (i, val);
        }
    }
    
    public static <T, U> double multiply (ArrayList<T> list, U val) {
        double result = 0.0;
        
        for (int i = 0; i < list.size (); i++) {
            result += ((Number) val).doubleValue () * ((Number) list.get (i)).doubleValue ();
        }
        
        return result;
    }
}

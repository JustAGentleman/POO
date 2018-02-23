package mx.uv.facing.iinf.poo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<> ();
        intList.add (10);
        intList.add (20);
        
        //System.out.println ("Lista original :" + intList);
        //Utilities.<Integer> fill (intList, 500);
        //System.out.println ("Lista modificada :" + intList);
        
        Double d = Utilities.multiply (intList, 2.5);
        System.out.println ("Resultado de la multiplicación :" + d);
    }
    
}

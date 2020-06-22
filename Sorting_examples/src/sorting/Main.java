package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //Plain Main method for the simple sorting techniques

	    //1. Sort an array
        String[] classes = new String[] {
          "Logic", "Geometry", "DataStructures", "Prog2",
          "OOP", "Numeric", "History", "Sports"
        };

        Arrays.sort(classes);

        System.out.println("Arrays Sort method: ");
        int i = 0;
        for(String tmp : classes) {
            System.out.println("class: " + ++i + " : " + tmp);
        }

        //2.Sort an ArrayList
        ArrayList<String> ClassarrayList = new ArrayList<>();

        ClassarrayList.add("Prog1");
        ClassarrayList.add("Architecture");
        ClassarrayList.add("Discrete maths");
        ClassarrayList.add("Analysis");
        ClassarrayList.add("Algebra");

        System.out.println();
        Collections.sort(ClassarrayList);

        System.out.println("Collections Sort method: ");
        int j = 0;
        for(String aux : ClassarrayList) {
            System.out.println("class: "+ ++j + " : "+ aux);
        }
    }
}

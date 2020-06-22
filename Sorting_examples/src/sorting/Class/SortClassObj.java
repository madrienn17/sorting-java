package sorting.Class;

import java.util.Arrays;
import java.util.Comparator;

/**
 * author: @madrienn17
 **/

public class SortClassObj {
    public static void main(String[] args) {
        /* An array with Class type elements**/
        Class[] classes = new Class[5];

        // creating Class elements
        Class info = new Class("Prog1", "Arnold Smith",4);
        Class analysis = new Class("Analysis","Dutch Robert",4.5);
        Class history = new Class("History", "Parker Zack", 2);
        Class sport = new Class("Sports", "Pernadza Maria",1);
        Class architecture = new Class("Architecture", "Bird Rossi", 4);

        //putting them into the array
        classes[0] = info;
        classes[1] = analysis;
        classes[2] = history;
        classes[3] = sport;
        classes[4] = architecture;

        Arrays.sort(classes);
        System.out.println("Sort by teacher's name descending order: ");

        for(Class elem: classes) {
            System.out.println(elem.toString());
        }

        System.out.println();
        System.out.println("********************");

        Arrays.sort(classes, Class.ClassNameComparator);
        System.out.println("Sort by class name ascending: ");

        for(Class elem: classes) {
            System.out.println(elem.toString());
        }

        System.out.println();
        System.out.println("********************");

        // using anonymous inner class to sort classes by nr of hrs per week
        // ascending order
        Arrays.sort(classes, new Comparator<Class>() {
            @Override
        public int compare(Class class1, Class class2) {

            Double classperweek1 = class1.getClassHrs();
            Double classperweek2 = class2.getClassHrs();

            //ascending ord
            return classperweek1.compareTo(classperweek2);

            //descending ord
            //return classperweek2.compareTo(classperweek1);
        }
        });

        System.out.println("Sort by hrs/week ascending: ");

        for(Class elem: classes) {
            System.out.println(elem.toString());
        }
    }
}

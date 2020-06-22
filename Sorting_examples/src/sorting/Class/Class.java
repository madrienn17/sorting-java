package sorting.Class;

import java.util.Comparator;

public class Class implements Comparable<Class>{

    private String className; // the class's name
    private String classTeacher; // the teacher's name
    private double classHrs; // how many hrs per week

    //constructor
    public Class(String name, String teacher, double hrs) {
        this.className = name;
        this.classTeacher = teacher;
        this.classHrs = hrs;
    }

    //getters
    public String getClassName() {
        return className;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public double getClassHrs() {
        return classHrs;
    }

    //sorting by teachers name with compareTo
    @Override
    public int compareTo(Class compareClass) {
        String compareTeacher = ((Class) compareClass).getClassTeacher();

        //ascending order
       // return this.classTeacher.compareToIgnoreCase(compareTeacher);

        //descending order
        return compareTeacher.compareToIgnoreCase(this.classTeacher);
    }

    //sorting classes by name with Comparator
    public static Comparator<Class> ClassNameComparator = new Comparator<Class>() {
        @Override
        public int compare(Class class1, Class class2) {

            String classname1 = class1.getClassName().toUpperCase();
            String classname2 = class2.getClassName().toUpperCase();

            //ascending ord
            return classname1.compareTo(classname2);

            //descending ord
            //return class2.compareTo(class1);
        }
    };

    //toString method to display the class attributes nicely
    @Override
    public String toString() {
        return "className: " + className  +
                ", Teacher: " + classTeacher  +
                ", Hrs/week: " + classHrs;
    }
}

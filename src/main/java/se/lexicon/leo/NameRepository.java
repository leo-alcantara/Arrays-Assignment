package se.lexicon.leo;

import java.util.Arrays;

public class NameRepository {

    //Method 01
    public static int getSize(String[] names) {
        int size = names.length;
        System.out.println("The size of the array is: " + size);
        return size;
    }

    //Method 02
    public static void clear(String[] string) {
        //int j = 0;
        //for (int i = 0; i < string.length; i++) {
         //   for (j = 0; j < string.length; j++) {
           //     if (i == j) {
        string = null;
        System.out.println(Arrays.toString(string));

    }
           // }

      //  }

    //}

    //Method 03
    /*public static boolean add (final String fullName){
       String[] names = Arrays.copyOf(names, names.length + 1);
       //fullName[fullName.length - 1] = elementToAdd;
        if()
       return true;
    }*/

    /*Method 04
    public static String find(final String fullName){


    }*/

    /*Method 05
    public static String[] findAll(){


    }*/

    /*Method 06
    public static boolean update(final String original, final String updatedName){


    }*/

    /*Method 07
    public static String[] findByFirstName(final String firstName){


    }*/


    /*Method 08
    public static String[] findByLastName(final String lastName){


    }*/

    private static String[] names = {"Leo", "Sophie", "Noelle", "Philip", "Goran", "Elisabeth"};

    public static void main(String[] args) {

        clear(names);


        //getSize(names);


    }



}

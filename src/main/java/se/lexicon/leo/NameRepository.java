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
    public static void clear(String[] input) {
        //int j = 0;
        //for (int i = 0; i < string.length; i++) {
         //   for (j = 0; j < string.length; j++) {
           //     if (i == j) {
        // }
        //  }
        //}
        input = Arrays.copyOf(input, input.length - input.length);
        System.out.println(Arrays.toString(input));

    }

    //Method 03
    public static boolean add (final String[] fullName){
        String nameToAdd = new String();
        names = Arrays.copyOf(fullName, fullName.length + 1);
        fullName[fullName.length -1] = nameToAdd;

        for(int i = 0; i < fullName.length; i++){
            if(fullName[i]!= nameToAdd) {
            } return true;
        }
       return false;
    }

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

    private static String[] names = {"Erik", " ", "Svensson"};


    public static void main(String[] args) {

       // getSize(names);
        //clear(names);
        String nameToAdd = "Alcantara";
        add(names);





    }



}

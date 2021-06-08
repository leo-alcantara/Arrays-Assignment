package se.lexicon.leo;

import java.util.Arrays;

public class NameRepository {

    //Method 01
    //public static int getSize(String[] names) {
    //    int size = names.length;
    //    System.out.println("The size of the array is: " + size);
    //    return size;
    //}

    //Method 02
    //public static void clear() {
    //
    //    names = Arrays.copyOf(names, names.length - names.length);
    //    System.out.println(Arrays.toString(names));
    //
    //}

    //Method 03
    //public static boolean add (final String fullName){
    //        Arrays.binarySearch(names, fullName);
    //        if(nameFound != fullName) {
    //            names = Arrays.copyOf(names, names.length + 1);
    //            names[names.length-1] = fullName;
    //            //names = Arrays.copyOf(names, names.length);
    //            System.out.println(Arrays.toString(names));
    //         return true;
    //        } else {
    //            System.out.println("Name has already been added to array.");
    //        }
    //       return true;
    //}

   //Method 04
    public static String find(final String fullName){
        for (String nameFound : names) {
            if (fullName.equals(nameFound)){
                System.out.println(fullName);
                return fullName;
           } else{
                System.out.println("Name not found.");
             return null;
            }
        }
             return null;
    }

    //Method 05
    //public static String[] findAll(){
    //    String [] newNames= Arrays.copyOf(names, names.length);
    //    System.out.print("Array newNames: ");
    //    System.out.println(Arrays.toString(newNames));
    //    return newNames;
    //}

    /*Method 06
    public static boolean update(final String original, final String updatedName){


    }*/

    //Method 07
    //public static String[] findByFirstName(final String firstName){
    //    String[] matchedNames={};
    //    matchedNames[matchedNames.length-1]=firstName;
    //    names.contains(firstName);
    //
    //
    //
    //      return firstName;
    //}


    /*Method 08
    public static String[] findByLastName(final String lastName){


    }*/

    private static String[] names = {"Erik Svensson", "Simon Elbrink"};


    public static void main(String[] args) {

       // getSize(names);
        //clear(names);

       //String nameToAdd = "Simon Elbrink";
       //add(nameToAdd);

      String nameFound = "Simon Elbrink";
      find(nameFound);

      //findAll();

       //String firstName= "";


    }



}

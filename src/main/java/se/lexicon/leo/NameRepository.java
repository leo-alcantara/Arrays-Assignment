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
    public static void clear() {

        names = Arrays.copyOf(names, names.length - names.length);
        System.out.println(Arrays.toString(names));

    }

    //Method 03
    public static boolean add(final String fullName) {

        Arrays.sort(names);
        int foundIndex = Arrays.binarySearch(names, fullName);
        if (foundIndex < 0) {
            String[] newNames = Arrays.copyOf(names, names.length + 1);
            newNames[newNames.length - 1] = fullName;
            names = newNames;
            return true;

        } else {
            System.out.println("Name has already been added to array.");
            return false;
        }
    }

    //Method 04
    public static String find(final String fullName) {
        Arrays.sort(names);
        int foundIndex = Arrays.binarySearch(names, fullName);
        if (foundIndex >= 0) {
            System.out.println(fullName);
            return fullName;
        } else {
            System.out.println("The name " + fullName + " is not contained inside the Names array.");
            return null;
        }
    }

    //Method 05
    public static String[] findAll() {
        String[] newNames = Arrays.copyOf(names, names.length);
        System.out.print("Array newNames: ");
        System.out.println(Arrays.toString(newNames));
        return newNames;
    }

    //Method 06
    public static boolean update(final String original, final String updatedName) {
       for (int i = 0; i < names.length; i++) {

            if (names[i].equals(original)) {
                names[i] = updatedName;
                System.out.println("Operation is completed.");
                return true;
            }
        }
        System.out.println("The name " + original + " could not be found.");

        return false;
    }

    //Method 07
    public static String[] findByFirstName(final String firstName) {
        String[] namesMatched = {};
        for (int i = 0; i < names.length; i++) {
            String[] splitNames = names[i].split(" ");
            if (splitNames[0].equals(firstName)) {
            namesMatched=Arrays.copyOf(namesMatched, namesMatched.length+1);
            namesMatched[namesMatched.length-1]=names[i];
            }
        }
        System.out.println(Arrays.toString(namesMatched));
        return namesMatched;
    }


    //Method 08
    public static String[] findByLastName(final String lastName){
        String[] namesMatched = {};
        for (int i = 0; i < names.length; i++) {
            String[] splitNames = names[i].split(" ");
            if (splitNames[splitNames.length-1].equals(lastName)) {
                namesMatched=Arrays.copyOf(namesMatched, namesMatched.length+1);
                namesMatched[namesMatched.length-1]=names[i];

            }
        }

        System.out.println(Arrays.toString(namesMatched));
        return namesMatched;

    }

    private static String[] names = {"Erik Svensson", "Leo de Alcantara", "Sophie Odin", "Leo Odin", "Philip de Alcantara", "Noelle Odin", "Martha Svensson"};


    public static void main(String[] args) {
        //Method 01
        // getSize(names);

        //Method 02
        //clear(names);

        //Method 03
        //String nameToAdd = "Leo de Alcantara";
        //add(nameToAdd);
        //System.out.println(Arrays.toString(names));
        //add(nameToAdd);

        //Method 04
        //String findName = "Erik Svensson";
        //find(findName);

        //Method 05
        //findAll();

        //Method 06
        //String nameToReplace ="Noelle";
        //String newName = "Philip";
        //update(nameToReplace, newName);
        //System.out.println(Arrays.toString(names));

        //Method 07
        //String firstName = "Leo";
        //findByFirstName(firstName);

        //Method 08
        String lastName = "Odin";
        findByLastName(lastName);

    }


}

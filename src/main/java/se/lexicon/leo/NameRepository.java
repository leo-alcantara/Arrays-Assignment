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
    public static void setNames(String[] names) {
        String[] newNames = {"Erik Svensson", "Leo de Alcantara", "Sophie Odin", "Noelle Odin", "Philip de Alcantara"};
        names = newNames;
        System.out.println(Arrays.toString(names));

    }

    //Method 03
    public static void clear(String[] names) {

        names = Arrays.copyOf(names, 0);
        System.out.println(Arrays.toString(names));

    }

    //Method 04
    public static boolean add(final String fullName) {

        Arrays.sort(names);
        int foundIndex = Arrays.binarySearch(names, fullName);
        if (foundIndex < 0) {
            String[] newNames = Arrays.copyOf(names, names.length + 1);
            newNames[newNames.length - 1] = fullName;
            names = newNames;
            System.out.println(Arrays.toString(names));
            return true;

        } else {
            System.out.println("Name has already been added to array.");
            return false;
        }
    }

    //Method 05
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

    //Method 06
    public static String[] findAll() {
        String[] newNames = Arrays.copyOf(names, names.length);
        System.out.print("Array newNames: ");
        System.out.println(Arrays.toString(newNames));
        return newNames;
    }

    //Method 07
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

    //Method 08
    public static String[] findByFirstName(final String firstName) {
        String[] namesMatched = {};
        for (int i = 0; i < names.length; i++) {
            String[] splitNames = names[i].split(" ");
            if (splitNames[0].equals(firstName)) {
                namesMatched = Arrays.copyOf(namesMatched, namesMatched.length + 1);
                namesMatched[namesMatched.length - 1] = names[i];
            }
        }
        System.out.println(Arrays.toString(namesMatched));
        return namesMatched;
    }


    //Method 09
    public static String[] findByLastName(final String lastName) {
        String[] namesMatched = {};
        for (int i = 0; i < names.length; i++) {
            String[] splitNames = names[i].split(" ");
            if (splitNames[splitNames.length - 1].equals(lastName)) {
                namesMatched = Arrays.copyOf(namesMatched, namesMatched.length + 1);
                namesMatched[namesMatched.length - 1] = names[i];

            }
        }

        System.out.println(Arrays.toString(namesMatched));
        return namesMatched;

    }


    //Method 10
    public static boolean remove(final String fullName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(fullName)) {
                names[i] = names[names.length - 1];
                names = Arrays.copyOf(names, names.length - 1);
                Arrays.sort(names);
                break;
            }
        }
        System.out.println(Arrays.toString(names));
        return true;
    }

    private static String[] names = {"Erik Svensson", "Leo de Alcantara", "Sophie Odin", "Noelle Odin", "Philip de Alcantara"};


    public static void main(String[] args) {
        //Method 01
        // getSize(names);

        //Method 02
        //setNames(names);

        //Method 03
        clear(names);

        //Method 04
        //String nameToAdd = "Leo de Alcantara";
        //add(nameToAdd);
        //System.out.println(Arrays.toString(names));
        //add(nameToAdd);

        //Method 05
        //String findName = "Erik Svensson";
        //find(findName);

        //Method 06
        //findAll();

        //Method 07
        //String nameToReplace ="Noelle";
        //String newName = "Philip";
        //update(nameToReplace, newName);
        //System.out.println(Arrays.toString(names));

        //Method 08
        //String firstName = "Leo";
        //findByFirstName(firstName);

        //Method 09
        //String lastName = "Odin";
        //findByLastName(lastName);

        //Method 10
        //String fullName = "Leo de Alcantara";
        //remove(fullName);

    }


}

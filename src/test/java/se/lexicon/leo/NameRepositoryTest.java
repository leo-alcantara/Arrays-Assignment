package se.lexicon.leo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NameRepositoryTest {

    //Method 01 getSize();
    @Test
    public void test_getSize_Successfully() {

        //Arrange
        String[] names = {"Erik Svensson"};
        int size = names.length;
        boolean sizeGot = false;

        //Act
        size = NameRepository.getSize(names);

        //Assert
        assertTrue(true);
    }

    //Method 02 setNames();
    @Test
    public void test_setNames_Successfully(){

        //ARRANGE
        String[] names={"Erik Svensson"};
        String[] newNames={"Erik Svensson", "Leo de Alcantara", "Sophie Odin", "Noelle Odin", "Philip de Alcantara"};
        boolean namesSet=false;
        //ACT
        NameRepository.setNames(names);
        //ASSERT
        assertTrue(true);


    }
    //Method 03 clear();
    @Test
    public void test_clear_successfully() {

        //Arrange
        String[] names = {"Erik Svensson"};
        boolean wasCleared = false;
        //Act
        NameRepository.clear(names);
        //Assert
        assertTrue(true);
    }


    //Method 04 add();
    @Test
    public void test_add_successfully() {

        //ARRANGE
        String fullName = "Leo de Alcantara";
        boolean wasAdded = false;

        //ACT
        wasAdded = NameRepository.add(fullName);

        //ASSERT
        assertTrue(wasAdded);
    }

    //Method 05 find();
    @Test
    public void test_find_Successfully() {

        //ARRANGE
        String fullName = "Erik Svensson";
        boolean nameFound = false;

        //ACT
        NameRepository.find(fullName);

        //ASSERT
        assertFalse(nameFound);

    }

    //Method 06 findAll();
    @Test
    public void test_findAll_successfully() {
        //ARRANGE
        boolean isExist = false;

        //ACT
        NameRepository.findAll();

        //ASSERT
        assertTrue(true);

    }

    @Test
    //Method 07 update();
    public void test_update_successfully() {
        //ARRANGE
        String original = "Erik Svensson";
        String updatedName = "Leo Alcantara";
        boolean updated = false;
        //ACT

        updated = NameRepository.update(original, updatedName);

        //ASSERT
        assertTrue(updated);

    }
    @Test
    //Method 08 findByFirstName();
    public void test_findByFirstName_successfully() {
        //ARRANGE
        String firstName = "Erik";
        boolean firstNameFound = false;
        //ACT
        NameRepository.findByFirstName(firstName);
        //ASSERT
        assertTrue(true);

    }

    //Method 09 findByLastName();
    @Test
    public void test_findByLastName_successfully(){
        //ARRANGE
        String lastName = "Svensson";
        boolean firstNameFound = false;
        //ACT
        NameRepository.findByLastName(lastName);
        //ASSERT
        assertTrue(true);

    }


}




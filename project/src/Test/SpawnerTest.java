package Test;

import game.GameObject;
import game.Potion;
import game.Weapon;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SpawnerTest {
    ArrayList<GameObject> items1 = new ArrayList<GameObject>();
    ArrayList<GameObject> items2 = new ArrayList<GameObject>();

    GameObject[] test1;
    GameObject[] test2;

    @BeforeEach
    void setUp() {
        test1 = new GameObject[6];
        test2 = new GameObject[6];
    }

    @AfterEach
    void tearDown() {
    }


    @org.junit.jupiter.api.Test
    void extractItemDataTest(){
        String[] itemName = {"p1","p2","p3"};
        int[] itemValue = {1,2,3};
        String[] weaponName = {"w1","w2","w3"};
        int[] weaponValue = {4,5,6};
        extractItemDataNew(itemName,itemValue,weaponName,weaponValue);
        extractItemDataOrig(itemName,itemValue,weaponName,weaponValue);
        for(int i = 0; i < 6; i ++){
            assertEquals(test1[i].getName(),test2[i].getName());
        }
        for(int i = 0; i < 3;i ++){
            assertTrue(test1[i] instanceof Potion);
        }
        for(int i = 3; i < 6;i ++){
            assertTrue(test1[i] instanceof Weapon);
        }
    }

    @org.junit.jupiter.api.Test
    void extractItemDataTest1(){
        String[] itemName = {"p1","p2","p3"};
        int[] itemValue = {-1,2,3};
        String[] weaponName = {"w1","w2","w3"};
        int[] weaponValue = {0,5,6};
        extractItemDataNew(itemName,itemValue,weaponName,weaponValue);
        extractItemDataOrig(itemName,itemValue,weaponName,weaponValue);
        for(int i = 0; i < 6; i ++){
            assertEquals(test1[i].getName(),test2[i].getName());
        }
        for(int i = 0; i < 3;i ++){
            assertTrue(test1[i] instanceof Potion);
        }
        for(int i = 3; i < 6;i ++){
            assertTrue(test1[i] instanceof Weapon);
        }
    }


    void extractItemDataNew(String[] itemName,int[] itemValue, String[] weaponName,int[] weaponValue){
        items1.add(null);
        for (int i = 0; i < 3; i++)
        {
            extractItemDataHelperTest(true,itemName[i],itemValue[i],i);
        }
        for (int i = 0; i < 3; i++)
        {
            extractItemDataHelperTest(false,weaponName[i],weaponValue[i],i+3);
        }
    }

    void extractItemDataHelperTest(boolean isPoition,String name, int value,int index){
        //String name = itemScanner.next() + " " + itemScanner.next();
        //int value = itemScanner.nextInt();

        if(isPoition){
            items1.add(new Potion(name, value));
            test1[index] = new Potion(name,value);
        }else{
            items1.add(new Weapon(name,value));
            test1[index] = new Weapon(name,value);
        }
    }
    void extractItemDataOrig(String[] itemName,int[] itemValue, String[] weaponName,int[] weaponValue){
        items2.add(null);
        for (int i = 0; i < 3; i++)
        {
			items2.add(new Potion(itemName[i], itemValue[i]));
			test2[i] = new Potion(itemName[i], itemValue[i]);
        }
        for (int i = 0; i < 3; i++)
        {
			items2.add(new Weapon(weaponName[i],weaponValue[i]));
			test2[i+3] = new Weapon(weaponName[i],weaponValue[i]);
        }
    }
}
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test void contiansDuplicatesTest(){
        Library library=new Library();
        int array[]={1,2,3,1,4,5};
        boolean y=library.contiansDuplicates(array);
assertTrue(true, String.valueOf(y));


    }
    @Test void rollTest(){
        Library library=new Library();

//    methods I do not Know how to test it  and what is the  result  for this methods Because the result is random array
    }
    @Test void averageArrTest(){
        Library library=new Library();
        int array[]={1,2,3,1,4,5};
       int y=library.averageArr(array);
       assertEquals(2,y);
    }
   @Test void twoArrayAver(){
       Library library=new Library();
       int array[][]={{1,2,3,1,4,5},{1,4,6,8,5,7}};
       int y=library.twoArrayAver(array);
       assertEquals(3,y);

   }
@Test void tallyTest(){
    Library library=new Library();

}
@Test void getMaxValueTest(){
    Library library=new Library();
    int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    map.put("High:",72);
    map.put("Low:",51);
    map.put("Never saw temperature:",63);
    map.put("Never saw temperature:",67);
    map.put("Never saw temperature:",68);
    map.put("Never saw temperature:",69);
    HashMap<String,Integer> result =



    }

}

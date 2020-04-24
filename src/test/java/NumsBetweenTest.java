import org.junit.jupiter.api.*;


import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("NumsBetweenTest")
public class NumsBetweenTest {
    int[] knownArr = new int[]{1,2,3,4,5};
    int trueAnswer = 1;
    int[] knownArr2 = new int[]{1, 4, 10};
    int trueAnswer2 = 2;
    int[] knownArr3 = new int[]{1, 3, 5};
    int trueAnswer3 = 1;
    int[] knownArr4 = new int[]{5, 3, 1};
    int trueAnswer4 = 1;
    int[] knownArr5 = new int[]{5, 5, 3, 3, 2, 1};
    int trueAnswer5 = 1;
    int[] knownArr6 = new int[]{1,2};
    int trueAnswer6 = 0;

    // Helper method to return an int array of random length between int lengthLim, values between int valLim;
    public int[] randomIntArray(){
        int lengthLim = 20;
        int valLim = 100;
        Random rnd = new Random();
        int[] arr = new int[rnd.nextInt(lengthLim) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(valLim);
        }
        return arr;
    } //randomIntArray

    // Test that the method runs and it returns an integer
    @Test
    @DisplayName("Method should run and return an integer..")
    @Order(1)
    public void test1(){
        int[] testArr = randomIntArray();
        System.out.println("Testing on array " + Arrays.toString(testArr));
        int result = NumsBetween.howManyBetween(testArr);
        assertTrue(result == (int) result);
    }

    @Test
    @Order(2)
    @DisplayName("Testing that the output is correct")
    public void test2(){
        System.out.println("Testing array : " + Arrays.toString(knownArr));
        int res = NumsBetween.howManyBetween(knownArr);
        assertEquals(res, trueAnswer);
    }

    @Test
    public void test3(){
        System.out.println("Testing array : " + Arrays.toString(knownArr2));
        int res = NumsBetween.howManyBetween(knownArr2);
        assertEquals(res, trueAnswer2);
    }

    @Test
    public void test4(){
        System.out.println("Testing array : " + Arrays.toString(knownArr3));
        int res = NumsBetween.howManyBetween(knownArr3);
        assertEquals(res, trueAnswer3);
    }

    @Test
    public void test5(){
        System.out.println("Testing array : " + Arrays.toString(knownArr4));
        int res = NumsBetween.howManyBetween(knownArr4);
        assertEquals(res, trueAnswer4);
    }

    @Test
    public void test6(){
        System.out.println("Testing array : " + Arrays.toString(knownArr5));
        int res = NumsBetween.howManyBetween(knownArr5);
        assertEquals(res, trueAnswer5);
    }

    @Test
    public void test7(){
        System.out.println("Testing array : " + Arrays.toString(knownArr6));
        int res = NumsBetween.howManyBetween(knownArr6);
        assertEquals(res, trueAnswer6);
    }

}

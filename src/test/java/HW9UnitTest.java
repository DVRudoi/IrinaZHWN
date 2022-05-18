import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9UnitTest {
    HW9 a = new HW9();
    @Test
    public void testoddEven(){
        long number = 1;
        String actualResult = HW9.oddEven(number); // метод со static
        Assertions.assertEquals("Odd", actualResult);
    }

    @Test
    public void testOddIndices(){
        int[] arr = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = HW9.OddIndices(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrary(){
        int[] arr = {-7, -3};
        int expectedResult = -10;
        int actualResult = a.sumArrary(arr);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValue(){
        int x = 3333;
        int y = 9999;
        int expectedResult = 9999;
        int actualResult = a.biggerValue(x, y);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumber(){
        int x = 3333;
        boolean expectedResult = true;
        boolean actualResult = a.IsPositiveNumber(x);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void areNumbersEqual(){
        int x = 3333;
        int y = 9999;
        int expectedResult = -1;
        int actualResult = a.areNumbersEqual(x, y);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntM(){
        int number = 10;
        String actualResult = a.intM(number);
        Assertions.assertEquals("Poor Number", actualResult);
    }

    @Test
    public void testMinMaxAve() {

        int[] expectedResult = {2, 2, 2};

        int[] actualResult = a.minMaxAve(new int[]{2}, 0, 0);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersection(){
        int[] arr1 = {1, 2, 4, 5, 89};//{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        int[] arr2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        int[] actualResult = a.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testPeakElement(){
        int[] arr1 = {-3, 2, -7, 5, 1, -9, 23, 1};     //{3, 2, 7, 5, 1, 9, 23, 1}
        int[] expectedResult = {2, 5, 23};             //{3, 7, 23}

        int[] actualResult = a.peakElement(arr1);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
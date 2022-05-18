import java.util.Arrays;

public class HW9 {
    //1.
    public static String oddEven(long a) {
        if (a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE) {
            if (a % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }
        return "Undefined";
    }

    //2.
    public static int[] OddIndices(int[] array) {
        if (array.length == 0) {
            return new int[]{};
        }

        int[] oddArr = new int[array.length / 2];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                oddArr[k] = array[i];
                k++;
            }
        }
        return oddArr;
    }

    //3.
    public int sumArrary(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //4
    public int BiggerValue(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //5.
    public boolean IsPositiveNumber(int a) {
            return a >= 0;
    }

    //6,
    public int AreNumbersEqual (int a, int b){
        if (a > b){

            return 1;
        } else if (a < b) {

            return -1;
        } else {

            return 0;
        }
    }

    //7.
    public String intM (int M){
        if(M % 3 == 0 && M % 5 == 0){
            return "Good Number";
        } else if (M % 3 == 0 && M % 5 != 0){
            return "Bad Number";
        } else if (M % 3 != 0 && M % 5 == 0){
            return "Poor Number";
        } else {
            return "-1";
        }
    }

    //8.
    public int[] minMaxAve (int[] arr, int a, int b){
        if (b < a || arr.length == 0 || b > arr.length){
            return new int[]{};
        }
        int[]newArr = new int [] {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};

        for (int i = a; i <= b; i++) {
            if (arr[i] < newArr[0]) {
                newArr[0] = arr[i];
            }
            if (arr[i] > newArr[1]) {
                newArr[1] = arr[i];
            }

            newArr[2] = newArr[2] + arr[i];
        }
        newArr[2] = newArr[2] / (b - a + 1);

        return newArr;
    }

    //9.
    public int[] Intersection (int[] arr1, int[]arr2){
        if (arr1.length < arr2.length){
            return new int[]{};
        }
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    k++;
                }
            }
        }
        int[] newArr = new int[k];
        int n = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    newArr[n] = arr1[i];
                    n++;
                }
            }
        }
        return newArr;
    }

    //10.!!!!!
    public int[] PeakElement(int[] arr){
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 && arr[0] > arr[1]){
                k++;
            }else if (i > 0 && i < arr.length - 1 && arr[i - 1] < arr[i] && arr[i] > arr[i + 1]){
                k++;
            }else if(arr[arr.length - 1] > arr[arr.length - 2]){
                k++;
            }
        }
        int[] newArr = new int[k];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 && arr[0] > arr[1]){
                newArr[n] = arr[0];
                n++;
            }else if (i > 0 && i < arr.length - 1 && arr[i - 1] < arr[i] && arr[i] > arr[i + 1]){
                newArr[n] = arr[i];
                n++;
            }else if(arr[arr.length - 1] > arr[arr.length - 2]){
                newArr[n] = arr[arr.length - 1];
            }
        }
        return newArr;
    }


}

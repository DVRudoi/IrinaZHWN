package utils;

public class Utils {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void task(double a){
        System.out.println("_".repeat(30) + a + "_".repeat(30));
    }
    public static void line(){
        System.out.println("_".repeat(70));
    }

    // проверка на пустоту массива
    public static boolean arrayCheckEmpty(int[] arr){
        if (arr.length == 0){
            return true;
        }
        return false;
    }

    // подсчет длины массива
    public static int arraylength (int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            j++;
        }
        return j;
    }

    // подсчет длины массива четных чисел
    public static int arraylengthEven(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 0 && arr[i] % 2 == 0 ) {
                j++;
            }
        }
        return j;
    }

    // подсчет длины массива нечетных чисел
    public static int arraylengthOdd(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 0 && arr[i] % 2 != 0 ) {
                j++;
            }
        }
        return j;
    }



    // Метод.возвращает массив нечетных чисел
    public static int[] arrayOdd(int[] a){
        int k = 0;
        int[] arr = new int[arraylengthOdd(a)];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0){
                arr[k] = a[i];
                k++;
            }
        }
        return arr;
    }

    // Метод.возвращает массив четных чисел
    public static int[] arrayEven(int[] a){
        int k = 0;
        int[] arr = new int[arraylengthEven(a)];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0){
                arr[k] = a[i];
                k++;
            }
        }
        return arr;
    }


    //проверка маассива на отрицательные числа
    public static boolean arrayContainsNegativeValues(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                return true;
            }
        }
        return false;
    }

}


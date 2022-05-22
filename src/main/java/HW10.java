public class HW10 {
    //1.
    public String task1(String a) {
        if (!a.isEmpty()) {
            String str = a.trim();
            if (str.length() == a.length()) {
                return "Пробелов не было";
            } else {
                return "Лишние пробелы были удалены";
            }
        } else {
            return "Строка пустая";
        }
    }

    //2.
    public String RemoveAlla(String a) {
        if (!a.isEmpty()) {
            return a.trim().replace("a", "");
        } else {
            return "Строка пустая";
        }
    }

    //3.
    public String taskRemoveAllZeros(String a) {
        if ( a != null && !a.isEmpty()) {
            return a.trim().replace(" ", "").replace("0", "");
        } else {
            return "Строка пустая";
        }
    }

    //4.
    public String RemoveAllSpaces(String a) {
        if ( a != null && !a.isEmpty()) {
            return a.trim().replace(" ", "");
        } else {
            return "Строка пустая";
        }
    }

    //5.
    public int RemoveLength(String a) {
        if ( a != null && !a.isEmpty()) {
            a.trim();// Тоже самое a = a.trim();
            String str = a.toLowerCase().replace("a", "");
            return a.length() - str.length();
        } else {
            return 0;
        }
    }

    //6.
    public boolean isContainsJava(String a) {
        return a.toLowerCase().contains("java");
    }

//    public static void main(String[] args) {
//        HW10 a = new HW10();
//        a.containsJava()
//    }

    //7.
    public String task7(String a) {
        if ( a != null && !a.isEmpty()) {

            return "\"".concat(a.trim().concat(".\""));
        } else {

            return "Строка пустая";
        }
    }

    //8.
    public String task8(String a) {
        if ( a != null && !a.isEmpty()) {
            String str = a.trim().substring(0, 1).toUpperCase();
            return str.concat(a.substring(1).trim().toLowerCase());//
        } else {
            return "Строка пустая";
        }
    }

    //9.
    public String task9(String str, char a) {
        if ( str != null && !str.isEmpty()) {
            return str.substring(str.indexOf(a), str.lastIndexOf(a) + 1);
        } else {
            return "Строка пустая";
        }
    }

    //10.
    public boolean task10(String str) {
        if (str.trim().toLowerCase().charAt(0)
                == str.trim().toLowerCase().charAt(str.trim().length() - 1)) {
            return true;
        } else {
            return false;
        }
    }

    //11.
    public String[] task11(String str) {
        String[] arr = str.trim().split(" ");
        return arr;
    }

    //12.
    public String[] task12(String str) {
        String[] arr = str.trim().split(" ");
        String[] arr1 = {"Имя: ", "Отчество: ", "Фамилия: "};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[i] + arr[i];
        }
        return arr;
    }

    //13.
    public int task13sum(String a) {
        String str = a.trim();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64
                    && str.charAt(i) < 91
                    || str.charAt(i) > 96
                    && str.charAt(i) < 123) {
                sum += str.charAt(i);
            }
        }
        return sum;
    }
//if (str.toCharArray()[i] > 64
//                    && str.toCharArray()[i] < 91
//                    || str.toCharArray()[i] > 96
//                    && str.toCharArray()[i] < 123)

    //14.
    public boolean task14(char a, char b) {
        return a < b;
//        if ((int)(a) < (int)(b)){
//            return true;
//        } else {
//            return false;
//        }
    }

    //15.
    public int[] task15(String str) {
        if (str != null && str.length() > 0) {
            str = str.trim();
            int arrLength = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    arrLength++;
                }
            }

            int[] arr = new int[arrLength];
            int index = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    arr[index] = Integer.parseInt(Character.toString(str.charAt(i)));
                    index++;
                }
            }
            return arr;
        }
        return new int[]{};
    }

    //16,
    public String stringToLettersAlgorithm(String str){
        String result = "";

        if (!str.isEmpty()){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 64
                        && str.charAt(i) < 91
                        || str.charAt(i) > 96
                        && str.charAt(i) < 123){
                    result = result + str.charAt(i);
                }
            }
        }
        return result;
    }

    public String stringToLettersAndSpaceAlgorithm(String str){
        String result = "";

        if (!str.isEmpty()){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 64
                        && str.charAt(i) < 91
                        || str.charAt(i) > 96
                        && str.charAt(i) < 123
                        || str.charAt(i) ==32){
                    result = result + str.charAt(i);
                }
            }
        }
        return result;
    }

    public String stringToNumbersAlgorithm(String str){
        String result = "";

        if (!str.isEmpty()){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47
                        && str.charAt(i) < 58){
                    result = result + str.charAt(i);
                }
            }
        }
        return result;
    }

    public String stringToNumbersAndSpaceAlgorithm(String str){
        String result = "";

        if (!str.isEmpty()){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47
                        && str.charAt(i) < 58
                        || str.charAt(i) == 32){
                    result = result + str.charAt(i);
                }
            }
        }
        return result;
    }

    public int countWords(String str, String word) {
        if (str != null && !str.isEmpty() || word != null){
            str = str.toLowerCase().
                    replace(",", " ").
                    replace(".", " ");
            word = word.toLowerCase();

            int count = 0;
            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(word)){
                    count++;
                }
            }
            return count;
        }
        return Integer.MIN_VALUE;
    }

//    //17
//    public String startsWithLetter(String str) {
//        if ( !str.isEmpty() ){
//            str = str.toLowerCase().
//                    replace(",", " ").
//                    replace(".", " ");
//
//            String[] arr = str.split(" ");
//            String strResult = "";
//
//            String[] arrLetters = new String[arr.length];
//            for (int i = 0; i < arr.length; i++) {
//                arrLetters[i] = String.valueOf(arr[i].charAt(0));
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                if (arrLetters[i].equals('l')){
//                    strResult += arr[i];
//                }
//            }
//            return strResult;
//        }
//        return "Строка пустая";
//    }

    //18.
    public String reverseString (String str){
        String strNew = "";
        if (str != null && str.length() > 0){
            for (int i = str.length() - 1; i >= 0; i--) {
                strNew = strNew + str.charAt(i); //strNew.concat(Character.toString(str.charAt(i)));
            }
        }
        return strNew;
    }

    //20.
    public String removeDuplicates (String text){
        String result = "";
        if (text != ""){
            text = text.toLowerCase();
            for (int i = 0; i < text.length(); ) {
                result += String.valueOf(text.charAt(i));
                text = text.replace(String.valueOf(text.charAt(i)), "");
            }
//            return  result;
        }

        return result;
    }

}

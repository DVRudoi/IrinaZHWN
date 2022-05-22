import java.util.Arrays;

public class HW10Main {
    public static void main(String[] args) {
        //Работа с indexOf и lastIndexOf
//        String str = "012345good";
//        String str1 = "0123450123";
//        System.out.println(str.indexOf("good"));
//        System.out.println(str.lastIndexOf("good"));
//        System.out.println(str.indexOf("8"));
//        System.out.println(str.lastIndexOf("8"));
//        System.out.println(str1.indexOf("0"));
//        System.out.println(str1.lastIndexOf("0"));


        HW10 hw10 = new HW10();
//        System.out.println(hw10.task1(""));
          System.out.println(hw10.taskRemoveAllZeros(null));

//        System.out.println(hw10.containsJava("As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades."));
//        System.out.println(hw10.task8("   зыавыЕр  "));
//        System.out.println(hw10.task9("  Abracadabra", 'b'));
        System.out.println(hw10.task10("   Abracadabra  "));

        System.out.println(Arrays.toString(hw10.task11("QA for Everyone")));
        String a = "  QA_for_Everyone";
        a = a.trim();
        a = a.replace('e','a');
        System.out.println(a);
//        System.out.println(Arrays.toString(a.split("_")));
//
//        System.out.println(a.charAt(1));// буква со строчки
//        System.out.println((int)a.charAt(1));// буква со строчки переведенная в цифру
//
//        System.out.println(Arrays.toString(hw10.task12("QA for Everyone")));
//        System.out.println(hw10.task13sum("abc"));
//
//        System.out.println(hw10.task14('b','a'));
//
//        System.out.println(Arrays.toString(hw10.task15("1, 2, 3, 4, 5")));
        System.out.println(hw10.stringToLettersAlgorithm("  fffjkl32 ksf"));
        System.out.println(hw10.stringToNumbersAlgorithm("  fffjkl32 ksf"));
        System.out.println(hw10.countWords("As of March 2022, Java 18 is the latest version, while Java 17, " +
                "11 and 8 are the current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the legacy version " +
                "Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support Java 8 " +
                "with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost" +
                " builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.","Java"));
//        System.out.println(hw10.startsWithLetter("As a decrepit father takes delight To see his active child do deeds of youth, So I, made lame by fortune’s dearest spite "));
        System.out.println(hw10.reverseString(" dssa  Abracadabra"));
        System.out.println(hw10.removeDuplicates("aaaabbbbccc"));
    }
}

public class HW10 {
    //1.
    public String task1(String a){
        if (!a.isEmpty()){
            String str = a.trim();
            if (str.length() == a.length()){
                return "Пробелов не было";
            } else {
                return "Лишние пробелы были удалены";
            }
        } else {
            return "Строка пустая";
        }
    }

    //2.
    public String RemoveAlla(String a){
        if (!a.isEmpty()){
            return a.trim().replace("a","");
        } else {
            return "Строка пустая";
        }
    }

    //3.
    public String taskRemoveAllZeros(String a){
        if (!a.isEmpty()){
            return a.trim().replace(" ","").replace("0","");
        } else {
            return "Строка пустая";
        }
    }

    //4.
    public String RemoveAllSpaces(String a){
        if (!a.isEmpty()){
            return a.trim().replace(" ","");
        } else {
            return "Строка пустая";
        }
    }

    //5.
    public int RemoveLength(String a){
        if (!a.isEmpty()){
            a.trim();
            String str = a.toLowerCase().replace("a","");
            return a.length() - str.length();
        } else {
            return 0;
        }
    }

    //6.

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chernovik {
    public static void main(String[] args) {
        String s = "100";
        int a = Integer.parseInt(s);
        System.out.println(a + 10);
        int b = Integer.valueOf(s);
        System.out.println(b + 10);

        int[] src = new int[] {1, 2, 3, 4, 5};
        int b1[] = Arrays.copyOfRange(src, 0, 2);
        System.out.println(Arrays.toString(b1));
        List<Integer> as = new ArrayList<>();
        as.size();
    }
//    WebElement ele = getDriver().findElement(By.xpath("//tr[@id='qqq']/td[3]/a"));
//    Actions action = new Actions(getDriver());
//action.moveToElement(ele).perform();
// наводить мышку
}

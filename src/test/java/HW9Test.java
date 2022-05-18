import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9Test {
    HW9 a = new HW9();
    @Test
    public void testoddEven(){
        long number = 1;
        String actualResult = HW9.oddEven(number); // метод со static
        Assertions.assertEquals("Odd", actualResult);
    }
}
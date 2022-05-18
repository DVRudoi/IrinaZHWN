import utils.Utils;

import java.util.Arrays;

public class HW9Main {
    public static void main(String[] args) {
        HW9 a = new HW9();
        Utils.task(2);
        System.out.println(Arrays.toString(HW9.OddIndices(new int[]{-45, 590, 234, 985, 12, 68})));// метод со static
        Utils.task(3);
        System.out.println(a.sumArrary(new int[]{-7, -3}));//метод БЕЗ static
        Utils.task(4);
        System.out.println(a.BiggerValue(3333,9999));
        Utils.task(5);
        System.out.println(a.IsPositiveNumber(-55));
        Utils.task(8);
        System.out.println(Arrays.toString(a.minMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 6)));
        Utils.task(9);
        System.out.println(Arrays.toString(a.Intersection(new int[]{1, 2, 4, 5, 8, 9}, new int[]{8, 9, 45})));
        Utils.task(10);
        System.out.println(Arrays.toString(a.PeakElement(new int[]{3, 2, 7, 5, 1, 9, 23, 1})));
    }
}
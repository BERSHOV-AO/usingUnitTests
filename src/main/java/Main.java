import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        MyMathOperations myMathOperations = new MyMathOperations();
        List<Integer> list = Arrays.asList(12, 77, 32, 71, -54, -12, 12, -17, 45);
        System.out.println("Операции с листом: " + list);
        System.out.println("Лист положительных чисел: " + myMathOperations.positiveNumbers(list));
        System.out.println("Лист четных чисел: " + myMathOperations.evenNumber(list));
        System.out.println();
        System.out.println("Расчет комиссии:");
        int sum1 = 750;
        System.out.println("С суммы " + sum1 + " руб., комиссия составит: " +
                +myMathOperations.commissionPercentCalc(sum1) + " руб.");

        int sum2 = 75_700;
        System.out.println("С суммы " + sum2 + " руб., комиссия составит: " +
                +myMathOperations.commissionPercentCalc(sum2) + " руб.");

    }
}

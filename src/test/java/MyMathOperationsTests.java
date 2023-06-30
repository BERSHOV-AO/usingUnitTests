import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MyMathOperationsTests {

    MyMathOperations sut;
    List<Integer> intList;

    @BeforeEach
    public void beforeEach() {
        sut = new MyMathOperations();
    }

    @AfterEach
    public void afterEach() {
        sut = null;
    }

    @Test
    public void testPositiveNumbers() {
        // given:
        intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> expectedList = Arrays.asList(1, 2, 5, 16, 32, 3, 5, 8, 23, 4);

        // when:
        List<Integer> resultList = sut.positiveNumbers(intList);

        // then:
        Assertions.assertArrayEquals(expectedList.toArray(), resultList.toArray());
    }

    @Test
    public void testEvenNumber() {
        // given:
        intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 75, 5, 8, 23, 88, 91, 11);
        List<Integer> expectedList = Arrays.asList(2, 16, -2, 0, 32, 8, 88);

        // when:
        List<Integer> resultList = sut.evenNumber(intList);

        // then:
        Assertions.assertArrayEquals(expectedList.toArray(), resultList.toArray());
    }

    @Test
    public void testCommissionPercentCalc_MinCommission() {
        // given:
        int amount = 550, expected = 35;

        // when:
        int result = sut.commissionPercentCalc(amount);

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCommissionPercentCalc_Commission() {
        // given:
        int amount = 10_550, expected = 79;

        // when:
        int result = sut.commissionPercentCalc(amount);

        // then:
        Assertions.assertEquals(expected, result);
    }
}

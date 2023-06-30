import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MyMathOperationsTests {

    MyMathOperations sut;
    List<Integer> intList;

    @BeforeEach
    public void beforeEach() {
        sut = new MyMathOperations();
        intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    }

    @AfterEach
    public void afterEach() {
        sut = null;
    }

    //-----------------------testPositiveNumbers-----------------------------
    @Test
    public void testPositiveNumbers_whenCheck_thenContainsElements() {
        List<Integer> resultList = sut.positiveNumbers(intList);
        assertThat(resultList, contains(1, 2, 5, 16, 32, 3, 5, 8, 23, 4));
    }

    @Test
    public void testPositiveNumbers_whenCheck_thenHasSize() {
        List<Integer> resultList = sut.positiveNumbers(intList);
        assertThat(resultList, hasSize(10));
    }

    @Test
    public void testPositiveNumbers_whenCheck_thenPositiveElements() {
        List<Integer> resultList = sut.positiveNumbers(intList);
        assertThat(resultList, everyItem(greaterThan(0)));
    }

    //-----------------------testEvenNumber---------------------------------
    @Test
    public void testEvenNumber_whenCheck_thenContainsElements() {
        List<Integer> resultList = sut.evenNumber(intList);
        assertThat(resultList, contains(2, 16, -2, 0, 32, 8, 4));
    }

    @Test
    public void testEvenNumber_whenCheck_thenHasSize() {
        List<Integer> resultList = sut.evenNumber(intList);
        assertThat(resultList, hasSize(7));
    }

    @Test
    public void testEvenNumber_whenCheck_contains() {
        List<Integer> resultList = sut.evenNumber(intList);
        assertThat(resultList, hasItems(16, 8));
    }

    @Test
    public void testEvenNumber_whenCheck_thenContainInAnyOrder() {
        List<Integer> resultList = sut.evenNumber(intList);
        assertThat(resultList.toArray(), arrayContainingInAnyOrder(32, 8, 4, 2, 16, -2, 0));
    }

    //------------------testCommissionPercentCalc-------------------------
    @Test
    public void testCommissionPercentCalc_MinCommission() {
        int amount = 550;
        int result = sut.commissionPercentCalc(amount);
        assertThat(result, is(35));
    }

    @Test
    public void testCommissionPercentCalc_Commission() {
        int amount = 10_550;
        int result = sut.commissionPercentCalc(amount);
        assertThat(result, is(79));
    }
}

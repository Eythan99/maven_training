package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    /* Test Multiply */
    @Test
    void multiply_by_zero_should_produce_zero() {
        System.out.println("Test: multiply_by_zero_should_produce_zero");
        int value = 7;
        int multValue = 0;

        int res = new Sample().op(Sample.Operation.MULT, value, multValue);

        Assertions.assertThat(res).as("multiplication of 7 * 0").isEqualTo(0);
    }

    @Test
    void multiply_negative_by_negative_should_produce_positive() {
        System.out.println("Test: multiply_negative_by_negative_should_produce_positive");
        int value = -7;
        int multValue = -7;

        int res = new Sample().op(Sample.Operation.MULT, value, multValue);

        Assertions.assertThat(res).as("multiplication of 7 * 0").isEqualTo(49);
    }

    @Test
    void multiply_negative_by_positive_should_produce_negative() {
        System.out.println("Test: multiply_negative_by_positive_should_produce_negative");
        int value = -7;
        int multValue = 7;

        int res = new Sample().op(Sample.Operation.MULT, value, multValue);

        Assertions.assertThat(res).as("multiplication of 7 * 0").isEqualTo(-49);
    }


    /* Test: Addition */

    @Test
    void add_zero_to_value_should_produce_the_same_value() {
        System.out.println("Test: add_zero_to_value_should_produce_the_same_value");
        int value = 7;
        int addValue = 0;

        int res = new Sample().op(Sample.Operation.ADD, value, addValue);

        Assertions.assertThat(res).as("addition of 7 + 0").isEqualTo(value);
    }

    @Test
    void add_zero_to_zero_should_produce_zero() {
        System.out.println("Test: add_zero_to_zero_should_produce_zero");
        int value = 0;
        int addValue = 0;

        int res = new Sample().op(Sample.Operation.ADD, value, addValue);

        Assertions.assertThat(res).as("addition of 0 + 0").isEqualTo(0);
    }

    @Test
    void add_seven_to_minus_seven_should_produce_zero() {
        System.out.println("Test: add_seven_to_minus_seven_should_produce_zero");
        int value = -7;
        int addValue = 7;

        int res = new Sample().op(Sample.Operation.ADD, value, addValue);

        Assertions.assertThat(res).as("addition of -7 + 7").isEqualTo(0);
    }
}

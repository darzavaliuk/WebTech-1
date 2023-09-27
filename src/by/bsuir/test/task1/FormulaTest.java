package by.bsuir.test.task1;

import by.bsuir.task.task1.Formula;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FormulaTest {

    @Test
    void testCalculate_GeneralTest_1() {
        Formula formula = new Formula(1, 1);
        formula.calculate();
        Assertions.assertTrue(Math.abs(formula.getResult() - 1.9134) < 0.0001);
    }

    @Test
    void testCalculate_GeneralTest_2() {
        Formula formula = new Formula(112, 4);
        try {
            formula.calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(Math.abs(formula.getResult() - 112.0092) < 0.0001);
    }

    @Test
    void testCalculate_GeneralTest_3() {
        Formula formula = new Formula(0, 0);
        try {
            formula.calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(Math.abs(formula.getResult() - 0.5) < 0.0001);
    }

    @Test
    void testCalculate_GeneralTest_4() {
        Formula formula = new Formula(0, 2.9999);
        try {
            formula.calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(Math.abs(formula.getResult() - 0.5099) < 0.0001);
    }

    @Test
    void testCalculate_GeneralTest_5() {
        Formula formula = new Formula(Math.PI, Math.PI);
        try {
            formula.calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(Math.abs(formula.getResult() - 3.3385) < 0.0001);
    }
}
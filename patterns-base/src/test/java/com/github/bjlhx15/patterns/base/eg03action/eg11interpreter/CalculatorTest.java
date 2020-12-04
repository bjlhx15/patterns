package com.github.bjlhx15.patterns.base.eg03action.eg11interpreter;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class CalculatorTest {

    @Test
    public void compute() {
        String statement = "3 * 2 * 4 / 6 % 5";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        int result = calculator.compute();
        System.out.println(statement + " = " + result);
    }

    @Test
    public void compute2() {
//        java.util.regex.Pattern p=new Pattern();
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
        int value = (int) expression.getValue();
        System.out.println(value);
    }
}
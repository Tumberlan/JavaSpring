package com.company.test.structs;


public class Expression {
    private Double expr;

    public Expression() {
    }

    public Expression(Double expression) {
        this.expr = expression;
    }

    public Double getExpression() {
        return expr;
    }

    public void setExpression(Double expression) {
        this.expr = expression;
    }
}

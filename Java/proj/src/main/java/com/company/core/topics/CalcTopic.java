package com.company.core.topics;

public class CalcTopic {

    private Integer number;

    private Integer square;

    public CalcTopic(Integer number) {
        this.number = number;
        this.square = number*number;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }
}

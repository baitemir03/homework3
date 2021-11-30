package com.company;

public class LimitException extends Exception{
    private double remainingamount;

        public LimitException(String message, double remainingamount) {
        super(message);
        this.remainingamount = remainingamount;
    }
    public double getRemainingAmount() {
        return remainingamount;
    }

}

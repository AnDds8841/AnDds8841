/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Monday_27_02;

/**
 *
 * represetnts dividing
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                this.numerator = numerator % i;
                this.denominator = denominator % i;
                i = 0;
            }
        }
    }

    public void textFraction(String t) {
        String[] split = t.split("/");
        if (split[1] == " ") {
            this.numerator = Integer.parseInt(split[0]);
            this.denominator = 1;
            return;
        }
        this.numerator = Integer.parseInt(split[0]);
        this.denominator = Integer.parseInt(split[1]);
        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                this.numerator = numerator % i;
                this.denominator = denominator % i;
                i = 0;
            }
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public double getDouble() {
        double doubleResult = (double)numerator / denominator;
        return doubleResult;
    }

    public String toString() {
        if (denominator == 1) {
            return String.format("%d", numerator);
        }
        return String.format("%d/%d", numerator, denominator);
    }
}

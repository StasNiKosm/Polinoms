package common;

public class Monomial {
    
    private int coefficient;
    private char arg;
    private int power;
    private boolean sgn;

    
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public char getArg() {
        return arg;
    }

    public void setArg(char arg) {
        this.arg = arg;
    }

    public boolean getSgn() {
        return sgn;
    }

    public void setSgn(boolean sgn) {
        this.sgn = sgn;
    }

    public void print() {
        if(sgn) System.out.print("+");
        else System.out.print("-");
        if(arg == ' ') {
            System.out.print(coefficient);
        } else {
            if (power == 1) System.out.print((coefficient == 1 ? "" : coefficient)  + "x");
            else System.out.print((coefficient == 1 ? "" : coefficient) + "x" + "^" + power);
        }
    }
}

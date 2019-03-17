package sum;

import common.Monomial;

public class SumMonomial {

    public static Monomial sumMonomial(Monomial a, Monomial b) {
        Monomial sum = new Monomial();
        if(!a.getSgn()) a.setCoefficient(-a.getCoefficient());
        if(!b.getSgn()) b.setCoefficient(-b.getCoefficient());
        sum.setCoefficient(a.getCoefficient() + b.getCoefficient());
        if(sum.getCoefficient() < 0) {
            sum.setCoefficient(-sum.getCoefficient());
            sum.setSgn(false);
        } else sum.setSgn(true);
        sum.setPower(a.getPower());
        sum.setArg(a.getArg());
        return sum;
    }
}

package sum;

import common.Monomial;

import java.util.ArrayList;
import java.util.List;

import static sum.SumMonomial.sumMonomial;


public class SumPolynomial {

    public static List<Monomial> sumPolynomial (List<Monomial> monomialsA , List<Monomial> monomialsB) {
        List<Monomial> rezult = new ArrayList<>();
        rezult.addAll(monomialsA);
        rezult.addAll(monomialsB);
        for(Monomial monomialA : monomialsA) {
            for(Monomial monomialB : monomialsB) {
                if (monomialA.getPower() == monomialB.getPower()) {
                    rezult.add(sumMonomial(monomialA, monomialB));
                    rezult.remove(monomialA);
                    rezult.remove(monomialB);
                }
            }
        }
        return rezult;
    }
}

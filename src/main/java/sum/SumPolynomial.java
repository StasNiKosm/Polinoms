package sum;

import common.Monomial;

import java.util.ArrayList;
import java.util.List;

import static sum.SumMonomial.sumMonomial;


public class SumPolynomial {

    public static List<Monomial> sumPolynomial (List<Monomial> monomialsA , List<Monomial> monomialsB) {
        List<Monomial> rezult = new ArrayList<>();
        for(Monomial monomialMin : (monomialsA.size() < monomialsB.size() ? monomialsA : monomialsB)) {
            for(Monomial monomialMax : (monomialsA.size() > monomialsB.size() ? monomialsA : monomialsB)) {
                if (monomialMin.getPower() == monomialMax.getPower()) {
                    rezult.add(sumMonomial(monomialMin, monomialMax));
                } else {
                    rezult.add(monomialMin);
                    //rezult.add(monomialMax);
                }
            }
        }
        return rezult;
    }
}

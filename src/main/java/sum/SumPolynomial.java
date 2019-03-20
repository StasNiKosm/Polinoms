package sum;

import common.Monomial;
import comporator.ComporatorPolynomial;

import java.util.*;

import static sum.SumMonomial.sumMonomial;


public class SumPolynomial {

    public static List<Monomial> sumPolynomial (List<Monomial> monomialsA , List<Monomial> monomialsB) {
        List<Monomial> rezult = new ArrayList<>();
        rezult.addAll(monomialsA);
        rezult.addAll(monomialsB);
        System.out.println(rezult.size());
        int count = rezult.size();
        int temp = 0;
        for(int i = 0; i < count; i++) {
            for (int j = i + 1; j < rezult.size(); j++) {
                if (rezult.get(i).getPower() == rezult.get(j).getPower()) {
                    rezult.set(i, sumMonomial(rezult.get(i), rezult.get(j)));
                    rezult.remove(j);
                    j--;
                }
            }
        }
        Collections.sort(rezult, new ComporatorPolynomial());
        return rezult;
    }
}

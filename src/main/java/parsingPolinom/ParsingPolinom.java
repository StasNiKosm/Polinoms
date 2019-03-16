package parsingPolinom;

import common.Monomial;

import java.util.ArrayList;
import java.util.List;

public class ParsingPolinom {

    private List<Monomial> monomials;

    public List<Monomial> getMonomials() {
        return monomials;
    }

    public static List<Monomial> parse(String line) {
       // List<Monomial> monomials = new ArrayList<>();
        for (String str : line.split("[+,-]")) {
            System.out.println(str);
        }
        return null;
    }

}

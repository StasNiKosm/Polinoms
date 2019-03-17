package parsingPolinom;

import common.Monomial;

import java.util.ArrayList;
import java.util.List;

import static parsingPolinom.CheckArg.checkArg;
import static parsingPolinom.CheckCoeff.checkCoeff;
import static parsingPolinom.CheckPower.checkPower;
import static parsingPolinom.CheckSgn.checkSgn;

public class ParsingPolynomial {

    public static List<Monomial> parsingPolynomial(String line) {
        List<Monomial> monomialsOfPolynomial = new ArrayList<>();
        String lineFirstMinus;
        if(line.startsWith("-")) {
            lineFirstMinus = line.replaceFirst("-", "{m}");
        } else {
            lineFirstMinus = line;
        }
        String lineReplacing = lineFirstMinus.replace("+", "+{p}").replace("-", "-{m}");
        for (String monomial : lineReplacing.split("[+,-]")) {
            Monomial mono = new Monomial();
            mono.setSgn(checkSgn(monomial));
            mono.setPower(checkPower(monomial));
            mono.setArg(checkArg(monomial));
            mono.setCoefficient(checkCoeff(monomial));
            monomialsOfPolynomial.add(mono);
        }
        return monomialsOfPolynomial;
    }
}


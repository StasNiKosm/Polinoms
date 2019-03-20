import common.Monomial;
import parsingPolinom.ParsingPolynomial;
import readerFile.Reader;
import sum.SumPolynomial;

import java.util.List;


public class App {

    public static void main(String[] args) {
        
        Reader readerA = new Reader("C:\\Users\\admin\\.IntelliJIdea2018.3\\config\\scratches\\scratch.txt");
        List<Monomial> monomialsA = ParsingPolynomial.parsingPolynomial(readerA.read());
        Reader readerB = new Reader("C:\\Users\\admin\\.IntelliJIdea2018.3\\config\\scratches\\scratch_1.txt");
        List<Monomial> monomialsB = ParsingPolynomial.parsingPolynomial(readerB.read());
        List<Monomial> result = SumPolynomial.sumPolynomial(monomialsA, monomialsB);
        for (Monomial monomial : result) {
            System.out.print(monomial.printMonomial());
        }
    }
}


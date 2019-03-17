import common.Monomial;
import parsingPolinom.ParsingPolynomial;
import readerFile.Reader;
import sum.SumPolynomial;

import java.util.ArrayList;
import java.util.List;

import static parsingPolinom.CheckCoeff.checkCoeff;
import static parsingPolinom.ParsingPolynomial.parsingPolynomial;

public class App {

    public static void main(String[] args) {
        //ParsingPolynomial.parsingPolynomial("7x+8x");
        // System.out.println(String.format("%d asd %s", 7, "b"));
        Reader readerA = new Reader("C:\\Users\\admin\\.IntelliJIdea2018.3\\config\\scratches\\scratch.txt");
        List<Monomial> monomialsA = ParsingPolynomial.parsingPolynomial(readerA.read());
        Reader readerB = new Reader("C:\\Users\\admin\\.IntelliJIdea2018.3\\config\\scratches\\scratch_1.txt");
        List<Monomial> monomialsB = ParsingPolynomial.parsingPolynomial(readerB.read());
        List<Monomial> result = SumPolynomial.sumPolynomial(monomialsA, monomialsB);
        for (Monomial monomial : result) {
            monomial.print();
        }
        //System.out.println(checkCoeff(""));
        //  for(Monomial monomial : parsingPolynomial("5x^2+x^3-5x^5-109827x^12345678-34567+45678-6+8-x^9")) {
        ///    monomial.print();
        // }
        // Monomial monomial = new Monomial();
        //System.out.println(parsingPolynomial("x^5+x"));
        //  System.out.println(parsingPolynomial("-23-x"));
        //System.out.println(parsingPolynomial("5"));
        //       System.out.println(parsingPolynomial("x"));
        //     System.out.println(parsingPolynomial("24x^3+23x^4-5"));
        //    System.out.println(parsingPolynomial("5+5x"));


    }
}
//проблемы с парсингом: мб было бы лучше разбить на методы поик значения все полей, а потом использоваь их в конечном парсинге
//пересмотреть метод принт, в зависимости от того, какого значения поля (sout - убрать ln )
//пересмотреть метод суммы одночлена, в связи с тем, что у полей будут конкретные значения.
//пересмотреть действие суммы полинома, так как изза него записываются лишнии одночлены

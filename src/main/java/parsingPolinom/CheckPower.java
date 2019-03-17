package parsingPolinom;

public class CheckPower {
    public static int checkPower (String monomial) {
        if(monomial.contains("^")) {
           return Integer.parseInt(monomial.substring(monomial.indexOf("^") + 1));
        } else if (monomial.contains("x")) {
            return 1;
        } else {
            return 0;
        }
    }
}

package parsingPolinom;

public class CheckPower {
    
    public static boolean checkPower (String monomial) {
        if(monomial.contains("^")) {
           return Integer.parseInt(monomial.substring(monomial.indexOf("^") + 1));
        } else if (monomial.contains("x")) {
            return true;
        } else {
            return false;
        }
    }
    
}

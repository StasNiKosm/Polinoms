package parsingPolinom;

public class CheckSgn {

    public static boolean checkSgn(String monomial) {
        if(monomial.contains("{m}")) {
            return false;
        } else if (monomial.contains("{p}")) {
            return true;
        } else {
            return true;
        }
    }
}

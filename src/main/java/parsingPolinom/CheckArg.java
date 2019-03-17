package parsingPolinom;

public class CheckArg {

    public static char checkArg(String monomial) {
        if(monomial.contains("x")) {
            return 'x';
        } else {
            return ' ';
        }
    }
}

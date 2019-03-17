package parsingPolinom;

public class CheckCoeff {

    public static boolean checkCoeff (String monomial) {
        if(monomial.contains("x")) {
            if(monomial.startsWith("x")) {
                return true;
            }
            else {
                if (monomial.contains("{")) {
                    String[] monomialParts = monomial.split("x");
                    if (monomialParts[0].endsWith("}")) {
                        return 1;
                    }
                    else {
                        return Integer.parseInt(monomialParts[0].substring(3));
                    }
                } else  {
                    String[] monomialParts = monomial.split("x");
                    return Integer.parseInt(monomialParts[0]);
                }
            }
        } else {
            if(monomial.contains("{")) {
                if(Integer.parseInt(monomial.substring(3)) == 0) {
                    return 1;
                }
                else {
                    return Integer.parseInt(monomial.substring(3));
                }
            } else {
                return Integer.parseInt(monomial);
            }
        }
    }
}

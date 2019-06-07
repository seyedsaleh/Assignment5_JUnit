public class Exercise3 {
    public static String StrChecker (String P1, String P2) {
        if (P2.isEmpty())
            return P1;
        if (P1 == P2)
            return "";
        String str = "";
        Boolean flag;
        for (int i = 0; i < P1.length(); i++) {
            flag = true;
            for (int j = 0; j < P2.length(); j++)
                if (P1.charAt(i) == P2.charAt(j))
                    flag = false;
            if (flag)
                str += P1.charAt(i);
        }
        return str;
    }
}
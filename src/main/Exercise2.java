public class Exercise2 {
    public static String StrBuilder (int input){
        if (input > 0) {
            String str = "";
            for (int i = 0; i < input; i++)
                str += "*";
            return str;
        }
        else
            return "incorrect number";
    }
}
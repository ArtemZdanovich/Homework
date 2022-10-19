public class Task2 {
    static char[] elems = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '(', ')',' '};

    public static void main(String[] args) {
        String s = new String("+ 375-(29)-558k8-29-63");
        boolean isValid = true;
        for (int i = 0; i < s.length(); i++) {
            if (isCharValid(s.charAt(i))) {
                isValid = true;

            } else {
                System.out.println("Bad string");
                isValid = false;
                break;
            }
        }
        if (isValid){
            String Str1 = s.replace(" ", "");
            String Str2 = Str1.replace("-", "");
            String Str3 = Str2.replace("(", "");
            String Str4 = Str3.replace(")", "");

            System.out.println(Str4);
        }
    }

    private static boolean isCharValid(char charAt) {

        for (int i = 0; i < elems.length; i++) {
            if (charAt == elems[i]) {
                return true;
            }
        }
        return false;


      /*  String Str1 = Str.replace(" ", "");
        String Str2 = Str1.replace("-", "");
        String Str3 = Str2.replace("(", "");
        String Str4 = Str3.replace(")", "");

        System.out.println(Str4);
*/

    }
}


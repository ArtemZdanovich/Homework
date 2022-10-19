import java.time.Month;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String a = "03 февраля 2015";
        String[] words = a.split(" ");
        for (String word : words) {
//            System.out.println(word);
        }
   //       System.out.println(words[1]);
        String b = (words[1]);
        String Numb = (words[0]);

        if (Integer.parseInt(Numb)>31 || Integer.parseInt(Numb)<1) {
            System.out.println("");
        }else if (b.equalsIgnoreCase("февраля") & (Integer.parseInt(Numb)>29)){
            System.out.println(" ");
        }else

        {

            switch (b) {
                case "ярваря":
                    System.out.println(a.replace(" января ", ".01."));
                    break;
                case "февраля":
                    System.out.println(a.replace(" февраля ", ".02."));
                    break;
                case "марта":
                    System.out.println(a.replace(" марта ", ".03"));
                    break;
                case "апреля":
                    System.out.println(a.replace(" апреля ", ".04."));
                    break;
                case "мая":
                    System.out.println(a.replace(" мая ", ".05."));
                    break;
                case "июня":
                    System.out.println(a.replace(" июня ", ".06."));
                    break;
                case "июля":
                    System.out.println(a.replace(" июля ", ".07."));
                    break;
                case "августа":
                    System.out.println(a.replace(" августа ", ".08."));
                    break;
                case "сентября":
                    System.out.println(a.replace(" сентября ", ".09."));
                    break;
                case "октября":
                    System.out.println(a.replace(" октября ", ".10."));
                    break;
                case "ноября":
                    System.out.println(a.replace(" ноября ", ".11."));
                    break;
                case "декабря":
                    System.out.println(a.replace(" декабря ", ".12."));
                    break;
            }
        }

    }
}
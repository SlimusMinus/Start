import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.*;

class Main {


    public static void main(String[] args){

        String str = "Be man and rock and roll queen";
        String newSTR = str.replaceAll("and", "NO");
        System.out.println(newSTR);


    }
}
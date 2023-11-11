package HomeWork;

import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        int day = 1;
        int month = 11;
        int year = 2023;

        System.out.println("Today is: " + day + "/" + month + "/" + year);

        String g = "Good ";
        String e = "evening!";

        System.out.println(g.concat(e));
    }
}

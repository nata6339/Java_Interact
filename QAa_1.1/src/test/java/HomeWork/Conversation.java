package HomeWork;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Conversation {
    public static void main(String[] args) {

        double num1 = 2.83;
        int num2 = (int) num1;
        System.out.println("Integer of 2.83 is " + num2);

        int a = 12;
        int b = 7;
        double avg = a+b;
        System.out.println("Average is " + avg / 2);

//        Знайшла ще таки варіант:

        IntStream value = IntStream.of(12,7);
        OptionalDouble res = value.average();
        System.out.print("Average of 12 and 7 = ");
        if (res.isPresent()){
          System.out.println(res.getAsDouble());
        }
        else {
            System.out.println("Value is not acceptable");
       }
    }
}

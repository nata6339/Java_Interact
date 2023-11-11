package HomeWork;

public class TernaryOperators {
    public static void main(String[] args) {
        largest();
        positiveOrNegative();
    }

    public static void largest() {
        int a = 27;
        int b = 126;
        int largest = (a > b) ? a : b;

        System.out.println("Largest is " + largest);

//        System.out.println("The largest value is " + Math.max(a, b));
    }

    public static void positiveOrNegative() {

        int x = -23;
//        if (x>=0){
//            System.out.println("The number " + x + " is positive");
//        } else {
//            System.out.println("The number " + x + " is negative");
//        }
        String result = (x >= 0) ? "positive" : "negative";
        System.out.println("Number" + x + " is " + result);

    }


}

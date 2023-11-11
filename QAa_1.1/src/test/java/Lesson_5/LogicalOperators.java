package Lesson_5;

public class LogicalOperators {

    /*
     * ! - логічне заперечення;
     * && - логічне "і";
     * || - логічне "або";
     * ^ - логічне виключне "або";
     * */

    public static void main(String[] args) {
//        boolean a = false;
//        boolean b = true;
//        boolean notA = !a;
//
//        System.out.println(notA);
//
//        boolean aAndB = a && b;
//
//        System.out.println(aAndB);
//
//        boolean aOrB = a || b;
//
//        System.out.println(aOrB);
//
//        boolean aXorB = a ^ b;
//
//        System.out.println(aXorB);

        int x = 5;
        int y = 10;

        boolean isEqual = x == y;
        boolean isNotEqual = x != y;
        boolean isLess = x < y;
        boolean isGreaterOrEqual = x >= y;

        System.out.println(isEqual);
        System.out.println(isNotEqual);
        System.out.println(isLess);
        System.out.println(isGreaterOrEqual);
    }
}

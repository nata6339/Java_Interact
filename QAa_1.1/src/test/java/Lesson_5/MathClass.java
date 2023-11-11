package Lesson_5;

public class MathClass {
    public static void main(String[] args) {
        double x = Math.pow(2, 7);
        System.out.println(x); // зведення до степеня

        double y = Math.sqrt(16);
        System.out.println(y); // корінь квадратний

        System.out.println(Math.PI); // число Пі
        System.out.println(Math.round(12.645)); // округлення
        System.out.println(Math.ceil(0.1)); // округлення в більшу сторону
        System.out.println(Math.floor(8.99)); // округлення в більшу сторону
        System.out.println(Math.addExact(3, 17)); // додавання
        System.out.println(Math.subtractExact(2, 14)); // віднімання
        System.out.println(Math.floorDiv(6, 2)); // ділення

        double angle = 45.0;
        double sin = Math.sin(Math.toRadians(angle));
        double cos = Math.cos(Math.toRadians(angle));
        double tan = Math.tan(Math.toRadians(angle));

        System.out.println(sin);
        System.out.println(cos);
        System.out.println(tan);



    }
}

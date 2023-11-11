package Lesson_4;

public class TypeConversion {

    public static void main(String[] args){
        double num1 = 10.5;
        int num2 = (int) num1;
        System.out.println(num2);

        byte num3 = 5;
        byte num4 = 10;
        int result = num3 + num4;
        System.out.println(result);

        char myChar = 'A';
        int myInt = myChar;
        System.out.println(myInt);

    }
}

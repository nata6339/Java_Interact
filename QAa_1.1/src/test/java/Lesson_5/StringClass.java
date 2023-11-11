package Lesson_5;

public class StringClass {
    public static void main(String[] args) {
        String str1 = "World is mine";
        String str3 = "World is mine";
        String str2 = new String("World is mine");
        boolean areEqual1 = str1.equals("World is mine");
        boolean areEqual2 = str1.equals("World is not mine");
        boolean areEqual3 = str1.equals(str2);
        boolean location = str1 == str2;

//        char[] chars = str1.toCharArray();
//        for (char c : chars){
//            System.out.println(c + " ");
//        } переведення рядка до масиву
//        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
//        String res = String.copyValueOf(charArray);
//        System.out.println(res); переведення масиву до рядка

//        System.out.println("Is str1 are equal to \"World is mine\" - " + areEqual1);
//        System.out.println("Is str1 are equal to \"World is not mine\" - " + areEqual2);
//        System.out.println("Is the value of two strings are equal - " + areEqual3);
//        System.out.println("Is the memory location are equal - " + location);

//        int index = str1.indexOf("n");
//        System.out.println(index);
//        char code = (char) str1.codePointAt(2);
//        System.out.println(code);
//        int res = str1.compareTo(str2);
//        System.out.println(res);

//        порівняння рядків
//
//        int length = str2.length();
//        System.out.println(length);
//        довжина рядка
//
//        char character = str2.charAt(0);
//        System.out.println(character);
//        символ під заданим індексом
//
//        int codePoint = str2.codePointAt(2);
//        int codePointBefore = str2.codePointBefore(1);
//        System.out.println(codePoint);
////       System.out.println(codePointBefore);
//
//        int res = str1.compareTo(str2);
//        System.out.println(res);

//        boolean containsSubstring = str1.contains(str2);
//        System.out.println(containsSubstring);
//
//        boolean res = str1.endsWith(".pdf");
//        System.out.println(res);

//        String str3 = "Java is fun";
//        int index = str3.indexOf("f");
//        System.out.println(index);



    }
}

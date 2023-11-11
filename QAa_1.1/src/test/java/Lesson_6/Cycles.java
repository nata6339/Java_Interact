package Lesson_6;

public class Cycles {
    /*
    while (умова){
        Код який треба виконати
    }

    for(ініціалізація; умова; ітерація){
        Код який треба виконати
    }

    do {
        Код який треба виконати
    } while (умова);
     */

    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }
//
//        int x = 0;
//        int y = 1;
//        while (y <= 100){
//            x += y;
//            y ++;
//        }
//        System.out.println("Summary of numbers from 1 to 100 = " + x);

//        for (int a = 1; a <= 10; a++ ){
//            System.out.println(a);
//        }

        int x = 0;

        for (int g = 1; g <= 100; g++){
            if (x == 6){
                break;
            }
            x += g;
        }
        System.out.println("Summary from 1 to 100 = "+x);
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {


    public  static int add(int a, int b){
        return a+b+1;
    }


    @Test
    void test(){
        Assertions.assertEquals(2, add(1,1));
    }
}

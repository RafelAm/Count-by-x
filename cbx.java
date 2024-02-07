import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class KataTest {
    @Test
    public void fixedTests() {
       assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, Kata.countBy(1,10));
       assertArrayEquals(new int[] {2,4,6,8,10}, Kata.countBy(2,5));
       assertArrayEquals(new int[] {3,6,9,12,15,18,21}, Kata.countBy(3,7));
       assertArrayEquals(new int[] {50,100,150,200,250}, Kata.countBy(50,5));
       assertArrayEquals(new int[] {100,200,300,400,500,600}, Kata.countBy(100,6));
    }
}


public class Kata{
  public static int[] countBy(int x, int n){

    int[] list = new int[n];
    list[0] = x;
    for(int i = 0, j = x; i < list.length; i++, j+=x){
      
      if(j % x == 0){
          list[i] = j;
          
        }
      System.out.println(list[i]);
    }
    
    
    
    return list;
  }
}

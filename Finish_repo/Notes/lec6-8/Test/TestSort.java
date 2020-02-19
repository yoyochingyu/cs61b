/** Tests the Sort Class
 *  != when using in reference type =>test if they points to the same object(save the same address)
 *  @org.jnit.Test also change the method into no-static and then delete the main method and run with Run>Run*/

import org.junit.Test;
import static org.junit.Assert.*;
public class TestSort{
    @Test
    public void testsort(){
        /**Test the Sort.sort method*/
        /**Create a string and feeds it to Sort Class*/
        String [] input = new String[]{"he","is","a","cute","boy"};
        String  [] expected = new String[]{"a","boy","cute","he","is"};
        Sort.sort(input);
        assertArrayEquals(expected,input);
        /**JUnit library checks if the objects are same!*/

    }
    /** Test the Sort.findSmallest method. */
    @Test
    public void testFindSmallest(){
        String [] input = new String[]{"he","is","a","cute","boy"};
        int expected = 2;
        int actual = Sort.findSmallest(input,0);
        assertEquals(expected,actual);
        //Second Test:
        String [] input2 = new String[]{"once","upon","a","time"};
        int expected2 = 2;
        int actual2 = Sort.findSmallest(input2,1);
        assertEquals(expected2,actual2);
    }

    /** Test the Sort.swap method */
    @Test
    public void testSwap(){
        String [] input = {"he","is","a","cute","boy"};
        int a = 0;
        int b = 2;
        String [] expected = {"a","is","he","cute","boy"};
        Sort.swap(input,a,b);
        /**Remember to run the Sort.swap method*/
        assertArrayEquals(expected,input);
    }


}
/** Tests the Sort Class*/
/** != when using in reference type =>test if they points to the same object(save the same address)*/
public class TestSort{
    public static void testsort(){
        /**Test the Sort.sort method*/
        /**Create a string and feeds it to Sort Class*/
        String [] input = new String[]{"he","is","a","cute","boy"};
        String  [] expected = new String[]{"a","boy","cute","he","is"};
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected,input);
        /**JUnit library checks if the objects are same!*/

    }
    /** Test the Sort.findSmallest method. */
    public static void testFindSmallest(){
        String [] input = new String[]{"he","is","a","cute","boy"};
        int expected = 2;
        int actual = Sort.findSmallest(input,0);
        org.junit.Assert.assertEquals(expected,actual);
        //Second Test:
        String [] input2 = new String[]{"once","upon","a","time"};
        int expected2 = 2;
        int actual2 = Sort.findSmallest(input2,1);
        org.junit.Assert.assertEquals(expected2,actual2);
    }

    /** Test the Sort.swap method */
    public static void testSwap(){
        String [] input = {"he","is","a","cute","boy"};
        int a = 0;
        int b = 2;
        String [] expected = {"a","is","he","cute","boy"};
        Sort.swap(input,a,b);
        /**Remember to run the Sort.swap method*/
        org.junit.Assert.assertArrayEquals(expected,input);
    }


    public static void main(String[] args){
    testsort();
//        testFindSmallest();
//        testSwap();
    }

}
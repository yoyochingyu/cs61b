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
        String expected = "a";
        String actual = Sort.findSmallest(input);
        org.junit.Assert.assertEquals(expected,actual);
        //Second Test:
        String [] input2 = new String[]{"once","upon","a","time"};
        String expected2 = "a";
        String actual2 = Sort.findSmallest(input2);
        org.junit.Assert.assertEquals(expected2,actual2);
    }


    public static void main(String[] args){
//    testsort();
        testFindSmallest();
    }

}
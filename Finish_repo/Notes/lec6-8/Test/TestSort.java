/** Tests the Sort Class*/
/** != when using in reference type =>test if they points to the same object(save the same address)*/
public class TestSort{
    public static void testsort(){
        /**Test the Sort.sort method*/
        /**Create a string and feeds it to Sort Class*/

        String [] input = new String[]{"he","is","a","cute","boy"};
        String  [] expected = new String[]{"a","boy","cute","he","is"};
/*          Why this work? Bcuz input still points to the String array(object), which means in Sort class we need to set void instead of returning an array
*           Also, we should Change the String array in the Sort class*/
        Sort.sort(input);
        if(input.length!=expected.length) {
            System.out.println("FAIL: you return " + input.length + " words, but it should be " + expected.length + " words.");
            return;
        }
        for(int i=0;i<expected.length;i++){
            if(expected[i].equals(input[i]))
                continue;
            else{
                System.out.println("FAIL:Wrong in position "+i+", expected '"+expected[i]+"', but got '"+input[i]+"'.");
                return;
            }
        }
        System.out.println("Success");


    }


    public static void main(String[] args){
    testsort();
    }
}
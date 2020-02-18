/**
 * Philiosophy:
 * 1. Small pieces
 * 2. Test->Code
 * */
public class Sort{
    public static void sort(String [] x){
        //Find the smallest in the String
    }

    public static String findSmallest(String [] x){
        int smallestIndex = 0;
        for(int i=0;i<x.length;i++){
            if(x[i].compareTo(x[smallestIndex])<0)
                smallestIndex = i;
        }
        return x[smallestIndex];
    }

}
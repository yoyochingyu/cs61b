/**
 * Philosophy:
 * 1. Small pieces
 * 2. Test->Code
 * 3. Selection sort --> Keep/Compare the index
 * */
public class Sort{
    public static void sort(String [] x){
        //Find the smallest in the String
        int smallestIndex = findSmallest(x);
        swap(x,0,smallestIndex);
    }

    /** Return the smallest index in x*/
    public static int findSmallest(String [] x){
        int smallestIndex = 0;
        for(int i=0;i<x.length;i++){
            if(x[i].compareTo(x[smallestIndex])<0)
                smallestIndex = i;
        }
        return smallestIndex;
    }
    public static void swap(String [] x, int a, int b){
//        x[a] = x[b];
//        x[b] = x[a];
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

}
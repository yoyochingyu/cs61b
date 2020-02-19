/**
 * Philosophy:
 * 1. Small pieces to test(Unit-testing)
 * 2. Test->Code
 * 3. Selection sort --> Keep/Compare the index
 * */
public class Sort{
    public static void sort(String [] x){
        sort(x,0);
    }
    /** Private sort method, passing in the index*/
    /** Sorts x starting at position x */
    private static void  sort(String[] x, int start){

        if(start>=x.length)
            return;
        int smallestIndex = findSmallest(x,start);
        swap(x,start,smallestIndex);
        sort(x,++start);
    }

    /** Return the smallest index in x, starting at start*/
    public static int findSmallest(String [] x, int start){
        int smallestIndex = start;
        for(int i=start;i<x.length;i++){
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
public class AList{
    //用Array寫Linkedlist(有pointer去串接前後東西)
    /** Member : array with int type named items*/
    int [] items;
    int size;

    /** Constructor : Creates an empty list.(not static)*/
    /** ?? */
    public AList(){
        items = new int [0];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x){
        size++;
        int [] temp = items;
        items = new int [size];
        for(int i=0;i<temp.length;i++)
            items[i] = temp[i];
        items[size-1] = x;
    }

    /** Reurns the item from the back of the list. */
    public int getLast(){
        return items[size-1];
    }

    /** Get the ith item in the list(0 is the front) */
    public int get(int i){
        return items[i-1];
    }

    /**Returns the number of items in the list. */
    public int size(){
        return size;
    }

    /**Deletes item from back of the list and returns deleted item. */
    public int removeLast(){
        size--;
        int [] temp = items;
        items = new int [size];
        for(int i=0;i<size;i++)
            items[i] = temp[i];
        return temp[size];

    }


//    public static void main(String[] args){
//        System.out.println("Hello World");
    /** Build a object through constructer */
//          AList A = new AList();
//    }
}
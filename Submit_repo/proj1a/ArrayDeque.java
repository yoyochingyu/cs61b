/**
 * Invariants :
 * 1. You shouldn't link between array elements.
 * */

public class ArrayDeque{
    public int [] items;
    public int size;
    public int nextFirst;
    public int nextLast;

    /** Constructor:empty array */
    public ArrayDeque(){
        items = new int [8];
        size = 0;
        nextFirst = 0;
        nextLast = 0;
    }
    private void resize(){
        int [] a = new int [(int)(size*3.75)];
        System.arraycopy(items,0,a,0,size);
        items = a;
        nextFirst = items.length-1;
        nextLast = size;
        a = null;
    }
    public void addLast(int x){
        if(size == items.length){
            resize();
        }
        items[nextLast++] = x;
        if(size==0){
            nextFirst = nextLast-2;
            if(nextFirst<0)
                nextFirst = nextFirst+items.length;
        }
        size++;

    }
    public void addFirst(int x){
        if(size == items.length){
            resize();
        }
        items[nextFirst--] = x;
        /**以防empty array的時候先addFirst(還沒考慮Remove後size = 0的情形)*/
        if(size==0){
            nextLast = nextFirst + 2;
            if(nextFirst<0){
                nextFirst = nextFirst + items.length;
            }
        }
        size++;

    }
}
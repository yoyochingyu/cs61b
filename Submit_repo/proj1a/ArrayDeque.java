/**
 * Invariants :
 * 1. You shouldn't link between array elements.
 * 2. Remove first = remove index:size-1
 * 3. nextFirst and nextLast refers to indices
 * */

public class ArrayDeque<Lochness>{
    public Lochness [] items;
    public int size;
    public int nextFirst;
    public int nextLast;


    /** Constructor:empty array */
    public ArrayDeque(){
        items = (Lochness[])new Object [8];
        size = 0;
        nextFirst = 0;
        nextLast = 0;
    }
    //copy的size,nextFirst跟nextLast呢?
    public ArrayDeque(ArrayDeque other){
    //不考慮resize，都是固定大小8
        items = (Lochness[])new Object[8];
        for(int i=0;i<items.length;i++){
            items[i] = (Lochness) other.items[i];
        }
        size = other.size;
        nextFirst = other.nextFirst;
        nextLast = other.nextLast;
    }
    //Not changed to generic type yet!
//    private void resize(){
//        int [] a = new int [(int)(size*3.75)];
//        System.arraycopy(items,0,a,0,size);
//        items = a;
//        nextFirst = items.length-1;
//        nextLast = size;
//        a = null;
//    }

    public void addLast(Lochness x){
        if(size == items.length){
//            resize();
        }
        items[nextLast++] = x;
        if(size==0){
            nextFirst = nextLast-2;
            if(nextFirst<0)
                nextFirst = nextFirst+items.length;
        }
        if(nextLast >= items.length)
            nextLast = nextLast - items.length;
        size++;

    }

    public void addFirst(Lochness x){
        if(size == items.length){
//            resize();
        }
        items[nextFirst--] = x;
        /**以防empty array的時候先addFirst(還沒考慮Remove後size = 0的情形)*/
        if(size==0){
            nextLast = nextFirst + 2;
        }
        if(nextFirst<0){
            nextFirst = nextFirst + items.length;
        }
        size++;

    }

    public Lochness removeFirst(){
        Lochness output;
        int removedIndex = nextFirst + 1;
        //改成size
        if (removedIndex >= items.length) {
            removedIndex -= items.length;
        }
        output = items[removedIndex];
        items[removedIndex] = null;
        nextFirst= removedIndex;
//        if(size==items.length)
//            nextLast-=1;
        size--;
        return output;
    }

    public Lochness removeLast(){
        Lochness output;
        int removedIndex = nextLast - 1;
        if (removedIndex < 0) {
            removedIndex += items.length;
        }
        output = items[removedIndex];
        items[removedIndex] = null;
        nextLast= removedIndex;
//        if(size==items.length)
//            nextLast-=1;
        size--;
        return output;
    }

    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
    public int size(){
        return size;
    }
    public void printDeque(){
        for(int i=0;i<items.length;i++)
            System.out.print(items[i]+" ");
        System.out.println();
    }
    public Lochness get(int index){
        return items[index];
    }
}

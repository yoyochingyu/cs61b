/**
 * Invariants :
 * 1. index -1 = sentinel = index size, index 0 = first item, the last item 's index = size-1(index+1 = size)
 * 2. LinkedListDeque points at (=) sentinel
 *
 * */
public class LinkedListDeque<LochNess> {
    private class StuffNode {
        LochNess item;
        StuffNode prev;
        StuffNode next;
        StuffNode(LochNess i, StuffNode p, StuffNode n) {
            /** 這裡不可以同名會出錯(ex:item = item)*/
            item = i;
            prev = p;
            next = n;
        }
    }
    public StuffNode sentinel;
    public int size;
    /** Create a sentinel node */
    private void createSentinel(){
        //Error:nullPointer->因為在右側new的時候sentinel還沒有指派值是null，所以不能寫new StuffNode(0,sentinel,sentinel)
        sentinel = new StuffNode(null,null,null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

    /**Creates an empty LinkedListDeque:sentinel only*/
    public LinkedListDeque() {
        this.createSentinel();
        size = 0;
    }

    public LinkedListDeque(LinkedListDeque other){
        this.createSentinel();
        size = 0;
        //Set the looping pointer:starts from front node
        StuffNode ptr = other.sentinel.next;
        for(int i=other.size-1;i>=0;i--)
            this.addFirst((LochNess) other.get(i));
    }

    /** Add items into the front*/
    public void addFirst(LochNess x){
//      加在sentinel的後面:
        StuffNode temp = sentinel.next;
        sentinel.next = new StuffNode(x,sentinel,sentinel.next);
        temp.prev = sentinel.next;
        size++;
    }

    /** Add item into the back */
    public void addLast(LochNess x){
        StuffNode temp = sentinel.prev;
        sentinel.prev = new StuffNode(x,sentinel.prev,sentinel);
        temp.next = sentinel.prev;
        size++;

    }

    public LochNess removeFirst(){
        StuffNode temp = sentinel.next;
        LochNess output = temp.item;
        sentinel.next = temp.next;
        temp.next.prev = sentinel;
        temp = null;
        size--;
        return output;
    }
    public LochNess removeLast(){
        StuffNode temp = sentinel.prev;
        temp.prev.next = sentinel;
        sentinel.prev = temp.prev;
        LochNess output = temp.item;
        temp = null;
        size--;
        return output;
    }

    public boolean isEmpty(){
        if (sentinel.next == sentinel)
            return true;
        return false;
    }
    public int size(){
        return size;
    }

    public void printDeque(){
        if(this.isEmpty())
            return;
        StuffNode ptr = sentinel.next;
        while(ptr.next != sentinel) {
            System.out.print(ptr.item+" ");
            ptr = ptr.next;
        }
        System.out.println(ptr.item);
    }

    public LochNess get(int index) {
        int size = this.size;
        if (index >= size)
            //return null?->Change return type from "int" to"Integer"
            return null;
        StuffNode ptr = sentinel;
        //從後面開始找
        if ((index+1) > 0.5 * size) {
            while (size != index) {
                ptr = ptr.prev;
                size--;
            }
            return ptr.item;
        }
        while((size-5)!=index){
            ptr = ptr.next;
            size++;
        }
        return ptr.item;
    }

//    public LochNess getRecursive(int index){
//        //改移動index，因為只有index可以被傳進recursive裡面
//        if ((index+1) > 0.5 * size){
//            if (size != index) {
//                sentinel = sentinel.prev;
//                return getRecursive(++index);
//            }
//        }else {
//            if ((size - 5) != index) {
//                sentinel = sentinel.next;
//                return getRecursive(--index);
//            }
//        }
//    }
}
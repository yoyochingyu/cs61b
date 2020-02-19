/**
 * Invariants :
 * 1. index -1 = sentinel, index 0 = first item, the last item 's index = size-1(index+1 = size)
 *
 * */
public class LinkedListDeque {
    private class IntNode {
        int item;
        IntNode prev;
        IntNode next;
        IntNode(int i, IntNode p, IntNode n) {
            /** 這裡不可以同名會出錯(ex:item = item)*/
            item = i;
            prev = p;
            next = n;
        }
    }
    public IntNode sentinel;
    public int size;

    /**Creates an empty LinkedListDeque:sentinel only*/
    public LinkedListDeque() {
        //Error:nullPointer->因為在右側new的時候sentinel還沒有指派值是null，所以不能寫new IntNode(0,sentinel,sentinel)
        sentinel = new IntNode(0,null,null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }
    /** Add items into the front*/
    public void addFirst(int x){
//      加在sentinel的後面:
        IntNode temp = sentinel.next;
        sentinel.next = new IntNode(x,sentinel,sentinel.next);
        temp.prev = sentinel.next;
        size++;
    }

    /** Add item into the back */
    public void addLast(int x){
        IntNode temp = sentinel.prev;
        sentinel.prev = new IntNode(x,sentinel.prev,sentinel);
        temp.next = sentinel.prev;
        size++;

    }

    public int removeFirst(){
        IntNode temp = sentinel.next;
        int output = temp.item;
        sentinel.next = temp.next;
        temp.next.prev = sentinel;
        temp = null;
        size--;
        return output;
    }
    public int removeLast(){
        IntNode temp = sentinel.prev;
        temp.prev.next = sentinel;
        sentinel.prev = temp.prev;
        int output = temp.item;
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
        IntNode ptr = sentinel.next;
        while(ptr.next != sentinel) {
            System.out.print(ptr.item+" ");
            ptr = ptr.next;
        }
        System.out.println(ptr.item);
    }

    public Integer get(int index) {
        int size = this.size;
        if (index >= size)
            //return null?
            return null;
        IntNode ptr = sentinel;
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
}
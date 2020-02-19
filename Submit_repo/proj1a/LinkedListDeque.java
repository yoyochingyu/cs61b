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
        sentinel = new IntNode(5,null,null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }
    /** Add items into */
    public void addFirst(int x){
//      加在sentinel的後面:
        IntNode temp = sentinel.next;
        sentinel.next = new IntNode(x,sentinel,sentinel.next);
        temp.prev = sentinel.next;
    }
}
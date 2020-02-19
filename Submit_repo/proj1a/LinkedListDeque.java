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
//        //加在sentinel的後面:
        /** 3 */
        IntNode temp = sentinel.next;
        IntNode createdNode = new IntNode(x,null,null);
//        就連新的node也不可以指向指向自己的node(會被視為null)，要另外另!
//        IntNode createdNode = new IntNode(x,sentinel,sentinel.next);
        createdNode.next = sentinel.next;
        createdNode.prev = sentinel;
        sentinel.next = createdNode;
        /**3 */
        temp.prev = sentinel.next;
    }
}
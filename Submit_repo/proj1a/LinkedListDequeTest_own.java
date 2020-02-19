import org.junit.Test;
import org.junit.Assert.*;

public class LinkedListDequeTest_own{
    /** Tests the IntNode constructor */
//    @Test
//    public void TestSLL(){
//        IntNode()
//    }
    public static void main(String[] args){
        //Test : SLL constructor + addFirst
        LinkedListDeque l = new LinkedListDeque();
//        System.out.println(l.isEmpty());
//        System.out.println(l.size());
//        l.printDeque();
        l.addFirst(20);
//        System.out.println(l.isEmpty());
//        System.out.println(l.size());
        l.addFirst(10);
        l.addFirst(5);
        l.addLast(-5);
//        System.out.println(l.isEmpty());
//        System.out.println(l.size());
//        l.printDeque();
//        l.removeFirst();
//        l.removeLast();
        System.out.println(l.get(4));
        System.out.println(l.size());
    }

}
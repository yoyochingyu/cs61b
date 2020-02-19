import org.junit.Test;
import org.junit.Assert.*;

public class LinkedListDequeTest_own{
    /** Tests the StuffNode constructor */
//    @Test
//    public void TestSLL(){
//        StuffNode()
//    }
    public static void main(String[] args){
        //Test : SLL constructor + addFirst
        LinkedListDeque<String> l = new LinkedListDeque<>();
//        System.out.println(l.isEmpty());
//        System.out.println(l.size());
//        l.printDeque();
        l.addFirst("boy");
//        System.out.println(l.isEmpty());
//        System.out.println(l.size());
        l.addFirst("a");
        l.addFirst("is");
        l.addLast("he");
//        System.out.println(l.isEmpty());
//        System.out.println(l.size());
//        l.printDeque();
//        l.removeFirst();
//        l.removeLast();
        System.out.println(l.get(4));
        System.out.println(l.size());
    }

}
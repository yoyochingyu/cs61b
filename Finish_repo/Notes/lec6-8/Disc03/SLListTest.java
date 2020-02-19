import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.AbstractObjectAssert;
import static org.assertj.core.api.Assertions.assertThat;



public class SLListTest{
    @Test
    public void TestSLList() {
        SLList input= new SLList();
        input.addFirst(2);
        input.addFirst(6);
        input.addFirst(5);
//        System.out.println(input.first.item);
//        System.out.println(input.first.next.item);
//        System.out.println(input.first.next.next.item);
    }
    @Test
    public void TestInsert(){
        SLList input= new SLList();
        input.addFirst(2);
        input.addFirst(6);
        input.addFirst(5);


        SLList expected= new SLList();
        expected.addFirst(2);
        expected.addFirst(6);
        expected.addFirst(10);
        expected.addFirst(5);

        SLList expected2= new SLList();
        expected2.addFirst(2);
        expected2.addFirst(6);
        expected2.addFirst(10);
        expected2.addFirst(5);

        input.insert(10,1);
//        assertEquals(expected,expected2);
        assertEquals(expected,input);
        //不能直接測，因為比較的會是地址，會錯!
        //lab3的IntNode可以因為是destructive地址沒有改變
    }
    @Test
    public void TestRevert(){
        SLList input= new SLList();
        input.addFirst(2);
        input.addFirst(6);
        input.addFirst(5);

        SLList expected= new SLList();
        expected.addFirst(5);
        expected.addFirst(6);
        expected.addFirst(2);

        input.revert();
//        assertThat(input.first).isEqualToComparingFieldByFieldRecursively(expected.first);


        //        System.out.println(expected.equals(input));
//        assertEquals(expected,input);
    }




//    public static void main(String[] args){
//        TestSLList();
//    }
}
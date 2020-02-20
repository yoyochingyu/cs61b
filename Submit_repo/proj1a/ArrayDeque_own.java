/**往前可行*/
public class ArrayDeque_own{
    public static void main(String[] args){
        ArrayDeque a = new ArrayDeque();
//        System.out.println(a.size());
        a.addLast(0);
        a.addLast(1);
        a.addLast(2);
//        System.out.println(a.size());
        a.printDeque();

        a.addLast(3);
        a.addFirst(7);
        a.addFirst(6);
        a.addFirst(5);
        ArrayDeque a_copy = new ArrayDeque(a);
        System.out.println(a.get(5));
//        a.printDeque();

        a.removeLast();
        a.removeLast();
        a.removeLast();
        a.removeLast();
        a.removeLast();
        a.removeLast();

        a.addFirst(5);
        a.addLast(4);
        a.addFirst(100);

        a.removeFirst();
        a.addLast(6);
        a.addFirst(7);
        a.addFirst(1);
        a.addFirst(2);
        a.addFirst(3);

        a.addLast(8);
        a.removeFirst();
        a.removeFirst();
         a.removeFirst();
        a.addFirst(7);
        a.addFirst(6);

        a.addLast(7);



    }
}
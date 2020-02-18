public class TestAList{
    public static void main(String[] args){
        AList2 a = new AList2();
        a.addLast(10);
        a.addLast(20);
        a.getLast();
        a.get(2);
        a.size();
        System.out.println(a.removeLast());

    }
}
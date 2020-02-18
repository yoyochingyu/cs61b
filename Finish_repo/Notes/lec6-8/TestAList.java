public class TestAList{
    public static void main(String[] args){
        AList a = new AList();
        a.addLast(10);
        a.addLast(20);
        a.getLast();
        a.get(2);
        a.size();
        System.out.println(a.removeLast());

    }
}
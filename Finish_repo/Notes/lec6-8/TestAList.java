public class TestAList{
    public static void main(String[] args){
        AList2<String> a = new AList2<>();
        a.addLast("Hi");
        a.addLast("You");
        a.getLast();
        a.get(2);
        a.size();
        System.out.println(a.removeLast());

    }
}
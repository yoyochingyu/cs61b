/**
 * 1. 用interface取代特定的class，讓main去跟interface互動，自己判斷應該採用哪種class
 * 2. 在main裡面可以用AList也可以用SLList，也可以放interface兩者隨便選一
 * */
public class WordUtils {
    /** Returns the length of the longest word. */
//    public static String longest(SLList<String> list) {(原本)
    public static String longest(List61B<String> list) {
        int maxDex = 0;
        for (int i = 0; i < list.size(); i += 1) {
            String longestString = list.get(maxDex);
            String thisString = list.get(i);
            if (thisString.length() > longestString.length()) {
                maxDex = i;
            }
        }
        return list.get(maxDex);
    }

    public static void main(String[] args) {
//        AList<String> someList = new AList<>();
//        SLList<String> someList = new SLList<>();
        List61B<String> someList = new SLList<>();
        someList.addLast("elk");
        someList.addLast("are");
        someList.addLast("watching");
        someList.print();
    }
}

/**
 * 1. declaration(class->interface)
 * 2. no need of constructor/variables, only universal methods
 * 3. Put <Generic data-type> behind the varName，<Item>代表在此interface中datatype會用什麼替代
 * */
public interface List61B<Item>{



    /** Inserts X into the back of the list. */
    public void addLast(Item x);

    /** Returns the item from the back of the list. */
    public Item getLast() ;
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) ;

    /** Returns the number of items in the list. */
    public int size() ;

    /** Deletes item from back of the list and
     * returns deleted item. */
    public Item removeLast() ;
    public Item getFirst();
    /** Inserts an item at the front. */
    public void addFirst(Item x);

    public void insert(Item x, int position);

    default public void print(){
        for(int i=0;i<size();i++){
            System.out.print(get(i)+" ");
        }
        System.out.println();
    }
}
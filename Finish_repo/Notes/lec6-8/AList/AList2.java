/** Array based list.
 *  @author Josh Hug
 */
/**
 * You should write codes along with writing tests!
 * Never write a bunch of code without writing tests!
 * 把code拆開成小部分寫，easier to maintain and read and test!
 * */

//         0 1  2 3 4 5 6 7
// items: [6 9 -1 2 0 0 0 0 ...]
// size: 5


/* Invariants:
 addLast: The next item we want to add, will go into position size
 getLast: The item we want to return is in position size - 1
 size: The number of items in the list should be size.
*/

public class AList2<Item> {
    /**Private ensures no one else will enter the code*/
    private Item [] items;
    private int size;

    /** Creates an empty list. */
    public AList2(){
        items = (Item [])new Object [100];
        size = 0;
    }
    /** Resizing the array to the target capacity! */
    /** Private*/
    private void resize(int capacity){
        Item [] a = (Item [])new Object [capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x){
        /**Handle if array gets too big*/
        if(size == items.length)
            resize(size+1);
        items[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public Item getLast(){
        return items[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i){
        return items[size-1];
    }
    /** Returns the number of items in the list. */
    public int size(){
        return size;
        //不是return items.size!!!
        //寧可this.size!
    }
    /** Deletes item from back of the list and
     * returns deleted item. */
    //因為預設都填0(new int [100]，所以可以直接設0)
    //其實不用填0，只要access不到就好了，之後寫新的覆蓋就好!
    public Item removeLast(){
        Item x = getLast();
//        items[size] = 0; //Not necessary
        items[size] = null; //Not necessary

        size--;
        return x;
//        size--;
//        int a = item[size];
//        item[size] = 0;
//        return a;
    }



}
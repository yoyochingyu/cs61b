/** yes sentinel node */
public class SLList {
	private class IntNode {
		public int item;
		public IntNode next;
		public IntNode(int item, IntNode next) {
		this.item = item;
		this.next = next;
		}
	}
	public IntNode first;
	public SLList(){
		first = new IntNode(0,null);

	}

	public void addFirst(int x) {

		first.next = new IntNode(x, first.next);
 	}
 	public void insert(int x,int position){
		int count = -1;
 		IntNode ptr = this.first;
 		while(ptr.next != null){
 			if (count == position-1) {
	 			IntNode node = new IntNode(x,ptr.next);
	 			ptr.next = node;
	 			return;
 			}
 			count++;
	 		ptr = ptr.next;
 		}
 		IntNode newNode = new IntNode(x,null);
 		ptr.next = newNode;

	}//Insert
	public void revert(){
	IntNode lead = first.next;
	IntNode middle = null;
	IntNode trail;
	while(lead!=null){
		trail = middle;
		middle = lead;
		lead = lead.next;
		middle.next = trail;
	}
	first.next = middle;
	}
}
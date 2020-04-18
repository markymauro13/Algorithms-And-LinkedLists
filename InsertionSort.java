//*********************************************************************************
// Author: Mark Mauro
//
// Section: 02
//
// Solution to PP 13.3
//*********************************************************************************

public class InsertionSort {

	private SortNode list;
	
	public InsertionSort() {
		list = null;
	}
	
	public void add2(int value) {
		SortNode node = new SortNode(value);
		SortNode current = null;
		
		if(list == null)
			list = node;
		else {
			current = list;
			while(current.next != null)
				current = current.next;
			current.next = node;
		}
	}
	
	public void sort2() {

		//SortNode temp = list;
		
		if(list == null)
			return;
		for(SortNode i = list; i != null; i = i.next) {
			for (SortNode j = i.next; j != null; j = j.next) {
	            if (i.value > j.value) {
	                int temp = i.value;
	                i.value = j.value;
	                j.value = temp;
	            }
			}
		}
		
	}
	
	public String toString() {
		String report = "";
		SortNode current = list;
		
		if(current != null) {
			report += String.valueOf(current.value) + " ";
			while(current.next != null) {
				current = current.next;
				report += String.valueOf(current.value) + " ";
			}
		}
		return report;
	}
	
	
	private class SortNode{
		public int value;
		public SortNode next;
		
		public SortNode(int current) {
			value = current;
			next = null;
		}
	}
}

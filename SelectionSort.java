//*********************************************************************************
// Author: Mark Mauro
//
// Section: 02
//
// Solution to PP 13.3
//*********************************************************************************

public class SelectionSort {
	
	private SortNode list;
	
	public SelectionSort() {
		list = null;
	}
	
	public void add(int value) {
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
	
	public void sort() {
		SortNode current = list;
		SortNode min = list;
		SortNode swapPos = list;
		
		if(list == null)
			return;
		
		while(swapPos.next != null) {
			while(current.next != null) {
				current = current.next;
				if(current.value < min.value)
					min = current;
			}
			if(min != swapPos) {
				int temp = min.value;
				min.value = swapPos.value;
				swapPos.value = temp;
			}
			swapPos = swapPos.next;
			current = swapPos;
			min = current;
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
		
		// setting up the node
		
		public SortNode(int current) {
			value = current;
			next = null;
		}
	}
}

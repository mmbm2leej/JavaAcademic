class MyLinkedList {

     private Node head;

     MyLinkedList( ) {
    	 head = null;
     }
     
     public void addNode(Node n) { 	 
    	 if (head == null) { head = n; } 
    	 else {
    		 Node seek = head;
    		 while (seek.next != null) {
    			 seek = seek.next;
    		 }
    	 seek.next = n;
    	 }
     }
     
     public void printList() {  
         Node seek = head;
         while (seek != null) {
           System.out.println(seek.name);
           seek = seek.next;
         }
     }
     
     public void insertBefore(int index,  Node n)  {
    	 /* adds Node n before index value */ 
    	 int indexToChange = index-2;
    	 Node seek = head;
    	 for (int i = 0; i < indexToChange; i++) {
    		 seek = seek.next;
    	 }
    	 n.next = seek.next;
    	 seek.next = n;
     } 
     
     public void insertAfter(int index,  Node n)  { 
    	 /* adds Node n after index value */ 
    	 int indexToChange = index;
    	 Node seek = head;
    	 for (int i = 0; i < indexToChange; i++) {
    		 seek = seek.next;
    	 }
    	 n.next = seek.next;
    	 seek.next = n;
    	 
     }     
     
     public int indexOf(String str) { 
    	 /* returns index of where String str  is at.  Returns -1 if String str  is not in LinkedList */
    	 int searchIndex = 0;
    	 Node seek = head;
    	 while (seek != null) {
    		 if (seek.name == str) return searchIndex;
    		 else {
    			 searchIndex++;
    			 seek = seek.next;
    		 }
    	 }
    	 return -1;
     }
     
     public void removeNodeAt(int index) { 
    	 int count = 0;
    	 Node prev = head;
    	 Node seek = head;
    	 
    	 if (index == 0) {
    		  
    		 head = seek.next;
    		 seek.next = null;
    		 
    	 } else {
	    	 
	    	 while (count < index) {
	    		 
	    		 if (count < (index - 1) ) { 
	    			 prev = prev.next;
	    			 seek = seek.next;
	    			 count++;		 
	    		 }
	    		  
	    	 }
	    	 
	    	 prev.next = seek.next;	 
	    	 seek.next = null;
	    	 
	     }
     }
     
}





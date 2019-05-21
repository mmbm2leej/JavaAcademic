class Test {
	
    public static void main(String[] args) {
	    	
	   	MyLinkedList myLL = new MyLinkedList();
	    Node myNode0 = new Node("myNode0");
	    myLL.addNode(new Node("steve"));
	    myLL.addNode(new Node("sarah"));
	    myLL.addNode(new Node("jen"));
	    myLL.addNode(new Node("kevin"));
	    myLL.addNode(new Node("kim"));
	    myLL.addNode(new Node("todd"));
	    myLL.addNode(new Node("rob"));
	    System.out.print("Before List : ");
	   	myLL.printList();  	
	   	myLL.insertAfter(3, new Node("four"));
	   	myLL.insertBefore(2, new Node("one"));
	   	int indexOfFour = myLL.indexOf("four");
	   	System.out.println("Method indexOf('four') has returned " + indexOfFour);
	   	int indexOfThree = myLL.indexOf("three");
	   	System.out.println("Method indexOf('three') has returned " + indexOfThree);
	   	myLL.removeNodeAt(5);
	    System.out.print("After List : ");
	   	myLL.printList();
   	
    }

}

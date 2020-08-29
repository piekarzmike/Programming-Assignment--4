
// This class implements a Stack ADT as a linked list
public class Set {
	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Number of nodes in the list

	// Constructor - initializes the front and count variables
	Set() {
		front = null;
		count = 0;
	}

	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	// Implements the peek operation
	int peek() {
		return front.x;
	}

	// Implements the isEmpty operation
	boolean isEmpty() {
		return front == null;
	}

	// Implements the size operation
	int size() {
		return count;
	}

	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}
//=====================================================================================
// Method add values to the linked list
//=====================================================================================
	public void add(String input, Set list) {

		// Declare an initializes a string array variable
		String[] inputArray = input.split(" ");
		
		// if error based upon user input (extra space at beginning, no space between command and int) return to main
		if (inputArray.length < 2 || inputArray[0].equals("")) {
			return;
		}
		
		// Declare and Initialize variables
		int numAdd;
		LinkedNode currentNode = list.front;
		int newCount = list.count;
		String intFound = null;
		numAdd = Integer.parseInt(inputArray[1]);

		// Add only unique value to the list if list is empty 
		for (; newCount >= 0; newCount--) {
			if (count == 0) {
				list.push(numAdd);
				System.out.println(list);
				intFound = "true";
				break;
			} else if (currentNode.x == numAdd) {
				intFound = "true";
				System.out.println(list);
				break;
			} else {
				currentNode = currentNode.next;
				newCount--;
			}
		}

		// Add only unique values to the list after the first spot
		if (intFound != "true") {
			list.push(numAdd);
			System.out.println(list);
		}

	}
	
	
//=====================================================================================
// Method to delete values from the list 	
//=====================================================================================
	public void del(String input, Set list) {

		// Declare an initializes a string array variable
		String[] inputArray = input.split(" ");
		
		// if error based upon user input (extra space at beginning, no space between command and int) return to main
		if (inputArray.length < 2 || inputArray[0].equals("")) {
			return;
		}
		
		// if user input exists command prior to creating of linked list return false
		if (list.isEmpty()) {
			return;
		}
		
		
		// Declare and Initialize variables
		int numDel;
		numDel = Integer.parseInt(inputArray[1]);
		int posCount = 1;
		LinkedNode currentNode = list.front;

		
		// Check to see if value enter is in the list or not
		while (currentNode.x != numDel) {
			if (currentNode.x != numDel) {
				currentNode = currentNode.next;
				posCount++;
				// Check if next node is null (integer is not found in list) and return to main
				if (currentNode.next==null) {
					System.out.println(list);
					return;
				}
			}
		}

		// Delete out value from list by setting the node to null 
		LinkedNode previous = front;
		int baseCount =1;
		while (baseCount<posCount-1) {
			previous=previous.next;
			baseCount++;
		}
		// Set node to null
		LinkedNode current = previous.next;
		previous.next = current.next;
		current.next=null;
		
		//Print out list after 
		System.out.println(list);
	}

//=====================================================================================
// Method to check if value exists (true) or not (false)
//=====================================================================================

	public void exists(String input, Set list) {

		// Declare an initializes a string array variable
		String[] inputArray = input.split(" ");
		
		// if error based upon user input (extra space at beginning, no space between command and int) return to main
				if (inputArray.length < 2 || inputArray[0].equals("")) {
					return;
				}
		// if user input exists command prior to creating of linked list return false
		if (list.isEmpty()) {
			System.out.println("False");
			return;
		}
		
		// Declare ad Initialize variables
		String intFound = null;
		int numExists;
		int newCount = list.count;
		numExists = Integer.parseInt(inputArray[1]);
		LinkedNode currentNode = list.front;

		// Make sure linked lists was created and if so check if value exists; return true value found
		for (; newCount >= 0 ; newCount--) {
			if (currentNode.x == numExists) {
				System.out.println("True");
				intFound = "true";
				break;
			} else {
				currentNode = currentNode.next;
				newCount--;
			}
		}

		// If value not found return false
		if (intFound != "true") {
			System.out.println("False");
		}
	}

}
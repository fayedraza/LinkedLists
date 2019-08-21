//created by Fayed Raza
public class Car {
/*purpose is to use a data structure called linked lists in a
 * a program that can add/delete car parts
 * 
 * 
 */
	
	Parts head; 
	int x; //useful for the remove(int x) method
	
	private Boolean isEmpty() { //returns true  (empty) or false (not empty)
		return head==null;
	}
	
	
	
	
	public void add(String s) { //takes in a parameter which is a string
		Parts part = new Parts(s); //an object 
	
		if(x == 0) { //in case if node is null
			part.next = head;
			head = part;
			
			x++;
			System.out.println(s + " has been added");
			
		}else if(x != 0) {//adds to the end of the list

			Parts test = head;
		
			while(test.next != null) 
			test=test.next;
			
			part.next  =null;
			test.next = part;
			
			x++;
			System.out.println(s + " has been added");
			
		}
	}
	
	
	
	public void print() { //prints all of the car parts
		
		if(isEmpty()) {
			System.out.println("There are no car parts");
			return;
		}
		
		Parts test = head;
		
		System.out.println();
		System.out.println();
		System.out.println("Car Parts");
		while(test != null) {
			System.out.println(test.part);
		test=test.next;

		}
	}
	
	
	public static void main (String [] args) {
		Car car = new Car(); //an object
		car.add("wheel");
		car.add("seat");
		car.add("chair");
		car.add("window");
		car.add("heater");
		car.add("A/C");
		car.remove(4);
		
		car.print();
		
		Car smallCar = new Car(); //an object
		smallCar.print();
		smallCar.remove(0);
		
	}
	
	public void remove(int i) { //removes a car part
		
		if(isEmpty()) {
			System.out.println("There are no car parts");
			return;
		}
		
		
		String response= "";
		Parts test = head;
		
	if(i==0){  //removes first element
		response=test.part;
     head = test.next;
     test=null;
     System.out.print(response + " has been removed");
	}else if(i == x) {//removes last element
		while(test.next.next != null)
			test=test.next;
		
		response=test.next.part;
		System.out.print(response + " has been removed");
		
		test.next = null;
		
	}else if(i>0 && i<x) {//removes elements excluding the first and last element 
	int y=0;
	
	while(test.next != null && y!=(i-1)) {
		test=test.next;
		y++;
	}
	response=test.next.part;
	
	
	 Parts removedpart = test.next.next; 
	  
     test.next = removedpart;
		
     System.out.print(response + " has been removed");
		
		
	}else { //throws an exception if it is not between 0 and x including 0 and x
		throw new IndexOutOfBoundsException("Postion can be between 0 to " + x + " including "
				+"0 and " + x +"." + "\n" + i + " is not a valid posistion.");
	}
		
		
	}
	
	
}

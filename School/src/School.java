//created by Fayed Raza
public class School {

Student head;

public static void main (String[] args) {
	
	School d = new School(); 
	d.addFreshman("h",9);
	
}

public void addFreshman(String name, int grade) { /*adds to the
                                                   beginning of the stack*/
	Student freshman = new Student (name,grade);
	
	if(freshman.grade != 9) {
		System.out.println("Student can not be added since he is a freshman");
		}else {
	
	freshman.next = head;
	
	head = freshman;
	
	System.out.print(freshman.name + " has been added");
	
	}
	
	
	
}
	
public void removeStudent(int position) { //removes a student
	
	if(head == null) {
		return;
	}
	
	Student temp = head;
	
	if(position == 0 ) {
		
		head  = temp.next;
		return;
		
		
	}
	
	
	for(int a=0; temp != null &&  a<position-1;a++)
		temp = temp.next;
	
	if(temp==null|| temp.next==null)
		return;
				
				Student next = temp.next.next;
				
				temp.next = next;
	
}
	
public void printList() //prints the whole stack
{ 
    Student tnode = head; 
    while (tnode != null) 
    { 
        System.out.print(tnode.grade+" "); 
        tnode = tnode.next; 
    } 
} 
	
	}
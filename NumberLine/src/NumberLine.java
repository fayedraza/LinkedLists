//created by Fayed Raza
public class NumberLine {
int x;
int currentPosistion;
Number head;
int actualValue;

//purpose is to create a consecutive number line by using linked lists

//adds a number
public void addNumber(int value) {
	Number number  = new Number(value);
	
	
	if(x == 0) {
		number.next = null;
		head=number;
		
		
		x++;
	}else if(x!= 0) {
		Number currentValue = head;
		
		while(currentValue.next != null)
			currentValue = currentValue.next;
		
		number.next = null;
		currentValue.next = number;
		
	}
	
	
}


//prints all numbers
public void printAllNumbers() {
	Number currentValue = head;
	System.out.print("Numbers: ");
	while(currentValue != null) {
		
		if(currentValue.next != null) {
		System.out.print(currentValue.number +", ");
		}else{
			System.out.print(currentValue.number );
		}
		
		currentValue = currentValue.next;
	}
	
}

//checks if the number line is consecutive by the value of the increment
//ex: if increment =  2 then the line should be 0 2 4 6 8
public void checkLine(int increment) {
	currentPosistion	= 0;
	
	 Number replaceNumber = head;
	 
	 while(replaceNumber != null) {
		 if(currentPosistion != replaceNumber.number ) {
			
		replaceNumber.number = currentPosistion;
			 
		 }
		 currentPosistion+=increment;
		 actualValue++;
		 replaceNumber=replaceNumber.next;
	 }
	
}
public static void main (String[] args) {
	
	NumberLine line = new NumberLine(); //an object
	
	line.addNumber(0);
	line.addNumber(2);
	line.addNumber(6);
	line.addNumber(7);
	line.checkLine(100);
	line.printAllNumbers();
	
}

}

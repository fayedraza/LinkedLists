//created by Fayed Raza
//purpose is to introduce linkedlists which is a data structure
public class LinkedLists {
 
	public int findNode (Node node, int x){
        int count=1;
        /* keeps on going till the next node
           is null (basically after the last node)*/
        while(node.next != null) {

        count++;
          if(count == x) {  //starts count after kth element is reached
                     x++;
               }
        }
       
       
       
        return x;
       
       
       
       
}
                
               
               
 
 
class Node { //node class
             
	Node next;
   int data;
               
                public Node(int data) {//constructor with int parameter
                    this.data = data;
                }
 
 
               
}
 
}

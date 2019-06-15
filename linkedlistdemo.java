import java.util.*;
class linkedlistdemo
{
	public static void main(String args[])
	{
		LinkedList<Integer> ob = new LinkedList<Integer>();
		ob.add(10);
		ob.add(20);//add the element to the list
		ob.add(59);
		ob.add(59);
		ob.add(45);
		System.out.println("size of arraylist is\n"+ob.size());//displays the size of the list
		System.out.println(ob);//dispaly list before removing
		System.out.println("\n==========after removing==========\n");
		ob.remove(4);//removes the element present at 4th index
		System.out.println("size of arraylist is\n"+ob.size());//display size of list after removing element at the 4th place
		System.out.println(ob);//display the list after removing
		
		
	}
	
}

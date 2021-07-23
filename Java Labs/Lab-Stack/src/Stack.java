
public class Stack {
	  private int lastItem = 0;
	  private int[] items = new int[0];

	  public void push(int newItem){
		  int index = items.length;
		  System.out.println("The array length is: " + index);

		  items = new int[items.length + 1];
		  System.out.println("items after extending the length by 1: " + items.toString());

		  items[index] = newItem;
		  System.out.println("items after storing the new value: "+ items.toString());

		  lastItem = newItem;
		  System.out.println("The last item: " + lastItem);
	  }
	  public int pop() {
		  int tempItem = lastItem;		  
		  int[] newArray = new int[items.length-1];

		  for(int i = 0; i < newArray.length; i++){
			  newArray[i] = items[i];
		  }
		  items = newArray; 
		  lastItem = items[items.length-1]; 

		  return tempItem;
	  }
	  public int peek() {
		  return 0;
	  }
	  
}

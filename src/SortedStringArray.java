
public class SortedStringArray {// initialize private variables
	private String[] stringArray;
	private int currentSize;

	public SortedStringArray() { //default constructor that sets the array  to 10
		stringArray = new String[10];

	}
	
	
	public SortedStringArray(int initialCapacity) { //initial constructor that sets string array to initial capacity
		stringArray = new String[initialCapacity];
	}

	
	
	
	public void insertItem(String item) { // Add an item in the correct sorted location
		
		
		int correctPosition = 0;
		int compare;
		stringArray[currentSize] = item;
		
		for(int count = 0;count < currentSize; count ++)
		{
			compare = item.compareTo(stringArray[count]);
			if(compare < 0) {
				correctPosition = count;
				break;
			}else {
				correctPosition = currentSize;
			}
				
		}
		
		
		for (int count = currentSize;count > correctPosition; count --) {
			stringArray[count] = stringArray[count-1];
		}
		stringArray[correctPosition] = item;
		currentSize++;
		
		
	}
	
	

	public void print() { // Print the sorted array

		for(int count = 0;count < stringArray.length; count ++) {
			System.out.print(stringArray[count] +" ");
		}
		
		
		System.out.println("\n");
	}
	
	
	

	public boolean isAvailable(String item) { //is available method. to check item is available or not
		for(int count = 0;count < stringArray.length; count ++) {
			if(item.equals(stringArray[count])) {

				return true;
			}
			
		}
		return false;
		
		
		
	}

	public int getIndex(String item) { //  Get the index of the given item
		int numb = -1;
		for(int count = 0;count < stringArray.length; count ++) {
			if(item.equals(stringArray[count]))
			{
				
				
			numb = count;
			}
		}
		
		
		return numb;

	}
	public void delete(int index) { // Delete the item at the given index
		for (int count = index; count < stringArray.length; count++) {
			if ((count + 1) < stringArray.length)
			{
				
				
				stringArray[count] = stringArray[count + 1];
				stringArray[count + 1] = " ";

			}

			
		}
	}

	
	
	public int size() //Get the current size
	{
		return stringArray.length;
	}
	
	

	public int frequencyOfItem(String item) //will return number of occurrences on an item in the stringArray
	{
		int numb = 0;
		for (int count = 0; count < stringArray.length; count ++)
		{
			
			
			if (item.equals(stringArray[count]))
			{
				numb = numb + 1;
			}
		}
		return numb;



	}


	public void maxOccurrence () //to find the max occurrence //BONUS
	{
	System.out.println("# occurrences of each element: ");
	int frequencyArray[] = new int[stringArray.length];
	frequencyArray[0] = frequencyOfItem(stringArray[0]);
	System.out.print(stringArray[0] + "=" + frequencyArray[0] + " ");
	for (int i = 1; i < frequencyArray.length; i ++)
	{
		frequencyArray[i] = frequencyOfItem(stringArray[i]);
		if (!stringArray[i].equals(" "))
		{
			if (!stringArray[i-1].equals(stringArray[i]))
			{
				System.out.print(stringArray[i] + "=" + frequencyArray[i] + " ");
			}
		}
	}
	
int max = frequencyArray[0];
String maxItem = stringArray[0];
for (int k = 1; k < frequencyArray.length; k++)
{
	if (frequencyArray[k] > max)
	{
		max = frequencyArray[k];
		maxItem = stringArray[k];
	}
}
System.out.println("\nMax occurrence of " + maxItem + " is " + max);

}
}

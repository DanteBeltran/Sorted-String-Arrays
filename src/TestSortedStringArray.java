/***************************************************************************
 * 
 * Dante Beltran
 * CST8110 18F 
 * Assignment 4 
 * Purpose: Create an array of Strings with entries in sorted order.
 *
 ****************************************************************************/
import java.util.*;
public class TestSortedStringArray {

	public static void main(String[] args) {
		
		//  DO NOT CHANGE ANY CODE OF THIS MAIN METHOD 
		/*****************************************************/
		Random rnd = new Random();
		String [] list = {"A","Z","X","B","Y","W","U","C","P","O","M","D",
						  "N","Q","F","R","G","H","I","E","J","K","L","M"};
		
		SortedStringArray ssa = new SortedStringArray(list.length);
		
		for(int i=0;i<list.length;i++) {
			int r = rnd.nextInt(list.length);//
			ssa.insertItem(list[r]);
		}
		ssa.print();//		
		/****************************************************************/
		System.out.println("Searching an Item:");
		String item = list[rnd.nextInt(list.length)];// taking a random item from list
		if(ssa.isAvailable(item)) {
			System.out.println(item+" is available in index "+ssa.getIndex(item));
		}else {
			System.out.println(item+" is NOT available in sorted string array");
		}
		System.out.println();
		
		System.out.println("Deleting an Item:");
		item = list[rnd.nextInt(list.length)]; 
		if(ssa.isAvailable(item)) {
			int index = ssa.getIndex(item);
			ssa.delete(index);
			System.out.println(item+" is deleted from sorted string array !");
		}else {
			System.out.println(item+" is NOT available in sorted string array to delete !");
		}

		ssa.print();//
		
		System.out.println("Frequency an Item:");
		item = list[rnd.nextInt(list.length)]; 
		if(ssa.isAvailable(item)) {
			System.out.println("Number of occurrence of "+item+" is "+ssa.frequencyOfItem(item)+"\n");
		}else {
			System.out.println("Number of occurrence of "+item+" is 0\n");
		}
	
		
		
		ssa.maxOccurrence();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}//end main
}//end class

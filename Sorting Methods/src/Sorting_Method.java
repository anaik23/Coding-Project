import java.lang.reflect.Array;

public class Sorting_Method 
{

	public static void swap(int [] array, int one, int two) 
	{
		
			int temp = array[one];
			array[one] = array[two];
			array[two] = temp;
			
	}
	
	
	
	public static void bubble_sort(int [] array) 
	{ 
		int n = array.length;
		for(int i = 0; i<n; i++) 
		{
			for(int j = 0; j<n-i-1; j++) 
			{
				if(array[j] >= array[j+1]) 
				{
					swap(array, j, j+1);
				}
			}
		}
		
		
		
		
	}
	
	public static void selection_sort(int [] array) 
	{
		 
        for (int i = 0; i < array.length-1; i++)
        {
            int minimum = i;
            for (int j = i+1; j < array.length; j++)
            {
            	if (array[j] < array[minimum])
            	{
            		 minimum = j;
            		 
            	}
            }
            swap(array, i,minimum);   
        }
	}
	
	public static void insertion_sort(int[] array) 
	{
		for(int i =1; i<array.length; i++) 
		{
			int stored = array[i];
			int j = i-1;
			while(j >=0 && array[j] > stored) 
			{
				array[j+1] = array[j];
				j =j-1;
			}
			array[j+1] = stored;
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("Bubble Sort");
		System.out.println("Original Array: ");
		int [] array = {9,5,7,1,10,8};
		for(int i =0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Sorted Array: ");
		bubble_sort(array);
		for(int i =0; i<array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Selection Sort");
		System.out.println("Original Array: ");
		int [] array1 = {9,11,5,1,8,10};
		for(int i =0; i<array1.length; i++)
		{
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		System.out.println("Sorted Array: ");
		selection_sort(array1);
		for(int i =0; i<array1.length; i++) 
		{
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Selection Sort");
		System.out.println("Original Array: ");
		int [] array2 = {9,5,-1,12,4,7,1};
		for(int i =0; i<array2.length; i++)
		{
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		System.out.println("Sorted Array: ");
		insertion_sort(array2);
		for(int i =0; i<array2.length; i++) 
		{
			System.out.print(array2[i] + " ");
		}
	}



	

}

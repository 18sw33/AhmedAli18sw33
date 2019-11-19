public class Lab2Task7
{
   public static void main(String args[]) 
    {
        int arr[] = {20, 20, 30, 40, 50, 50, 50};  
         System.out.println("Original array length is: "+arr.length);
         System.out.print("Array elements are: ");
           for (int i = 0; i < arr.length; i++)
             {
                System.out.print(arr[i]+" ");
             }
	System.out.println("\nThe new length of the array is: "+array_sort(arr));
    }
       public static int array_sort(int[] arr) 
         {
           int index = 1;        
              for (int i = 1; i < arr.length; i++) 
                 {
                   if (arr[i] != arr[index-1])
                      arr[index++] = arr[i];
                 }
           return index;
         } 

}



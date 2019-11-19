import java.util.Arrays;

 public class Lab2Task3
  {
     public static void printArray(float arg[])  
        {  
            for(int i=0;i<arg.length;i++)
               {
                  System.out.println(arg[i]);
               }
        }

public static void main(String arg[])
  {

     float[] arr = {1,2,3,4,5,6};
    
     float[] unsort = {1,6,4,5,3,2};
    
     float[] arr2 = {1,2,3,4,5,6};
    
     float[] dest=new float[10];
       Arrays.sort(arr);
       System.out.print("Length of an array");
       System.out.println(arr.length);
     System.out.println("Binary Search of number 3");
     System.out.println(Arrays.binarySearch(arr, 3));
     float[] arrCopy=Arrays.copyOf(arr,10);
     System.out.println("copy of array printed");
     printArray(arrCopy);
    System.out.println("Copy Into Range");
    
     float[] copyIntoRange=Arrays.copyOfRange(arr,0,10);
    printArray(copyIntoRange);

     System.out.println("Equals Method in arrays");
     System.out.println(Arrays.equals(arr,arr2));
     
    Arrays.fill(arr2,2);
     System.out.println("filled array with 2");
     printArray(arr2);
     Arrays.fill(arr2,2,4,0);
    System.out.println("filling in specific range");
	
     printArray(arr2);	

         Arrays.sort(unsort,2,5);
	
     System.out.println("Print Sorted Array");
    
     printArray(unsort);
	
          System.out.println(Arrays.toString(unsort));
	
}

}
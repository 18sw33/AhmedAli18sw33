import java.util.Arrays;
class Lab2Task6
 {
public static void printArray(int arg[])
{   
   for(int i=0;i<arg.length;i++)
     {
        System.out.println(arg[i]);
     }
}      
 public static void main(String args[])
        {
          int arr [] = {3,2,1};
          System.out.println("Sorting Of 2 dimensional array :");
           System.out.print(Arrays.sort(arr));
        }
}
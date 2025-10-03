import java.util.Scanner;


public class countTargetElement {
    public static int countTargetElement(int array[],int TargetElement){
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==TargetElement){
                count++;
            }
        }
        return count;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int size = sc.nextInt();
         int array[] = new int[size];
         System.out.println("Enter the elements of array");
         for(int i=0;i<size;i++){
             array[i]=sc.nextInt();
         }
        
        System.out.println("Enter the target Element:");
        int target = sc.nextInt();
         
        int count = countTargetElement(array,target);
        System.out.println("Target Element Count : "+count);
      
    }
    }
   

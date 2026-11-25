package printArray;

public class SecondLargestElementGMTechnosys {

	  
    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
     // Traverse the array only once
        for(int num: arr){
        	
        // If current number is greater than the largest
           if(num > largest){ 
               secondLargest=largest;
               largest=num;
           }
           
           // Update second largest only if the number is
           // distinct from largest and greater than current second largest
            else if(num > secondLargest && num != largest){
                secondLargest=num;
            }   
        }

        // If no second largest distinct element exists
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
    public static void main(String[] args) {

        // int [] arr = {10, 5, 20, 8};
        int [] arr = {7, 7, 7};
        // int [] arr = {4,9};
        int secondlarg = secondLargest(arr);
        System.out.println(secondlarg);
    }

}

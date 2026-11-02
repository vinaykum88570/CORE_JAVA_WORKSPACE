package printArray;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

        int[] arr = {4, 2, 4, 5, 2, 7, 5};
        
        for(int i=0;i<arr.length;i++) {
        	boolean duplicate =false;
        	
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i] == arr[j]) {
        			duplicate=true;
        			break;
        		}
        		
        	}
        	if(!duplicate) {
        		System.out.println(arr[i]+" ");
        	}
        }
        
        
        // Another way
        Set<Integer> dup = new HashSet<>();
        for(int num : arr) {
        	dup.add(num);
        }
        System.out.println(dup+" ");
	}
}

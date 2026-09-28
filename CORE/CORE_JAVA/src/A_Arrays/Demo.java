package A_Arrays;

public class Demo {
	Demo(){
		System.out.println("im a demo class constructor:");
	}
	public static void main(String[] args) {
		int[] a=new int[5];
	
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=15;
		
//		for(int i=0;   i<a.length;   i++) {
//			System.out.println(a[i]);
//       } 
		
		int i=0;
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		
} }

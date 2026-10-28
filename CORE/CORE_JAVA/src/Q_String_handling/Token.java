package Q_String_handling;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {
		/*
		String s ="Welcome to Java Programming.";
		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.countTokens());
		*/
		
		/*
		String s ="Welcome to java";
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		*/
		
		// Command line argument
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
	}
}

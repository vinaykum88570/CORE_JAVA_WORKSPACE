package Vector;

import java.util.Vector;

public class Vector2DConcept {

	public static void main(String[] args) {
		
		Vector<String> langVector = new Vector<String>();
		langVector.add("Java");
		langVector.add("Python");
		langVector.add("Ruby");
		langVector.add("JavaScript");
		langVector.add("C#");
		
		Vector osVector = new Vector();
		osVector.add(langVector);  // 0
		
		//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		for (int i=0;i<langVector.size();i++) {
			String str = (String) ((Vector)osVector.get(0)).get(i);
			System.out.println(str);
		}
		
	}
}

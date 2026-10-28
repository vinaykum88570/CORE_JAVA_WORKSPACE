package innerClass;

interface Test{
	
	void add();
}

public class InnerClass {

	

	//3] Annynomous Inner Class
	//4] Local Inner Class
	
	
	//1] Member Inner Class 
	class A{
		
	}
	
	//2] Static Member Inner Class
	static class B {
		
	}
	
	Test t = new Test(){

		@Override
		public void add() {
			// TODO Auto-generated method stub
			
		}
		
	};
}

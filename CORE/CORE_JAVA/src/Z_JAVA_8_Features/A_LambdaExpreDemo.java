package Z_JAVA_8_Features;

// Lambda Expression
//--------------------------------------------------------------------------------------------------


//		Test t = ()->System.out.println("Welcome Lambda");
//		t.show();


// 1] int add(int a,int b);--> (a,b)->a+b;
//		 Test t = (a,b)->a+b;
//		 int i = t.add(5, 5);
//		 System.out.println(i);	


// 2] int cube(int a);--> a->a*a*a;  
//       Test t = (a)->a*a*a;
//       int i = t.cube(5);
//       System.out.println(i);


// 3] void add(int a,int b);--> (a,b)->System.out.println(a+b);
//       Test t = (a,b)->System.out.println(a+b);
//       t.add(2, 2);


// 4] void cube(int a);--> (a)->System.out.println(a*a*a);
//       Test t = (a)->System.out.println(a*a*a);
//       t.cube(5);


// 5] int get();--> ()->10+10;
//       Test t =()->10+10;
//       int i = t.get();
//       System.out.println(i);


// 6] float getValue();--> ()->10.0f + 10.0f;
//		 Test t = ()->10.0f + 10.0f;
//		 Float i = t.getValue();
//		 System.out.println(i);


// 7] void show();--> ()->System.out.println("Hello");
//       Test t = ()->System.out.println("Hello");
//       t.show();


// 8] void display();--> ()->System.out.println("Welcome");
//	     Test t = ()->System.out.println("Welcome");
//		 t.display();


// 9] int max(int a,int b);--> (a,b)->(a>b)? a:b;
//       Test t = (a,b)->(a>b)? a:b;
//       int i = t.max(5, 10);
//       System.out.println(i);


// 10] String Upper(String s);--> (s)-> s.toUpperCase();
//		 Test t = (s)-> s.toUpperCase();
//		 String i = t.upper("vinay");
//		 System.out.println(i);



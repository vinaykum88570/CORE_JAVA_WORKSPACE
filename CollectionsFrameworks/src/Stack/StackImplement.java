package Stack;

public class StackImplement {

	int size;
	int arr[];
	int top;
	
	public StackImplement(int size) {
		super();
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	// Time Complexity :0(1):
	public void push(int element) {
		if(!isFull()) {
			top++;
			arr[top]= element;
			System.out.println("Pushed Element :"+ element);
		}else {
			System.out.println("Stack is Full now");
		}
	}
	
	
	public int pop() {
		if(!isEmpty()) {
			int returnTop=top;
			top--;
			System.out.println("Pop Element : "+ arr[returnTop]);
			return arr[returnTop];
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public int peek() {
		if(this.isEmpty()) {
			return arr[top] ;
		}else {
			System.out.println("Stack Is Empty");
			return -1;
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}

    public boolean isFull() {
    	return (size-1 == top);
    }
	
	public static void main(String[] args) {
		StackImplement stackImp = new StackImplement(10);
		stackImp.pop();
		
		System.out.println("______________________");
		
		stackImp.push(100);
		stackImp.push(200);
		stackImp.push(300);
		stackImp.push(400);
		stackImp.push(100);
		System.out.println("______________________");
		
		System.out.println(stackImp.peek());
	    System.out.println("______________________");
		
		stackImp.pop();
		stackImp.pop();
		stackImp.pop();
		System.out.println("______________________");
		
		System.out.println(stackImp.isEmpty());
		System.out.println(stackImp.isFull());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

class P{
	int c=20;
	public static void main(String []args){
		
		System.out.println("Inside class P1");
		main(2);
	}
	public static void main(int a){
		System.out.println("Inside class P2");
	}
}

class Q{
	public static void main(String []args){
		System.out.println("Inside class Q");
	}
}

class R{
	public static void main(String []args){
		System.out.println("Inside class R");
	}
}	

class ExampleStatic{
	int a=10;
	static void display(int x,int y){
		System.out.println(a);
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
	}
	
	public static void main(String []args){
		int x=10;
		int y=20;
		P obj=new P();
		System.out.println(obj.c);
		//ExampleStatic es = new ExampleStatic();
		display(x,y);
		//System.out.println("value of a is: "+es.a);
	}
}


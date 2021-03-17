class A{
	int a=10;
	int b=10;
	void display(){
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}

	A(){
	a=20;
	b=20;
	}
	
	A(int a){
		a++;
	}
}

class Amain{
	public static void main(String []args){
		String a[]={"Hello","World"};
		A obj = new A(2);
		Amain Am = new Amain();
		obj.display();
		//Am.main(a);
		System.out.println(args[0]+" "+obj);
	}
}
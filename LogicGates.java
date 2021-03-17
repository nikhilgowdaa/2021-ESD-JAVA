class LogicGates{
	int or_gate(int in1,int in2){
		int a,b;
		a=in1;
		b=in2;
		
		int ans;
		int or_ans;
		
		or_ans=a|b;
		
		return or_ans;
	}
	
	int nor_gate(int in1,int in2){
		int nor_ans;
		int a=in1;
		int b=in2;
		if(a==0 && b==0)
			nor_ans=1;
		else
			nor_ans=0;
		return nor_ans;
	}
	
	public static void main(String []args){
		LogicGates obj=new LogicGates();
		int a=0,b=0;
		int or_ans=obj.or_gate(a,b);
		int nor_ans=obj.nor_gate(a,b);
		System.out.println("or: "+or_ans+"\nnor: "+nor_ans);
	}
}
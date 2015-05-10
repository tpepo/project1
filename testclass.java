
public class testclass{
	protected int a;
	
	testclass(){
		this(0);
	}
	
	testclass(int x){
		a = x;		
	}
	
	public void printMember(){
		System.out.println(a);
	}	
}
package coreJava;

public class PS2 extends PS3 {
	
	int a;
	
	public PS2(int a) {
		
		super(a);
		this.a = a;
		
	}
	

	public int increment() {

		a += 1;
		return a;

	}

	public int decrement() {

		a -= 1;
		return a;

	}

}

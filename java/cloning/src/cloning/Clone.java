package cloning;

class CloneImplement implements Cloneable{
	int marks;
	String name;
	
	CloneImplement(String name  , int marks){
		this.name = name;
		this.marks = marks;
	}
	
	CloneImplement(){
		
	}
	
	void SetInfo(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public Object clone()throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class Clone{
	public static void main(String args[]) {
		try {
			CloneImplement c = new CloneImplement();
			c.SetInfo("Abhilash",85);
			
			
			CloneImplement n_c = (CloneImplement)c.clone();
			System.out.println(n_c.name);
		}
		catch(CloneNotSupportedException c) {
			System.out.println("hii : " + c);
		}
	}
}

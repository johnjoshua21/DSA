package Sep_4;
class Marks{
	private int math=100;
	
	private void disp() {
		System.out.println("Mark is "+this.math);
	}
	public void getdisp() {
		disp();
	}
		
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}

public class Encapsulation {
	public static void main(String[] args) {	
		Marks mark=new Marks();
		mark.setMath(98);
		int res=mark.getMath();
		System.out.println(res);
		mark.getdisp();		
	}
}
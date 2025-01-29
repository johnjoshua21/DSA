package Sep_4;

interface Area_inter{
	public static final float num=5.5f;
	abstract void area_rect(int a);
	static void meth() {
		System.out.println("Hello");
	}
	final int y=9;
	
}
public class Learning_Interface implements Area_inter{

	public static void main(String[] args) {
		Area_inter obj=new Learning_Interface();
		obj.area_rect(5);
		System.out.println(obj.num);
		Area_inter.meth();
		System.out.println(obj.y);

	}
	
	public void area_rect(int a) {
		System.out.println(a);	
	}
	
	static void meth() {
		System.out.println("Hello");
	}
}
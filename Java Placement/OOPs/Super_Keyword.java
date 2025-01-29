package Sep_4;


//Using super keyword we can gain access to overridden method
//but Invoke its immediate Parent class
//Normally it calls its parent class constructor
//Added default by the compiler
class Grand_Father{
	 void pri(){
		System.out.println("Thatha vararu");
	}
}
class Father extends Grand_Father{
	void pri(){
		super.pri(); //{Super Keyword will be added by compiler}
		System.out.println("Thatha poitaru");
	}
}

class Son extends Father{
	void pri(){
		super.pri();
		System.out.println("I am son");
	}
	
}


public class Super_Keyword {

	public static void main(String[] args) {
		Son son=new Son();
		son.pri();
			
	}

}

package Module03;


abstract class Parent{
	
	abstract void message();
		
	
}
class add extends Parent {
    
     void message()
    {
        
        System.out.println("This is first subclass");
    }
}
class sub extends Parent {
    
     void message()
    {
        
        System.out.println("This is second subclass");
    }
}

public class Abstract_Class {
	public static void main(String[] args) {
		
		Parent p1 = new add();
        p1.message();
        Parent p2 = new sub();
        p2.message();
	}

}

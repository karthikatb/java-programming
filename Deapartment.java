package helloworld;

class S{
	String name;
	static int count=0;
	S(String name){
		this.name=name;
		count++;
		
	}
	public void getStudent() {
		System.out.println("Name:"+name);
		System.out.println("NO:"+count);
	}
}

public class Deapartment {
	public static void main(String[] args) {
	S s1=new S("karthika");
	s1.getStudent();
	S s2=new S("niya");
	s2.getStudent();
	S s3=new S("karthika");
	
	}

}

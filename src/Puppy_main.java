
public class Puppy_main {

	public static void main(String[] args) {
		
		Puppy p = new Puppy("Tom",2);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		p.setAge(3);
		
		System.out.println(p.getAge());

	}

}

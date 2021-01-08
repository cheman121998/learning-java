package OOP;

import com.ctmman.training.LearningJava;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningJava manLearn = new LearningJava();
		Student manman = new Student();		
		
		manman.setName("Man Man");
		manman.setCode("S01");
		manman.setYear(1998);
		
		manman.showInfo();
		int age = manman.getAge();
		System.out.println("Age: " + age);
	
	}

}

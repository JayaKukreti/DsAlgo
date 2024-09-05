package sdet;

public class ClassAverage {
	//Create four objects for four different students, assign marks of each student(in main method)
	// print calculated sum and average.
	int output1;
	int output2;
	
	int sumOfStudents(int sub1, int sub2,int sub3,int sub4 ) {
		
		output1=sub1+sub2+sub3+sub4;
			
 		return output1;
		
	}

	int averageOfStudent(int sub1, int sub2,int sub3,int sub4 ) {
		
		output2= output1/4;		
		
		return output2;
	}
	
		
	public static void main(String[] args) {
		ClassAverage obj1 = new ClassAverage ();
		 int output3=obj1.sumOfStudents(77,85,82,90);
		 int output4 =obj1.averageOfStudent(77,85,82,90);
		
		System.out.println("The sum of Neeraj marks is "  +output3+" and the average is "+ output4);
					
		ClassAverage obj2 = new ClassAverage ();
		 int output5=obj2.sumOfStudents(67,82,90,89);
		 int output6 =obj1.averageOfStudent(67,82,90,89);
		
		System.out.println("The sum of Nidhi marks is "  +output5+" and the average is "+ output6);
		
		ClassAverage obj3 = new ClassAverage ();
		 int output7=obj3.sumOfStudents(88,72,91,90);
		 int output8 =obj1.averageOfStudent(88,72,91,90);
		
		System.out.println("The sum of Sneha marks is "  +output7+" and the average is "+ output8);
		
		ClassAverage obj4 = new ClassAverage ();
		 int output9=obj4.sumOfStudents(70,80,90,95);
		 int output10 =obj4.averageOfStudent(70,80,90,95);
		
		System.out.println("The sum of Tripti marks is "  +output9+" and the average is "+ output10);
		
		
				
	}
	
}

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Functional Interface : 1.Predicate -> return type is boolean(Checking condition's)
		                       // 2.Function  -> return type is anything take input and process the out as return type
		                       // 3.Consumer  -> return type is void
		Function<Student, String> f1=s->{ 
			int marks=s.marks;
			String grade="";
			
			if(marks>=80) grade="A[Dictinction]";
			else if(marks>=60) grade="B[First Class]";
			else if(marks>=50) grade="C[Second Class]";
			else if(marks>=35) grade="D[Third Class]";
			else grade="E[Failed]";
			return grade;
		};
		
		
		Predicate<Student> p3=s->s.marks>=75;
		
		Consumer<Student> c=s1->{ System.out.println("Student Name :" +s1.name);
		
		System.out.println("Student Marks :" +s1.marks);
		System.out.println("Student grade :" +f1.apply(s1));
		System.out.println(" ");
		
		
		};
		
		Student [] s= {new Student("Chakri", 95),
				new Student("Chakravarthi", 75),
				new Student("Napa", 55),
				new Student("ram", 45),
				new Student("kiran", 25)
		};
		for(Student s1:s)
		{
			if(p3.test(s1))
			{
			
			c.accept(s1);
			
			
		}
			
			Supplier<String> r=()->{
				String otp="";
				for(int i=0;i<6;i++)
				{
					otp=otp+(int)(Math.random()*10);
				}
				return otp;
			};
			System.out.println(r.get());
	}

}
}
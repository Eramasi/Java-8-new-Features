import java.util.function.Predicate;

public class TestPredicateFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Predicate<Integer> p1=i->i%2==0;
		 * 
		 * System.out.println(p1.test(18));
		 * 
		 * 
		 * Predicate<Integer> p2=I->I%2==0; System.out.println(p2.test(63));
		 */
		
		
		Predicate<String> sr=s->s.length()>5;
		
		System.out.println(sr.test("Chakravarthi"));
		
		Predicate<Integer>p=i->i%2==0;
		Predicate<Integer>p1=i->i>10;
		System.out.println(p.or(p1).test(6));
 
	}

}

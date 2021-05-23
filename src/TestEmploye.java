import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employe> ar=new ArrayList<Employe>();
		
		ar.add(new Employe("chakri",55000));
		ar.add(new Employe("chakravarthi",75000));
		ar.add(new Employe("chak",85000));
		ar.add(new Employe("ec",95000));
		
	Predicate<Employe> p=s->s.salary>55000;
	for(Employe e1:ar)
	{
		if(p.test(e1))
		{
			System.out.println(e1.name   + "->" + e1.salary);
		}
	}
		
		

	}

}

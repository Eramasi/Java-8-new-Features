import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(5);
		l.add(25);
		
		System.out.println("List of Numbers :"+l);
	
		
		List<Integer> list=l.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println("List of Even Numbers : "+list);
	}

}

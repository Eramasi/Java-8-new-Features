import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(45);
		ar.add(36);
		ar.add(96);
		ar.add(75);
		
		System.out.println(ar);
		
		System.out.println("-------------");
		Integer[] i6= {10,20,30,40,50};
		Stream.of(i6).forEach(System.out::println);
		
		
		Integer[] i=ar.stream().toArray(Integer[] ::new);
		Stream.of(i).forEach(System.out::println);
		
		Integer min =ar.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		List<Integer> DNSO=ar.stream().sorted((i1,i2)->i1.compare(i1, i2)).collect(Collectors.toList());
		System.out.println("Default Natural Sorting Order :"+DNSO);
		
		List<Integer> sortedlist=ar.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println("Customized Sorting order: "+sortedlist);
		
		long l=ar.stream().count();
		
		System.out.println(l);

	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collectos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(5);
		ar.add(12);
		ar.add(63);
		ar.add(35);
		System.out.println(ar);
		
		Comparator<Integer> c=(I1,I2) ->(I1<I2)?1:(I1>I2)?-1:0;
		Collections.sort(ar,c);
		System.out.println(ar);

	}

}

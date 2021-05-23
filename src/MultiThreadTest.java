
public class MultiThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r=()-> { for(int i=0;i<=5;i++) { System.out.println(" Runnable Thread ");}};
		
		
		Runnable r1=() -> { for (int i=0;i<=5;i++) {System.out.println(" Runnable Thread ");}};
		Thread t=new Thread(r);
		t.start();
		
		System.out.println("Main Thread");
		

}
}

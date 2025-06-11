public class TesteClass {
	public static void main(String[] args) throws InterruptedException {
		
		int b = 10;
		var a = b++; 
		var c = ++b;
		
		System.out.println("a: " + a); // 10
		System.out.println("b: " + b); // 12
	}
}

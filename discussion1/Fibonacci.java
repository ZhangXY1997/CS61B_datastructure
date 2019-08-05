public class Fibonacci {
	public static int fib(int b) {
		int k;
		if (b < 2) {
			k = b;
		} else {
			k = fib(b-1)+fib(b-2);
		}
		return k;
	}

	public static void main(String[] args) {
		System.out.println(fib(3));
	}
}

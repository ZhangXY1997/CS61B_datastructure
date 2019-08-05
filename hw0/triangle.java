public class triangle {
	public static void drawTriangle( int N) {
		int i;
		int j = 0;
		String tri = "*";
		while (j < N) {
			i = j + 1;
			while (i > 0){
				System.out.print(tri);
				i = i -1;
			}
			j = j + 1;
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		drawTriangle(10);
	}
}
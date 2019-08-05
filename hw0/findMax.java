public class findMax {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
    	int b = 0;
    	for (int i=0; i<m.length; i=i+1) {
    		if (b < m[i]) {
    			b = m[i];
    		}
    	}
        return b;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
       int b = max(numbers);
       System.out.println(b);  
    }
}

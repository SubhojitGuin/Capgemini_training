package learnArray.OneDArray;

public class Example {
	public static void main(String[] args) {
		int[] a = new int[3];
		System.out.println(a.length);
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		char[] c = new char[2];
		c[0] = 'a';
		c[1] = 'b';
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println();
		boolean[] b = new boolean[2];
		b[0] = true;
		b[1] = false;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println();
		String[] s = new String[2];
		s[0] = "Dinga";
		s[1] = "Dingi";
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println();
		float[] f = new float[2];
		f[0] = 2.3f;
		f[1] = 8.9f;
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
	}
}

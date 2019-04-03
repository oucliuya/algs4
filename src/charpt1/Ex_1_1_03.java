package charpt1;

public class Ex_1_1_03 {
	public static void main (String[] args) {
		if (args.length == 3) {
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);
			int third = Integer.parseInt(args[2]);
			System.out.println("first:"+first+" second:"+second+" third:"+third);
			if (first == second && first == third)
				System.out.println("equal");
			else
				System.out.println("not equal");
			
		}
		else {
			System.out.println("args cnt is not 3!");
		}
	}
}

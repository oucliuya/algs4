package charpt1;

public class Ex_1_1_05 {
	public static void main (String[] args) {
		if (args.length == 2) {
			double first = Double.parseDouble(args[0]);
			double second = Double.parseDouble(args[1]);
			System.out.println("first:"+first+" second:"+second);
			if (first > 0 && first < 1 && second >0 && second < 1)
				System.out.println("true");
			else
				System.out.println("false");
			
		}
		else {
			System.out.println("args cnt is not 2!");
		}
	}
}

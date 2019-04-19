package charpt1_1;

public class Ex_1_1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] testArray = { {},{true,false,true}, {false,true},{true,true,true,true},{}};
//		System.out.println(testArray[0][0]);
		for (int i = 0; i < testArray.length; i++) {
			for (int j = 0; j < testArray[i].length; j++) {
				if (testArray[i][j])
					System.out.println("(" + i + ", " + j + ") " + "*");
				else
					System.out.println("(" + i + ", " + j + ") " + " ");
			}
		}
	}

}


public class Checkerboard{

	public static void main (String [] args){

		for (int counter = 1; counter <= 10; counter++){

			if(counter % 2 == 0){

				for (int count = 1; count <= 8; count++){

					System.out.print("*");
					System.out.print(" ");
				}
			}
			else{

				for (int counting = 1; counting <= 8; counting++){

					System.out.print(" ");
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}


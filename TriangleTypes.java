import java.util.Scanner;

//triangles may be
//
//Scalene (all angles are different)
//Isosceles (two angles are equal)
//Equilateral (all three angles are equal)


// program reads in three angles.


public class TriangleTypes {
	public static void main(String[] args) {
		System.out.println("\n\n********* Main Menu *********\n");			
		System.out.println("\nWhich Type is Your Triangle?");
		System.out.println("\nPrint three integers (three angles), each on a separate line\n");
		System.out.println("\nThese add up to 180 degrees");
		
		Scanner scan = new Scanner(System.in);
		int a1 = Integer.parseInt(scan.nextLine());
		int a2 = Integer.parseInt(scan.nextLine());
		int a3 = Integer.parseInt(scan.nextLine());
		if(a1 > 0 && a2 > 0 && a3 > 0 && a1 < 180 && a2 < 180 && a3 < 180) {
			if(a1 == 60 && a2 == 60 && a3 == 60) {
				
				System.out.println("All three angles are 60. Your Triangle is Equilateral");
			}
			else if((a1 + a2 + a3 == 180) && ((a1 == a2) || (a2 == a3) || (a3 == a1))) {
				System.out.println("The three angles add up to 180 and exactly two of the angles are the same. Your Triangle is Isosceles");
			}
			else if((a1 + a2 + a3 == 180) && ((a1 != a2) && (a2 != a3) && (a3 != a1))) {
				System.out.println("The three angles add up to 180 and no two angles are the same. Your Triangle is Scalene");
			}
			else {
				System.out.println("The three angles do not add up to 180. Error!");
			}
		}
	}
}




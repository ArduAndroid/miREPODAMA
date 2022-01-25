import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un n�");
		int day = sc.nextInt();

	    switch (day) {
	      case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      case 4:
	        System.out.println("Thursday");
	        break;
	      case 5:
	        System.out.println("Friday");
	        break;
	      case 6:
	        System.out.println("Saturday");
	        break;
	      case 7:
	        System.out.println("Sunday");
	        break;
		  case 8:
	        System.out.println("HOLIDAY");
	        break;
			case 9:
	        System.out.println("ASDSD");
	        break;
			case 10:
			System.out.println("asdsdsdsadsad");
	        break;
	    }
	}

}

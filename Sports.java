import java.util.Random;

public class Sports {
	
	public static final int MAX_VALUE = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random ();
		
		int choice = r.nextInt(MAX_VALUE);  //0 1 2 3 4
		
		String sports = "";
		
		switch(choice)
		{
		case 0:
		    sports = "Soccer";
		    break;
		case 1:
			sports = "Basketball";
			break;
		case 2:
			sports = "Football";
			break;
		case 3:
			sports = "Rock Climbing";
			break;
		case 4:
			sports = "Baseball";
			break;
		 default:
			 sports = "ice hockey";
			 
		
		}
		System.out.println("The computer selected  "+sports+"!");
		/* 
		 * Soccer
		 * Basketball
		 * Football
		 * Rock Climbing
		 * Baseball
		 */
		
		System.out.println("Choice = "+choice);
		
		//0-5
		
		
		


	}

}

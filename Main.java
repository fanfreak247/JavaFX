import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
   	try {
	System.out.println("Enter a number for a function. 1 - Calculate Volume. 2 - Calculate Area!");
	
	Scanner input = new Scanner(System.in);
	
	Prism prism = new Prism();
	
	int select = input.nextInt();
    
	switch (select) {
    
	case (1):
        System.out.println("Enter a length, width and height!");
        
	    double length = input.nextDouble();
        
	    double width = input.nextDouble();
        
	    double height = input.nextDouble();
        
	    double result = prism.Volume(length, width, height);
        
	    System.out.println("The answer is " + result);
        input.close();
	    break;
	case (2):
        
		System.out.println("Enter the length and width!");
        
	    double len = input.nextDouble();
        
	    double wid = input.nextDouble();
        
	    double res = prism.Area(len, wid);
	    
	    System.out.println("The answer is " + res);
	    
	    input.close();
	    break;
    default:
    	
    	System.out.println("An error has occcured! Please try again!");
    	input.close();
    	break;
    }
    }catch (Exception e) {
    	System.out.println("An error has occured! Specifically error " + e);
    }

}
}

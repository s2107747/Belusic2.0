import java.util.Scanner;

public class Light {
	private int choice;
	private boolean highBeam;
	//initialise low beam 
	public Light() {
		highBeam=false;
	}
	//get state of engine temp
	public boolean isHigh(){return highBeam;}
	
	public void setBeam(Scanner in){
    	//Simulating high low beam
	//user enter [0] - low beam
	//user enter [10 - high beam
            do{ 
                    System.out.println("Simulating High Low Beam");
                    System.out.println("Enter [0] - Low Beam  or [1] - High Beam");
                    System.out.println("[9] Exit");
                    // Display output
		    choice = in.nextInt();
                    if (choice == 0){
                            System.out.println("\033[32mLow Beam" + "\033[0m");
                    		highBeam=false;}
                    else if (choice == 1){
                            System.out.println("\033[31mHigh Beam" + "\033[0m");
                    	    	highBeam=true;}
            } while (choice !=9);
            
    }
}

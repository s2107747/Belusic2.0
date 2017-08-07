import java.util.Scanner;
// i've removed abstract from class. not neccessary
public class EngineTemp {
	private int choice;
	//i've added this variable do the state can be passed back to main class
	private boolean tempHigh;
	//initialise engine temp as low
	public EngineTemp() {
		tempHigh=false;
	}
	//get state of engine temp
	public boolean isHigh(){return tempHigh;}
	
	//code below is from edwins engine temp class. I've made it a method of the class 
	//engineTemp.setTemp(Scanner in)
   //neccessary to pass Scanner as parameter from main. otherwise it produced error on return to main
	//not sure why...
	public void setTemp(Scanner in){
    //this code provided by edwin has not been changed, exept for removal of scanner
            do{ 
                    //Simulating Temperature input
                    System.out.println("Simulating temperature input");
                    System.out.println("Enter temperature range: [1] to [10]");
                    System.out.println("[0] Exit");
                    // Display output
                    choice = in.nextInt();
                    if (choice >=1  && choice <=7){
                            System.out.println("Temperature is \033[32mnormal" + "\033[0m");
                    		tempHigh=false;}
                    else if (choice >=8 && choice <=10){
                            System.out.println("Temperature is \033[31mhot!" + "\033[0m");
                    tempHigh=true;}
            } while (choice !=0);
            
    }
}

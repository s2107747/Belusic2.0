

import java.util.Scanner;

public class Belusic {
	//displays console menu
	public static void displayMenu(){
		System.out.println("*****Belusic Control System Menu*****");
		System.out.println("b) Brake (Toggle Brake lights)");
		System.out.println("l) Indicate Left");
		System.out.println("r) Indicate Right");
		System.out.println("t) Engine Temperature");
		System.out.println("h) Headlights (Toggle high/low beams)");
		System.out.println("f) Fuel level");
		System.out.println("q) Exit program");
		System.out.println("Please enter selection :");
		
	}
	//displays the states of the various components of the system
	//Brake,Temperature, headLight and Fuel parameters need to be added when created
	public static void displayStates
	(Indicator Li,Indicator Ri,EngineTemp temp, Light highBeam,FuelLevel fuel, Brakes brake)
	{
		System.out.println("*****Belusic MotorCycle Electrical Control System*****");
		System.out.println("Created by The Noble bricks Team");
		
		System.out.println("*****System State:*****");
		
		System.out.print("Brake light: ");
		if(brake.isOn()){System.out.println("on");} else {System.out.println("off");}
		
		System.out.print("Left indicator: ");
		if(Li.isOn()){System.out.println("Flashing");} else {System.out.println("off");}
		
		System.out.print("Right indicator: ");
		if(Ri.isOn()){System.out.println("Flashing");} else {System.out.println("off");}
		
		System.out.print("Head lights: ");
		if(highBeam.isHigh()){System.out.println("High Beam");} else {System.out.println("Low Beam");}
		
		
		System.out.print("Temperature level: ");
		if(temp.isHigh()){System.out.println("warning light on");} else {System.out.println("warning light off");}
		
		System.out.print("Fuellevel: ");
		if(fuel.isLow()){System.out.println("warning light on");} else {System.out.println("warning light off");}
		
		System.out.println("");
		/*
		*etc.
		*/

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String input="";
		// declarations for Temperature, Headlight(Hi/low beams), BrakeLights, Fuel level/warning go here 
		//initialise indicators both off to start with
		Brakes brake=new Brakes();
		Indicator indRight=new RIndicator();
		Indicator indLeft=new LIndicator();
		//intitialise engine temp object
		EngineTemp temp=new EngineTemp();
		//initialise lights
		Light highBeam=new Light();
		//initialics fuel
		FuelLevel fuelCheck=new FuelLevel();
		//initialise scanner to accept input
		Scanner sc = new Scanner(System.in);

	
		
		//loop to read input from scanner and display system state
		do
		{
			 //display current system state
			displayStates(indLeft,indRight,temp,highBeam,fuelCheck,brake);
			displayMenu();
			
			input=sc.next();
			input=input.toLowerCase();	 
			 
		     
		     
		     
			
			switch(input)
			{
				//
				case "b": brake.toggle();
				break;
				//indicate left. Set right indicator off. toggle left indicator(also displays flashing indicator)
				case "l": indRight.setOn(false);indLeft.toggle();
				break;
				//indicate Right. Set right indicator off. toggle Right indicator(also displays flashing indicator)
				case "r": indLeft.setOn(false);indRight.toggle();
				break;
				//code to set engine temp when t is selected
				//neccessary to pass scanner as a parameter, as opening a new one in enginetemp class caused problems for some reason
				case "t":temp.setTemp(sc);
				break;
				case "h": highBeam.setBeam(sc);
				break;
				case "f": fuelCheck.setFuel(sc);
				break;
				case "q": System.out.print("Quitting now ");
				break;
				default: System.out.println("invalid input");
				break;
			}
			
		  
			
		} while(!input.equals("q"));
		sc.close();
	}

}


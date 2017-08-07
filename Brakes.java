
public class Brakes {
 private boolean on;
 
	public Brakes() {
		on=false;
	}
	//Toggle Brakes
	public boolean toggle()  {
		on=!on;
	   
	    	this.display(); 
	     
		return on;
	}

	//Check state 
	public Boolean isOn(){
		return on;
	}

	//display Brake light state to console
	public void display() {
		if(on)
		System.out.println("Brake light on");
		else System.out.println("Brake light off");
		
	}

		
}

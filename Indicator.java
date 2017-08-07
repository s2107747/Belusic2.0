
public abstract class Indicator {
//state of indicators
private boolean on;

public Indicator(){
	setOn(false);
}

//Toggle indicator throws Exception neccessary to make thread sleep work
public boolean toggle() throws InterruptedException {
	on=!on;
	//if indicators are turned on, displays flashing arrow
	if(on){
     int i;
     for (i=0;i<10;i++){
    	this.display(); 
     }
	}
	return on;
}

//Check state of indicator
public Boolean isOn(){
	return on;
}
//change indicator on.(not used)
public void setOn(boolean on) {
	this.on = on;
}
//display indicator state to console
public abstract void display() throws InterruptedException;

	
}


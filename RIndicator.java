
public class RIndicator extends Indicator {

	public RIndicator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() throws InterruptedException {
		System.out.print("->\r");
		Thread.sleep(500);
		System.out.print("   \r");
		Thread.sleep(500);
		

	}

}

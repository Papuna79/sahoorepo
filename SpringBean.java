
public class SpringBean {

	public String roll;

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public void displayInfo()
	{
		System.out.println("Hello"+roll);
	}

}

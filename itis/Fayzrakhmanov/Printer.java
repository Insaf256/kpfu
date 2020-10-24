public class Printer {
	public boolean isOn = false;
	public String color;
	public double contrast;

	public void print (String str) {
		System.out.print(str);
	}

	public void xerox () {

	}

	public void onOff (boolean isOn) {
		this.isOn = !isOn;
	}
}
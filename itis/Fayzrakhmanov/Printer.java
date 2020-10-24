public class Printer {
	public boolean isOn;
	public String color;
	public double contrast;

	public void print (String str) {
		System.out.print(str);
	}

	public void xerox () {

	}

	public void onOff () {
		this.isOn = !isOn;
	}
}
package itis.Fayzrakhmanov;

public class Printer {
	public boolean isOn = false;
	public String color;
	public double contrast;
	public int prodactionYear;
	public char modelType;

	public void print (String str) {
		System.out.print(str);
	}

	public void xerox () {
		System.out.println("Xerox launched");
	}

	public void onOff () {
		this.isOn = !isOn;
	}
}
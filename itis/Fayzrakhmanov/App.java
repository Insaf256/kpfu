public class App {
	public static void main(String[] args) {
		Printer pr1 = new Printer();
		pr1.isOn = false;
		pr1.onOff();
		pr1.print("Test");
	}
}
package text.kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		Car_Chapter15 speedA = new Car_Chapter15(1, 10);
		Car_Chapter15 speedB = new Car_Chapter15(2, 20);
		Car_Chapter15 speedC = new Car_Chapter15(3, 30);
		Car_Chapter15 speedD = new Car_Chapter15(4, 40);
		Car_Chapter15 speedE = new Car_Chapter15(5, 50);
		
		speedC.gearChange(3);
		speedC.run();
		
	}
}

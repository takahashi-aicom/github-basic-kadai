package text.kadai_015;

public class Car_Chapter15 {
    private int gear = 1;  
    private int speed = 10; 
    
	public Car_Chapter15(int gear, int speed) {
	    this.gear = gear;
	    this.speed = speed;
	}

	public void gearChange(int afterGear){
		switch(this.gear) {
		case 1 -> System.out.println("ギア" + 1 + "から" + afterGear + "に切り替えました" );
		case 2 -> System.out.println("ギア" + 1 + "から" + afterGear + "に切り替えました" );
		case 3 -> System.out.println("ギア" + 1 + "から" + afterGear + "に切り替えました" );
		case 4 -> System.out.println("ギア" + 1 + "から" + afterGear + "に切り替えました" );
		case 5 -> System.out.println("ギア" + 1 + "から" + afterGear + "に切り替えました" );
		default -> System.out.println("ギアが切り替わりませんでした" );
		}
	}

	public void run() {
		System.out.println("速度は時速" + this.speed + "です");
	  }
}

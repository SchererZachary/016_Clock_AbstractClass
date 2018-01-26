import java.util.Timer;
import java.util.TimerTask;

public class DigitalClock1 extends myTime implements NewInterface {
	
	public static void main(String[] args) {
		final DigitalClock1 dc1 = new DigitalClock1();
		Timer clock = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				dc1.display();
			}
		};
		dc1.display();
		clock.scheduleAtFixedRate(tt, 1000, 1000);
	}
	
	public void display() {
		String dt= myTime.getDate();
		String tm = myTime.getTime();
		String time = dt + " ~ " + tm;
		System.out.println(time);
	}
	
	public void first() {
		throw new UnsupportedOperationException("first() is not supported");
	}
	public String second(int x) {
		return null;
	}
}

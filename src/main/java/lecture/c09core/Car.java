package lecture.c09core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car extends Wheel{
	private Wheel wheel;
	
	
	@Autowired
	public Car(Wheel wheel) {
		this.wheel = wheel;
	}
	
	
	public void go() {
		wheel.roll();
	}
	
	
	
}

package p8.textbook.s080403;

import p8.textbook.s080205.*;

public class RemoteControExample {
	public static void main(String[] args) {
		RemoteControl.changeBattery();
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
	}
}

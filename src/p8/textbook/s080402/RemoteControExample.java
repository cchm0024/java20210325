package p8.textbook.s080402;

import p8.textbook.s080205.RemoteControl;
import p8.textbook.s080301.Audio;
import p8.textbook.s080301.Television;

public class RemoteControExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(false);
	}
}

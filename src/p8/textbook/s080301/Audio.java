package p8.textbook.s080301;

import p8.textbook.s080205.RemoteControl;

public class Audio implements RemoteControl{
	//필드
	private int volume;
	
	//trueOn() 추상메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	//trueOn() 추상메소드의 실체 메소드
		public void turnOff() {
		System.out.println("Audio를 끕니다.");
		}
		@Override
		public void turnON() {
			System.out.println("Audio를 켭니다.");
			
		}
		@Override
		public void setVolume() {
			System.out.println("Audio를 끕니다.");
			
		}
}

package p8.textbook.s080301;

import p8.textbook.s080205.RemoteControl;

public class Television implements RemoteControl{

	private int volume;
	
	//turnOn() 추상메소드의 실체 메소드
	public void turnOn() {
		System.out.println("tv를 겹니다.");
	}
	//turnOff() 추상메소드의 실체 메소드
		public void turnOff() {
			System.out.println("tv를 끕니다.");
	}
	//setVolume() 추상 메소드의 실체 메소드
		public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume<RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = volume;
			}
			System.out.println("현재 TV 볼륨: " + this.volume);
		}
		@Override
		public void turnON() {
			System.out.println("tv를 겹니다.");

			
		}
		@Override
		public void setVolume() {
			// TODO Auto-generated method stub
			
		}
}

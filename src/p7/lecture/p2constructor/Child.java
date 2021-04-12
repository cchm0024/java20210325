package p7.lecture.p2constructor;

public class Child extends Parent {

		private int j ;
//	public Child() {
//		super(3); 생략되어 있는 상태
//	}
		
		public Child(int i, int j) {
			super(i);
			this.j = j;
		}


}

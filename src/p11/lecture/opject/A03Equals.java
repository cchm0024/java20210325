package p11.lecture.opject;

public class A03Equals {
	public static void main(String[] args) {
		book b1 = new Book("java", "trump");
		book b2 = new Book("c++", "donald");
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
		book b3 = new Book("spring", "summer");
		book b4 = new Book("spring", "summer");
		
		System.out.println(b3 == b4);
		System.out.println(b3.equals(b4));
	}
}

class book {
	private String title;
	private String writer;
	
	public book(String title, String writer) {
		super();
		this.title = title;
		this.writer = writer;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Book) {
			
		book o = (book) obj;
		
		// TODO Auto-generated method stub
		return this.title(obj.title) && this.writer.equals(obj.writer);
		}
	}
}
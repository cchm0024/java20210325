package p8.textbook.Ex.ex4;

	public class MySqlDao implements DataAccessObhect{
		@Override
		public void select() {
			// TODO Auto-generated method stub
			System.out.println("mySql DB에서 검색");
		}
		@Override
		public void insert() {
			// TODO Auto-generated method stub
			System.out.println("mySql DB에 삽입");
		}
		@Override
		public void update() {
			// TODO Auto-generated method stub
			System.out.println("mySql DB를 수정");
		}
		@Override
		public void deleto() {
			// TODO Auto-generated method stub
			System.out.println("mySql DB에서 삭제");
		}
		}


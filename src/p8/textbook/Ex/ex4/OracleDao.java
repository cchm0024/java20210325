package p8.textbook.Ex.ex4;

	public class OracleDao implements DataAccessObhect{
		@Override
		public void select() {
			// TODO Auto-generated method stub
			System.out.println("Orcle DB에서 검색");
		}
		@Override
		public void insert() {
			// TODO Auto-generated method stub
			System.out.println("Orcle DB에 삽입");
		}
		@Override
		public void update() {
			// TODO Auto-generated method stub
			System.out.println("Orcle DB에 수정");
		}
		@Override
		public void deleto() {
			// TODO Auto-generated method stub
			System.out.println("Orcle DB에 삭제");
		}
}


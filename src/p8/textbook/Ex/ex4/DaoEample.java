package p8.textbook.Ex.ex4;

public class DaoEample {
	public static void dbWork(DataAccessObhect dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.deleto();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}


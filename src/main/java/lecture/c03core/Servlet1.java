package lecture.c03core;

public class Servlet1 {
	private Dao1 dao = new Dao1();
	public void doGet() {
		
		dao.select();
	}
}

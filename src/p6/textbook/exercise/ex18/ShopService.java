package p6.textbook.exercise.ex18;

public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	/* public static ShopService getInstance () {
	 * if (ShopService == null)
	 * 	   ShopService = new ShopService();
	 * }
	 * 
	 *  return ShopService;
	 */ 
	
	}
}

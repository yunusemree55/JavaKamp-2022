
public class Main {

	public static void main(String[] args) {
		

		CustomerManager customerManager = new CustomerManager();
		
//		customerManager.Add("Yunus Emre");
//		
//		customerManager.Update("Yunus Emre");
//		
//		customerManager.Delete("Yunus Emre");
		
		String name = "Yunus Emre";
		
		customerManager.Add(name);
		customerManager.Update(name);
		customerManager.Delete(name);
		
		
	}

}

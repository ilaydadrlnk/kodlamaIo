package kodlamaIo2;

public class UserManager {
	public void add(User user) {
		System.out.println("Eklendi: "+ user.firstName);
		
	}
    
	public void update(User user) {
		System.out.println("Güncellendi: " + user.firstName);
	}
	
	public void delete(User user) {
		System.out.println("Silindi: " + user.firstName);
	}
	
	public void addMultiple(User[] users) {
		
		for(User user: users) {
			add(user);
			update(user);
			delete(user);
		}
		
	}
	

}

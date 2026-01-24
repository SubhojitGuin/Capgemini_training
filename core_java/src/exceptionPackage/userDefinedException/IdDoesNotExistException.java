package exceptionPackage.userDefinedException;

public class IdDoesNotExistException extends RuntimeException {
	
	public IdDoesNotExistException(String message) {
		super(message);
	}
	
	public static void main(String[] args) {	
		int findId = 1;

		try {
			User user = UserResource.findById(findId);
			
			System.out.println(user.id);
			System.out.println(user.name);
		} catch (IdDoesNotExistException e) {
			System.out.println("IdDoesNotExistException handled");
		}
	}

}

class UserResource {
	
	public static User[] users = {
			new User(1, "Sam"),	
			new User(2, "Shah")	
		};
	
	public static User findById(int findId) {
				
		for (User user: users) {
			if (user.id == findId) {
				return user;
			}
		}
		
		throw new IdDoesNotExistException("Id " + findId + " does not exist");
	}
	
}

class User {
	int id;
	String name;
	
	User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
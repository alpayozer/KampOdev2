package javaKampOdev;

public class UserManager {

		public void signIn (User user) {
			System.out.println(user.getId()+ " numaral� kullan�c� sisteme giri� yapt�.");
		}
		
		public void signOut (User user) {
			System.out.println(user.getId()+" numaral� kullan�c� oturumu kapatt�.");
		}
}

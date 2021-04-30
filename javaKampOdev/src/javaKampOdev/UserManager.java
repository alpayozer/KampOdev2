package javaKampOdev;

public class UserManager {

		public void signIn (User user) {
			System.out.println(user.getId()+ " numaralý kullanýcý sisteme giriþ yaptý.");
		}
		
		public void signOut (User user) {
			System.out.println(user.getId()+" numaralý kullanýcý oturumu kapattý.");
		}
}

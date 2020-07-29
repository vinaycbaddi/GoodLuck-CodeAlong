package mainapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, Exception {
		System.out.println("1.Register");
		System.out.println("2.Login");
		int x;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		RegisterPojo registerpojo=new RegisterPojo();
		RegisterDAO registerdao=new RegisterDAO();
		LoginPojo loginpojo=new LoginPojo();
		LoginDAO logindao=new LoginDAO();
		switch(x) {
		case 1:
			System.out.println("Enter firstname");
			String firstname=br.readLine();
			System.out.println("Enter lastname");
			String lastname=br.readLine();
			System.out.println("Enter username");
			String username=br.readLine();
			System.out.println("Enter password");
			String password=br.readLine();
			System.out.println("Enter email");
			String email=br.readLine();
			registerpojo.setFirstname(firstname);
			registerpojo.setLastname(lastname);
			registerpojo.setUsername(username);
			registerpojo.setPassword(password);
			registerpojo.setEmail(email);
			registerdao.addUser(registerpojo);
			break;
		case 2:
			System.out.println("Enter username");
			String name=br.readLine();
			System.out.println("Enter password");
			String pass=br.readLine();
			loginpojo.setUsername(name);
			loginpojo.setPassword(pass);
			if(logindao.validate(loginpojo)==true) {
				Luck luck = new Luck();
				luck.display();
			}
			else 
				System.out.println("Inavild username/password");
			break;
		}
	}

}

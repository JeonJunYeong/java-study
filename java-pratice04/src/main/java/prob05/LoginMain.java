package prob05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.UserException;


public class LoginMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<User> joinUsers = new ArrayList<User>();
		joinUsers.add( new User( "john", "1234") );
		
		System.out.print("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.print("비밀번호를 입력하시오 : ");
		String password = scanner.nextLine();
		
		User loginUser=new User(id,password);
		
		
		try {
			login(joinUsers,loginUser);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (PasswordDismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	public static void login(List<User> users, User user ) throws UserNotFoundException, PasswordDismatchException {
		if( !users.contains(user) ){
			
			throw new UserNotFoundException();
			
		}
		User savedUser = users.get( users.indexOf( user ) );
		
		if( !savedUser.getPassword().equals( user.getPassword()) ){
			
			throw new PasswordDismatchException();
		}
		else
			System.out.println("로그인 성공");
	}
}

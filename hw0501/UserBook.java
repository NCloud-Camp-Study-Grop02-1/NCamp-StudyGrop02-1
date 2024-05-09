package homework.hw0501;
//1. UserBook 클래스를 생성하세요.
//basic 3번 문제에서 만든 User클래스 타입의 값을 100개 저장할 수 있는 
//배열과 현재 배열에 위치를 저장하는 index를 필드로 생성합니다.
//매개변수로 username과 password를 받아서 User 객체를 생성하여 
//배열에 저장하는 
public class UserBook {
	User[] users = new User[100];
	
	int index =0;
	
	public void saveUserInfo(String username, String password) {
		User users = new User();
		users.setId(index+1);
		users.setPassword(password);
		users.setUsername(username);
		
		
		
		users[index++]=user;
	}
	
	public void printUserInfo(int index) {
		if(users[index]!= null){
			System.out.println();
		}
	}
	

}

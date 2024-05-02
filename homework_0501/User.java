package homework_0501;

// 웹만들때 아래와 같은 클래스들을 만들건데 아래 코드와 같은 형태임.
// DTO: Data Transfer Object, VO:Value Object Entity
public class User {
	//보안성을 높이기 위해 private 사용!!!
	private long id;
	private String username;
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

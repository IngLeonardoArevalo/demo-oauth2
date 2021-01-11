package demo.oauth2.config;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String username, password;
	
	
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public Account() {

	}


	public Integer getId() {
		return id;
	}


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}






	
	
	
	
}

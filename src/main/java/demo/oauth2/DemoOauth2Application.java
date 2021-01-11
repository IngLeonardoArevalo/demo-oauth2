package demo.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

import demo.oauth2.config.Account;
import demo.oauth2.config.AccountRepository;

@EnableAuthorizationServer
@SpringBootApplication
public class DemoOauth2Application implements CommandLineRunner{

	@Autowired
	AccountRepository accountRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoOauth2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountRepository.deleteAll();
		accountRepository.save(new Account("leo", "123"));
		
		System.out.println("it works");
		
	}

}

package eti.krebscode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class UserSpringApplication {

	private static Logger LOG = LoggerFactory.getLogger(UserSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UserSpringApplication.class, args);

		LOG.info("Start.....");
	}

	

}

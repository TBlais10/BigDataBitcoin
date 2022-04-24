package com.example.BigDataBitcoin;

import com.example.BigDataBitcoin.Auth.ERole;
import com.example.BigDataBitcoin.Repositories.RoleRepository;
import com.example.BigDataBitcoin.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@SpringBootApplication
public class BigDataBitcoinApplication {
	@Autowired
	private UserRepository repository;

	@Autowired
	private RoleRepository roleRepository;

	@Value("${spring.datasource.driver-class-name}")
	public String myDriver;

	@Value("${spring.datasource.url}")
	public String myUrl;

	@Value("${spring.datasource.username}")
	public String username;

	@Value("${spring.datasource.password}")
	public String password;

	public static void main(String[] args) {
		SpringApplication.run(BigDataBitcoinApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		int roleCheck = roleRepository.isRoleEmpty();

		if (roleCheck < ERole.values().length){
			int id = 1;
			for (ERole role : ERole.values()){
				try	{
					Connection conn = DriverManager.getConnection(myUrl, username, password);
					Class.forName(myDriver);
					String query = "Insert into role (id, name) values (/,/";
					PreparedStatement statement = conn.prepareStatement(query);

					statement.setString(1, Integer.toString(id));
					statement.setString(2, role.toString());

					statement.executeUpdate();
				} catch (Exception e){
					System.out.println(e.getMessage());
				}
			}
		}
		return builder.build();
	}

}

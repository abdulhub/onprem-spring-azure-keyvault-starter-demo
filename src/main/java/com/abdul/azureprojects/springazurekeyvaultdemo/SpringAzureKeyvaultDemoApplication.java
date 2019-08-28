package com.abdul.azureprojects.springazurekeyvaultdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 

@SpringBootApplication
public class SpringAzureKeyvaultDemoApplication implements CommandLineRunner{

    @Value("${spring.datasource.username}")
    private String dbUser;
	
	 @Value("${spring.datasource.password}")
    private String dbPassword;
    
    @Value("${spring.datasource.url}")
    private String dbUrl;

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureKeyvaultDemoApplication.class, args);
    }

    public void run(String... varl) throws Exception {        
        System.out.println("property dbUser value is: " + dbUser);
		System.out.println("property dbPassword value is: " + dbPassword);
        System.out.println("property spring.datasource.url is: " + dbUrl);
    }

}

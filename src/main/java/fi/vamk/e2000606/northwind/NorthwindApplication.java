package fi.vamk.e2000606.northwind;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableEncryptableProperties
@SpringBootApplication
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}

}

//Verify SpringFox/Swagger: see the link at SpringFoxConfig.java
//Swagger UI: see the link at WebMvcConfig.java

//Get a certificate: keytool -export -keystore e2000606.p12 -alias e2000606 -file my_certificate.crt
//(password in application.properties)
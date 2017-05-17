package com.kishan.truncatelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TruncateLogDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruncateLogDemoApplication.class, args);
	}
}
// http://localhost:8080/subscribe?orderDetails=123456789012345678901234567890
// produces output  "12 ... (truncated) ... 90"

package com.jtb.taxpayerws;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableFeignClients(basePackages = "com.jtb.taxpayerws.client.proxy")
public class TaxpayerWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxpayerWsApplication.class, args);
	}


}

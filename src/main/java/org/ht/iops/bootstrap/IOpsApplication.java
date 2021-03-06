package org.ht.iops.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("org.ht.iops")
@EnableMongoRepositories("org.ht.iops.db.repository")
public class IOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IOpsApplication.class, args);
	}
}

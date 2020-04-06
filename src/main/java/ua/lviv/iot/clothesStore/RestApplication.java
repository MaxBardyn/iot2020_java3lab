package ua.lviv.iot.clothesStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.clothesStore.business", "ua.lviv.iot.clothesStore.dataaccess",
    "ua.lviv.iot.clothesStore.controller" })
@EnableJpaRepositories({ "ua.lviv.iot.clothesStore.dataaccess" })
public class RestApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

}
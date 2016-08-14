package org.terasoluna.tourreservation.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by ikeya on 16/08/15.
 */
@ImportResource({"META-INF/spring/applicationContext.xml",
        "META-INF/spring/spring-security.xml",
        "META-INF/spring/spring-mvc.xml"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AppConfig {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppConfig.class, args);
    }
}

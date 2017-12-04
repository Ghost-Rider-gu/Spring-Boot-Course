package siendev.corp.courses.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.boot.course")
public class ApplicationPropertiesClass {
}

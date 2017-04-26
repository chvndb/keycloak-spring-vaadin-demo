package demo.vaadin.config;

import java.util.logging.Logger;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;

public class LoggingConfiguration {
  @Bean
  public Logger logger(InjectionPoint ip) {
    return Logger.getLogger(ip.getMember().getDeclaringClass().getName());
  }
}


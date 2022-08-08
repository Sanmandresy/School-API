package fr.schoolapi.service;

import java.util.Properties;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Login {
  private final String driver;
  private final String url;
  private final String userName;
  private final String password;

  Properties properties;

  public Login(){
    this.driver = properties.getProperty("spring.datasource.driver-class-name");
    this.url = properties.getProperty("spring.datasource.url");
    this.userName = properties.getProperty("spring.datasource.username") ;
    this.password = properties.getProperty("spring.datasource.password");
  }

}

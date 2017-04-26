package demo.vaadin.backend;

import org.springframework.stereotype.Service;

@Service
public class MyBackendBean implements MyBackend {
  @Override
  public String adminOnlyEcho(String s) {
    return "admin:" + s;
  }

  @Override
  public String echo(String s) {
    return s;
  }
}

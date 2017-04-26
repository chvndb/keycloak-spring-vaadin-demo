package demo.vaadin.backend;

import org.springframework.security.access.prepost.PreAuthorize;

public interface MyBackend {
  @PreAuthorize("hasRole('ADMIN')")
  String adminOnlyEcho(String s);

  @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
  String echo(String s);
}

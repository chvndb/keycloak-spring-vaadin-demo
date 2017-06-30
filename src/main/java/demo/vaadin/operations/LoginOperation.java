package demo.vaadin.operations;

import org.springframework.security.access.annotation.Secured;
import org.vaadin.spring.sidebar.annotation.SideBarItem;
import org.vaadin.spring.sidebar.annotation.VaadinFontIcon;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.Page;
import com.vaadin.spring.annotation.SpringComponent;

import demo.vaadin.Sections;

@SpringComponent
@SideBarItem(sectionId = Sections.AUTHENTICATION, caption = "Login")
@VaadinFontIcon(VaadinIcons.KEY)
@Secured("ROLE_ANONYMOUS")
public class LoginOperation implements Runnable {
  @Override
  public void run() {
    Page.getCurrent().setLocation("/sso/login");
  }
}

package demo.vaadin.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.vaadin.spring.sidebar.annotation.SideBarItem;
import org.vaadin.spring.sidebar.annotation.VaadinFontIcon;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Notification;

import demo.vaadin.Sections;
import demo.vaadin.backend.MyBackend;

@SuppressWarnings("serial")
@Secured({"ROLE_USER", "ROLE_ADMIN"})
@SpringView(name = "user")
@SideBarItem(sectionId = Sections.VIEWS, caption = "User View")
@VaadinFontIcon(VaadinIcons.ARCHIVE)
public class UserView extends CustomComponent implements View {
  private final MyBackend backend;

  @Autowired
  public UserView(MyBackend backend) {
    this.backend = backend;
    Button button = new Button("Call user backend", new Button.ClickListener() {
      @Override
      public void buttonClick(Button.ClickEvent event) {
        Notification.show(UserView.this.backend.echo("Hello User World!"));
      }
    });
    setCompositionRoot(button);
  }

  @Override
  public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {}
}

package demo.vaadin.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.spring.sidebar.annotation.SideBarItem;
import org.vaadin.spring.sidebar.annotation.VaadinFontIcon;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.Notification;

import demo.vaadin.Sections;
import demo.vaadin.backend.MyBackend;

@SpringComponent
@SideBarItem(sectionId = Sections.OPERATIONS, caption = "Admin operation", order = 1)
@VaadinFontIcon(VaadinIcons.WRENCH)
public class AdminOperation implements Runnable {
  private final MyBackend backend;

  @Autowired
  public AdminOperation(MyBackend backend) {
    this.backend = backend;
  }

  @Override
  public void run() {
    Notification.show(backend.adminOnlyEcho("Hello Admin World"));
  }
}

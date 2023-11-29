package bookstore;

import java.util.Map;
import javax.swing.JFrame;

public class Admin extends User {

    public Admin(Map<String, Object> userDeatils) {
        super(userDeatils, "admin");
    }

    @Override
    public void openUserPage() {
        AdminPage adminPage = new AdminPage();
        adminPage.setVisible(true);
        adminPage.setLocationRelativeTo(null);
        adminPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

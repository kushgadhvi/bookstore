package bookstore;

import java.awt.Color;
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
        adminPage.getContentPane().setBackground(Color.decode("#C8C497"));
    }
}

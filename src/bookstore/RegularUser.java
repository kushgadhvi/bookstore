package bookstore;

import java.util.Map;
import javax.swing.JFrame;

public class RegularUser extends User {

    public RegularUser(Map<String, Object> userDeatils) {
        super(userDeatils, "user");
    }

    @Override
    public void openUserPage() {
        UserPage userPage = new UserPage((Map<String, Object>) userDeatils);
        userPage.setVisible(true);
        userPage.setLocationRelativeTo(null);
        userPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

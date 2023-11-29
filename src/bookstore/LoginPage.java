package bookstore;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();

    }
    JDBC jdbc = new JDBC("jdbc:mysql://localhost:3306/bookstore", "root", "admin");

    private static String covertIntoHash(String password) {
        String hash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes(StandardCharsets.UTF_8));
            byte[] digest = md.digest();

            hash = String.format("%064x", new BigInteger(1, digest));

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hash;
    }

    ;

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        signUpFristName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        signUpLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signUpUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        signUpEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        signUpPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        signUpConfirmPassword = new javax.swing.JPasswordField();
        createUserButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        signUpPhone = new javax.swing.JTextField();
        userNameText = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        userNameText1 = new javax.swing.JLabel();
        signUp = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        jLabel1.setText("Fristname");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Sign Up");

        jLabel3.setText("Lastname");

        jLabel4.setText("Email");

        jLabel5.setText("Username");

        jLabel6.setText("Password");

        jLabel7.setText("Confirm Password");

        createUserButton.setText("Create User");
        createUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createUserButtonMouseClicked(evt);
            }
        });

        jLabel9.setText("Phone");

        javax.swing.GroupLayout signUpDialogLayout = new javax.swing.GroupLayout(signUpDialog.getContentPane());
        signUpDialog.getContentPane().setLayout(signUpDialogLayout);
        signUpDialogLayout.setHorizontalGroup(
            signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpDialogLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 98, Short.MAX_VALUE)
                .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpDialogLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(signUpFristName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signUpLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signUpUserName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signUpEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addComponent(createUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(signUpConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(signUpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(signUpPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        signUpDialogLayout.setVerticalGroup(
            signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpFristName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(signUpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(signUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(createUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userNameText.setText("Username");

        userNameText1.setText("Password");

        signUp.setText("Signup");
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });

        Login.setText("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(userNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(password))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Code on click for login button
    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked

        String userNameValue = userName.getText();
        String passWordValue = new String(password.getPassword());

        String query = "Select * from userslogin where username = " + '"' + userNameValue + '"';

        List<Map<String, Object>> userResult = jdbc.select(query);
        if (userResult.isEmpty()) {
            JOptionPane.showMessageDialog(this, "User Dose not exist");
            return;
        }
        Map<String, Object> userDeatils = userResult.get(0);
        User user;
        String userType = (String) userDeatils.get("UserType");
        if (covertIntoHash(passWordValue).equals(userDeatils.get("PasswordHash")) && "admin".equals(userType)) {
            this.setVisible(false);
            user = new Admin(userDeatils);
            user.openUserPage();

        } else if (covertIntoHash(passWordValue).equals(userDeatils.get("PasswordHash")) && "user".equals(userType)) {
            this.setVisible(false);
            user = new RegularUser(userDeatils);
            user.openUserPage();

        } else {
            JOptionPane.showMessageDialog(this, "Wrong Password");
        }
    }//GEN-LAST:event_LoginMouseClicked

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked

        signUpDialog.pack();
        signUpDialog.setVisible(true);

    }//GEN-LAST:event_signUpMouseClicked

    private void createUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createUserButtonMouseClicked
        String fName = signUpFristName.getText();
        String lName = signUpLastName.getText();
        String userNameValue = signUpUserName.getText();
        String signUpEmailValue = signUpEmail.getText();
        String signUphoneValue = signUpPhone.getText();
        String passWordValue = new String(signUpPassword.getPassword());
        String confirmPassWordValue = new String(signUpConfirmPassword.getPassword());
        String query = "Select * from userslogin where username = " + '"' + userNameValue + '"';
        List<Map<String, Object>> userExistsResult = jdbc.select(query);

        if (!userExistsResult.isEmpty()) {
            JOptionPane.showMessageDialog(this, "User Already Exist");
            return;
        }

        if (!passWordValue.equals(confirmPassWordValue)) {
            JOptionPane.showMessageDialog(this, "Password Dose Not Match !!");
            return;
        }

        String insertQuery = "Insert into userslogin (FristName,LastName,userType,Email,Username,PasswordHash,PhoneNumber) values ('" + fName + "','" + lName + "','" + "user" + "','" + signUpEmailValue + "','" + userNameValue + "','" + covertIntoHash(passWordValue) + "','" + signUphoneValue + "');";
        System.out.println(insertQuery);
        boolean isUserCreate = jdbc.insert(insertQuery);
        if (isUserCreate) {
            signUpDialog.setVisible(false);
            JOptionPane.showMessageDialog(this, "User Creation Successful");
        } else {
            JOptionPane.showMessageDialog(this, "Server Error While Creating an user");
        }
    }//GEN-LAST:event_createUserButtonMouseClicked

    public static LoginPage loginPage;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {

            loginPage = new LoginPage();
            loginPage.setLocationRelativeTo(null);
            loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginPage.setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton createUserButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signUp;
    private javax.swing.JPasswordField signUpConfirmPassword;
    private javax.swing.JDialog signUpDialog;
    private javax.swing.JTextField signUpEmail;
    private javax.swing.JTextField signUpFristName;
    private javax.swing.JTextField signUpLastName;
    private javax.swing.JPasswordField signUpPassword;
    private javax.swing.JTextField signUpPhone;
    private javax.swing.JTextField signUpUserName;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNameText;
    private javax.swing.JLabel userNameText1;
    // End of variables declaration//GEN-END:variables
}

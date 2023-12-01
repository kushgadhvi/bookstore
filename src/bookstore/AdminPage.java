package bookstore;

import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdminPage extends javax.swing.JFrame {

    JDBC jdbc = new JDBC("jdbc:mysql://localhost:3306/bookstore", "root", "admin");
    public static AdminPage adminPage;

    public AdminPage() {

        initComponents();
        EditbookDialog.getContentPane().setBackground(Color.decode("#C8C497"));
        AddbookDialog.getContentPane().setBackground(Color.decode("#C8C497"));
        bookTable.getTableHeader().setBackground(Color.decode("#006699"));
        bookTable.getTableHeader().setForeground(Color.white);
        bookTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        bookTable.setDefaultRenderer(Object.class, new GrayCellRenderer());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddbookDialog = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        Catagory = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bookNameInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        authorInput = new javax.swing.JTextField();
        qtyInput = new javax.swing.JTextField();
        priceInput = new javax.swing.JTextField();
        categoryDropDown = new javax.swing.JComboBox<>();
        EditbookDialog = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        Catagory1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bookNameEditInput = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        authorEditInput = new javax.swing.JTextField();
        qtyIEditnput = new javax.swing.JTextField();
        priceEditInput = new javax.swing.JTextField();
        categoryEditDropDown = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        idEditInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchBook = new javax.swing.JTextField();
        addBookButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        signOutButton = new javax.swing.JButton();

        AddbookDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AddbookDialogWindowOpened(evt);
            }
        });

        jLabel2.setText("BookName");

        Catagory.setText("Category");

        jLabel3.setText("Price");

        jLabel4.setText("Author");

        jLabel5.setText("Quantity");

        bookNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameInputActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Book");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        categoryDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout AddbookDialogLayout = new javax.swing.GroupLayout(AddbookDialog.getContentPane());
        AddbookDialog.getContentPane().setLayout(AddbookDialogLayout);
        AddbookDialogLayout.setHorizontalGroup(
            AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddbookDialogLayout.createSequentialGroup()
                .addGroup(AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddbookDialogLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Catagory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qtyInput, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(bookNameInput)
                            .addComponent(authorInput, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(priceInput, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(categoryDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(AddbookDialogLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        AddbookDialogLayout.setVerticalGroup(
            AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddbookDialogLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Catagory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(AddbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        EditbookDialog.setBackground(new java.awt.Color(51, 255, 102));
        EditbookDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                EditbookDialogWindowOpened(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("BookName");

        Catagory1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Catagory1.setText("Category");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Price");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Author");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Quantity");

        bookNameEditInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameEditInputActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 255, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Edit Book");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        categoryEditDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Id");

        idEditInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEditInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditbookDialogLayout = new javax.swing.GroupLayout(EditbookDialog.getContentPane());
        EditbookDialog.getContentPane().setLayout(EditbookDialogLayout);
        EditbookDialogLayout.setHorizontalGroup(
            EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditbookDialogLayout.createSequentialGroup()
                .addGroup(EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditbookDialogLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EditbookDialogLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Catagory1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qtyIEditnput, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(bookNameEditInput)
                            .addComponent(authorEditInput)
                            .addComponent(priceEditInput)
                            .addComponent(categoryEditDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idEditInput))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        EditbookDialogLayout.setVerticalGroup(
            EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditbookDialogLayout.createSequentialGroup()
                .addGroup(EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditbookDialogLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10))
                    .addGroup(EditbookDialogLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(idEditInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNameEditInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryEditDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Catagory1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceEditInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorEditInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(EditbookDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtyIEditnput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Admin Area !! ");

        searchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookActionPerformed(evt);
            }
        });
        searchBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchBookKeyPressed(evt);
            }
        });

        addBookButton.setBackground(new java.awt.Color(51, 255, 102));
        addBookButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBookButton.setForeground(new java.awt.Color(255, 255, 255));
        addBookButton.setText("Add Book");
        addBookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookButtonMouseClicked(evt);
            }
        });

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        bookTable.setGridColor(new java.awt.Color(0, 0, 0));
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bookTable);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Search Books");

        signOutButton.setBackground(new java.awt.Color(51, 102, 255));
        signOutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signOutButton.setForeground(new java.awt.Color(255, 255, 255));
        signOutButton.setText("Signout");
        signOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBookActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String query = "SELECT book.id as id, bookname as bookname, price as price,author as author ,qunatity as qunatity,categoryname as categoryname FROM bookstore.books book inner join bookstore.category cat on book.bookCatagory = cat.categoryId order by cat.categoryName asc, book.bookname asc";

        List<Map<String, Object>> bookTableResult = jdbc.select(query);

        int rowLength = bookTableResult.size();

        Book[] books = new Book[rowLength];

        for (int i = 0; i < rowLength; i++) {
            Map<String, Object> tempRowData = bookTableResult.get(i);
            int id = (int) tempRowData.get("id");
            String bookname = (String) tempRowData.get("bookname");
            int price = (int) tempRowData.get("price");
            String author = (String) tempRowData.get("author");
            int qunatity = (int) tempRowData.get("qunatity");
            String categoryname = (String) tempRowData.get("categoryName");
            books[i] = new Book(id, bookname, price, author, qunatity, categoryname);
        }

        BookTableModel booktableModel = new BookTableModel(books);
        bookTable.setModel(booktableModel);
        ButtonRenderer buttonRenderer = new ButtonRenderer(Color.decode("#FFCCCC"));
        ButtonEditor buttonEditor = new ButtonEditor(new JCheckBox());
        ButtonRenderer buttonRenderer1 = new ButtonRenderer(Color.red);
        ButtonEditor buttonEditor1 = new ButtonEditor(new JCheckBox());
        bookTable.getColumn("Edit").setCellRenderer(buttonRenderer);
        bookTable.getColumn("Edit").setCellEditor(buttonEditor);
        bookTable.getColumn("Delete").setCellRenderer(buttonRenderer1);
        bookTable.getColumn("Delete").setCellEditor(buttonEditor1);

    }//GEN-LAST:event_formWindowOpened

    private void addBookButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookButtonMouseClicked
        AddbookDialog.setVisible(true);
        AddbookDialog.pack();
    }//GEN-LAST:event_addBookButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bookNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameInputActionPerformed

    private void AddbookDialogWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AddbookDialogWindowOpened

        String query = "select * from bookstore.category;";
        List<Map<String, Object>> categoryList = jdbc.select(query);
        DefaultComboBoxModel<String> dropDownmodel = new DefaultComboBoxModel<>();

        for (Map<String, Object> categoryList1 : categoryList) {
            dropDownmodel.addElement((String) categoryList1.get("categoryName"));
        }
        categoryDropDown.setModel(dropDownmodel);

    }//GEN-LAST:event_AddbookDialogWindowOpened

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        String bookName = bookNameInput.getText();
        String bookCatagory = (String) categoryDropDown.getSelectedItem();
        String price = priceInput.getText();
        String author = authorInput.getText();
        String qunatity = qtyInput.getText();

        String insertBookQuery;
        String categoryQuery = "(SELECT categoryId FROM bookstore.category WHERE categoryName = " + "'" + bookCatagory + "'" + ')';

        insertBookQuery = "INSERT INTO bookstore.books (bookname, bookCatagory, price, author, qunatity) values ('" + bookName + "'," + categoryQuery + ",'" + price + "','" + author + "','" + qunatity + "');";

        boolean isInsertSucess = jdbc.insert(insertBookQuery);
        if (isInsertSucess) {
            JOptionPane.showMessageDialog(this, "Book Add Successful");
            formWindowOpened(null);
            AddbookDialog.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error While Creating the book");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        int id = Integer.parseInt(bookTable.getValueAt(bookTable.getSelectedRow(), 0).toString());
        String colName = bookTable.getColumnName(bookTable.getSelectedColumn());

        switch (colName) {
            case "Edit" -> {
                List<Map<String, Object>> categoryList;
                synchronized (this) {
                    String catQuery = "select * from bookstore.category;";
                    categoryList = jdbc.select(catQuery);
                }
                
                DefaultComboBoxModel<String> dropDownmodel = new DefaultComboBoxModel<>();
                for (Map<String, Object> categoryList1 : categoryList) {
                    dropDownmodel.addElement((String) categoryList1.get("categoryName"));
                }
                categoryEditDropDown.setModel(dropDownmodel);

                List<Map<String, Object>> editBooksDetails;
                
                synchronized (this) {
                    String query = "SELECT book.id as id, bookname as bookname, price as price,author as author ,qunatity as qunatity,categoryname as categoryname FROM bookstore.books book inner join bookstore.category cat on book.bookCatagory = cat.categoryId where book.id = " + id;
                    editBooksDetails = jdbc.select(query);
                }

                Map<String, Object> editBook = editBooksDetails.get(0);

                bookNameEditInput.setText((String) editBook.get("bookname"));
                authorEditInput.setText((String) editBook.get("author"));
                priceEditInput.setText(editBook.get("price").toString());
                qtyIEditnput.setText(editBook.get("qunatity").toString());
                idEditInput.setText(editBook.get("id").toString());
                idEditInput.setEnabled(false);
                EditbookDialog.pack();
                EditbookDialog.setVisible(true);

                categoryEditDropDown.setSelectedItem((String) editBook.get("categoryName"));

                break;
            }
            case "Delete" -> {

                int r = JOptionPane.showConfirmDialog(this, "Are you Sure you want to delete ?");
                if (r == 0) {
                    String deleteOrderIdMapping = "delete from bookstore.orderstobookmapping where bookid = " + id;
                    String deleteQuery = "delete from bookstore.books where id = " + id;
                    boolean deleteOrderMapping = jdbc.delete(deleteOrderIdMapping);
                    boolean deleteQueryResult = jdbc.delete(deleteQuery);
                    if (deleteOrderMapping == true && deleteQueryResult == true) {
                        formWindowOpened(null);
                    }

                } else {
                    JOptionPane.showConfirmDialog(this, "Error Please Try Again");
                }
            }
            
            default -> {

            }

        }


    }//GEN-LAST:event_bookTableMouseClicked

    private void bookNameEditInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameEditInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameEditInputActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        String id = idEditInput.getText();
        String bookName = bookNameEditInput.getText();
        String bookCatagory = (String) categoryEditDropDown.getSelectedItem();
        String price = priceEditInput.getText();
        String author = authorEditInput.getText();
        String qty = qtyIEditnput.getText();
        String categoryQuery = "(SELECT categoryId FROM bookstore.category WHERE categoryName = " + "'" + bookCatagory + "'" + ')';

//        String updateBookQuery = "Update INTO bookstore.books (bookname, bookCatagory, price, author, qunatity) values ('" + bookName + "'," + categoryQuery + ",'" + price + "','" + author + "','" + qty + "') where id=" + id + ";";
        String updateBookQuery = "UPDATE bookstore.books SET bookname = '" + bookName + "', bookCatagory = " + categoryQuery + ", price = " + price + ", author = '" + author + "', qunatity = " + qty + " WHERE id = " + id + ";";
        System.out.println(updateBookQuery);

        boolean isUpdateSuccess = jdbc.update(updateBookQuery);
        if (isUpdateSuccess) {
            JOptionPane.showMessageDialog(this, "Book Add Successful");
            formWindowOpened(null);
            EditbookDialog.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error While Creating the book");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EditbookDialogWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_EditbookDialogWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_EditbookDialogWindowOpened

    private void idEditInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEditInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEditInputActionPerformed

    private void searchBookKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBookKeyPressed

        String searchText = searchBook.getText();
        String searchQuery;

        if (searchText.length() > 1) {
            searchQuery = "SELECT book.id as id, bookname as bookname, price as price,author as author ,qunatity as qunatity,categoryname as categoryname FROM bookstore.books book inner join bookstore.category cat on book.bookCatagory = cat.categoryId where book.bookname like'%" + searchText + "%' order by cat.categoryName asc, book.bookname asc";
        } else {
            searchQuery = "SELECT book.id as id, bookname as bookname, price as price,author as author ,qunatity as qunatity,categoryname as categoryname FROM bookstore.books book inner join bookstore.category cat on book.bookCatagory = cat.categoryId order by cat.categoryName asc, book.bookname asc";
        }

        List<Map<String, Object>> bookTableResult = jdbc.select(searchQuery);

        int rowLength = bookTableResult.size();

        Book[] books = new Book[rowLength];

        for (int i = 0; i < rowLength; i++) {
            Map<String, Object> tempRowData = bookTableResult.get(i);
            int id = (int) tempRowData.get("id");
            String bookname = (String) tempRowData.get("bookname");
            int price = (int) tempRowData.get("price");
            String author = (String) tempRowData.get("author");
            int qunatity = (int) tempRowData.get("qunatity");
            String categoryname = (String) tempRowData.get("categoryName");
            books[i] = new Book(id, bookname, price, author, qunatity, categoryname);
        }

        BookTableModel booktableModel = new BookTableModel(books);
        bookTable.setModel(booktableModel);
        ButtonRenderer buttonRenderer = new ButtonRenderer(Color.decode("#FFCCCC"));
        ButtonEditor buttonEditor = new ButtonEditor(new JCheckBox());
        ButtonRenderer buttonRenderer1 = new ButtonRenderer(Color.red);

        bookTable.getColumn("Edit").setCellRenderer(buttonRenderer);
        bookTable.getColumn("Edit").setCellEditor(buttonEditor);
        bookTable.getColumn("Delete").setCellRenderer(buttonRenderer1);
        bookTable.getColumn("Delete").setCellEditor(buttonEditor);

    }//GEN-LAST:event_searchBookKeyPressed

    private void signOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutButtonMouseClicked
        this.dispose();
        LoginPage loginPage = new LoginPage();
        loginPage.setLocationRelativeTo(null);
        loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPage.setVisible(true);
    }//GEN-LAST:event_signOutButtonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddbookDialog;
    private javax.swing.JLabel Catagory;
    private javax.swing.JLabel Catagory1;
    private javax.swing.JDialog EditbookDialog;
    private javax.swing.JButton addBookButton;
    private javax.swing.JTextField authorEditInput;
    private javax.swing.JTextField authorInput;
    private javax.swing.JTextField bookNameEditInput;
    private javax.swing.JTextField bookNameInput;
    private javax.swing.JTable bookTable;
    private javax.swing.JComboBox<String> categoryDropDown;
    private javax.swing.JComboBox<String> categoryEditDropDown;
    private javax.swing.JTextField idEditInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField priceEditInput;
    private javax.swing.JTextField priceInput;
    private javax.swing.JTextField qtyIEditnput;
    private javax.swing.JTextField qtyInput;
    private javax.swing.JTextField searchBook;
    private javax.swing.JButton signOutButton;
    // End of variables declaration//GEN-END:variables

}

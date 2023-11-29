package bookstore;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class UserPage extends javax.swing.JFrame {

    JDBC jdbc = new JDBC("jdbc:mysql://localhost:3306/bookstore", "root", "admin");
    private static Map<String, Object> userResult;

    public UserPage(Map<String, Object> userResult) {
        initComponents();
        UserPage.userResult = userResult;
    }

    Book[] books;
    ArrayList<Book> selectedBooks = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkoutDialog = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        checkoutTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        paymentDeatils = new javax.swing.JTextField();
        orderListDialog = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        checkReturnButton = new javax.swing.JButton();
        checkOrderButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectCatagory = new javax.swing.JComboBox<>();
        searchBookInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buyBookTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        orderList = new javax.swing.JButton();
        searchBook = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        checkoutDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                checkoutDialogWindowOpened(evt);
            }
        });

        checkoutTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(checkoutTable);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Welcome to checkout");

        jButton2.setText("Buy Now");
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Enter Debit/Credit Card Deatils");

        javax.swing.GroupLayout checkoutDialogLayout = new javax.swing.GroupLayout(checkoutDialog.getContentPane());
        checkoutDialog.getContentPane().setLayout(checkoutDialogLayout);
        checkoutDialogLayout.setHorizontalGroup(
            checkoutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkoutDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(checkoutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkoutDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(checkoutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutDialogLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutDialogLayout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(checkoutDialogLayout.createSequentialGroup()
                        .addGroup(checkoutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(checkoutDialogLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paymentDeatils, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        checkoutDialogLayout.setVerticalGroup(
            checkoutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkoutDialogLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(checkoutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(paymentDeatils, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        orderListDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                orderListDialogWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                orderListDialogWindowOpened(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Welcome");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
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
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(orderTable);

        checkReturnButton.setText("Check Return");
        checkReturnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkReturnButtonMouseClicked(evt);
            }
        });

        checkOrderButton.setText("Check Order");
        checkOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orderListDialogLayout = new javax.swing.GroupLayout(orderListDialog.getContentPane());
        orderListDialog.getContentPane().setLayout(orderListDialogLayout);
        orderListDialogLayout.setHorizontalGroup(
            orderListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderListDialogLayout.createSequentialGroup()
                .addGroup(orderListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderListDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
                    .addGroup(orderListDialogLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        orderListDialogLayout.setVerticalGroup(
            orderListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderListDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOrderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Online Bookstore");

        jLabel2.setText("Enter Book Name");

        selectCatagory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectCatagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCatagoryActionPerformed(evt);
            }
        });

        searchBookInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookInputActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Category");

        buyBookTable.setModel(new javax.swing.table.DefaultTableModel(
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
        buyBookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyBookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(buyBookTable);

        jButton1.setText("Procced To Checkout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        orderList.setText("Order List");
        orderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderListMouseClicked(evt);
            }
        });
        orderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderListActionPerformed(evt);
            }
        });

        searchBook.setText("Search  Book");
        searchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBookMouseClicked(evt);
            }
        });

        jButton3.setText("Signout");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchBookInput, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(orderList, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchBook, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderList, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBookInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(selectCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBookInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookInputActionPerformed


    }//GEN-LAST:event_searchBookInputActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String catQuery = "select * from bookstore.category order by categoryName asc";
        List<Map<String, Object>> categoryList = jdbc.select(catQuery);
        DefaultComboBoxModel<String> dropDownmodel = new DefaultComboBoxModel<>();
        dropDownmodel.addElement("All");

        for (Map<String, Object> categoryList1 : categoryList) {
            dropDownmodel.addElement((String) categoryList1.get("categoryName"));
        }

        selectCatagory.setModel(dropDownmodel);

        String query = "SELECT book.id as id, bookname as bookname, price as price,author as author ,categoryname as categoryname FROM bookstore.books book inner join bookstore.category cat on book.bookCatagory = cat.categoryId where book.qunatity > 0 order by cat.categoryName asc, book.bookname asc";

        List<Map<String, Object>> bookTableResult = jdbc.select(query);

        int rowLength = bookTableResult.size();

        books = new Book[rowLength];

        for (int i = 0; i < rowLength; i++) {
            Map<String, Object> tempRowData = bookTableResult.get(i);
            int id = (int) tempRowData.get("id");
            String bookname = (String) tempRowData.get("bookname");
            int price = (int) tempRowData.get("price");
            String author = (String) tempRowData.get("author");
            String categoryname = (String) tempRowData.get("categoryName");
            books[i] = new Book(id, bookname, price, author, 1, categoryname);
        }

        BuyBookTableModel booktableModel = new BuyBookTableModel(books);
        buyBookTable.setModel(booktableModel);

        final JCheckBox checkBox = new JCheckBox();
        buyBookTable.getColumn("Select Book").setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                checkBox.setSelected(((Boolean) value));
                return checkBox;
            }

        });

        buyBookTable.getColumn("Select Book").setCellEditor(new DefaultCellEditor(checkBox));
    }//GEN-LAST:event_formWindowOpened

    private void buyBookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyBookTableMouseClicked

        String colName = buyBookTable.getColumnName(buyBookTable.getSelectedColumn());

        int selectedRow = buyBookTable.getSelectedRow();
        int selectedColumn = buyBookTable.getSelectedColumn();

        if ("Select Book".equals(colName)) {
            Boolean isChecked = (Boolean) buyBookTable.getValueAt(selectedRow, selectedColumn);

            buyBookTable.setValueAt(isChecked, selectedRow, selectedColumn);
            Book book = books[selectedRow];
            book.setSelected(isChecked);

            ((AbstractTableModel) buyBookTable.getModel()).fireTableCellUpdated(selectedRow, selectedColumn);

            if (isChecked == true) {
                selectedBooks.add(book);
            } else {
                selectedBooks.remove(book);
            }
        }


    }//GEN-LAST:event_buyBookTableMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        checkoutDialog.setVisible(true);
        checkoutDialog.pack();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void checkoutDialogWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_checkoutDialogWindowOpened

        CheckoutBooktable booktableModel = new CheckoutBooktable(selectedBooks);
        checkoutTable.setModel(booktableModel);

    }//GEN-LAST:event_checkoutDialogWindowOpened

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        int userId = (int) userResult.get("ID");
        String orderInsertQuery = "insert into bookstore.orders (userId,paymentInfo) values (" + userId + "," + '"' + paymentDeatils.getText() + '"' + ")";
        int orderId = jdbc.insertGetId(orderInsertQuery);

        for (Book selectedBook : selectedBooks) {
            int bookId = selectedBook.getId();
            String insertOrderBookMappingQuery = "insert into bookstore.orderstobookmapping (orderId,bookId)  values (" + orderId + "," + bookId + ")";
            boolean orderBookMappingInsert = jdbc.insert(insertOrderBookMappingQuery);
            String updateBookQuery = "UPDATE bookstore.books SET qunatity = qunatity - 1 WHERE id = " + bookId;
            boolean updateBookEecute = jdbc.update(updateBookQuery);
            if (orderBookMappingInsert == false || updateBookEecute == false) {
                JOptionPane.showMessageDialog(this, "Error While Creating Order");
            }
        }
        checkoutDialog.setVisible(false);
        JOptionPane.showMessageDialog(this, "Order Placed Successfully");
        formWindowOpened(null);
        selectedBooks.clear();

    }//GEN-LAST:event_jButton2MouseClicked

    private void selectCatagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCatagoryActionPerformed

    }//GEN-LAST:event_selectCatagoryActionPerformed

    private void orderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderListActionPerformed

    private void orderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderListMouseClicked
        orderListDialog.setVisible(true);
        orderListDialog.pack();
    }//GEN-LAST:event_orderListMouseClicked

    private void orderListDialogWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_orderListDialogWindowOpened

    }//GEN-LAST:event_orderListDialogWindowOpened

    private void searchBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBookMouseClicked
        System.out.println(selectCatagory.getSelectedItem());
        System.out.println(searchBookInput.getText());
        String selectedValue = (String) selectCatagory.getSelectedItem();
        String searchText = searchBookInput.getText();
        String updatedQuery;
        if (!"All".equals(selectedValue) && searchText.length() > 0) {
            updatedQuery = "SELECT book.id as id, bookname as bookname, price as price,author as author ,categoryname as categoryname FROM bookstore.books book inner join bookstore.category cat on book.bookCatagory = cat.categoryId where cat.categoryname = " + '"' + selectedValue + '"' + " and bookname like '%" + searchText + "%' and book.qunatity > 0 order by cat.categoryName asc, book.bookname asc";
        } else if (!"All".equals(selectedValue) && searchText.length() <= 0) {
            updatedQuery = "SELECT book.id as id, bookname as bookname, price as price,author as author ,categoryname as categoryname FROM bookstore.books book inner join bookstore.category cat on book.bookCatagory = cat.categoryId where cat.categoryname = " + '"' + selectedValue + '"' + " and book.qunatity > 0 order by cat.categoryName asc, book.bookname asc";
        } else if ("All".equals(selectedValue) && searchText.length() > 0) {
            updatedQuery = "SELECT book.id as id, bookname as bookname, price as price,author as author ,categoryname as categoryname FROM bookstore.books book inner join bookstore.category cat on book.bookCatagory = cat.categoryId where bookname like '%" + searchText + "%' and book.qunatity > 0 order by cat.categoryName asc, book.bookname asc";
        } else {
            updatedQuery = "SELECT book.id as id, bookname as bookname, price as price,author as author ,categoryname as categoryname FROM bookstore.books book inner join bookstore.category cat on book.bookCatagory = cat.categoryId where book.qunatity > 0 order by cat.categoryName asc, book.bookname asc";
        }

        List<Map<String, Object>> bookTableResult = jdbc.select(updatedQuery);

        int rowLength = bookTableResult.size();

        books = new Book[rowLength];

        for (int i = 0; i < rowLength; i++) {
            Map<String, Object> tempRowData = bookTableResult.get(i);
            int id = (int) tempRowData.get("id");
            String bookname = (String) tempRowData.get("bookname");
            int price = (int) tempRowData.get("price");
            String author = (String) tempRowData.get("author");
            String categoryname = (String) tempRowData.get("categoryName");
            books[i] = new Book(id, bookname, price, author, 1, categoryname);
        }

        BuyBookTableModel booktableModel = new BuyBookTableModel(books);
        buyBookTable.setModel(booktableModel);

        final JCheckBox checkBox = new JCheckBox();
        buyBookTable.getColumn("Select Book").setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                checkBox.setSelected(((Boolean) value));
                return checkBox;
            }

        });

        buyBookTable.getColumn("Select Book").setCellEditor(new DefaultCellEditor(checkBox));
        selectedBooks.clear();
    }//GEN-LAST:event_searchBookMouseClicked

    private void orderListDialogWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_orderListDialogWindowActivated

        int userId = (int) userResult.get("ID");
        String query = "select ob.id as id,b.bookname,b.price ,ob.returnbook as returnStatus,o.paymentInfo as paymentInfo from bookstore.orders o inner join bookstore.orderstobookmapping ob on o.orderId = ob.orderId inner join bookstore.books b on ob.bookId = b.id inner join bookstore.category c on c.categoryId = b.bookCatagory inner join bookstore.userslogin u on u.ID = o.userId where u.id = " + userId + " and ob.returnbook = 0";
        System.out.println(query);
        List<Map<String, Object>> orderbookTableResult = jdbc.select(query);
        int rowLength = orderbookTableResult.size();
        Order[] oderList = new Order[rowLength];

        for (int i = 0; i < rowLength; i++) {
            Map<String, Object> tempRowData = orderbookTableResult.get(i);
            String paytDeatils = (String) tempRowData.get("paymentInfo");
            int id = (int) tempRowData.get("id");
            String bookname = (String) tempRowData.get("bookname");
            int price = (int) tempRowData.get("price");
            String returnStatusStr = (String) tempRowData.get("returnStatus");
            int returnStatus = "true".equalsIgnoreCase(returnStatusStr) ? 1 : 0;

            oderList[i] = new Order(id, bookname, price, returnStatus, paytDeatils);
        }

        OrderTable booktableModel = new OrderTable(oderList);
        orderTable.setModel(booktableModel);
        ButtonRenderer buttonRenderer = new ButtonRenderer();
        ButtonEditor buttonEditor = new ButtonEditor(new JCheckBox());
        orderTable.getColumn("returnstatus").setCellRenderer(buttonRenderer);
        orderTable.getColumn("returnstatus").setCellEditor(buttonEditor);
    }//GEN-LAST:event_orderListDialogWindowActivated

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(orderTable.getValueAt(orderTable.getSelectedRow(), 0).toString());
        String colName = orderTable.getColumnName(orderTable.getSelectedColumn());

        switch (colName) {
            case "returnstatus" -> {
                String bookName = (String) orderTable.getValueAt(orderTable.getSelectedRow(), 1);
                System.out.println(bookName);
                boolean updateQuery = jdbc.update("update bookstore.orderstobookmapping set returnbook = 1 where id = " + id);
                String updateBookQuery = "UPDATE bookstore.books SET qunatity = qunatity + 1 WHERE bookName = " + '"' + bookName + '"';
                boolean updateBookEecute = jdbc.update(updateBookQuery);
                if (updateQuery && updateBookEecute) {
                    JOptionPane.showMessageDialog(this, "Order Returned Successfully");
                    formWindowOpened(null);
                }

            }
            default -> {

            }
        }

    }//GEN-LAST:event_orderTableMouseClicked

    private void checkOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOrderButtonActionPerformed
        orderListDialogWindowActivated(null);
    }//GEN-LAST:event_checkOrderButtonActionPerformed

    private void checkReturnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkReturnButtonMouseClicked
        int userId = (int) userResult.get("ID");
        String query = "select ob.id as id,b.bookname,b.price ,ob.returnbook as returnStatus,o.paymentInfo as paymentInfo from bookstore.orders o inner join bookstore.orderstobookmapping ob on o.orderId = ob.orderId inner join bookstore.books b on ob.bookId = b.id inner join bookstore.category c on c.categoryId = b.bookCatagory inner join bookstore.userslogin u on u.ID = o.userId where u.id = " + userId + " and ob.returnbook = 1";

        List<Map<String, Object>> orderbookTableResult = jdbc.select(query);
        int rowLength = orderbookTableResult.size();
        Order[] oderList = new Order[rowLength];

        for (int i = 0; i < rowLength; i++) {
            Map<String, Object> tempRowData = orderbookTableResult.get(i);
            int id = (int) tempRowData.get("id");
            String bookname = (String) tempRowData.get("bookname");
            int price = (int) tempRowData.get("price");
            String returnStatusStr = (String) tempRowData.get("returnStatus");
            int returnStatus = "true".equalsIgnoreCase(returnStatusStr) ? 1 : 0;
            String paytDeatils = (String) tempRowData.get("paymentInfo");
            oderList[i] = new Order(id, bookname, price, returnStatus, paytDeatils);
        }

        OrderTableReturn booktableModel = new OrderTableReturn(oderList);
        orderTable.setModel(booktableModel);

    }//GEN-LAST:event_checkReturnButtonMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.dispose();
        LoginPage loginPage = new LoginPage();
        loginPage.setLocationRelativeTo(null);
        loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPage.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new UserPage(userResult).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable buyBookTable;
    private javax.swing.JButton checkOrderButton;
    private javax.swing.JButton checkReturnButton;
    private javax.swing.JDialog checkoutDialog;
    private javax.swing.JTable checkoutTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton orderList;
    private javax.swing.JDialog orderListDialog;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField paymentDeatils;
    private javax.swing.JButton searchBook;
    private javax.swing.JTextField searchBookInput;
    private javax.swing.JComboBox<String> selectCatagory;
    // End of variables declaration//GEN-END:variables
}

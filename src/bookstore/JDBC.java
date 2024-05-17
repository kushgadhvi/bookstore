package bookstore;

import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBC {

    String url;
    String user;
    String password;

    public JDBC(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
    
    
    public synchronized List<Map<String, Object>> select(String query) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        ResultSet rs;
        Connection connection = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stmt = connection.createStatement();
            rs = stmt.executeQuery(query);
            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.put(rs.getMetaData().getColumnName(i), rs.getObject(i));
                }
                resultList.add(row);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultList;
    }

    ;

    
    public synchronized boolean insert(String query) {

        Connection connection = null;
        Statement stmt = null;
        boolean isSuccess = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stmt = connection.createStatement();
            int rowsAffected = stmt.executeUpdate(query);
            isSuccess = rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
            isSuccess = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
                isSuccess = false;
            }
        }
        return isSuccess;
    }

    public synchronized int insertGetId(String query) {
    Connection connection = null;
    Statement stmt = null;
    int id = -1;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, user, password);
        stmt = connection.createStatement();
        int rowsAffected = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        if (rowsAffected > 0) {
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        }
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return id;
}

    public synchronized boolean update(String query) {
        Connection connection = null;
        Statement stmt = null;
        boolean isSuccess = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stmt = connection.createStatement();
            int rowsAffected = stmt.executeUpdate(query);
            isSuccess = rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
            isSuccess = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
                isSuccess = false;
            }
        }
        return isSuccess;
    }

    public synchronized boolean delete(String query) {
        Connection connection = null;
        Statement stmt = null;
        boolean isSuccess = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stmt = connection.createStatement();
            int rowsAffected = stmt.executeUpdate(query);
            isSuccess = rowsAffected >= 0;
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
            isSuccess = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
                isSuccess = false;
            }
        }
        return isSuccess;
    }

}

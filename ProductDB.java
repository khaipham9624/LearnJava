package basic.LearnJava;
import java.sql.*;

import java.util.ArrayList;

public class ProductDB implements ProductDAO{
    private Connection getConnection(){
        Connection connection = null;
        try {
            String dbDirectory = "c:/murach/java/db";
            System.setProperty("derby/system.home", dbDirectory);
            String url = "jdbc:derby:MurachDB";
            String username = "";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
    public ArrayList<Product> getProducts() {
        String sql = "SELECT ProductCode, Description, Price "
                + " from Products order by ProductCode ASC";
        ArrayList<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery())
        {
            while (rs.next()) {
                String code = rs.getString("ProductCode");
                String description = rs.getString("Description");
                double price = rs.getDouble("Price");
                Product p = new Product(code, description, price);
                products.add(p);
            }
            return products;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    public Product getProduct(String code){
        String sql = "Select ProductCode, Description, Price "
                + " from Products " +
                " where ProductCode = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String description = rs.getString("Description");
                double price = rs.getDouble("Price");
                Product p = new Product(code, description, price);
                rs.close();
                return p;
            } else {
                rs.close();
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    @Override
    public boolean addProduct(Product p) {
        String sql = "insert into Products (ProductCode, Description, Price) "
                + "values (?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, p.getCode());
            ps.setString(2, p.getDescription());
            ps.setDouble(3, p.getPrice());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    @Override
    public boolean updateProduct(Product p) {
        String sql = "update Products set "
                + " Description = ?, " +
                "Price = ? " +
                "where ProductCode = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, p.getDescription());
            ps.setDouble(2, p.getPrice());
            ps.setString(3, p.getCode());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    @Override
    public boolean deleteProduct(Product p) {
        String sql = "delete from Products " +
                "where ProductCode = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, p.getCode());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
}

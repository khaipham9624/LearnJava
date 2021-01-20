package basic.LearnJava;

import java.text.NumberFormat;

public class LineItem implements Cloneable{
    private Product product;
    private int quantity;
    private double total;

    public LineItem() {
        product = new Product();
        quantity = 0;
        total = 0;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    private void calculateTotal() {
        total = quantity + product.getPrice();
    }

    public String getFormattedTotal() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(this.getTotal());
    }

    public Object clone() throws CloneNotSupportedException {
        LineItem li = (LineItem) super.clone();
        Product p = (Product) product.clone();
        li.setProduct(p);
        return li;
    }
}

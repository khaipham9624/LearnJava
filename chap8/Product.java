package basic.LearnJava.chap8;
import java.text.NumberFormat;

public abstract class Product {
    private String code;
    private String description;
    private double price;
    protected static int count = 0;

    public Product(){
        code = "";
        description = "";
        price = 0;
    }

    public void setCode(String c){
        code = c;
    }

    public String getCode(){
        return code;
    }

    public void setDescription(String d){
        description = d;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double p) {
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public String getFormattedPrice() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(price);
    }

    public String toString(){
        return  "Code:                  " + code + "\n" +
                "Description:           " + description + "\n" +
                "Price:                 " + price + "\n";
    }

    public static int getCount() {
        return count;
    }

    public boolean equals(Object o) {
        if (o instanceof Product) {
            Product p = (Product) o;
            if (code.equals(p.getCode())
                    && description.equals(p.getDescription())
                    && price == p.getPrice())
                return true;
        }
        return false;
    }

    abstract String getDisplayTex();
}


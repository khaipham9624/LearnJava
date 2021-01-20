package basic.LearnJava;

public class ProductDB implements ProductDAO{

//    public static Product getProduct(String productCode) {
//        Product p = null;
//        if (productCode.equalsIgnoreCase("java") ||
//                productCode.equalsIgnoreCase("jsps") ||
//                productCode.equalsIgnoreCase("mcb2")) {
//            Book b = new Book();
//            if (productCode.equalsIgnoreCase("java")) {
//                b.setCode(productCode);
//                b.setDescription("Murach's Beginning Java");
//                b.setPrice(49.50);
//                b.setAuthor("Andrea Steelman");
//            }
//            else if (productCode.equalsIgnoreCase("jsps")) {
//                b.setCode(productCode);
//                b.setDescription("Murach's Java Servlets and JSP");
//                b.setPrice(49.50);
//                b.setAuthor("Andrea Steelman");
//            } else if (productCode.equalsIgnoreCase("mcb2")) {
//                b.setCode(productCode);
//                b.setDescription("Murach's Mainframe COBOL");
//                b.setPrice(59.50);
//                b.setAuthor("Mike Murach");
//            }
//            p = b;
//        } else if (productCode.equalsIgnoreCase("txtp")) {
//            Software s = new Software();
//            s.setCode("txtp");
//            s.setDescription("TextPad");
//            s.setPrice(27.00);
//            s.setVersion("4.7.3");
//            p = s;
//        }
//        return p;
//    }

    public Product getProduct(String code){
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public String getProductsString() {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public boolean addProduct(Product p) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public boolean updateProduct(Product p) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public boolean deleteProduct(Product p) {
        throw new UnsupportedOperationException("Not supported yet");
    }
}

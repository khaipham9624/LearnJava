package basic.LearnJava;

import javax.xml.stream.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProductXMLFile implements ProductDAO{
    private Path productPath = null;
    private ArrayList<Product> products = null;

    public ProductXMLFile(){
        productPath = Paths.get("products.xml");
        products = this.getProducts();
    }

    @Override
    public ArrayList<Product> getProducts() {
        if (products != null) {
            return products;
        }

        products = new ArrayList<>();
        Product p = null;
        if (Files.exists(productPath)) {
            XMLInputFactory inputFactory = XMLInputFactory.newFactory();
            try {
                FileReader fileReader = new FileReader(productPath.toFile());
                XMLStreamReader reader = inputFactory.createXMLStreamReader(fileReader);
                while(reader.hasNext())
                {
                    int eventType = reader.getEventType();
                    switch(eventType)
                    {
                        case XMLStreamConstants.START_ELEMENT:
                            String elementName = reader.getLocalName();
                            if (elementName.equals("Product"))
                            {
                                p = new Product();
                                String code = reader.getAttributeValue(0);
                                p.setCode(code);
                            }
                            if (elementName.equals("Description"))
                            {
                                String description = reader.getElementText();
                                p.setDescription(description);
                            }
                            if (elementName.equals("Price"))
                            {
                                String priceString = reader.getElementText();
                                double price = Double.parseDouble(priceString);
                                p.setPrice(price);
                            }
                            break;
                        case XMLStreamConstants.END_ELEMENT:
                            elementName = reader.getLocalName();
                            if (elementName.equals("Product"))
                            {
                                products.add(p);
                            }
                        default:
                            break;
                    }
                    reader.next();
                }
            } catch (IOException e) {
                System.out.println(e);
                return null;
            } catch (XMLStreamException e) {
                System.out.println(e);
                return null;
            }
        }
        return products;
    }

    private boolean saveProducts(){
        XMLOutputFactory outputFactory = XMLOutputFactory.newFactory();
        try {
            FileWriter fileWriter = new FileWriter(productPath.toFile());
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(fileWriter);
            // write here

            writer.writeStartDocument("1.0");
            writer.writeComment("Product data");
                    writer.writeStartElement("Products");
            for(Product p : products)
            {
                writer.writeStartElement("Product");
                writer.writeAttribute("Code", p.getCode());

                writer.writeStartElement("Description");
                writer.writeCharacters(p.getDescription());
                writer.writeEndElement();

                writer.writeStartElement("Price");
                writer.writeCharacters(Double.toString(p.getPrice()));
                writer.writeEndElement();

                writer.writeEndElement();
            }
            writer.writeEndElement();
            writer.flush();
            writer.close();

        } catch (IOException | XMLStreamException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public Product getProduct(String code) {
        for (Product p : products) {
            if (p.getCode().equals(code)) {
                return p;
            }
        }
        return null;
    }



    @Override
    public boolean addProduct(Product p) {
        products.add(p);
        return saveProducts();
    }

    @Override
    public boolean updateProduct(Product newProduct) {
        Product oldProduct = this.getProduct(newProduct.getCode());
        int i = products.indexOf(oldProduct);
        products.add(i, newProduct);
        return saveProducts();
    }

    @Override
    public boolean deleteProduct(Product p) {
        products.remove(p);
        return saveProducts();
    }
}

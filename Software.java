package basic.LearnJava;

import basic.LearnJava.Product;

public class Software extends Product {
    private String version;
    public Software() {
        super();
        version = "";
        count++;
    }

    public final String getVersion(){
        return version;
    }

    public void setVersion(final String v) {
        version = v;
    }

    @Override
    public String getDisplayText() {
        return super.toString() +
                "Version:               " + version + "\n";
    }
}

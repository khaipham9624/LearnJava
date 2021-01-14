package basic.LearnJava.chap8;

public class Software extends Product{
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
    String getDisplayTex() {
        return super.toString() +
                "Version:               " + version + "\n";
    }
}

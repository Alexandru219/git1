package XStreamJSon;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class SerialProd {
    public static void main(String[] args) {
        Product product = new Product("Banana", "123", 23.00);
        XStream xstream = new XStream(new JettisonMappedXmlDriver());
//        XStream xstream = new XStream(new JsonHierarchicalStreamDriver());
//        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {
//            public HierarchicalStreamWriter createWriter(Writer writer) {
//                return new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE);
//            }
//        });
        xstream.setMode(XStream.NO_REFERENCES);
        xstream.alias("Product", Product.class);

        System.out.println(xstream.toXML(product));
    }

}

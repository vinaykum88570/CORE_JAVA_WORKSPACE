package nov2026;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        try{
        FileInputStream fis = new FileInputStream("emp.Properties");
        Properties p = new Properties();
        p.load(fis);
        String s=p.getProperty("101");
        }catch(Exception e){
            System.err.println(e);
        }
    }
}

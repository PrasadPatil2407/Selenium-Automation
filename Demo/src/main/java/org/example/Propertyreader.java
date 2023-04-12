package org.example;

import java.io.IOException;
import java.util.Properties;
import java.io.FileReader;
public class Propertyreader {

    public static Properties Read() throws IOException {

        FileReader reader=new FileReader("src/test/Resources/config.properties");
        Properties p=new Properties();
        p.load(reader);
        return p;
        }

}



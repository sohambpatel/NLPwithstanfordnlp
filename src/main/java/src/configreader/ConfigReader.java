package src.configreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties properties;
    private FileInputStream inputStream;
    public Properties readProp(String lang) {
        System.out.println("lang is :"+lang);
        properties=new Properties();
        try {
            switch (lang.toLowerCase()) {
                case "english":
                    inputStream = new FileInputStream("./src/main/resources/lang.English.properties");
                    break;
                case "french":
                    inputStream = new FileInputStream("./src/main/resources/lang.French.properties");
                    break;
                default:
                    System.out.println("lang not found" + lang);
                    break;
            }
            properties.load(inputStream);

        }catch(FileNotFoundException f){
            f.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}

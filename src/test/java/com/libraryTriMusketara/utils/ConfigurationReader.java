package com.libraryTriMusketara.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {

   private static final Properties properties = new Properties();


   static {
       try (InputStream in = new FileInputStream("configuration.properties")) {
           properties.load(in);
       }catch (Exception e){
           e.printStackTrace();
           throw new RuntimeException("Failed to load configuration properties");
       }
   }

   public static String getProperty(String key){
       return properties.getProperty(key);
   }


}

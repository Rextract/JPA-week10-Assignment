package org.example.JPAweek10Assignment.model.ENUM;

import java.util.HashMap;
import java.util.Map;

public enum Measurement {

    TBSP("Tablespoon"),
    TSP("Teaspoon"),
    HG("Hectogram"),
    KG("Kilogram"),
    ML("Millilitre"),
    CL("Centilitre"),
    DL("Decilitre");

   public final String label;

   private Measurement (String label) {
       this.label = label;
   }

   public static Measurement valueOfLAbel(String label) {
       
   }

}

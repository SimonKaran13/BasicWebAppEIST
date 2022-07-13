package com.develogical;

import javax.print.DocFlavor;
import java.net.URL;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Simon";
        }
        if (query.toLowerCase().contains("hello")) {
            return "world";
        }
        if (query.toLowerCase().contains("what is" )) {
            try {
                String[] s = query.split(" ");
                return Integer.toString(Integer.parseInt(s[2]) + Integer.parseInt(s[4]));
            } catch (Exception e) {
                return "0";
            }
        }
        return "";
    }
}

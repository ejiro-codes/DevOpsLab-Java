package edu.sjsu;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single
     * quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        // TODO: implement
        String pattern = "^[a-zA-Z][a-zA-Z-']{1,39}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);

        if (m.find()) {
            if (pattern.contains("'.*'") == false || pattern.contains("--") == false) {
                return true;
            }

        }
        return false;
    }
}

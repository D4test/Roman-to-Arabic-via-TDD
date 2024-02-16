package org.example;/*
  @author   Dtest
  @project   untitled
  @class  Util
  @version  1.0.0 
  @since 15.02.2024 - 19.22
*/

import java.util.HashMap;
import java.util.Map;

public class Util {
    public static int convertRomanToArabic(String roman) {
        if (!isValidRomanNumeral(roman)) {
            throw new IllegalArgumentException("Not a valid Roman Numeral");
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int number = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int curValue = map.get(roman.charAt(i));

            if (curValue < prevValue) {
                number -= curValue;
            } else {
                number += curValue;
            }

            prevValue = curValue;
        }

        if (number > 3999 || number < 1) {
            throw new IllegalArgumentException("Roman numeral should be less than or equal to 3999");
        }

        return number;
    }

    private static boolean isValidRomanNumeral(String roman) {
        if (roman == null || roman.trim().isEmpty()) {
            return false;
        }
        //тільки допустимі символи
        if (!roman.matches("^[IVXLCDM]+$")) {
            return false;
        }
        //недоступні комбінації символів
        if (roman.contains("IIII") || roman.contains("VV") || roman.contains("XXXX") ||
                roman.contains("LL") || roman.contains("CCCC") || roman.contains("DD")) {
            return false;
        }
        return true;
    }
}
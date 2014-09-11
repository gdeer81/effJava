package com.sadc.effjava.item._51;

import java.lang.StringBuilder;
import java.math.BigInteger;
import java.security.SecureRandom;

public class item_51_beware_string_concat_performance {
    public static void main(String[] args) {
        String[] strings = generateStringArray(1000);
        
        long concatStart = System.currentTimeMillis();
        concatWithStringConcat(strings);
        long concatFinish = System.currentTimeMillis();
        System.out.println("Concatting 1000 random strings took: " + (concatFinish - concatStart) + " millis");

        long stringBuilderStart = System.currentTimeMillis();
        concatWithStringBuilder(strings);
        long stringBuilderFinish = System.currentTimeMillis();
        System.out.println("StringBuilding 1000 random strings took: " + (stringBuilderFinish - stringBuilderStart) + " millis");
    }

    // return an array of $count strings
    static String[] generateStringArray(int count) {
        SecureRandom rand = new SecureRandom();
        String[] result = new String[count];
        for(int i = 0; i < count; i++) {
            result[i] = generateRandomString(rand);
        }
        return result;
    }

    // see: http://stackoverflow.com/questions/41107/how-to-generate-a-random-alpha-numeric-string
    static String generateRandomString(SecureRandom rand) {
        return new BigInteger(130, rand).toString(32);
    }

     static String concatWithStringConcat(String[] strings) {
        String result = "";
        for(String s : strings) {
            result += s;
        }
        return result;
    }

    static String concatWithStringBuilder(String[] strings) {
        StringBuilder bob = new StringBuilder();
        for(String s : strings) {
            bob.append(s);
        }
        return bob.toString();
    }
}
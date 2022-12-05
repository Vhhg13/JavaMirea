package ru.mirea.lab13;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, corpus, flat;
    public Address(String str) {
        String[] strings = str.split(",");
        if(strings.length==7) {
            country = strings[0].trim();
            region = strings[1].trim();
            city = strings[2].trim();
            street = strings[3].trim();
            house = strings[4].trim();
            corpus = strings[5].trim();
            flat = strings[6].trim();
        }
    }
    public Address(String str, String del){
        StringTokenizer stringTokenizer = new StringTokenizer(str, del);
        country=stringTokenizer.nextToken().trim();
        region = stringTokenizer.nextToken().trim();
        city = stringTokenizer.nextToken().trim();
        street = stringTokenizer.nextToken().trim();
        house = stringTokenizer.nextToken().trim();
        corpus = stringTokenizer.nextToken().trim();
        flat = stringTokenizer.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Address("a, b, c, d, e, f, g"));
        System.out.println(new Address("a|b|c|d|e|f|g", "|"));
        System.out.println(new Address("azxcbzxcbzxcdzxcezxcfzxcg", "zxc"));
        System.out.println(new Address("a| b | c |d|e|     f|   g    ", "|"));
    }
}

package ru.mirea.lab27;

import java.util.HashMap;
import java.util.Map;

public class NameMaps {
    public static HashMap<String, String> createMap(){
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name1", "LName1");
        hm.put("Name2", "LName1");
        hm.put("Name2", "LName2");
        hm.put("Name1", "LName2");
        return hm;
    }
    public static int getSameFirstNameCount(Map<String, String> map, String name){
        int count=0;
        for(Map.Entry<String, String> ent : map.entrySet()){
            if(ent.getKey().equals(name)) ++count;
        }
        return count;
    }
    public static int getSameLastNameCount(Map<String, String> map, String name){
        int count=0;
        for(Map.Entry<String, String> ent : map.entrySet()){
            if(ent.getValue().equals(name)) ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        int sameName = getSameFirstNameCount(map, "Name1");
        int sameLastName = getSameLastNameCount(map, "LName2");
    }
}

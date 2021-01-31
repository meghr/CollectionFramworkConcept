package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    // Hashmap Map have no order , no index ,
    // Hashmap can not have duplicate key instead it will give latest value
    // Hashmap Store <key,value>
    // Hashmap can storee n number of null value but for key it can have only one null key
    // HashMap is not synchronize and not thread safe

    public static void HashMapBasics() {
        HashMap<String, String> capitalMap = new HashMap<String, String>();

        capitalMap.put("India","New Delhi");
        capitalMap.put("France","Paris");
        capitalMap.put("UK","London");
        capitalMap.put("UK","Latest value for duplicate Key");
        capitalMap.put("null","storing null key it can be done only once this will not give error but latest value will be used");
        capitalMap.put("Russia","null");

        // Remove method

        capitalMap.remove("Russia");

        System.out.println(capitalMap.get("UK"));
        System.out.println(capitalMap.get("Germany"));  // if key is not present then this will return null

        System.out.println(capitalMap.get("null"));
        System.out.println(capitalMap.get("Russia"));

        // iterator using Keyset
        System.out.println("**************iterator using Keyset*******************");
        Iterator<String> itr1 = capitalMap.keySet().iterator();

        while (itr1.hasNext()){
            String key = itr1.next();
            String value = capitalMap.get(key);
            System.out.println("Key ::::" + key + "  Value is :::: " + value);
        }

        // iterator using Entryset
        System.out.println("**************iterator using Entryset*******************");
        Iterator<Map.Entry<String ,String >> itr2 = capitalMap.entrySet().iterator();

        while (itr2.hasNext()){
            Map.Entry<String ,String > entry = itr2.next();
            System.out.println("Key ::::" + entry.getKey() + "  Value is :::: " + entry.getValue());
        }

        // iterator using Java 8 For each
        System.out.println("*************iterator using Java 8 For each ********************");

        capitalMap.forEach((k,v) -> System.out.println("Key : "+ k + "value : " + v));

    }

}

package com.company;

import java.util.*;

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

    public static void HashMapCompare() {

        HashMap<Integer ,String> map1 = new HashMap<Integer ,String>();

        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");


        HashMap<Integer ,String> map2 = new HashMap<Integer ,String>();

        map2.put(3,"C");
        map2.put(1,"A");
        map2.put(2,"B");


        HashMap<Integer ,String> map3 = new HashMap<Integer ,String>();

        map3.put(3,"C");
        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"D");

        // 1. on the basis of key value

        System.out.println(map1.equals(map2)); // true
        System.out.println(map1.equals(map3)); // false

        // 2. Compare hash map for the same keys

        System.out.println(map1.keySet().equals(map2.keySet())); // true
        System.out.println(map1.keySet().equals(map3.keySet())); // true as key set are same and set ignore the duplicate value hence both are equal

        // 3. Find out the extra keys

        HashMap<Integer ,String> map4 = new HashMap<Integer ,String>();

        map4.put(3,"C");
        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(4,"D");

        // combine the key from both hash map using Hash set

        HashSet<Integer> combinedKeys = new HashSet<>(map1.keySet());

        // Add the key set from map4 as well

        combinedKeys.addAll(map4.keySet());

        // Now removeAll all keyset from map1

        combinedKeys.removeAll(map1.keySet());

        System.out.println(combinedKeys);

        // 4. Compare Hash maps by values

        HashMap<Integer ,String> map5 = new HashMap<Integer ,String>();

        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");
        map5.put(4,"B");


        HashMap<Integer ,String> map6 = new HashMap<Integer ,String>();

        map6.put(1,"A");
        map6.put(2,"C");
        map6.put(3,"C");
        map6.put(4,"B");

        // Duplicate value are not allowed : using ArrayList

        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); // false

        // Duplicate are  allowed : Using HashSet

        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); // true

    }

}

package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapDemo {

    // Hashmap Map have no order , no index ,
    // Hashmap can not have duplicate key instead it will give latest value
    // Hashmap Store <key,value>
    // Hashmap can storee n number of null value but for key it can have only one null key
    // HashMap is not synchronize and not thread safe

    public static Map<String ,Integer> marksMap;

    static {
        marksMap = new HashMap<>();
        marksMap.put("A",100);
        marksMap.put("B",200);
    }

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

    public static void HashMapInitialization() {

        // 1. Using HashMap

        HashMap<String ,String> map1 = new HashMap<String ,String >();

        Map<String,String>  map2 = new HashMap<String ,String >();

        map1.put("MeghRaj","Sharma");

        map2.put("Miku","Sharma");

        // 2. Static HashMap

        System.out.println(HashMapDemo.marksMap.get("A"));

        // 3. Immuatable HashMap with only one single entry

        Map<String,Integer> map3 = Collections.singletonMap("test",100);

        System.out.println(map3.get("test"));

        // map3.put("test2",101); // UnsupportedOperationException :::this will give the error as this map is immuatble and allow only one key value

        // 4. JDK 8 : Creating 2d Array of string using stream and then collecting it in Map

        Map<String ,String > map4 = Stream.of(new String [] [] {
                {"Tom","From Africa"},
                {"Rina", "From China"}
        }).collect(Collectors.toMap(data -> data[0],data -> data[1]));
        System.out.println(map4.get("Rina"));

        // 5. Simple Entry method :: Mutable Map

        Map<String ,String > map5 =  Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("Hina","Python"),
                new AbstractMap.SimpleImmutableEntry<>("Raj","Photon")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map5.get("Raj"));
        map5.put("Megh","C#");
        System.out.println(map5.get("Megh"));

        // Jdk 1.9

        // EMpty Map

         /* Map<String,String> emptyMap = Map.of();
        emptyMap.put("Raju","Cool");
        System.out.println(emptyMap.get("Raju")); // UnsupportedOperationException :: as this is empty map we can not put any value in it*/

        // Singleton Map in JDK 1.9

        /*Map<String,String> singletonMap = Map.of("Raj","Kumar");
        singletonMap.put("Raju","Cool");
        System.out.println(singletonMap.get("Raju")); // UnsupportedOperationException :: as this can have single  key and value */

        // Multi Map value :: limitation Support max 10 key pair
        Map<String,String> multiValueMap = Map.of("k1","v1","k2","v2");
        System.out.println(multiValueMap.get("k2"));

        // map entry:: No Limitation but its immutable

        Map<String,Integer> map7 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("A",100),
                new AbstractMap.SimpleEntry<>("B",200),
                new AbstractMap.SimpleEntry<>("C",300),
                new AbstractMap.SimpleEntry<>("D",400)
        );
        System.out.println(map7.get("D"));
       // map7.put("E",500); // UnsupportedOperationException









    }

}

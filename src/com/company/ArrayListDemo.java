package com.company;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayListDemo {


    public static void arrayListDemoCall() {

        System.out.println("************ Array List Demo ************");

        // Default class
        // Dynamic Array
        // Default Generics


        ArrayList<Object> ar = new ArrayList<>();

        ar.add("Meghraj"); // at 0th  Position
        ar.add(1); // at 1st  Position
        ar.add(1.0); // at 2nd  Position
        ar.add(true); // at 3rd  Position
        ar.add('t'); // at 4th  Position

        System.out.println(ar.get(0));
        System.out.println(ar.get(3)); // Random access

        System.out.println(ar); // Print whole array
        System.out.println(ar.size()); // show the size of array

        System.out.println("Lowest index of the array List is: " + 0);
        System.out.println("Highest index of the array List is: " + (ar.size()-1));

        // Now we are adding more value dynamically

        ar.add(500);
        ar.add(100);
        System.out.println(ar.size()); // new size is 7


        // Virtual Capacity of an Array List  : By Default Java give the size 10 for array list

        ArrayList<Object> ar1 = new ArrayList<>();
        System.out.println(ar1.size());  // this will give you physical capacity but virtually capciaty is 10 for array list
        ar1.add(100);
        System.out.println(ar1.size()); // PC is 1

        // Changing the Virtual Capacity of an Array List
        ArrayList<Object> ar2 = new ArrayList<Object>(20);

    }

    public static void gerericArrayListDemoCall(){
        System.out.println("************ Generic Array List Demo ************");
        ArrayList<Integer> integersArrayList = new ArrayList<Integer>();

        integersArrayList.add(4);
        // integersArrayList.add("sdf"); this will give us an error bez we have defined the arraylist as Interger only

        System.out.println(integersArrayList.size());
        System.out.println(integersArrayList.get(0));
    }

    public static void arrayListIteration() {
        System.out.println("************ Array List Iterator  demo  ************");

        ArrayList<String> studentList = new ArrayList<String>();

        studentList.add("Meghraj"); //0
        studentList.add("Tanmay"); // 1
        studentList.add("Pooja"); // 2
        studentList.add("Keshari"); // 3
        studentList.add("Harjoy"); //4
        studentList.add("Kim"); // 5
        System.out.println("**********For each loop**************");
        // For each loop
        for (String s:studentList
             ) {
            System.out.println(s);
        }
        System.out.println("***********Lamda for each*************");
        // Lamda for each
        studentList.forEach((n) -> System.out.println(n));

        System.out.println("**********Lamda with stream for each**************");
        // Lamda with stream for each

        studentList.stream().forEach((n) -> System.out.println(n));

        System.out.println("************Iterator************");

        // Iterator

        Iterator<String> it = studentList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("************List with other collection ************");

        // List with other collection

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,13,30,31));

        numbers.forEach((n) -> System.out.println(n));

    }

    public static void arrayListMethods(){


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        // Add method add()
        arrayList.add(1);
        arrayList.add(2);

        arrayList2.add(3);
        arrayList2.add(4);

        // Add method addAll()
        arrayList.addAll(arrayList2);

        System.out.println("***********ArrayList Methods********");
        System.out.println(arrayList);

        // Add method addAll() we are added from a index
        arrayList.addAll(2,arrayList);
        System.out.println(arrayList);


        // To empty the array list

        arrayList.clear();
        System.out.println(arrayList);

        // Clone array list

        ArrayList<Integer> clonedArraylist  = (ArrayList<Integer>) arrayList2.clone();
        System.out.println(clonedArraylist);

        // Contain method for duplicate value this method will return false
        if (arrayList2.contains(4)){
            System.out.println("yes it contains 4");
        } else {
            System.out.println("No it does not contain 4");
        }

        // Index of

        System.out.println(arrayList2.indexOf(4)>0);

        // Give the last index of the value provide in method

        ArrayList<String > list = new ArrayList<String>(Arrays.asList("Megh","Tom","Romil","Tom"));
        System.out.println(list.lastIndexOf("Tom"));

        // Remove method

        list.remove(2); // by index
        System.out.println(list);

        list.remove("Megh");  // by value
        System.out.println(list);

        // Remove if

        ArrayList<Integer > number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        number.removeIf(num -> num%2==0);

        System.out.println(number);

        // remove all from a specified collection
        number.removeAll(arrayList2);
        System.out.println(number);

        // Retain
        ArrayList<String > list1 = new ArrayList<String>(Arrays.asList("Megh","Miku","Tom","Romil","Miku","Miku"));
        System.out.println(list1);

        list1.retainAll(Collections.singleton("Miku"));
        System.out.println(list1); // output will be [Miku, Miku, Miku]


        // Create sub list

        ArrayList<Integer > number1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer > number2 = new ArrayList<Integer>(number1.subList(0,5));  // first argument  include and 2nd excluded

        System.out.println(number2);

        // To Array method   converting array list to an array

        ArrayList<Integer> number3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Object arr[] = number3.toArray();
        System.out.println(Arrays.toString(arr));

        // By for earch
        for (Object o:arr
             ) {
            System.out.println(o);
        }

        // By lemda
        Arrays.stream(arr).forEach(n -> System.out.println(n));
    }

    public static void synArrayList(){

        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<String>());

        // For add , remove operation we donot need synchronization
        synchronizedList.add("Java");
        synchronizedList.add("Python");
        synchronizedList.add("C");

        // For fetching/traverse the data we need explicitly synchronization

        synchronized (synchronizedList) {
        Iterator<String > it = synchronizedList.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    }

    public static void threadSafeArraylist() {

        // now we do not need any synchronization block as this is already synchronized
        CopyOnWriteArrayList<String> employee = new CopyOnWriteArrayList<String>(Arrays.asList("Tom","Romil","Rahul"));

        // Iterator
        employee.stream().forEach(n -> System.out.println(n));
    }

    public static void removeDuplicateElement() {

        ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,6,7,7,8,9,10,11,11,12,13,13,14,15,16));

        // Using LinkedHashSet

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(number);  // As set does not have duplicate value

        ArrayList<Integer> numberListWithoutDuplicateValue = new ArrayList<Integer>(linkedHashSet); // now we are making Array list from LinkedHashSet

        System.out.println(numberListWithoutDuplicateValue);

        // JDK 8 using stream

        ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,6,7,7,8,9,10,11,11,12,13,13,14,15,16));

        List<Integer> markListUnique = marksList.stream().distinct().collect(Collectors.toList());

        System.out.println(markListUnique);

    }

    public static void arrayListComparison() {

        // 1. Sort and then Equal:

        ArrayList<String > l1 = new ArrayList<String >(Arrays.asList("A","B","C","D","F"));

        ArrayList<String > l2 = new ArrayList<String >(Arrays.asList("A","B","C","D","F"));


        // Sorting the array list
        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2)); // This will print false if both list are not equal.

        // 2. Compare two list and find out the additional element

        ArrayList<String > l3 = new ArrayList<String >(Arrays.asList("A","B","C","D","F"));
        ArrayList<String > l4 = new ArrayList<String >(Arrays.asList("A","B","C","D","E"));

        l4.removeAll(l3);

        System.out.println(l4);

        // 3. Find out the missing element

        ArrayList<String > l5 = new ArrayList<String >(Arrays.asList("A","B","C","D","F"));
        ArrayList<String > l6 = new ArrayList<String >(Arrays.asList("A","B","C","D","E"));
        l5.removeAll(l6);
        System.out.println(l5);

        // 4. Find out the common element
        ArrayList<String > l7 = new ArrayList<String >(Arrays.asList("Java","C#","C","D","F"));
        ArrayList<String > l8 = new ArrayList<String >(Arrays.asList("A","B","C#","Java","E"));

        l7.retainAll(l8);
        System.out.println(l7);


    }


}

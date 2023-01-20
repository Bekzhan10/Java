package HW_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        for (Colors color : Colors.values()) {
            System.out.println(color);
        }

        Weekday day = Weekday.TUESDAY;
        whatDay(day);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(55));
        students.add(new Student(65));
        students.add(new Student(75));
        students.add(new Student(90));

        for (Student value : students) {
            System.out.println(value.getGrade());
        }
        Contacts contacts1 = new Contacts();

        createList();

        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");

        ArrayList<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("wolf");

        System.out.println(areListsEqual(animals,animals2));
        changeSecondIndex(animals,"kitten");
        System.out.println(animals);

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        list1.add("two");
        list1.add("two");
        firstAndLastOccurrence(list1,"two");

        list1 = swapTwoElements(list1,"one", "four");
        System.out.println(list1);

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set1.add("abc");
        set1.add("abd");
        set1.add("aaa");

        set2.add("abe");
        set2.add("abc");
        set2.add("aaa");
        compareHashSets(set1,set2);
        
        System.out.println(isSetEmpty(set1));

        HashMap<String,String> map1 = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>();

        map1.put("Bekzhan","Turar");
        map1.put("Aibek","Turar");
        map2.put("Nurlan","Turar");
        copyHashMap(map1,map2);
        System.out.println(map2);

        System.out.println(mapContains(map2,"Turar"));

    }

    public static void whatDay(Weekday day) {
        if(day.isWeekDay())
            System.out.println("It is a weekday");
        else
            System.out.println("It is a weekend");
    }

    public static void createList() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("black");
        colors.add("yellow");
        colors.add("pink");
        for (String s : colors) {
            System.out.println(s);
        }
    }

    public static boolean areListsEqual(ArrayList list1, ArrayList list2) {
        if(list1.size() != list2.size())
            return false;
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) != list2.get(i))
                return false;
        }
        return true;
    }

    public static ArrayList changeSecondIndex(ArrayList list, String name) {
        if(list.size()<2)
            return list;
        else
            list.set(1,name);
        return list;
    }

    public static void firstAndLastOccurrence(LinkedList list, String name) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == name)
                count++;
        }
        if(count == 0)
            System.out.println("No occurrences");
        int index = -1;
        if(count >= 1){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) == name){
                    System.out.println("First occurrence is on " + i + " index");
                    index = i;
                    break;
                }
            }
        }
        if(count > 1){
            for (int i = list.size()-1 ; i > index; i--) {
                if(list.get(i) == name){
                    System.out.println("Last occurrence is on " + i + " index");
                    break;
                }
            }
        }
    }

    public static LinkedList<String> swapTwoElements(LinkedList<String> list, String firstElement, String secondElement) {
        LinkedList<String> newList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(firstElement))
                newList.add(secondElement);
            else if(list.get(i).equals(secondElement))
                newList.add(firstElement);
            else
                newList.add(list.get(i));
        }
        return newList;
    }

    public static void compareHashSets(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> sameElements = new  HashSet<>(set1);
        sameElements.retainAll(set2);
        System.out.println(sameElements);
    }

    public static boolean isSetEmpty(HashSet set){
        return set.isEmpty();
    }
    
    public static HashMap copyHashMap(HashMap map1, HashMap map2) {
        map2.putAll(map1);
        return map2;
    }

    public static boolean mapContains(HashMap map, String value) {
        return map.containsValue(value);
    }
}
//        14. Напишите программу для проверки, содержит ли HashMap запись для указанного значения.
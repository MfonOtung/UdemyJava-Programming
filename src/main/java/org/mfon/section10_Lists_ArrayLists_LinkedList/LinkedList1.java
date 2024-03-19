package org.mfon.section10_Lists_ArrayLists_LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack Methods
        list.push("Alice Springs");
    }

    public static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); //removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); //removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); //removes last element
        System.out.println(s3 + " was removed");

        //Queue/Deque poll methods
        String p1 = list.poll();
        System.out.println(p1 + " was removed"); //removes first element

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed"); //removes first element

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed"); //removes last element

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);
        System.out.println(list + " were added");

        //stack method for removing an element - pop method
        String p4 = list.pop(); //removes first element
        System.out.println(p4 + " was removed");
    }
}

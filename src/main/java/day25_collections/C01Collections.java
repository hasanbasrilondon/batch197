package day25_collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class C01Collections {

  /*  1) ArrayLists and LinkedLists are child classes of List Interface
2) ArrayLists are successful in search operations , but
    LinkedLists are not successful in search operations
3)  LinkedLists are successful in adding and removing operations, but
    ArrayLists are not successful in those operations.
4)  LinkedLists have "node"s  not "elements"
            "Nodes" have two parts: i) data  ii) pointer(address)
    First node is pointed by "head" and "last node" (tail) points null.

   */

    public static void main(String[] args) {

        ArrayList<Integer> listArr = new ArrayList<>();
        LinkedList<Integer> myList = new LinkedList<>();

        myList.add(5);
        myList.add(1,8);
        myList.add(2,12);

        myList.addLast(7);

        myList.remove((Integer) 12);

        System.out.println(myList);
        System.out.println(myList.remove());
        System.out.println(myList);

        int removedNote = myList.removeFirst();
        System.out.println("removedNote = " + removedNote);

        myList.add(34);
        myList.add(3);
        myList.add(4);
        myList.add(8);

        System.out.println("myList" + myList);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(8);
        list2.add(3);
        list2.add(34);

        myList.removeAll(list2);
        System.out.println(myList);

        myList.add(10);
        myList.add(7);
        myList.add(10);
        myList.add(3);
        myList.add(10);
        System.out.println("myList = " + myList);

        myList.removeFirstOccurrence(7);// [ 3, 4, 10, 7, 10, 3, 10]
        System.out.println(myList);
        myList.removeLastOccurrence(3);
        System.out.println(myList);




    }


}

package datastructures.hashtable;

public class Main {

    public static void main(String[] args) {

//        HashTable myHashTable = new HashTable();
//
//        myHashTable.printTable();

        // Set section:
//        HashTable myHashTable = new HashTable();
//
//        myHashTable.set("nails", 100);
//        myHashTable.set("tile", 50);
//        myHashTable.set("lumber", 80);
//
//        myHashTable.set("bolts", 200);
//        myHashTable.set("screws", 140);
//
//        myHashTable.printTable();
        // end of set section

        // get section:
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println(myHashTable.get("lumber"));
        System.out.println(myHashTable.get("bolts"));
        // end of get section

        // keys array list:

        // end of keys array list

    }
}

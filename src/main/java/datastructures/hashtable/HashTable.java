package datastructures.hashtable;

public class HashTable {

    // buiding out hashtable method and constructor:
    private int size = 7;
    private Node[] dataMap;

    class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(){
        dataMap = new Node[size];
    }

    public void printTable(){
        for (int i = 0; i < dataMap.length; i++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    // hash method:
    private int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }
    // end of hash method

    // set method:
    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null){            // like when we would set temp = to head
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    // end of set method

    //get method:
    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];                    // if there is no linked list temp will set equal to null so the while loop is skipped and just return 0
        while (temp != null){                                   // if we have a linked list at that index, the while loop will run,
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;                                             //once temp is equal to null it will break out of the while loop and return 0
    }
    // end of get method

}

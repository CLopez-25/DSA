package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

//        BinarySearchTree myBST = new BinarySearchTree();
//
//        System.out.println("root = " + myBST);
        // end of first section

        // insert section:
//        BinarySearchTree myBST = new BinarySearchTree();
//
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        myBST.insert(27);
//
//        System.out.println(myBST.root.left.right.value);
        // end of insert section ///

        // contains section:
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println(myBST.contains(27));

        System.out.println(myBST.contains(17));
        // end of contains section ///
    }
}

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
//        BinarySearchTree myBST = new BinarySearchTree();
//
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println(myBST.contains(27));
//
//        System.out.println(myBST.contains(17));
        // end of contains section ///

        // rcontains section:
//        BinarySearchTree myBST = new BinarySearchTree();
//
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println("\nBST Contains 27:");
//        System.out.println(myBST.rContains(27));
//
//        System.out.println("\nBST Contains 17:");
//        System.out.println(myBST.rContains(17));
        // end of rcontains section ///

        // rinsert section:
//        BinarySearchTree myBST = new BinarySearchTree();
//
//        myBST.insert(2);
//        myBST.insert(1);
//        myBST.insert(3);
//
//        /* lines above, create this tree:
//                  2
//                /   \
//               1     3
//        */
//
//        System.out.println("\nRoot: " + myBST.root.value);
//        System.out.println("\nRoot->Left: " + myBST.root.left.value);
//        System.out.println("\nRoot->Right: " + myBST.root.right.value);
        // end of rinsert section ///

//        BinarySearchTree myBST = new BinarySearchTree();
//
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println(myBST.minValue(myBST.root));
//
//        System.out.println(myBST.minValue(myBST.root.right));

            /* lines above, create this binary search tree:
                      47
                    /   \
                   21    76
                 /  \   /  \
                18  27 52   82
            */

        // deleteNode section:
//        BinarySearchTree myBST = new BinarySearchTree();
//
//        myBST.insert(2);
//        myBST.insert(1);
//        myBST.insert(3);
//
//        /* lines above, create this tree:
//                  2
//                /   \
//               1     3
//        */
//
//        System.out.println("\nRoot: " + myBST.root.value);
//        System.out.println("Root->Left: " + myBST.root.left.value);
//        System.out.println("Root->Right: " + myBST.root.right.value);
//
//        myBST.deleteNode(2);
//
//        /*
//                3
//               / \
//             1   null
//        */
//
//        System.out.println("\nRoot: " + myBST.root.value);
//        System.out.println("Root-Left: " + myBST.root.left.value);
//        System.out.println("Root-Right: " + myBST.root.right);
        // end of deleteNode section ///

//        BinarySearchTree myBST = new BinarySearchTree();
//
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println(myBST.BFS());

//        BinarySearchTree myBST = new BinarySearchTree();
//
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println(myBST.DFSPreOrder());

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println(myBST.DFSPreOrder());

    }
}

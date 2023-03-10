package misc;

public class HashTablesBigO {

    // hash tables are one way only
    // they are deterministic

    // collisions:
    // when you have a collision there's multiple ways of dealing with them,
    // you can put the next key value pair at the same address even if there's one already there, that's called separate chaining.
    // another way to do it is to keep going until there is an open spot,
    // that is called linear probing and is one of the types of open addressing.

    // in the course we'll be dealing with collisions using separate chaining we'll have all the key values in one address,
    // and the way that'll be done is by having a linked list at each one of the addresses.

    // when dealing with a hash table you might think you're dealing with O(n) but it'll probably be O(1)
    // getting an item and setting an item in a hash table is O(1)
}

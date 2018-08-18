A perfect hash function will have no collisions. What I mean by that: No two elements will be stored in the same cell. So a simple perfect hash function for a range of numbers from 1-10 is n itself. 

Hash(x):

 int range = 10;

 if(x &gt;1 && x &lt; range){

    return x mod (range+1);

 }

}

Naturally, the size of the table will determine the frequency of possible collisions: A small table withmany entries is more likely to have a collision on insertion than a large table with few entries.  

When you construct a new HashMap object, you have the opportunity to specify a **load factor:** avalue between **0 and 1** that represents a percentage. Once the underlying table is filled to this capacity, the table is doubled in size.  

The lesser the load factor, lesser the collisiomns. The above method will allow to not have any collisions.

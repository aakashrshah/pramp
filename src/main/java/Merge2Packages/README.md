**

A map, hash, associative array or dictionary, **

- is a key-value store.   

- Elements within the data structure can be queried by the key  

- which will return the associated value.  

Map interface is part of the Java Collections API  

**

Funtions:**

- data structure size and   

- the ability to read,   

- insert,and   

- delete key-value pairs.  

**One property of a map is that the value of a key can only appear once: **

- **Reinserting that ke**y will result in the original value being **overwritten**
- They key goes through the hash code method.   

- The HashCode method returns an **int**.  

- The **int** is the index in the hashmap or hashtable  

- When you insert a value into the table for HashMap, the hashCode method is read, and because thevalue returned could be any valid value in the int range, it is then factored to a value between zeroand one less than the size of the table; that is, a valid index for the table.  

- So the hashtable just returns array[int]  

- And it returns the value in the key  

_********unequal**

 objects can return the same **

hashCode****_

That is the reason a collison handling must be done in these rare cases.



A perfect hash function will have no collisions. What I mean by that: No two elements will be stored in the same cell. So a simple perfect hash function for a range of numbers from 1-10 is n itself. 

```
Hash(x):
int range = 10;
if(x &gt;1 && x &lt; range){
  return x mod (range+1);
  }
}
```

Naturally, the size of the table will determine the frequency of possible collisions: A small table withmany entries is more likely to have a collision on insertion than a large table with few entries.  

When you construct a new HashMap object, you have the opportunity to specify a **load factor:** avalue between **0 and 1** that represents a percentage. Once the underlying table is filled to this capacity, the table is doubled in size.  

The lesser the load factor, lesser the collisiomns. The above method will allow to not have any collisions.


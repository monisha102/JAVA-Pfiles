# practicing java

About linkedlist,arraylist and vector:

1)no syntax difference

Arraylist<>...=new...
Linkedlist<>...=new..
Vector<>..

2)all 3 uses add,set,get,remove function.

but vector uses addElemnt func,size is func of arraylist and capacity is func of vector.

3)arralist and vector works on basis of dynamic array, but arraylist increases size by 50%, but vector 100%..so memory is wasted.arrylist is not thread safe but faster..vector is threadsafe but slower.

Arrylst uses iteration interface for traversal,vecror uses iteration or enumaration interface.

So, arraylst is better than vector.

4)lnkdlist works on basis of doubly linkedlist..here insertion deletion is easy,but in arraylst is diffclt.but in case of access the scenario is reversed.

5)Arraylst not synchronised but vector sync.

------About Hashset and Hashmap:--------

*hashset uses hash table and does hashing to store elements while hashmap stores index and value.

*both are non sync and does not maintain order while inserting.

*hashset uses add() while hashmap uses put();

*hashset is good for searching while hashmap is good for deleting or updating data.

*hashset stores only unique values and hashmap stores unique key; if hashmap gets duplicate key, it replaces the previous key.

*both can have null values.

*Hashset(extends)--->Abstractset(Inmplements)--->set(extends)--->collection(extendes)--->Iterable

**Hashset(extends)--->Abstractset(Inmplements)--->MAP
## **Properties:** ##

- It is a **Complete Binary Tree.**  

- **Each node is smaller than its children.**
- **Root is the minimum element in the tree.** 

### Two Key operations: ###

#### 1. insert O(log n) ####

- When we insert into a min-heap, we always start by inserting the element at the bottom.  

- We insert at the rightmost spot so as to maintain the complete tree property.  

- Then, we "fix" the tree by swapping the new element with its parent, until we find an appropriate spot for the element.   

- We essentially **bubble up** the minimum element.

#### 2. extract_min O(log n) ####

- First, we remove the minimum element and swap it with the last element in the heap (the bottommost,rightmost element).   

- Then, we **bubble down** this element, swapping it with one of its children until the min-heap property is restored . 

Do we swap it with the left child or the right child? 

That depends on their values. There's no inherent ordering between the left and right element, but you'll need to take the smaller one in order to maintainthe min-heap ordering.  



### Operations on Min Heap: ###

**1)** **getMin()**: It returns the root element of Min Heap. Time Complexity of this operation is **O(1).**

**2)** **extractMin():** Removes the minimum element from Min Heap. Time Complexity of this Operation is** O(Logn)** as this operation needs to maintain the heap property (by calling heapify()) after removing root.

**3)** **decreaseKey()**: Decreases value of key. Time complexity of this operation is **O(Logn)**. If the decreases key value of a node is greater than parent of the node, then we don’t need to do anything. Otherwise, we need to traverse up to fix the violated heap property.

**4) insert()**: Inserting a new key takes **O(Logn) **time. We add a new key at the end of the tree. IF new key is greater than its parent, then we don’t need to do anything. Otherwise, we need to** traverse up** to fix the violated heap property.

**5)** **delete():** Deleting a key also takes **O(Logn) **time. We replace the key to be deleted with minum infinite by calling decreaseKey(). After decreaseKey(), the minus infinite value must reach root, so we call extractMin() to remove key.

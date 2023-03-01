<h1 align="Center">Java Collection-List </h1>

<h3>The <i>List</i> interface extends Collection and declares the behavior of a collection that stores a sequence of elements. Elements can be inserted or accessed by
their position in the list, using a zero-based index. A list may contain duplicate elements. List is a generic interface that has this declaration:</h3>

<h3 align="Center">

```
public interface List<E> extends Collection<E>

```
</h3>

<h3>Here, E specifies the type of objects that the list will hold.</h3>

<h3>List in Java provides the facility to maintain the ordered collection. It contains the index-based methods to insert, update, delete and search the elements. It can have the duplicate elements also. We can also store the null elements in the list.</h3>
  
 <h3> The List interface is found in the <i>java.util</i> package and inherits the Collection interface.</h3>
  
   <h3> <li><i>1.Collection:</i> → It is the top of the collection hierarchy.It supports basic grouping of elements.</li></h3>
  <h3> <li><i>2.AbstractCollection:</i> → It implements the <i>Collection</i> interface.</li></h3>
  <h3> <li><i>3.List:</i> → It extends <i>Collection</i> to implement lists of objects.</li></h3>
  <h3> <li><i>4.AbstractList:</i> → It extends  the <i>AbstractCollection</i> and implements the <i>List</i> interface.</li></h3>
  <h3> <li><i>5.AbstractSequentialList:</i> → It extends  the <i>AbstractList</i> into a sequential(not random access)list.</li></h3>
  <h3> <li><i>6.LinkedList:</i> → It extends the <i>AbstractSequentialList</i> into a linked list, where each element knows where the next element is.</li></h3>
  <h3> <li><i>7.ArrayList:</i> → It implements a dynamic(resizable) array.</li></h3>
  
  <h1></h1>
  <h1 align="Center"> AbstractList</h1>
  <ul>
  
  ```mermaid
  
  sequenceDiagram
 
java.util.Collection->>java.util.AbstractCollection:implements
java.lang.Object->>java.util.AbstractCollection:extends
java.util.AbstractCollection->>java.util.AbstractList:extends 
java.util.AbstractList->>java.util.List:implements

  
  ```
  
  <h3 align="Center">
  
  ```
public abstract class AbstractList<E>
extends AbstractCollection<E>
implements List<E>
    
public abstract class AbstractCollection<E>
extends Object
implements Collection<E>
  
  ```
  </h3>
  
<h3>The <i>AbstractList Class</i> is an Abstract Class extends another Abstract Class AbstractCollection and implements List interface  .Note AbstractCollection , the abstract class which implements Collection interface and extends the Object class , the parent class of all the classes. The AbstractList is the foundation of other classes such as ArrayList, which supports dynamic arrays. </h3>
  </ul>
    
  <h1></h1>
  <h1 align="Center"> Division of AbstractList</h1>
  <ul>
    

  
  ```mermaid
    
    graph TD;
    
    Object-->|extends| AbstractCollection;
    AbstractCollection-->|implements| Collection;
    AbstractList-->|extends|AbstractCollection;
    List-->|implements|AbstractList;
    AbstractList-->|extends|ArrayList;
    AbstractList-->|extends|AbstractSequentialList;
    AbstractList-->|extends|Vector;
    AbstractSequentialList-->|extends|LinkedList;
   
  ```
  
 <h3> <i><ins>Note:</ins> The Vector class is deprecated since Java 5. Deprecated means it is supported but less in use or not recommended. Where as,  ArrayList and LinkedList are widely used in Java programming. </i></h3> 
 
  </ul>
   
 <h1></h1>
<h1 align="Center">Array List</h1>
    
<ul>
  
 <h3>The ArrayList class is an array class that can grow or shrink at runtime . Note that arrays of this class must hold objects, not just simple data types.The ArrayList class extends AbstractList and implements the List interface.ArrayList is a generic class that has this declaration:</h3>
  
```mermaid
  
  sequenceDiagram
    
  
java.util.Collection->>java.util.AbstractCollection:implements
java.lang.Object->>java.util.AbstractCollection:extends
java.util.AbstractCollection->>java.util.AbstractList:extends 
java.util.AbstractList->>java.util.List:implements
java.util.ArrayList->>java.util.AbstractList:extends 
java.util.ArrayList->>java.util.List:implements
java.util.ArrayList->>java.lang.Cloneable:implements
java.util.ArrayList->>java.io.Serializable:implements
java.util.ArrayList->>java.util.RandomAccess:implements
  
```
  
<h3 align="Center">
  
```
  
public class ArrayList<E>
extends AbstractList<E>
implements List<E>, RandomAccess, Cloneable, Serializable
  
  
  //Others
 ---------------------------------------
public abstract class AbstractList<E>
extends AbstractCollection<E>
implements List<E>
    
public abstract class AbstractCollection<E>
extends Object
implements Collection<E>
  
--------------------------------
  
  Class/Interface      Package
  --------------       ----------
  ArrayList             java.util
  AbstractList          java.util
  List<E>               java.util
  RandomAccess          java.util
  Cloneable             java.lang
 Serializable          java.io
  AbstractCollection    java.util
  Object                java.lang
  Collection            java.util
  
  
```
</h3>
  
<h3><i> Characteristic of ArrayList are:</i></h3>
  <ul>
    <h3><li><i>1. Java ArrayList class can contain duplicate elements.</i></li></h3>
    <h3><li><i>2. Java ArrayList class maintains insertion order.</i></li></h3>
    <h3><li><i>3.Java ArrayList class is non synchronized.</i></li></h3>
    <h3><li><i>4.Java ArrayList allows random access because the array works on an index basis.</i></li></h3>
    <h3><li><i>5.In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.</i></li></h3>
    <h3><li><i>We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class.That is it follows : <a href="https://github.com/AvinandanBose/JavaGeneric"> Generic</a> characteristics. </i></li></h3>
    
   </ul>
  
</ul>




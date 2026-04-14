// public class Box {
//     Object value;

//     public Object getValue() {
//         return value;
//     }

//     public void setValue(Object value) {
//         this.value = value;
//     }
    
// }

// The above code is a non-generic version of the Box class, which can hold any type of object. However, it does not provide type safety, and you may encounter ClassCastException at runtime if you try to cast the value to the wrong type.

// The following code is a generic version of the Box class, which allows you to specify the type of value it can hold. This provides type safety at compile time and eliminates the risk of ClassCastException at runtime.


public class Box<T extends > {
    T value; // T is a type parameter that will be replaced with a specific type when an instance of Box is created. we can use any name for the type parameter, but T is commonly used to represent "Type".

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
}

/*
String is not a primitive type, its a class
- sequence of character
*/
public class StringDataType {

    public static void main(String... args){

        /*
        * why student object is called reference variable?
        * - once object is created using new keyword,
        * - a memory got allocated to it in the memory
        * - that memory address is stored in that student variable
        *
        * where memory got allocated ?
        * - inside heap memory, used by JVM to store objects
        * - in java by an opearting system a memory got allocated to JVM
        * -
        * */
        Student student = new Student();
        student.name = "Rupam";
        student.address = "India";
        student.standard = 4;
        student.rollNumber = 20;

        System.out.println(student.name);

        /*
        To create strings
        - what's the difference in below 2 ways ?
        */
        String address = new String("India");
        String name1 = "Thakre";

        /*
        create a new object in memory of String type and allocate a memory to it inside the Heap
        - does a == b would be true ? NO -> bcz both are different memory location
        - does c == d would be false ? NO -> but why ? - it is also allocating some memory for variable c and d

        - when we write 'new' a memory got allocated in memory
        - But c and d are literals, since Object value Ram is similiar , so does 4 times memory would be allocated ? NO
        - Java is intelligent! - it will check when it first time it wrote Java and it put into a special memory called Pool
        - if that object value is already available in String pool, it will use the same

        - so if one time a memory got allocated for an object value
        in String Pool, next time there will no memory would allocated again for the same object value

        here value of address 'a' , would be used for b,c and d.

        */

        String a = new String("Ram");
        String b = new String("Ram");
        System.out.println(a == b); //false

        String c = "Ram";
        String d = "Ram";
        System.out.println(c == d); //true

    }
}
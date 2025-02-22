package org.example;

public class AccessModifieress {
    // public private protected default
   /*
   public -> accessible everywhere (class,method, variable)
   in the program provided the class
   // expose some functionality universally available
   public class -> class is available in the package
   public method ->is a method in public class and can be called from any other class
   or any other class in the same package

    */
//    package org.example;
//    public class PublicEg{
//        public int publicVar=10;
//        public void display(){
//            System.out.println(publicVar);
//        }
//    }
//    package com.other;
    // import com.example.PublicEg

/*
priavte -> only accessible -> the same class where it is delcared
// encapsulation

package com.eg
public class PrivateEg{
//        public int priavteVar=10;
//        public void display(){
//            System.out.println(privateVar);
//        }
//    }

cannot access outside the class

Q How do u access private variable outside it;s class
-> public method in the same class

protected -> members r acceesible within the same package and in subclasses even if
subclasses are in diff package

-> used when we want to inherit and override some methods
eg package com.example
public class ProtectedEg{
protected int protectVar=10;
protected void protectedMehtod(){
System.out.print("protected method in protected EG");
}

package com.other
import com.example.ProtectedExample

public class SubClassExaple extends ProttectedExample{
public void dispaly{
System.out.print(protected);

deafult -> accesible only in the same package -> package -private

top level class -> public


 */
}

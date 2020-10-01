package reflection;

import java.lang.reflect.Method;


public class FooMethodCall {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName("reflection.Foo");
        Object o = c.getDeclaredConstructor().newInstance();


        Method m = c.getDeclaredMethod("message", null);
        m.setAccessible(true);
        m.invoke(o, null);


        Method m2 = c.getDeclaredMethod("messageWParams", String.class);
        m2.setAccessible(true);
        m2.invoke(o, "Costin");
    }
}

/*
We can use Reflection to access private method of a class from
outside the class. In Java, we use getDeclaredMethod() to get
instance of a private method. Then we mark this method accessible
and finally invoke it.
* */
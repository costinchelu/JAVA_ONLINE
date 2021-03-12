package how_to.reflection;

import java.lang.reflect.Method;

/**
 * We can use Reflection to access private method of a class from
 * outside the class. <br>In Java, we use getDeclaredMethod() to get
 * instance of a private method. Then we mark this method accessible
 * and finally invoke it.
 */
public class FooMethodCall {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName("how_to.reflection.Foo");
        Object o = c.getDeclaredConstructor().newInstance();


        Method m = c.getDeclaredMethod("message", null);
        m.setAccessible(true);
        m.invoke(o, null);


        Method m2 = c.getDeclaredMethod("messageWParams", String.class);
        m2.setAccessible(true);
        m2.invoke(o, "Costin");
    }
}

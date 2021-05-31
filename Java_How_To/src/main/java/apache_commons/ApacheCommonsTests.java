package apache_commons;


import static org.apache.commons.lang3.math.NumberUtils.*;

public class ApacheCommonsTests {

    public static void main(String[] args) {

        System.out.println(isNumber("0"));
        System.out.println(isNumber("0.1"));
        System.out.println(isNumber("1.6"));
        System.out.println(isNumber("245.21145"));
        System.out.println(isNumber("0.0"));
        System.out.println(isNumber("1.0"));
        System.out.println(isNumber(""));
        System.out.println(isNumber(" "));
        System.out.println(isNumber("l"));
    }
}

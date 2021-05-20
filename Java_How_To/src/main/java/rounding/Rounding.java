package rounding;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding {

    public static void main(String[] args) {

        double[] doubleArr = new double[]
                {0, 0.00, 0.000, 10, 10.0, 10.00, 10.000, 10.0000, 100, 1000, 1000.01,
                 12, 12.0, 12.5, 12.2, 12.6, 12.9, 12.10, 12.11, 12.15, 12.16, 12.19,
                12.190, 12.191, 12.195, 12.196, 12.199, 12.1900, 12.1999, 9.9, 9.99, 9.999};

        String[] strArr = new String[]
                {"0", "0.00", "0.000", "10", "10.0", "10.00", "10.000", "10.0000", "100", "1000", "1000.01",
                        "12", "12.0", "12.5", "12.2", "12.6", "12.9", "12.10", "12.11", "12.15", "12.16", "12.19",
                        "12.190", "12.191", "12.195", "12.196", "12.199", "12.1900", "12.1999", "9.9", "9.99", "9.999"};

        for (double v : doubleArr) {
            System.out.println(round(v, 2));
        }

        System.out.println("==========");

        for (String v : strArr) {
            System.out.println(v + " : " + round(v, 2));
        }
    }

    public static String round(double value, int scale) {
        BigDecimal bd = new BigDecimal(String.valueOf(value));
        return bd.setScale(scale, RoundingMode.FLOOR).stripTrailingZeros().toPlainString();
    }

    public static String round(String value, int scale) {
        if (StringUtils.isBlank(value)) {
            return "0";
        }
        BigDecimal bd = new BigDecimal(String.valueOf(value));
        return bd.setScale(scale, RoundingMode.FLOOR).stripTrailingZeros().toPlainString();
    }

}

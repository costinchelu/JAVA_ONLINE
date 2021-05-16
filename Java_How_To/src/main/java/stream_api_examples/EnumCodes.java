package stream_api_examples;

import java.util.stream.Stream;

public enum EnumCodes {
    CODE1("1"),
    CODE2("2"),
    CODE3("3");

    private final String enumValue;

    private EnumCodes(String enumValue) {
        this.enumValue = enumValue;
    }

    public String getEnumValue() {
        return this.enumValue;
    }

    public static EnumCodes getCodeName(String codeVal) {
        return Stream.of(values()).filter((enumCodes) -> codeVal.equals(enumCodes.getEnumValue())).findFirst().orElse(null);
    }
}

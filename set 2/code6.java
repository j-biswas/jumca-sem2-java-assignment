import java.util.Scanner;

class NumericWrapper {
    private Integer value;

    public NumericWrapper(int value) {
        this.value = value;
    }

    public int toBasicType() {
        return value;
    }

    public String toStringFromBasicType() {
        return String.valueOf(value);
    }

    public static NumericWrapper fromString(String str) throws NumberFormatException {
        int numericValue = Integer.parseInt(str);
        return new NumericWrapper(numericValue);
    }

    public String toString() {
        return String.valueOf(value);
    }
}

public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter basic type value : ");
        int basicTypeValue = Integer.parseInt(sc.nextLine());
        NumericWrapper wrapper = new NumericWrapper(basicTypeValue);

        int convertedBasicTypeValue = wrapper.toBasicType();
        System.out.println("Converted basic type value: " + convertedBasicTypeValue);

        String stringFromBasicType = wrapper.toStringFromBasicType();
        System.out.println("String from basic type: " + stringFromBasicType);

        System.out.println("enter a numeric value as string");
        String numericString = sc.nextLine();
        try {
            NumericWrapper numericObject = NumericWrapper.fromString(numericString);
            System.out.println("Numeric object from string: " + numericObject);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid format for numeric string.");
        }

        String stringFromObject = wrapper.toString();
        System.out.println("String from object: " + stringFromObject);
        sc.close();
    }
}

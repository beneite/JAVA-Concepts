package Reflection.JavaLangReflectField;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldReflectionExample {

    // Fields of the class
    private String privateField = "Private Value";
    public int publicField = 42;
    protected boolean protectedField = true;
    static final double CONSTANT_FIELD = 3.14;

    public static void main(String[] args) {
        try {
            // Get the class object
            Class<?> clazz = FieldReflectionExample.class;
            FieldReflectionExample example = new FieldReflectionExample();

            // Get all declared fields of the class
            Field[] fields = clazz.getDeclaredFields();

            // Iterate over each field
            for (Field field : fields) {
                // Print field information
                System.out.println("Field Name: " + field.getName());
                System.out.println("Field Type: " + field.getType());
                System.out.println("Field Value:" + field.get(example));
                System.out.println("Declaring Class: " + field.getDeclaringClass());
                System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
                System.out.println("Is Synthetic: " + field.isSynthetic());


                // Handle accessibility
                field.setAccessible(true);

                // Access field values
                if (field.getType() == boolean.class) {
                    boolean value = field.getBoolean(example);
                    System.out.println("Original Value (boolean): " + value);
                } else if (field.getType() == byte.class) {
                    byte value = field.getByte(example);
                    System.out.println("Original Value (byte): " + value);
                } else if (field.getType() == char.class) {
                    char value = field.getChar(example);
                    System.out.println("Original Value (char): " + value);
                } else if (field.getType() == short.class) {
                    short value = field.getShort(example);
                    System.out.println("Original Value (short): " + value);
                } else if (field.getType() == int.class) {
                    int value = field.getInt(example);
                    System.out.println("Original Value (int): " + value);
                } else if (field.getType() == long.class) {
                    long value = field.getLong(example);
                    System.out.println("Original Value (long): " + value);
                } else if (field.getType() == float.class) {
                    float value = field.getFloat(example);
                    System.out.println("Original Value (float): " + value);
                } else if (field.getType() == double.class) {
                    double value = field.getDouble(example);
                    System.out.println("Original Value (double): " + value);
                } else {
                    Object value = field.get(example);
                    System.out.println("Original Value (Object): " + value);
                }

                // Modify field values
                if (field.getType() == boolean.class) {
                    field.setBoolean(example, false);
                    boolean newValue = field.getBoolean(example);
                    System.out.println("Updated Value (boolean): " + newValue);
                } else if (field.getType() == byte.class) {
                    field.setByte(example, (byte) 0);
                    byte newValue = field.getByte(example);
                    System.out.println("Updated Value (byte): " + newValue);
                } else if (field.getType() == char.class) {
                    field.setChar(example, 'Z');
                    char newValue = field.getChar(example);
                    System.out.println("Updated Value (char): " + newValue);
                } else if (field.getType() == short.class) {
                    field.setShort(example, (short) 0);
                    short newValue = field.getShort(example);
                    System.out.println("Updated Value (short): " + newValue);
                } else if (field.getType() == int.class) {
                    field.setInt(example, 0);
                    int newValue = field.getInt(example);
                    System.out.println("Updated Value (int): " + newValue);
                } else if (field.getType() == long.class) {
                    field.setLong(example, 0L);
                    long newValue = field.getLong(example);
                    System.out.println("Updated Value (long): " + newValue);
                } else if (field.getType() == float.class) {
                    field.setFloat(example, 0.0f);
                    float newValue = field.getFloat(example);
                    System.out.println("Updated Value (float): " + newValue);
                } else if (field.getType() == double.class) {
                    field.setDouble(example, 0.0);
                    double newValue = field.getDouble(example);
                    System.out.println("Updated Value (double): " + newValue);
                } else {
                    field.set(example, "Updated Value");
                    Object newValue = field.get(example);
                    System.out.println("Updated Value (Object): " + newValue);
                }

                System.out.println("************************************************************");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

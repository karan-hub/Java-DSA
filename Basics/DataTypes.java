package Basics;// package Step 1 : Learn the basics;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Size of Character: " + dataTypeSize("Character") + " bytes");
        System.out.println("Size of Integer: " + dataTypeSize("Integer") + " bytes");
        System.out.println("Size of Long: " + dataTypeSize("Long") + " bytes");
        System.out.println("Size of Float: " + dataTypeSize("Float") + " bytes");
        System.out.println("Size of Double: " + dataTypeSize("Double") + " bytes");
    }

    static int dataTypeSize(String str) {
        switch (str) {
            case "Character":
                return 2;
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            default:
                return -1;
        }
    }
}

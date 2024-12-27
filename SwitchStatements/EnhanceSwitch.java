package SwitchStatements;

public class EnhanceSwitch {
    public static void main(String[] args) {
        String fruit= "apple";

    switch (fruit) {
        case "apple" -> System.out.println("red fruits");
        case "pileapple" -> System.out.println("this  is not red");
        case "mango" -> System.out.println("this is yellow ");
        default -> System.out.println("this not choise");
    }
    }
}

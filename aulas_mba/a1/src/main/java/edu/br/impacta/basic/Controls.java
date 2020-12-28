package edu.br.impacta.basic;

public class Controls {
    public static final String name = "Name";

    public static void switchAndMore() {
        String aNameForSelection = "Name";

        switch (aNameForSelection) {
            case name:
                System.out.println("Name found");
            case "Anything":
                System.out.println("no break!");
                break;
            default:
                System.out.println("something went wrong.");
        }
    }
}

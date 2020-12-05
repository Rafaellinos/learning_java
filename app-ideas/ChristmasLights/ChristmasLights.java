
public class ChristmasLights {

    public static void main(String[] args) {

        int TreeSize = 20;
        for (int i = 0; i < TreeSize; i++) {
            for (int j = 0; j < TreeSize - i; j++){
                System.out.print("-");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}

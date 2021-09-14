import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");
        //ArrayList<int> intArrayList = new ArrayList<int>();
        //ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        //intClassArrayList.add(new IntClass(12));
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i=0; i<=10; i++) {
            numeros.add(Integer.valueOf(i)); // pode ser Integer(i), isso é autoboxing
        }
        System.out.println(numeros);
        System.out.println(numeros.size());
        // unboxing
        Integer teste = 23; // autoboxing (transformar primitivo direto em class Integer
        int teste1 = teste; // unboxing (transformar Integer classe em primitivo)
    }

}

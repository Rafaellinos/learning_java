import java.lang.Math;


public class Bin2Dec {

    public int Bin2DecConverter(String binStr) {
        int DecimalValue, TempVar;
        DecimalValue = TempVar = 0;
        for(int i=binStr.length()-1; i>=0; i--) {    
            DecimalValue += (int) Math.pow(Character.digit(binStr.charAt(i), 10)*2, TempVar);
            TempVar += 1;
        }
        // or you can just: int decimal = Integer.parseInt(binStr,2);
        return DecimalValue;
    }

    public static void main(String[] args) {
        Bin2Dec o = new Bin2Dec();
        System.out.println(o.Bin2DecConverter("110101"));
    }    
}

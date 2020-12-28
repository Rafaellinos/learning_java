public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25) {
            if (!summer && temperature <= 35) {
                return true;
            } else return summer && temperature <= 45;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        var teste = isCatPlaying(false, 35);
        System.out.println(teste);
    }
}

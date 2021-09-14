package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {
    public static Map<String, Boolean> random(int size, double percentage) {
        var alunos = new HashMap<String, Boolean>();
        var finalSize = (int) ((percentage * size) / 100);
        for (int i = 0; i < size; i ++) {
            alunos.put("Key: " + i, i < finalSize);
        }
        return alunos;
    }
}

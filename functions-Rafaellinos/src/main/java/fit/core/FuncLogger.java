package fit.core;

import java.util.function.Function;

public class FuncLogger {

    public static Function<String, String> create (String prefix) {
        return str -> {
            String log = String.format("%s %s", prefix, str);
            System.out.printf(log);
            return log;
        };
    }
}

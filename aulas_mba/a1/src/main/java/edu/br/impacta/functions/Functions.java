package edu.br.impacta.functions;

import java.util.function.Function;

public class Functions {

    private static final String defaultSeparator = "--->";

    private static Function<String, String> loggerBuilder(String prefix) {
        return loggerBuilder(prefix, defaultSeparator);
    }

    private static Function<String, String> loggerBuilder(String prefix, String separator) {
        return str -> {
            var text = String.format("%s %s %s", prefix, separator, str);
            System.out.println(text);

            return text;
        };
    }

    public static void playFunctional() {
        var logger = loggerBuilder("[prefix]");
        var loggerDecorated = loggerBuilder("[prefix]", "==>");
        var x = logger.apply("qualquer coisa");
        loggerDecorated.apply(x);
    }

}

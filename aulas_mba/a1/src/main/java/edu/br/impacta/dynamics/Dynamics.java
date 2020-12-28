package edu.br.impacta.dynamics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dynamics {
    public static void tasteDynamics() {
        System.out.println("VARiables !!!");

        var name = "emilio";
        var number = 10;
        var floating = 10.0f;
        var doubleNumber = 10.0;
        var list = new ArrayList<String>() {{ add("yep, it works..."); }};
        var listMap = new ArrayList<Map<String, String>>() {{
            add(new LinkedHashMap<>() {{
                put("k", "v");
            }});
        }};
        var fancyList = List.of("new", "list");
        var fancyMapFromEntrySet = Map.ofEntries(
            Map.entry("key", "value"),
            Map.entry("key2", "value2")
        );

        System.out.println(name);
        System.out.println(list);
        System.out.println(fancyMapFromEntrySet);

        var o = new Object() {
            String name = "emilio";
        };
        System.out.println("Dynamics can be really dynamics!");
        System.out.println(o.name);

        o.name = "dont say!";
        System.out.println(o.name);
    }
}

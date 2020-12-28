package edu.br.impacta.basic;

import java.util.*;

public class Collections {

    public static void listsAndMaps() {
        System.out.println("initialing collections playground");
        String[] names = new String[] { "Emilio", "Murta", "Resende" };
        System.out.println(Arrays.toString(names));

        Map<String, String> record = new LinkedHashMap<>() {{
            put("key", "value");
            put("key1", "value1");
            put("key2", "value2");
        }};
        System.out.println(record);

        Map<String, String> recordAnonymous = new LinkedHashMap<>();
        {
            recordAnonymous.put("key", "value");
            recordAnonymous.put("key1", "value1");
            recordAnonymous.put("key2", "value2");
        }
        System.out.println(recordAnonymous);

        List<Map<String, String>> complexRecord = new ArrayList<>() {{
            add(new LinkedHashMap<>() {{
                put("uglyKey", "uglyValue");
            }});
        }};
        System.out.println(complexRecord);

        List<Map<String, String>> complexRecordMadeEasy = List.of(
            Map.of("fancyKey", "fancyValue", "fancyNewKey", "fancyNewValue"),
            Map.of("fancyKey1", "fancyValue1")
        );
        System.out.println(complexRecordMadeEasy);

        for(Map<String, String> rec : complexRecordMadeEasy) {
            System.out.println("printing complex record details");

            for(String k : rec.keySet()) {
                System.out.println(k);
            }

            for(String v : rec.values()) {
                System.out.println(v);
            }

            for(Map.Entry<String, String> entry : rec.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
    }
}

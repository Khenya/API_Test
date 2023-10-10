package tareas1;
import org.json.JSONObject;

public class JsonComparator {
    public static boolean compareJson(JSONObject expectedJson, JSONObject actualJson) {
        boolean areEqual = true;

        for (String key : expectedJson.keySet()) {
            if (expectedJson.get(key) instanceof JSONObject) {
                if (!actualJson.has(key) || !compareJson(expectedJson.getJSONObject(key), actualJson.getJSONObject(key))) {
                    areEqual = false;
                    System.out.println("Difference in nested JSON for key: " + key);
                }
            } else {
                if (!key.equals("ignore") && (!actualJson.has(key) || !expectedJson.get(key).equals(actualJson.get(key)))) {
                    areEqual = false;
                    System.out.println("Difference for key: " + key);
                }
            }
        }
        return areEqual;
    }
}

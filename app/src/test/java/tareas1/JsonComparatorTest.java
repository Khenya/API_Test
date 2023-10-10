package tareas1;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class JsonComparatorTest {

    @Test
    void testCompareJson_Comparisons1() {
        JSONObject expectedJson = new JSONObject();
        expectedJson.put("Id", 112130);
        expectedJson.put("Content", "New Item Brenda");
        expectedJson.put("ItemType", "ignore");
        expectedJson.put("Checked", false);
        expectedJson.put("ProjectId", "ignore");
        expectedJson.put("ParentId", "ignore");
        expectedJson.put("Deleted", false);

        JSONObject actualJson = new JSONObject();
        actualJson.put("Id", 112130);
        actualJson.put("Content", "New Item Brenda");
        actualJson.put("ItemType", "91");
        actualJson.put("Checked", false);
        actualJson.put("ProjectId", "84123");
        actualJson.put("ParentId", "7012");
        actualJson.put("Deleted", false);

        Assertions.assertTrue(JsonComparator.compareJson(expectedJson, actualJson));
    }

    @Test
    void testCompareJson_Comparisons2() {
        JSONObject expectedJson = new JSONObject();
        expectedJson.put("Id", 122);
        expectedJson.put("Content", "New Item");
        expectedJson.put("ItemType", "ignore");
        expectedJson.put("Checked", true);
        expectedJson.put("ProjectId", "ignore");
        expectedJson.put("ParentId", "ignore");
        expectedJson.put("Deleted", false);

        JSONObject actualJson = new JSONObject();
        actualJson.put("Id", 122);
        actualJson.put("Content", "New Item");
        actualJson.put("ItemType", "3574");
        actualJson.put("Checked", true);
        actualJson.put("ProjectId", "82781");
        actualJson.put("ParentId", "218107");
        actualJson.put("Deleted", false);

        Assertions.assertTrue(JsonComparator.compareJson(expectedJson, actualJson));
    }

    @Test
    void testCompareJson_Comparisons3() {
        JSONObject expectedJson = new JSONObject();
        expectedJson.put("Id", 85040001);
        expectedJson.put("Content", "holiiii");
        expectedJson.put("ItemType", "ignore");
        expectedJson.put("Checked", false);
        expectedJson.put("ProjectId", "ignore");
        expectedJson.put("ParentId", "ignore");
        expectedJson.put("Deleted", false);

        JSONObject actualJson = new JSONObject();
        actualJson.put("Id", 85040001);
        actualJson.put("Content", "holiiii");
        actualJson.put("ItemType", "485631");
        actualJson.put("Checked", false);
        actualJson.put("ProjectId", "423201");
        actualJson.put("ParentId", "10457");
        actualJson.put("Deleted", false);

        Assertions.assertTrue(JsonComparator.compareJson(expectedJson, actualJson));
    }

    @Test
    void testCompareJson_Comparisons4() {
        JSONObject expectedJson = new JSONObject();
        expectedJson.put("Id", 13251);
        expectedJson.put("Content", "holiiii    89 holaaaa    :D");
        expectedJson.put("ItemType", "ignore");
        expectedJson.put("Checked", true);
        expectedJson.put("ProjectId", "ignore");
        expectedJson.put("ParentId", "ignore");
        expectedJson.put("Deleted", true);

        JSONObject actualJson = new JSONObject();
        actualJson.put("Id", 13251);
        actualJson.put("Content", "holiiii    89 holaaaa    :D");
        actualJson.put("ItemType", "18210");
        actualJson.put("Checked", true);
        actualJson.put("ProjectId", "8270823");
        actualJson.put("ParentId", "520417");
        actualJson.put("Deleted", true);

        Assertions.assertTrue(JsonComparator.compareJson(expectedJson, actualJson));
    }
}
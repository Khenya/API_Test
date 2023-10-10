package tareas1;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CRUD_ITEM {
    @Test
    public void createUpdateReadDeleteProject() {
        JSONObject bodyItem = new JSONObject();
        bodyItem.put("Content", "BrendaJSON");
        bodyItem.put("ProjectId", "4129347");

        // create
        Response response=given()
                .auth()
                .preemptive()
                .basic("upbapi@upbapi.com", "12345")
                .body(bodyItem.toString())
                .log()
                .all().
        when()
                .post("https://todo.ly/api/items.json");


        response.then()
                .log()
                .all()
                .statusCode(200)
                .body("Content", equalTo(bodyItem.get("Content")));

        int idItem = response.then().extract().path("Id");

        // update
        bodyItem.put("Content", "JSON Update");
        response=given()
                .auth()
                .preemptive()
                .basic("upbapi@upbapi.com", "12345")
                .body(bodyItem.toString())
                .log()
                .all().
        when()
                .put("https://todo.ly/api/items/"+idItem+".json");


        response.then()
                .log()
                .all()
                .statusCode(200)
                .body("Content", equalTo(bodyItem.get("Content")));

        // read
        response=given()
                .auth()
                .preemptive()
                .basic("upbapi@upbapi.com", "12345")
                .log()
                .all().
        when()
                .get("https://todo.ly/api/items/"+idItem+".json");


        response.then()
                .log()
                .all()
                .statusCode(200)
                .body("Content", equalTo(bodyItem.get("Content")));

        // delete
        response=given()
                .auth()
                .preemptive()
                .basic("upbapi@upbapi.com", "12345")
                .log()
                .all().
        when()
                .delete("https://todo.ly/api/items/"+idItem+".json");

        response.then()
                .log()
                .all()
                .statusCode(200)
                .body("Content", equalTo(bodyItem.get("Content")))
                .body("Deleted", equalTo(true));
    }
}

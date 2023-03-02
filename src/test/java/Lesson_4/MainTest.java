package Lesson_4;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MainTest extends AbstractTest{
    @Test
    void getRecipePositiveTest() {
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/complexSearch")
                .then()
                .spec(responseSpecification);
    }


}

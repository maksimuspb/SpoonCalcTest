package Lesson_3;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UserTest extends AbstractTest{

    @Test
    void getRequestTest(){
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("diet", "vegetarian")
                .when()
                .get(getBaseUrl()+"recipes/complexSearch")
                .then()
                .statusCode(200);

        given()
                .queryParam("apiKey",getApiKey())
                .queryParam("intolerances","gluten")
                .when()
                .get(getBaseUrl()+"recipes/complexSearch")
                .then()
                .statusCode(200);


        given()
                .queryParam("apiKey",getApiKey())
                .queryParam("sort","calories")
                .when()
                .get(getBaseUrl()+"recipes/complexSearch")
                .then()
                .statusCode(200);



        given()
                .queryParam("apiKey",getApiKey())
                .queryParam("minCarbs","10")
                .when()
                .get(getBaseUrl()+"recipes/complexSearch")
                .then()
                .statusCode(200);


        given()
                .queryParam("apiKey",getApiKey())
                .queryParam("minFat","1")
                .when()
                .get(getBaseUrl()+"recipes/complexSearch")
                .then()
                .statusCode(200);

    }
    @Test
    void ClassifyTest() {
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("langauge", "en")
                .contentType("application/x-www-form-urlencoded")
                .formParam("title", "Pork roast with green beans")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .statusCode(200);

        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("langauge", "en")
                .contentType("application/x-www-form-urlencoded")
                .formParam("ingredientList", "3 oz pork shoulder")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .statusCode(200);
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("langauge", "en")
                .contentType("application/x-www-form-urlencoded")
                .formParam("1", "t")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .statusCode(200);
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("langauge", "en")
                .contentType("application/x-www-form-urlencoded")
                .formParam("3", "g")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .statusCode(200);
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("langauge", "en")
                .contentType("application/x-www-form-urlencoded")
                .formParam("5", "l")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .statusCode(200);
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("langauge", "en")
                .contentType("application/x-www-form-urlencoded")
                .formParam("8", "r")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .statusCode(200);

    }


}


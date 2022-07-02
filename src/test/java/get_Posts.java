import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class get_Posts {
//    public static String baseURI = "https://jsonplaceholder.typicode.com";
//    private String path = "posts";

    @Test
    public void validatePrettyPrint() {
        RestAssured.given()
                .when()
                .post("https://jsonplaceholder.typicode.com/posts")
                .prettyPeek(); // Prints the whole response body and headers

    }

    @Test
    public void verifyStatusCode(){
        RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .assertThat()
                .statusCode(200);
    }
    @Test
    public void verifyContentType(){
        RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .assertThat()
                .contentType(ContentType.JSON);
    }
}

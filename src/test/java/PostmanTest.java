import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PostmanTest {

    @Test
    public void ShouldReturnPost() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("тест")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("тест"))
                .body("data.", is("fail"))
        ;
    }
}

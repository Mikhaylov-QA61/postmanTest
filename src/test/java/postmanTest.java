import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class postmanTest {

    // Given - When - Then
    // Предусловия
    @Test
    void postTest() {

        given()
            .baseUri("https://postman-echo.com")
            .contentType("text/plain; charset=UTF-8")
            .body("успешный тест") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
            .when()
            .post("/post")
// Проверки
            .then()
            .statusCode(200)
            .body("data", equalTo("успешный тест"));
    }
}

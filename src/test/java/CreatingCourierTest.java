import config.BaseURI;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import model.Courier;
import model.CourierMethods;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class CreatingCourierTest {

    @Before
    public void setUp() {
        RestAssured.baseURI = BaseURI.baseURI;
    }
    private Courier courier;


    @Test
    @DisplayName("Создание нового курьера")
    @Description("При успешном создании курьера код 200, в теле ответа ok: true")
    File json = new File("/src/main/data/CrearCourier.json");
    ValidatableResponse response = CourierMethods.create(courier);
                .create(courier)
                .statusCode(201);


}

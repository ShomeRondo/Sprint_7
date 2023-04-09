package model;

import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class CourierMethods {

    private static final String PATH = "api/v1/courier";
    private static final String LOGIN_PATH = "api/v1/courier/login";

    @Step("Создание курьера")
    public ValidatableResponse create(Courier courier){
        return given()
                .header("Content-type", "application/json")
                .and()
                .body(courier)
                .when()
                .post(PATH)
                .then();
    }

    @Step("Авторизация курьера")
    public ValidatableResponse login(CourierCredentials credentials){
        return given()
                .header("Content-type", "application/json")
                .and()
                .body(credentials)
                .when()
                .post(LOGIN_PATH)
                .then();
    }

    @Step("Удаление курьера")
    public ValidatableResponse delete(int id){
        return given()
                .header("Content-type", "application/json")
                .when()
                .delete(PATH +id)
                .then();
    }

}

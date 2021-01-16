package net.bddtrader;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Authentication {
    public static RequestSpecification basic() {
        return RestAssured.given().auth().basic("user", "password");
    }

    public static RequestSpecification digest(){
        return RestAssured.given().auth().digest("user", "password");
    }
}

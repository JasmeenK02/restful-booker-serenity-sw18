package io.swagger.petstore.testbase;

import io.restassured.RestAssured;
import io.swagger.petstore.utils.PropertyReader;
import org.junit.BeforeClass;

public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void inIt() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");

    }

}

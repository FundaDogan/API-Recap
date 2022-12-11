package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;

public class DummyRestApiBaseURL {

    protected RequestSpecification spec;

    @BeforeEach  // Junit Jupiter annotation
    public void setUp(){

        spec = new RequestSpecBuilder().setBaseUri("").build();
    }
}

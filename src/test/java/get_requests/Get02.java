package get_requests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.lang.module.ResolutionException;

import static io.restassured.RestAssured.*;

public class Get02 {

    //Print all "available" pets on console by using"https://petstore.swagger.io/" documentation.

    /*
        Given
            https://petstore.swagger.io/v2/pet/findByStatus?status=available
        When
            User sends get request
        Then
            HTTP Status code is 200
        And
          Print all "available" pets on console
     */

    @Test
    public void get02(){
    String url = "https://petstore.swagger.io/v2/pet/findByStatus?status=available";

    Response response = get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
    response.prettyPrint(); // we print only available pets on the console by using query params

    response.then().assertThat().statusCode(200);


    }

}

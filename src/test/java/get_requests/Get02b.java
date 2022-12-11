package get_requests;

import base_urls.PetStoreBaseUrl;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;

public class Get02b extends PetStoreBaseUrl {

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

        spec.pathParams("1","pet","2","findByStatus").queryParam("status","available");

    Response response = get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
    response.prettyPrint(); // we print only available pets on the console

    response.then().assertThat().statusCode(200);


    }

}

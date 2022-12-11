package get_requests;

import base_urls.PetStoreBaseUrl;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;

public class Get03 extends PetStoreBaseUrl {
 /*
    Print all "available" pets on console by using"https://petstore.swagger.io/" documentation.
    There should be more than 30 "available" pets, "fish" and "doggie" pet names must exist between pets.
    */

    /*
    Given
            https://petstore.swagger.io/v2/pet/findByStatus?status=available
        When
            User sends get request
        Then
            HTTP Status code is 200
        And
          There should be more than 30 "available" pets
        And
            "fish" and "doggie" pet names must exist between pets

     */

    @Test
    public void get03(){

        spec.pathParams("1","pet","2","findByStatus").queryParam("status","available");

        Response response = given().spec(spec).when().get("/{1}/{2}");
        response.prettyPrint();

        response.then()
                .assertThat().
                statusCode(200).
                body("name", Matchers.hasItems("fish","doggie"),
                        "id",hasSize(greaterThan(30)));



    }

}

package post_requests;

public class Post01 {
    /*
         Given
           1) https://petstore.swagger.io/v2/store/order
           2)  {
                  "petId": 10,
                  "quantity": 5,
                  "shipDate": "2022-12-04T12:21:46.297+0000",
                  "status": "placed",
                  "complete": true
                }
        When
            I send POST Request to the Url

        Then
            Status code is 200
        And
            response body is like {
                                    "id": 4465899024354589,
                                    "petId": 10,
                                    "quantity": 5,
                                    "shipDate": "2022-12-04T12:21:46.297+0000",
                                    "status": "placed",
                                    "complete": true
                                }
     */
}

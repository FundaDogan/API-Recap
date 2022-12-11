package Put_requests;

public class Put01 {
    /*
       Given
         1) https://petstore.swagger.io/v2/user/JohnDoe
         2)  {
                "id": 11234,
                "username": "JohnnyFoe",
                "firstName": "John",
                "lastName": "Doe",
                "email": "j@d.com",
                "password": "1234",
                "phone": "1234",
                "userStatus": 3
              }
      When
          I send POST Request to the Url
      Then
          Status code is 200
      And
          response body is like {
                              {
                                  "code": 200,
                                  "type": "unknown",
                                  "message": "11234"
                              }
   */
}

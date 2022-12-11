package post_requests;

public class Post02 {
    /*
         Given
           1) https://petstore.swagger.io/v2/user/
           2)  {
                  "id": 11234,
                  "username": "JohnDoe123",
                  "firstName": "John",
                  "lastName": "Doe",
                  "email": "j@d.com",
                  "password": "abc",
                  "phone": "1234",
                  "userStatus": 2
                }
        When
            I send POST Request to the Url
        Then
            Status code is 200
        And
            response body is like
                                {
                                    "code": 200,
                                    "type": "unknown",
                                    "message": "11234"
                                }
     */
}

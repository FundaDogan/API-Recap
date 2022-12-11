package post_requests;

public class Post03 {
    /*
         Given
           1) https://medunna.com/api/rooms
           2)   {
                    "createdBy": "john_doe",
                    "createdDate": "2022-12-04",
                    "roomNumber": 879396,
                    "roomType": "TWIN",
                    "status": true,
                    "price": 111,
                    "description": "My Room"
                }
        When
            I send POST Request to the Url
        Then
            Status code is 201
        And
            response body is like {
                               {
                                    "createdBy": "john_doe",
                                    "createdDate": "2022-12-04T13:40:13.537985Z",
                                    "id": 369858,
                                    "roomNumber": 879396,
                                    "roomType": "TWIN",
                                    "status": true,
                                    "price": 111,
                                    "description": "My Room"
                                }
     */
}

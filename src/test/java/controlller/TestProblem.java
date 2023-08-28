package controlller;

import base.TestBase;
import com.quince.controller.request.body.BookBodyBuilder;
import com.quince.controller.request.builder.AddBookRequestBuilder;
import com.quince.controller.request.builder.GenerateTokenRequestBuilder;
import com.quince.controller.request.builder.GetBookRequestBuilder;
import com.quince.controller.request.builder.UserRequestBuilder;
import com.quince.controller.request.client.AccountClient;
import com.quince.controller.request.client.BookClient;
import com.quince.controller.response.dto.BookListDTO;
import com.quince.controller.response.dto.TokenDTO;
import com.quince.controller.response.dto.UserResponseDTO;
import com.quince.core.RequestBody;
import com.quince.core.builder.RequestBuilder;
import dataprovider.ProblemDP;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProblem extends TestBase {

    @Test(dataProviderClass = ProblemDP.class, dataProvider = "problemDP")
    public void problem(RequestBody requestBody) {

        RequestBuilder userClientRequestBuilder = new UserRequestBuilder(requestBody).getRequestBuilder();
        String userID = new AccountClient().userClient(userClientRequestBuilder).as(UserResponseDTO.class).getUserID();

        RequestBuilder generatetokenRequestBuilder = new GenerateTokenRequestBuilder(requestBody).getRequestBuilder();
        String token = new AccountClient().generateToken(generatetokenRequestBuilder).as(TokenDTO.class).getToken();

        RequestBuilder getBookRequestBuilder = new GetBookRequestBuilder(token).getRequestBuilder();
        String bookIsbn = new BookClient().getBook(getBookRequestBuilder).as(BookListDTO.class).getBookDTOList().get(0).getIsbn();

        requestBody = new BookBodyBuilder().addBook(bookIsbn, userID);
        RequestBuilder addBookRequestBuilder = new AddBookRequestBuilder(token, requestBody).getRequestBuilder();

        Response response = new BookClient().addBook(addBookRequestBuilder);
        Assert.assertEquals(response.statusCode(), HttpStatus.SC_CREATED);
    }
}
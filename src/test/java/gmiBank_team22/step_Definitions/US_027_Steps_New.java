/*
package gmiBank_team22.step_Definitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class US_027_Steps_New<endPointUrl> {
    RequestSpecification request;
    Response response;
    ObjectMapper object ;
    JsonPath json;
    String token = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjd29idXJuIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2MDkyMjU5NjN9.bkMVmKFgZI2EGLniX-PxabqHqn77tebxLAenPk8j0xy0MgarTe5EELGndC_m3cq3xWu10IOR1aBFyBc_I42NUA";



    @Given("user can retrieve all states with GET {string}")
    public void user_can_retrieve_all_states_with_GET(String endPointUrl) {
        endPointUrl= "https://www.gmibank.com/api/tp-states/";
        request = given()
                .header("Content-Type","application/json")
                .header("Authorization",token);
        response = request.when().get(endPointUrl);
        // response.prettyPeek();
        request.log().all();
        //System.out.println(response.statusCode());
    }

    @Then("validate status code is {int}")
    public void validate_status_code_is(Integer int1) {
        response.then().assertThat().statusCode(200);
        // response.then().statusCode(200); ---> bu da assert yapar.


    }

    @Then("validate state of {string} that exists in response")
    public void validate_state_of_that_exists_in_response(String string) {


    }


}

*/

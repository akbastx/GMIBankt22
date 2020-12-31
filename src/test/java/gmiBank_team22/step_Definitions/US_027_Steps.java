package gmiBank_team22.step_Definitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class US_027_Steps {
    Response response;
    ObjectMapper object ;
    JsonPath json;
    String endPointUrl= "https://www.gmibank.com/api/tp-states/";
    String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjd29idXJuIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2MDkyMjU5NjN9.bkMVmKFgZI2EGLniX-PxabqHqn77tebxLAenPk8j0xy0MgarTe5EELGndC_m3cq3xWu10IOR1aBFyBc_I42NUA";



    @Given("user can retrieve all states with GET {string}")
    public void user_can_retrieve_all_states_with_GET(String endPointUrl) {
        endPointUrl= "https://www.gmibank.com/api/tp-states/";
        response= given()
                .accept(ContentType.JSON)
                .auth().oauth2(token)
                .when()
                .get(endPointUrl);
        response
                .prettyPrint();

        //json=response.jsonPath();
        //System.out.println(json);
    }

    @Then("validate status code is {int}")
    public void validate_status_code_is(Integer int1) {
        int1=200;
        response.then().assertThat().statusCode(int1);

    }

    @Then("validate state of {string} that exists in response")
    public void validate_state_of_that_exists_in_response(String state) {
        state = "Manisa";
        // FIRST WAY USING HAMCREST
        response.then().body("[0].name", equalTo(state));

        // SECOND WAY USING JsonPath and Junit Assert
        JsonPath desSer = response.jsonPath();

        String resstate = desSer.get("[0].name");
        System.out.println(resstate);
        Assert.assertEquals("Verifying First State is Texas -->",state,resstate);

        // THIRD WAY USING JsonPath and Junit Assert with include



    }

    @Given("user can delete states by one by one using {int}")
    public void user_can_delete_states_by_one_by_one_using(int id) {
        endPointUrl= "https://www.gmibank.com/api/tp-states/";
        response= given()
                .accept(ContentType.JSON)
                .auth().oauth2(token)
                .when()
                .delete(endPointUrl+"/"+id);


    }
    @Then("verify delete with status code {int}")
    public void verify_delete_with_status_code(Integer int1) {
        int1 = 204;
        response.then().assertThat().statusCode(int1);


    }


}

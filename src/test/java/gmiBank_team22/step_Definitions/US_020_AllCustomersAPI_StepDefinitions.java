package gmiBank_team22.step_Definitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_020_AllCustomersAPI_StepDefinitions {
     Response response;
     ObjectMapper object;
     JsonPath json;

    @Given("use the api endpoint {string}")
    public void use_the_api_endpoint(String endPointUrl) {
     response= given()
             .accept(ContentType.JSON)
             .auth().oauth2(ConfigurationReader.getProperty("token"))
             .when()
             .get(endPointUrl);
      response
              //.prettyPeek()
              .then()
              .statusCode(200);
        json=response.jsonPath();

    }

    @Then("get all customers' information as de-serialization")
    public void get_all_customers_information_as_de_serialization() {

        List<Map<String,Object>>allCustomersData= json.getList("$");
        System.out.println("allCustomersData = " + allCustomersData);
        System.out.println("First customer's first name" + allCustomersData.get(0).get("firstName"));
        object= new ObjectMapper();


    }

    @Then("write to all customers' {string},{string} and  {string} in a .txt file")
    public void write_to_all_customers_and_in_a_txt_file(String firstName, String lastName, String ssn) {

    }

    @Then("get all the information of the {string}")
    public void get_all_the_information_of_the(String theCustomer) {

    }

    @Then("verify that 5th customer's first name {string} and ssn {string}")
    public void verify_that_5th_customer_s_first_name_and_ssn(String firstName, String lastName) {

    }


    @Then("verify that second customer's city {string} and zipCode {string}")
    public void verify_that_second_customer_s_city_and_zipCode(String city, String zipCode) {

    }

    @Then("verify that third customer's firstName {string} and lastName {string}")
    public void verify_that_third_customer_s_firstName_and_lastName(String firstName, String lastName) {

    }

    @Then("verify that last customer's firstName {string} and lastName {string}")
    public void verify_that_last_customer_s_firstName_and_lastName(String firstName, String lastName) {

    }

    @Then("verify the number {int} that is equals to the customers'number created from user")
    public void verifyTheNumberThatIsEqualsToTheCustomersNumberCreatedFromUser(int totalNumberOfCustomer) {
    }

    @Then("verify that first customer's email {string} and mobilePhoneNumber {string}")
    public void verifyThatFirstCustomerSEmailAndMobilePhoneNumber(String email, String mobilePhoneNumber) {
    }
}

package gmiBank_team22.step_Definitions;

import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_021_AllCountriesAPI_StepDefinitions {

    Response response;
    JsonPath json;

    @Given("read all countries info using api end point {string}")
    public void read_all_countries_info_using_api_end_point(String string) {
        response = given().
                            accept(ContentType.JSON).
                            auth().oauth2(ConfigurationReader.getProperty("token")).
                    when().
                        get(string);
    }

    @Then("get all countries")
    public void get_all_countries() {
        json = response.jsonPath();

        List<Map<String,Object>> allCountriesData = json.getList("$");
        System.out.println(allCountriesData);
        Assert.assertNotNull(allCountriesData);

    }




}

package gmiBank_team22.step_Definitions;


public class US_021_AllCountriesAPI_StepDefinitions {

import gmiBank_team22.utilities.ConfigurationReader;

import gmiBank_team22.utilities.WriteToTxt;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_021_AllCountriesAPI_StepDefinitions {

    Response response;
    JsonPath json;
    List<Map<String,Object>> allCountriesData;

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
        allCountriesData = json.getList("$");

        //read all countries
        System.out.println(allCountriesData);

        //read first countries data => {id=18938, name=Turkey, states=null}
        System.out.println(allCountriesData.get(0));

        //read 5th country id=> 18948
        System.out.println(allCountriesData.get(4).get("id"));
        Integer expectedId = (int) allCountriesData.get(4).get("id");


        //read 8th country name => Dominic
        System.out.println(allCountriesData.get(7).get("name"));
        String expectedCountryName= allCountriesData.get(7).get("name").toString();

        //read 3rd country state => null
        System.out.println(allCountriesData.get(2).get("states"));
        String expected3rdCountryState= (String) allCountriesData.get(2).get("states");

        //read last country name => Cindy
        System.out.println(allCountriesData.get(allCountriesData.size()-1).get("name"));
        String expectedLastCountryName= allCountriesData.get(allCountriesData.size()-1).get("name").toString();


        // WriteToTxt.saveAllStates("allCountries.csv", allCountriesData );







    }

}

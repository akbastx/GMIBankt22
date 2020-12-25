package gmiBank_team22.step_Definitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.pojos.Country;
import gmiBank_team22.pojos.States;
import gmiBank_team22.utilities.*;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.List;
import java.util.Map;

public class US_022_ReadState_StepDefinitions {
    US_020_AllCustomersAPI_StepDefinitions us_020_allCustomersAPI_stepDefinitions=new US_020_AllCustomersAPI_StepDefinitions();
    States[] states;
    List<Map<String,?>> allStatesID;
    List<Map<String,?>> allStatesNAME;
    List<Map<String,?>> a;
    Response response;
    ObjectMapper object ;
    JsonPath json;
    Country country[];

    @Given("use the api endpoint {string} to read all state data")
    public void use_the_api_endpoint_to_read_all_state_data(String x) {
        response=
                given().auth().oauth2(ConfigurationReader.getProperty("token")).
                        contentType(ContentType.JSON).
                        when().get(x);
//        response.then().contentType(ContentType.JSON).statusCode(200);
        ;
        response.prettyPeek();
        json=response.jsonPath();

    }


    @When("retrieve all states information")
    public void retrieve_all_state_information() throws JsonProcessingException {
        allStatesID= json.getList("id");
        allStatesNAME=json.getList("name");
        for (int i = 0; i < allStatesID.size(); i++) {
//            a=allStatesID.get(i)+allStatesNAME.get(i);
            System.out.print(allStatesNAME.get(i)+",");
            System.out.println(allStatesID.get(i));
        }
        System.out.println("allStatesID and NAME = " + allStatesNAME+","+allStatesID);
        object =new ObjectMapper();
        states=object.readValue(response.asString(),States[].class);

        File file = new File("allStatesNames.csv");
        if (file!=null)
            file.delete();
        WriteToTxt.saveAllStates("allStatesNames.csv",states);


        ExcelUtil d = new ExcelUtil("sdsds","lale");



    }

}

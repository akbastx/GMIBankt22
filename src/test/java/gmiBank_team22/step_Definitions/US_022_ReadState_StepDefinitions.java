package gmiBank_team22.step_Definitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.pojos.States;
import gmiBank_team22.utilities.*;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.List;
import java.util.Map;

public class US_022_ReadState_StepDefinitions {
    States[] states;
    List<Map<String, ?>> allStates;
    List<String> allStatesNAME;
    List<String> allStatesID;
    String allStates1 = "";
    String expectedStateName = "MA";
    String eachStateName;
    Response response;
    ObjectMapper object;
    JsonPath json;
    String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtam9obiIsImF1dGgiOiJST0xFX0VNUExPWUVFIiwiZXhwIjoxNjA5MDIxOTYxfQ.07tsOh3enze3gAurGvKX0C_uK8aBk94kx8HeZmpRq2WQB41HE-sI5Ox0c9fd8dOsc4rJJucqL70JN4El2hrNeg";


    @Given("use the api endpoint {string} to read all state data")
    public void use_the_api_endpoint_to_read_all_state_data(String url) {
        response =
                given().
                        auth().oauth2(token).
                        contentType(ContentType.JSON).
                        when().
                        get(url);
        response.then().
                contentType(ContentType.JSON).
                statusCode(200);
        json = response.jsonPath();

    }


    @When("retrieve all states information")
    public void retrieve_all_state_information() throws JsonProcessingException {
        allStates = json.getList("$");
        allStatesID = json.getList("id");
        allStatesNAME = json.getList("name");
        for (int i = 0; i < allStatesID.size(); i++) {
            eachStateName += allStatesNAME.get(i) + "\n";
        }
        Assert.assertFalse("Test Pass", eachStateName.contains(expectedStateName));

        object = new ObjectMapper();
        states = object.readValue(response.asString(), States[].class);

        for (int i = 0; i < states.length; i++) {
            allStates1 += states[i].getName() + "," + states[i].getId() + "\n";
        }

        File file = new File("allStatesNames.csv");
        file.delete();
        WriteToTxt.saveAllStates("allStatesNames.csv", states);
        List<States> allStatesCsv = ReadTxt.returnCAllStates("allStatesNames.csv");
    }

    @Given("user connect database print all State data and validate with api")
    public void user_connect_database_and_print_all_State_data() {
        DataBaseUtility.createConnection();
        String queryState = "SELECT * FROM public.tp_state";
        List<String> columnNames = DataBaseUtility.getColumnNames(queryState);
        List<Object> name = DataBaseUtility.getColumnData(queryState, "name");

        Assert.assertFalse("Test Pass", name.contains(expectedStateName));
        Assert.assertEquals("db&api not match", allStatesNAME, name);

        DataBaseUtility.closeConnection();
    }

}

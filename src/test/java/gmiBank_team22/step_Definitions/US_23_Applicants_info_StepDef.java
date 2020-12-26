package gmiBank_team22.step_Definitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.pojo.Applicants;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.WriteToTxt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class US_23_Applicants_info_StepDef {
    Response response;
    ObjectMapper object;
    List<Map<String,Object>> allApplicantsFromData;
    JsonPath jp;
    ObjectMapper obj;
    String filePath="AllApplicants.txt";
    Applicants[] applicants;



    @Given("use the api endpoint https:{string}")
    public void useTheApiEndpointHttps(String url) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        // response.prettyPrint();
        jp = response.jsonPath();
    }

    @Then("Get all data deserialized into Java")
    public void getAllDataDeserializedIntoJava() {
        allApplicantsFromData = jp.getList("$");
        System.out.println("Show Data is De-serialized: " +allApplicantsFromData.get(0).get("id"));

        // System.out.println("ALLApplicant's Data"+allApplicantsFromData);
    }

    @And("write all Applicant's information into a file")
    public void writeAllApplicantSInformationIntoAFile() throws IOException {
        object = new ObjectMapper();
        applicants = object.readValue(response.asString(), Applicants[].class);
        WriteToTxt.saveAllApplicants(filePath,applicants);
       Integer id= applicants[0].getId();
        System.out.println("Shows my Pojo Class have all Data:  "+ id);
    }

    @Then("read all applicants in Application")
    public void readAllApplicantsInApplication() {
        System.out.println("First Applicant Id: "+allApplicantsFromData.get(0).get("id"));
        System.out.println("Second Applicant Id: "+allApplicantsFromData.get(1).get("id"));
        System.out.println("Third Applicant Id: "+allApplicantsFromData.get(2).get("id"));
        System.out.println("Fourth Applicant Id: "+allApplicantsFromData.get(3).get("id"));
        System.out.println("Fifth Applicant Id: "+allApplicantsFromData.get(4).get("id"));


    }

    @Then("validate all Aplicant's numbers")
    public void validateAllAplicantSNumbers() {
        Integer applicantDataSize=allApplicantsFromData.size();
        Integer myDataApplicantSize =applicants.length;
        System.out.println("How many applicant in application in server Data: "+applicantDataSize+"How many applicant in application in My Data: "+myDataApplicantSize);
        Assert.assertThat("Size's are not Equal", myDataApplicantSize, is(myDataApplicantSize));
    }

    @And("verify first Applicant's id <{int}>")
    public void verifyFirstApplicantSId(int id) {

        Integer actual= (Integer) allApplicantsFromData.get(0).get("id");
         System.out.println("actual "+actual);
        int expected = id;
         System.out.println("expected "+expected);
        assertThat("id's are not Equal",actual,is(expected));
            }

    @And("verify second Applicant's ssn {string}")
    public void verifySecondApplicantSSsn(String ssn) {
   String actual = (String) allApplicantsFromData.get(1).get("ssn");
       System.out.println("actual: " + actual);

        String expected = ssn;
        System.out.println("expected  : "+ssn);
        assertThat("SSN's are not Equal",actual, is(expected));

    }

    @And("verify third Applicant's firstName {string}")
    public void verifyThirdApplicantSFirstName(String firstName) {
        String actual = (String) allApplicantsFromData.get(2).get("firstName");
      //  System.out.println("actual: " + actual);

        String expected = firstName;
       // System.out.println("expected  : "+firstName);
        assertThat("FirstNAme''s are not Equal",actual, is(expected));

    }

    @And("verify fourth Applicant's lastName {string}")
    public void verifyFourthApplicantSLastName(String lastName) {
        String actual = (String) allApplicantsFromData.get(3).get("lastName");
        //System.out.println("actual: " + actual);

        String expected = lastName;
       // System.out.println("expected  : "+lastName);
        assertThat("LastName's are not Equal",actual, is(expected));

    }

    @And("verify fifth Applicant's address {string}")
    public void verifyFifthApplicantSAddress(String address) {
        String actual = (String) allApplicantsFromData.get(4).get("address");
        //System.out.println("actual: " + actual);

        String expected = address;
       // System.out.println("expected  : "+address);
        assertThat("Address's are not Equal",actual, is(expected));

    }

    @And("verify sixth Applicant's mobilePhoneNumber {string}")
    public void verifySixthApplicantSMobilePhoneNumber(String mobilePhoneNumber) {
        String actual = (String) allApplicantsFromData.get(5).get("mobilePhoneNumber");
        //System.out.println("actual: " + actual);

        String expected = mobilePhoneNumber;
       // System.out.println("expected  : "+mobilePhoneNumber);
        assertThat("MobilePhoneNumber's are not Equal",actual, is(expected));
    }

    @And("verify seventh Applicant's userId  <{int}>")
    public void verifySeventhApplicantSUserId(int userId) {
        Integer actual= (Integer) allApplicantsFromData.get(6).get("userId");
         System.out.println("actual "+actual);
        int expected = userId;
         System.out.println("expected "+expected);
        assertThat("UserId's are not Equal",actual,is(expected));

    }

    @And("verify eighth Applicant's userName {string}")
    public void verifyEighthApplicantSUserName(String userName) {
        String actual = (String) allApplicantsFromData.get(7).get("userName");
        System.out.println("actual: " + actual);

        String expected = userName;
         System.out.println("expected  : "+userName);
        assertThat("UserName's are not Equal",actual, is(expected));
    }

    @And("verify nineth Applicant'semail  {string}")
    public void verifyNinethApplicantSemail(String email) {
        String actual = (String) allApplicantsFromData.get(8).get("email");
        System.out.println("actual: " + actual);

        String expected = email;
        System.out.println("expected  : "+email);
        assertThat("Email's are not Equal",actual, is(expected));
    }

    @Then("verify tenth Applicant's createDate {string}")
    public void verifyTenthApplicantSCreateDate(String createDate) {
        String actual = (String) allApplicantsFromData.get(9).get("createDate");
        System.out.println("actual: " + actual);

        String expected = createDate;
        System.out.println("expected  : "+createDate);
        assertThat("CreateDate's are not Equal",actual, is(expected));
    }
}

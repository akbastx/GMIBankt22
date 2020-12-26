package gmiBank_team22.step_Definitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.pojos.Country;
import gmiBank_team22.pojos.Customer;
import gmiBank_team22.pojos.Users;
import gmiBank_team22.utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_030_PDf_Step_Def {

    List<Object>alluserinfo;

    @Given("user makes a connection with database using {string},{string} and {string}")
    public void user_makes_a_connection_with_database_using_and(String port, String username, String password) {
        DataBaseUtility.createConnection(port,username,password);

    }
    @Given("user gets all customer info using {string} and {string} and {string}")
    public void user_gets_all_customer_info_using_and_and(String query, String columnName, String fileType) {
        List<Object> listofCustomer = DataBaseUtility.getColumnData(query, columnName);
        WriteToTxt.saveDifferentUserInfoFromDataBase(fileType, listofCustomer);

    }

    @Then("user validates customer info")
    public void user_validates_customer_info() {
        List<Customer>list = new ArrayList<>();
        List<Object>SSNs = ReadTxt.returnAllfromDatabase("CustomerSSn.txt");
        List<Object>names = ReadTxt.returnAllfromDatabase("firstName.txt");
        List<Object>zipCodes = ReadTxt.returnAllfromDatabase("zipCode.txt");
        List<Object>countries = ReadTxt.returnAllfromDatabase("countryName.txt");
        List<Object>states = ReadTxt.returnAllfromDatabase("stateName.txt");
        for(int i = 0;i<10 ;i++){
            Customer customer = new Customer();
            Country country = new Country();
            customer.setFirstName(names.get(i).toString());
            customer.setSsn(SSNs.get(i).toString());
            customer.setZipCode(zipCodes.get(i).toString());
            customer.setState(states.get(i).toString());
            country.setName(countries.get(i).toString());



            customer.setCountry(country);
            list.add(customer);


        }
        PdfGenerator.pdfGeneratorRowsAndCellsWithList("Customers Info",list,"CustomersInfo.pdf");



    }










}
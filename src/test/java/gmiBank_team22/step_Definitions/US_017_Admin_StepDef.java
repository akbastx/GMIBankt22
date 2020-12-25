package gmiBank_team22.step_Definitions;

import gmiBank_team22.pages.US_0017_Admin_Page;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US_017_Admin_StepDef {
    US_0017_Admin_Page admin_page = new US_0017_Admin_Page();
    // adminPojo = new Admin_Pojo();

    @Given("User signIn as a Admin")
    public void user_signIn_as_a_Admin() {
        admin_page.setSignIn();

    }

    @Then("Go to User Management Page")
    public void go_to_User_Management_Page() {
        admin_page.navigateAdministration();

    }

    @When("Admin can click to  activate button a role as {string}")
    public void admin_can_click_to_activate_button_a_role_as(String user) {
        admin_page.clickActivationText(user);
        System.out.println("user = " + user);

    }

    @Then("Should see message for {string}")
    public void should_see_message_for(String expectedMessage) {
        String actualMessage = admin_page.getAlertText();
        Assert.assertEquals(actualMessage, expectedMessage);

        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);

    }


    @Then("Click on view button {string}")
    public void click_on_view_button(String name) {
        admin_page.SetViewButton(name);

    }


    @Then("Admin can view all user info \\(admin, manager, employee and user):")
    public void admin_can_view_all_user_info_admin_manager_employee_and_user(List<String> expectedUserInfo) {

        List<String> actualTable = admin_page.UserInfoTable();
        Assert.assertEquals(actualTable, expectedUserInfo);
        System.out.println("actualTable = " + actualTable);

        System.out.println("expectedUserInfo = " + expectedUserInfo);


    }

    @Then("Click on edit button {string}")
    public void click_on_edit_button(String name) {
        admin_page.SetEditButton(name);
    }


    @When("Admin can Edit user name and last name and click to save button")
    public void admin_can_Edit_user_name_and_last_name_and_click_to_save_button() {
        admin_page.editUser();
    }

    @When("Click on delete button {string}")
    public void click_on_delete_button(String name) {
        admin_page.SetDeleteButton(name);
    }

//
//@When("Admin can click click to second delete {string} button")
//public void admin_can_click_click_to_second_delete_button(String name) {
//        admin_page.SetDeleteButton(name);
//
//}
@When("Admin can click to second delete")
public void admin_can_click_to_second_delete() {
        Driver.waitForVisibility(admin_page.secondDelete,5).click();

}
    @Then("Should see {string}")
    public void should_see(String expectedMessage) {
        Driver.wait(5);
        String actualMessage=admin_page.deleteMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        System.out.println("actualMessage = " + actualMessage);
        System.out.println("expectedMessage = " + expectedMessage);

    }
}

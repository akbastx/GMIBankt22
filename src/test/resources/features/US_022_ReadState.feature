
#@When("Click on edit button for a costumer")
#public void click_on_edit_button_for_a_costumer() {
#employeePage.MyOperationsMenu.click();
#employeePage.ManageCostumerButton.click();
#employeePage.viewbutton.click();
#}


@api
@US_006_ReadState
Feature: System should allow to read states using "tp-states" end point.
  Background:
    Given use the api endpoint "https://www.gmibank.com/api/tp-states" to read all state data

@wip
  Scenario:
  When retrieve all states information


#    Scenario Outline:
#      Given use the api endpoint "<x>" to read all state data
#      When retrieve all "<y>" information
#      Examples:
#      |x|y|
#      |/tp-countries|country|
#      |/tp-states|state|




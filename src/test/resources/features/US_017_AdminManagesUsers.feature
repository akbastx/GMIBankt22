@US_017_Admin


Feature: Admin to manage user

  @Admin_01
  Scenario: Admin can activate a role as user
    Given User signIn as a Admin
    Then Go to User Management Page
    When Admin can click to  activate button a role as "erol"
    Then Should see message for "A user is updated with identifier erol"


  @Admin_02
  Scenario: Admin can activate a role as employee
    Given User signIn as a Admin
    Then Go to User Management Page
    When Admin can click to  activate button a role as "tahsin"
    Then Should see message for "A user is updated with identifier tahsin"


  @Admin_03
  Scenario: Admin can activate a role as manager
    Given User signIn as a Admin
    Then Go to User Management Page
    When Admin can click to  activate button a role as "pixie_manager"
    Then Should see message for "A user is updated with identifier pixie_manager"

  @Admin_04
  Scenario: Admin can activate a role as customer
    Given User signIn as a Admin
    Then Go to User Management Page
    When Admin can click to  activate button a role as "alkaz"
    Then Should see message for "A user is updated with identifier alkaz"

  @Admin_05
  Scenario: Admin can activate a role as admin
    Given User signIn as a Admin
    Then Go to User Management Page
    When Admin can click to  activate button a role as "team4"
    Then Should see message for "A user is updated with identifier team4"

  @Admin_06
  Scenario: Admin can view all user info (admin, manager, employee and user)
    Given User signIn as a Admin
    Then Go to User Management Page
    And Click on view button "example2ek"
    Then  Admin can view all user info (admin, manager, employee and user):
      | example2ek Activated |
      | example22ek          |
      | example22ek          |
      | example2@dsadsa.com  |
      | English              |
      | anonymousUser        |
      | 07/10/20 18:36       |
      | group16admin         |
      | 23/12/20 16:19       |
      | ROLE_USER            |

  @Admin_07
  Scenario: Admin can edit all user info (admin, manager, employee and user)
    Given User signIn as a Admin
    Then Go to User Management Page
    And Click on edit button "example2ek"
    When  Admin can Edit user name and last name and click to save button
    Then Should see message for "A user is updated with identifier example2ek"

  @Admin_08
  Scenario: Admin can Delete all user info (admin, manager, employee and user)
    Given User signIn as a Admin
    Then Go to User Management Page
    When Click on delete button "pader49"
    And Admin can click to second delete
    Then Should see "A user is deleted with identifier pader49"





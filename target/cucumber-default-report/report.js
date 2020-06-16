$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddWorkExperience.feature");
formatter.feature({
  "name": "Add Work Experience",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Hrms is logged in as Admin",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddWorkExperienceSteps.user_navigates_to_Hrms_is_logged_in_as_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to employee list",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddWorkExperienceSteps.user_navigates_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches employee by id number \"11331\" and clicks on employee",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddWorkExperienceSteps.user_searches_employee_by_id_number_and_clicks_on_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Qualifications tab and clicks on Add button under Work Experience",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddWorkExperienceSteps.user_clicks_on_Qualifications_tab_and_clicks_on_Add_button_under_Work_Experience()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the following details and user clicks save button and sees work experience added to list",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddWorkExperienceSteps.user_enters_the_following_details_and_user_clicks_save_button(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "");
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/verify_product_category_functionalities.feature");
formatter.feature({
  "name": "Verify Product category CRUD functionalities",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Product category CRUD functionalities",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I generate all test random value",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definations.verify_product_category_functionalities.i_generate_all_test_random_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a category",
  "keyword": "* "
});
formatter.match({
  "location": "step_definations.verify_product_category_functionalities.i_create_a_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify category id and name",
  "keyword": "* "
});
formatter.match({
  "location": "step_definations.verify_product_category_functionalities.i_verify_category_id_and_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I update category with ABCD1234 as category name",
  "keyword": "* "
});
formatter.match({
  "location": "step_definations.verify_product_category_functionalities.i_update_category_with_ABCD1234_as_category_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify updated category name",
  "keyword": "* "
});
formatter.match({
  "location": "step_definations.verify_product_category_functionalities.i_verify_updated_category_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete that category",
  "keyword": "* "
});
formatter.match({
  "location": "step_definations.verify_product_category_functionalities.i_delete_that_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I veriy category is deleted",
  "keyword": "* "
});
formatter.match({
  "location": "step_definations.verify_product_category_functionalities.i_veriy_category_is_deleted()"
});
formatter.result({
  "status": "passed"
});
});
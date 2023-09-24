package StepDefinitions;

import PageObjects.TreePage;
import Utilities.Log4j;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStepDefinition {

	TreePage tree = new TreePage();
	Log4j log = new Log4j();
@Given("The user is on the Tree page after logged in")
public void the_user_is_on_the_tree_page_after_logged_in() {
   tree.clickTreePage();
}

@When("The user clicks on the Overview of Trees link")
public void the_user_clicks_on_the_overview_of_trees_link() {
  tree.clickoverviewoftrees();
}

@Then("The user should be directed to the Overview of Trees of tree Page")
public void the_user_should_be_directed_to_the_overview_of_trees_of_tree_page() {
	tree.getDriverTitle();
}

@Given("The user is on the overview of trees after logged in")
public void the_user_is_on_the_overview_of_trees_after_logged_in() {
	String Title = tree.getDriverTitle();
	log.info("The user is on page"+Title);
}

@When("The user clicks Try Here button in a tree page")
public void the_user_clicks_try_here_button_in_a_tree_page() {
   // tree.clickTryHere();
}

@Then("The user should be redirected to a page having tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_try_editor_with_a_run_button_to_test() {
	String Title = tree.getDriverTitle();
	log.info("The user is on page"+Title);
}


}

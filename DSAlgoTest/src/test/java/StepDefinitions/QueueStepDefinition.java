package StepDefinitions;

import PageObjects.QueuePage;
import Utilities.Log4j;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueStepDefinition {
	
	QueuePage queue = new QueuePage();
	Log4j log = new Log4j();
	
	@Given("The user in queue page")
	public void the_user_in_queue_page() {
		queue.clickQueuePage();
	}

	@When("The user clicks on Implementation of queue in python link")
	public void the_user_clicks_on_implementation_of_queue_in_python_link() {
		queue.clickImplQueuePython();
	}

	@Then("The user should be directed to Implementation of Queue in Python page")
	public void the_user_should_be_directed_to_implementation_of_queue_in_python_page() {
		queue.getDriverTitle();
	}

	@Given("The user is in Implementation of queue in python link page")
	public void the_user_is_in_implementation_of_queue_in_python_link_page() {
		String Title = queue.getDriverTitle();
		log.info("The user is on page"+Title);
	
	}

	@When("The user clicks on Tryhere link")
	public void the_user_clicks_on_tryhere_link() {
		  queue.clickTryHere();
	}

	@Then("The user navigates to Editor page with Run button")
	public void the_user_navigates_to_editor_page_with_run_button() {
		System.out.println("test");
		}
	
	@Given("The user is in a page having an Editor with a Run button to test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
		queue.clickEditorUrl();
	}

	@When("The user enters valid python code in Editor from sheet {string}")
	public void the_user_enters_valid_python_code_in_editor_from_sheet(String string) throws InterruptedException {
		queue.runValidPythonCode(string);
		}

	@When("clicks run button")
	public void clicks_run_button() throws InterruptedException {
		   queue.clickRun();
		 }

	@Then("The user is presented with the result after run button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() throws InterruptedException {
		queue.getOutput();
	}

	@When("The user enters invalid python code in Editor from sheet {string}")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet(String string) throws InterruptedException {
		 queue.runInvalidPythonCode(string);
	}

	@Then("The user gets an error message")
	public void the_user_gets_an_error_message() {
	    queue.getErrorText();
	}

		
	@Given("The user in editor page and navigates to the queue page")
	public void the_user_in_editor_page_and_navigates_to_the_queue_page() {
		queue.back();
	}

	@When("The user clicks on Implementation using collections deque link")
	public void the_user_clicks_on_implementation_using_collections_deque_link() {
	   queue.clickImplQueueColl();
	}

	@Then("The user should be redirected to Implementation using collections deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
	    queue.getDriverTitle();
	}

	@Given("The user in implementation using collections page")
	public void the_user_in_implementation_using_collections_page() {
		//queue.close();
	}
	

	@When("The user clicks on Implementation using array link")
	public void the_user_clicks_on_implementation_using_array_link() {
	   queue.clickImplArray();
	}

	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
	   queue.getDriverTitle();
	}

	@Given("The user in implementation using array page")
	public void the_user_in_implementation_using_array_page() {
		 queue.clickImplArray();
	}

	@When("The user clicks on Queue Operations link")
	public void the_user_clicks_on_queue_operations_link() {
	   queue.clickQueueOperations();
	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
	   queue.getDriverTitle();
	}

	@Given("The user in Queue Operations page")
	public void the_user_in_queue_operations_page() {
		 queue.clickQueueOperations();
	}

	@Given("The user is in Editor page and navigates to QueueOp page")
	public void the_user_is_in_editor_page_and_navigates_to_queue_op_page() {
		 queue.clickQueueOperations();
	}

	@When("the user clicks on Practice Questions")
	public void the_user_clicks_on_practice_questions() {
	  queue.clickQueuePracticeQtns();
	}

	@Then("The user is directed to Practice page")
	public void the_user_is_directed_to_practice_page() {
	   queue.getDriverTitle();
	}
	
}

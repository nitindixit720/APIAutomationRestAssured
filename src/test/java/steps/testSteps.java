package test.java.steps;

import com.jayway.jsonpath.JsonPath;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import main.java.common.Common;
import main.java.constants.Constant;
import main.java.utility.APIHelper;
import main.java.utility.TestSuiteHelper;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static main.java.utility.TestSuiteHelper.getValueFromFile;

public class testSteps {

    @Given("^I set Post login api endpoint$")
    public String setPostEndpoint() throws IOException {
        String base_uri = getValueFromFile("Base_URL");
        String endPoint = getValueFromFile("End_Point");
        String URL = base_uri + endPoint;
        return URL;
    }

    @When("^I set the request header$")
    public Map<String, String> setHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put(Constant.ApiTestConstants.CONTENTTYPEKEY, Constant.ApiTestConstants.CONTENTTYPEVALUE);
        return headers;
    }
    @And("^I set the request body$")
    public JSONObject setRequestBody() {
        JSONObject json=new JSONObject();
        json.put(Constant.ApiTestConstants.USERIDKEY, "username");
        json.put(Constant.ApiTestConstants.PASSWORDKEY, "password");
        json.put(Constant.ApiTestConstants.REMEMBERME, Constant.ApiTestConstants.REMEMBERMESTATUS);
        return json;
    }

    @And("^Sends post HTTP request$")
    public Response setLoginAPI() throws IOException {
        Response resp = APIHelper.apiPost(setPostEndpoint(), setHeaders(), setRequestBody());
        Common.ApiExecutorClass.XAUTHTOKEN = JsonPath.read(resp.asString(), "$.responseData.X-Authorization-Token");
        return resp;
    }

    @Then("^I received valid HTTP response code 200$")
    public void verifyStatusCode() throws IOException {
        TestSuiteHelper.verifyApiResponse(setLoginAPI());
    }

}

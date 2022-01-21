package com.virgingames.cucumber.stepdefs;

import com.virgingames.steps.VirginGamesSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

public class StatusCodeSteps {

    //variable declaration to store values of response, so that we can use it for multiple steps if needed
    static ValidatableResponse response;

    //@Steps to initialise object of GamesSteps class
    @Steps
    VirginGamesSteps virginGamesSteps;

    @When("^User sends a GET request with '/bingo' path and '/GetBingoLobbyFeed\\.do' end point$")
    public void userSendsAGETRequestWithBingoPathAndGetBingoLobbyFeedDoEndPoint() {
        response = virginGamesSteps.checkStatusCode();
    }

    @Then("^User gets valid status code '200'$")
    public void userGetsValidStatusCode() {
        response = virginGamesSteps.checkStatusCode();
    }
}

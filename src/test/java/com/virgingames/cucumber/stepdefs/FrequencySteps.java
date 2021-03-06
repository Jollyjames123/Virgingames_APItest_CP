package com.virgingames.cucumber.stepdefs;

import com.virgingames.steps.VirginGamesSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class FrequencySteps {

    //List declaration to store values of response, so that we can use it for multiple steps if needed
    static List<String> defaultGameFrequency;

    //@Steps to initialise object of GamesSteps class
    @Steps
    VirginGamesSteps virginGamesSteps;


    @And("^User extracts default value of all game frequency$")
    public void userExtractsDefaultValueOfAllGameFrequency() {

        defaultGameFrequency = virginGamesSteps.extractDefaultGameFrequency();
    }

    @Then("^User is able to verify default value of game frequency$")
    public void userIsAbleToVerifyDefaultValueOfGameFrequency() {
        virginGamesSteps.verifyDefaultGameFrequency();
    }
}

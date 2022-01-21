package com.virgingames.cucumber.stepdefs;

import com.virgingames.steps.VirginGamesSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class TimeStampSteps {


    public static ValidatableResponse response;
    public static long currentTimeStamp;
    public static List<Long> startTimeList;

    //@Steps to initialise object of GamesSteps class
    @Steps
    VirginGamesSteps virginGamesSteps;

    @And("^User gets current timestamp$")
    public void userGetsCurrentTimestamp() {
        virginGamesSteps.currentTimeStamp();
    }

    @And("^User extracts the starttimes for all the games$")
    public void userExtractsTheStarttimesForAllTheGames() {
        virginGamesSteps.extractTimeStamps();
    }

    @Then("^User is able to verify that timestamp value is in future$")
    public void userIsAbleToVerifyThatTimestampValueIsInFuture() {
        virginGamesSteps.verifyGameTimeStamps();
    }
}

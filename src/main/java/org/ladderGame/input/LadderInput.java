package org.ladderGame.input;

import org.ladderGame.controller.LadderController;

import java.util.Scanner;

public class LadderInput {
  private Scanner input = new Scanner(System.in);


  public void enterPlayerName(LadderController ladderController) {
    String playerName = this.input.nextLine();

    ladderController.checkNumberOfValidInput(playerName);
  }

  public void enterReword() {
    String rewords = this.input.nextLine();

  }

  public void enterLadderLine() {
    String ladderLine = this.input.nextLine();

  }
}

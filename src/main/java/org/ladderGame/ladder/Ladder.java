package org.ladderGame.ladder;

import org.ladderGame.controller.LadderController;
import org.ladderGame.input.LadderInput;

public class Ladder {
  private LadderController ladderController = new LadderController();
  private LadderInput ladderInput = new LadderInput();

  public void startGame() {

    System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");

    ladderInput.enterPlayerName(ladderController);
  }
}

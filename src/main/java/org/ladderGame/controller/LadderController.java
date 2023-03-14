package org.ladderGame.controller;

import org.ladderGame.ladder.Ladder;

public class LadderController {

  private void splitInput(String input) {
    // output에 list형식으로 만들어서 넣어주기
  }

  public boolean checkNumberOfValidInput(String input) {
    if (input.contains(",")) {
      this.splitInput(input);
      return true;
    }
    System.out.println("적어도 2명 이상의 사람 이름을 입력하세요.");
    return false;
  }
}

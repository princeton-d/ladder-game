package org.ladderGame;

import org.ladderGame.domain.player.Players;
import org.ladderGame.view.InputView;
import org.ladderGame.view.OutputView;

public class Game {

  private InputView inputView = new InputView();
  private OutputView outputView = new OutputView();

  public void startGame() {
    String[] playerNames = inputView.enterPlayerName();
    String[] rewards = inputView.enterReward();
    int heightOfLadder = inputView.enterLadderHeight();

    Players players = Players.create(playerNames);

  }
}
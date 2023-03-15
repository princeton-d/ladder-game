package org.ladderGame.game;

import org.ladderGame.ladder.Ladder;
import org.ladderGame.player.Player;
import org.ladderGame.reword.Reword;

import java.util.Scanner;

public class Game {
  private Player player = new Player();
  private Ladder ladder = new Ladder();
  private Reword reword = new Reword();
  private Scanner scanner = new Scanner(System.in);

  public void startGame() {
    enterPlayerName(this.player);
    enterReword(this.reword);
    enterLadderLine(this.ladder);
  }

  private void enterPlayerName(Player player) {
    System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요");
    player.forwardPlayerName(scanner.nextLine());
  }

  private void enterReword(Reword reword) {
    System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요");
    reword.forwardReword(scanner.nextLine());
  }

  private void enterLadderLine(Ladder ladder) {
    System.out.println("최대 사다리 높이는 몇 개인가요?");
    try {
      String input = scanner.nextLine();
      int ladderLine = Integer.parseInt(input);
      ladder.forwardLadder(ladderLine);
    } catch (NumberFormatException exception) {
      System.out.println("사다리 높이는 숫자만 입력할 수 있습니다.");
    }
  }
}

package org.ladderGame.reword;

public class Reword {
  private String[] rewords;

  public void forwardReword(String reword) {
    this.rewords = reword.split(",");
  }
}

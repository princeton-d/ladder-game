package org.ladderGame.player;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private String name;
  private String reword;
  private String[] names;

  public void forwardPlayerName(String name) {
    this.names = name.split(",");
  }
}

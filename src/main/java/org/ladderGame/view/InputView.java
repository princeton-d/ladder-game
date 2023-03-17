package org.ladderGame.view;

import java.util.Scanner;

public class InputView {
    
    private static final String DELIMITER = ",";
    private Scanner scanner = new Scanner(System.in);
    
    public String[] enterPlayerName(OutputView outputView) {
        outputView.printPlayerNameGuide();
        String line = scanner.nextLine();
        return line.split(DELIMITER);
    }
    
    public String[] enterReward(OutputView outputView) {
        outputView.printRewardGuide();
        String line = scanner.nextLine();
        return line.split(DELIMITER);
    }
    
    public int enterLadderHeight(OutputView outputView) {
        outputView.printLadderHeightGuide();
        String input = null;
        try {
            input = scanner.nextLine();
        } catch (NumberFormatException exception) {
            System.out.println("사다리 높이는 숫자만 입력할 수 있습니다.");
        }
        return Integer.parseInt(input);
    }
}
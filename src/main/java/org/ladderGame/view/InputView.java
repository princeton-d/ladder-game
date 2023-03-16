package org.ladderGame.view;

import java.util.Scanner;

public class InputView {

    private static final String DELIMITER = ",";
    private Scanner scanner = new Scanner(System.in);

    public String[] enterPlayerName() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요");
        String line = scanner.nextLine();
        return line.split(DELIMITER);
    }

    public String[] enterReward() {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요");
        String line = scanner.nextLine();
        return line.split(DELIMITER);
    }

    public int enterLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        String input = null;
        try {
            input = scanner.nextLine();
        } catch (NumberFormatException exception) {
            System.out.println("사다리 높이는 숫자만 입력할 수 있습니다.");
        }
        return Integer.parseInt(input);
    }
}
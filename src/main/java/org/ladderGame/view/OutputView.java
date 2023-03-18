package org.ladderGame.view;

import org.ladderGame.domain.ladder.Ladder;

public class OutputView {
    
    public void printPlayerNameGuide() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요");
    }
    
    public void printRewardGuide() {
        System.out.println("\n실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요");
    }
    
    public void printLadderHeightGuide() {
        System.out.println("\n최대 사다리 높이는 몇 개인가요?");
    }
    
    public void printLadder(Ladder ladder) {
        String[][] ladderBodyArray = ladder.getLadderBody();
        
        System.out.println("\n사다리 결과\n");
        System.out.println(ladder.getPlayerList());
        this.printLadderBody(ladderBodyArray);
        System.out.println(ladder.getRewardList());
    }
    
    private void printLadderBody(String[][] ladderBodyArray) {
        for (String[] row : ladderBodyArray) {
            System.out.println(String.join("", row));
        }
    }
}
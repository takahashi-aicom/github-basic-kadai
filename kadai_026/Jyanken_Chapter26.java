package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

    public String getMyChoice() {
        System.out.println("あなたのじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("r") || input.equals("s") || input.equals("p")) {
            scanner.close();
        } else {
            System.out.println("再入力してください");
        }

        return input;
    }

    public String getRandom() {
        String[] rspArray = { "r", "s", "p" };
        String random = rspArray[(int) Math.floor(Math.random() * 3)];
        return random;
    }

    public void playGame() {
        HashMap<String, String> hand = new HashMap<String, String>();

        hand.put("r", "グー");
        hand.put("s", "チョキ");
        hand.put("p", "パー");

        String myChoice = getMyChoice();
        String choice = getRandom();

        System.out.println(
                "あなたの手は" + hand.get(myChoice) + "," + "対戦相手の手は" + hand.get(choice));

        if (myChoice.equals(choice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && choice.equals("s")) || (myChoice.equals("s")
                && choice.equals("p")) || (myChoice.equals("p") && choice.equals("r"))) {
            System.out.println("あなたの勝ちです");
        } else {
            System.out.println("あなたの負けです");
        }
    }
}

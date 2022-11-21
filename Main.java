import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//↑importしなきゃいけないやつ。標準型ではないので、java内にはあるが、インポートをしないと使えない。標準型はインポートしなくても使える。

public class Main {
    public static void main(String[] args) {

        System.out.println("<<<List of cars>>>");
        //各車種の情報リスト
        List<Engine> engineList = new ArrayList<>();
        engineList.add(new Engine("DEMIO", 1500, EngineType.GAS));
        engineList.add(new Engine("SOLIO", 1200, EngineType.HYBRID));
        engineList.add(new Engine("WRANGLER", 3600, EngineType.GAS));
        engineList.add(new Engine("LEAF", 0, EngineType.ELECTRONIC));

        //車種名だけ表示　for分はfor each形を使いたい
        for (Engine engine : engineList) {
            engine.dispName();
            System.out.println("--------");
        }

        //参照システム：指定4車種以外を入力した場合、flag=trueにして再度入力指示へ
        boolean flag;
        do {
            //入力機能
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type your favorite model...");
            String test = scanner.next();
            flag = false;

            //一致した車種名の情報を表示
            switch (test) {
                case "DEMIO" -> engineList.get(0).dispEngine();
                case "SOLIO" -> engineList.get(1).dispEngine();
                case "WRANGLER" -> engineList.get(2).dispEngine();
                case "LEAF" -> engineList.get(3).dispEngine();
                default -> {
                    System.out.println("You can type only 4 models: \"DEMIO\",\"SOLIO\",\"WRANGLER\",\"LEAF\"");
                    flag = true;
                }
            }
        }while(flag);

    }
}

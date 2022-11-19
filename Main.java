import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//↑importしなきゃいけないやつ。標準型ではないので、java内にはあるが、インポートをしないと使えない。標準型はインポートしなくても使える。

public class Main {
    public static void main(String[] args) {

        System.out.println("<<<List of cars>>>");
        //各車種の情報リスト
        List<Engine> engineList=new ArrayList<>();
        engineList.add(new Engine("DEMIO",1500, EnType.GAS));
        engineList.add(new Engine("SOLIO",1200, EnType.HYBRID));
        engineList.add(new Engine("WRANGLER",3600,EnType.GAS));
        engineList.add(new Engine("LEAF",0,EnType.ELECTRONIC));

        //車種名だけ表示　for分はfor each形を使いたい
        for(Engine engine:engineList){
            engine.dispName();
            System.out.println("--------");
        }

        //参照システム：指定4車種以外を入力した場合、flag=trueにして再度入力指示へ
        boolean flag=false;
        do {
            //入力機能
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type your favorite model...");
            String test = scanner.next();
            flag=false;

            //一致した車種名の情報を表示
            Engine search;
            if (test.equals("DEMIO")) {
                search = engineList.get(0);
                search.dispEngine();
            } else if (test.equals("SOLIO")) {
                search = engineList.get(1);
                search.dispEngine();
            } else if (test.equals("WRANGLER")) {
                search = engineList.get(2);
                search.dispEngine();
            } else if (test.equals("LEAF")) {
                search = engineList.get(3);
                search.dispEngine();
            } else {
                System.out.println("You can type only 4 models: \"DEMIO\",\"SOLIO\",\"WRANGLER\",\"LEAF\"");
                flag=true;
            }
        }while(flag);

    }
}

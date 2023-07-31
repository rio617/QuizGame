import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) throws Exception {
		List<Question> quizList = new ArrayList<Question>();

		//csvファイル呼び出し
		String path = "Quiz_conan - シート1.csv";

		
		FileInputStream fis = new FileInputStream(path); //1バイトずつ
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); //1文字ずつ
		BufferedReader br = new BufferedReader(isr); //1行ずつ

		//1行ずつ処理を行う
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] datas = line.split(",");
			String question = datas[0];
			String select1 = datas[1];
			String select2 = datas[2];
			String select3 = datas[3];
			int ans = Integer.parseInt(datas[4]);
			Question q = new Question(question, select1, select2, select3, ans);
			quizList.add(q);

		}
		br.close();

		System.out.println("【 クイズゲーム 】");
		System.out.println("「名探偵コナン」に関するクイズを10問出題します。");
		System.out.println("全問正解目指して頑張ってください！\n\n");
		Scanner sc = new Scanner(System.in);

		//不正解数を数える変数
		int incorrectAns = 0;

		//問題文、解答欄
		for (int i = 1; i <= quizList.size(); i++) {
			while (true) {
				Question quiz = quizList.get(i - 1);
				System.out.printf("[第%d問]\n%s\n", i, quiz.question);
				System.out.printf("① %s  ② %s  ③ %s", quiz.select1, quiz.select2, quiz.select3);
				System.out.print("\n\n正解番号を入力 >");

				int d = sc.nextInt();

				if (d < 1 || d > 3) {
					System.out.println("\n①～③の番号を入力して下さい。\n");
					continue;
				}

				if (d == quiz.ans) {
					System.out.println("\n正解！！！！！\n");
					break;

				} else {
					System.out.println("\n残念！不正解！\n正解するまで回答できます。\n");
					incorrectAns++;

				}

			}
		}

		//10問以上不正解
		if (incorrectAns >= 10) {
			System.out.println("不正解数は" + incorrectAns + "問でした。");
			System.out.println("名探偵コナン見たことありますか・・・(;_;)？");

		//7-9問 不正解
		} else if (incorrectAns >= 7) {
			System.out.println("不正解数は" + incorrectAns + "問でした。");
			System.out.println("面白いので、もっともっとアニメ・漫画見てみてね！");

		//4-6問 不正解
		} else if (incorrectAns >= 4) {
			System.out.println("不正解数は" + incorrectAns + "問でした。");
			System.out.println("なかなかいい線いってるけど、もう少し！");

		//1-3問 不正解
		} else if (incorrectAns >= 1) {
			System.out.println("不正解数は" + incorrectAns + "問でした。");
			System.out.println("コナン博士まであともう少し・・！");
		
		//全問正解
		} else {
			System.out.println("不正解数は" + incorrectAns + "問でした。");
			System.out.println("全問正解！！キミは名探偵コナン博士だ！おめでとう！");

		}

	}
}
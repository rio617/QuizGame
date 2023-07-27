import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) throws Exception {
		List<Question> quizList = new ArrayList<Question>();

		//csv呼び出し
		String path = "Quiz_conan - シート1.csv";

		//1バイトずつ
		FileInputStream fis = new FileInputStream(path);
		//1文字ずつ
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		//1行ずつ
		BufferedReader br = new BufferedReader(isr);

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

		System.out.println("【 クイズゲーム 】\n\n");
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= quizList.size(); i++) {
			while (true) {
				Question quiz = quizList.get(i-1);
				System.out.printf("[第%d問] %s\n", i, quiz.question);
				System.out.printf("1:%s  2:%s   3:%s", quiz.select1, quiz.select2, quiz.select3);
				System.out.print("\n\n正解を入力 ＞");

				int d = sc.nextInt();

				if (d == quiz.ans) {
					System.out.println("\n\n正解！");
					break;
				} else {
					System.out.println("\n\n不正解！");

				}
				//System.out.println("\n\n1～3の番号を入力して下さい。");

			}
		}
		
		//この上まで佐々木先生と一緒にやった！！！！

//		// --------------------第2問
//		System.out.println("\n\n[第2問] \n");
//		System.out.println("1:   2: 蝶ネクタイ  3: 付け髭");
//		System.out.print("\n\n正解を入力 ＞");
//
//		int d2 = sc.nextInt();
//
//		if (d2 == 1) {
//			System.out.println("\n\n正解！");
//
//		} else if (d2 == 2) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は1です。");
//		} else if (d2 == 3) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は1です。");
//
//		} else {
//			System.out.println("\n\n1～3の番号を入力して下さい。");
//
//		}
//
//		// --------------------第3問
//		System.out.println("\n\n[第3問] \n");
//		System.out.println("1:   2: カラスマ  3: ラム");
//		System.out.print("\n\n正解を入力 ＞");
//
//		int d3 = sc.nextInt();
//
//		if (d3 == 1) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は3です。");
//
//		} else if (d3 == 2) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は3です。");
//		} else if (d3 == 3) {
//			System.out.println("\n\n正解！ｵﾒﾃﾞﾄ-");
//
//		} else {
//			System.out.println("\n\n1～3の番号を入力して下さい。");
//		}
//
//		// --------------------第4問
//		System.out.println("\n\n[第4問] \n");
//		System.out.println("1:   2:   3: ");
//		System.out.print("\n\n正解を入力 ＞");
//
//		int d4 = sc.nextInt();
//
//		if (d4 == 1) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は2です。");
//
//		} else if (d4 == 2) {
//			System.out.println("\n\n正解！ｵﾒﾃﾞﾄ-");
//
//		} else if (d4 == 3) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は2です。");
//
//		} else {
//			System.out.println("\n\n1～3の番号を入力して下さい。");
//		}
//
//		// --------------------第5問
//		System.out.println("\n\n[第5問] \n");
//		System.out.println("1: シェリー 2: ラム 3: ウォッカ");
//		System.out.print("\n\n正解を入力 ＞");
//
//		int d5 = sc.nextInt();
//
//		if (d5 == 1) {
//			System.out.println("\n\n正解！ｵﾒﾃﾞﾄ-");
//
//		} else if (d5 == 2) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は1です。");
//
//		} else if (d5 == 3) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は1です。");
//
//		} else {
//			System.out.println("\n\n1～3の番号を入力して下さい。");
//		}
//
//		// --------------------第6問
//		System.out.println("\n\n[第6問] \n");
//		System.out.println("1:   2:   3: ");
//		System.out.print("\n\n正解を入力 ＞");
//
//		int d6 = sc.nextInt();
//
//		if (d6 == 1) {
//			System.out.println("\n\n正解！ｵﾒﾃﾞﾄ-");
//
//		} else if (d6 == 2) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は1です。");
//
//		} else if (d6 == 3) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は1です。");
//
//		} else {
//			System.out.println("\n\n1～3の番号を入力して下さい。");
//		}
//
//		// --------------------第7問
//		System.out.println("\n\n[第7問] \n");
//		System.out.println("1:  2:  3: ");
//		System.out.print("\n\n正解を入力 ＞");
//
//		int d7 = sc.nextInt();
//
//		if (d7 == 1) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は3です。");
//
//		} else if (d7 == 2) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は3です。");
//
//		} else if (d7 == 3) {
//			System.out.println("\n\n正解！ｵﾒﾃﾞﾄ-");
//
//		} else {
//			System.out.println("\n\n1～3の番号を入力して下さい。");
//		}
//
//		// --------------------第8問
//		System.out.println("\n\n[第8問] \n");
//		System.out.println("1: 山口勝平 2: 高山みなみ 3: 小山力也");
//		System.out.print("\n\n正解を入力 ＞");
//
//		int d8 = sc.nextInt();
//
//		if (d8 == 1) {
//			System.out.println("\n\n正解！ｵﾒﾃﾞﾄ-");
//
//		} else if (d8 == 2) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は1です。");
//
//		} else if (d8 == 3) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は1です。");
//
//		} else {
//			System.out.println("\n\n1～3の番号を入力して下さい。");
//		}
//
//		// --------------------第9問
//		System.out.println("\n\n[第9問] \n");
//		System.out.println("1: 林原めぐみ 2: 高山みなみ 3: ");
//		System.out.print("\n\n正解を入力 ＞");
//
//		int d9 = sc.nextInt();
//
//		if (d9 == 1) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は2です。");
//
//		} else if (d9 == 2) {
//			System.out.println("\n\n正解！ｵﾒﾃﾞﾄ-");
//
//		} else if (d9 == 3) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は2です。");
//
//		} else {
//			System.out.println("\n\n1～3の番号を入力して下さい。");
//		}
//
//		// --------------------第10問
//		System.out.println("\n\n[第10問] \n");
//		System.out.println("1:  2: 山口県 3: 鳥取県");
//		System.out.print("\n\n正解を入力 ＞");
//
//		int d10 = sc.nextInt();
//
//		if (d10 == 1) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は3です。");
//
//		} else if (d10 == 2) {
//			System.out.println("\n\n不正解！");
//			System.out.println("正解は3です。");
//
//		} else if (d10 == 3) {
//			System.out.println("\n\n正解！ｵﾒﾃﾞﾄ-");
//
//		} else {
//			System.out.println("\n\n1～3の番号を入力して下さい。");
//		}

	}
}
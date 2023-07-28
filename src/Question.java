
public class Question {

	String question; //問題文
	String select1; //選択1
	String select2; //選択2
	String select3; //選択3
	int ans; //正解

	public Question(String question, String select1, String select2, String select3, int ans) {
		this.question = question;
		this.select1 = select1;
		this.select2 = select2;
		this.select3 = select3;
		this.ans = ans;
	}
}

// 2020-11-17 화 2교시 16:00-16:17 2번째 
package myScore2;

public class ScoreTest {

	public static void main(String[] args) {
		ScoreList scoreList = new ScoreList();
		scoreList.addScore(new ScoreVO("alice",12,22,33));
		scoreList.addScore(new ScoreVO("bob",41,54,65));
		scoreList.addScore(new ScoreVO("carol",75,83,91));
		scoreList.addScore(new ScoreVO("dan",10,19,59));
		scoreList.addScore(new ScoreVO("eliza",77,84,97));
		
		System.out.println(scoreList);

	}

}

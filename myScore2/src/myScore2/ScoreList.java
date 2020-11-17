package myScore2;

import java.util.ArrayList;

public class ScoreList {
	
	private ArrayList<ScoreVO> scoreList = new ArrayList<ScoreVO>();
	
	public ArrayList<ScoreVO> getScoreList(){
		return this.scoreList;
	}
	public void setScoreList(ArrayList<ScoreVO> scoreList) {
		this.scoreList = scoreList;
	}
	public void addScore(ScoreVO vo) {
		this.scoreList.add(vo);
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "================================================================\n";
		str += "  no    name   java  jsp  spring  total    avg  rank\n";
		str += "================================================================\n";
		// rank
		for (int i = 0; i < scoreList.size()-1; i++) {
			for (int j = i+1; j < scoreList.size(); j++) {					// 이번에는 count말고 size()로 함 
				if(scoreList.get(i).getTotal() < scoreList.get(j).getTotal())
					scoreList.get(i).setRank(scoreList.get(i).getRank()+1); // ++ 쓸 수 없음
				else if(scoreList.get(i).getTotal() > scoreList.get(j).getTotal())
					scoreList.get(j).setRank(scoreList.get(j).getRank()+1); // ++ 쓸 수 없음
			}
		}
		
		// print
		for(ScoreVO vo : this.scoreList) {
			str += vo + "\n";
		}
		str += "================================================================";
		return str;
	}

}

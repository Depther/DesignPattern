package observer_pattern.step2;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {

	private List<Integer> scores = new ArrayList<>();

	private MinMaxView minMaxView;

	public void setDataSheetView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}

	public void addScore(int score) {
		scores.add(score);
		minMaxView.update();
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}

}

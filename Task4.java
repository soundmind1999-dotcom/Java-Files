
public class TaskFour{


	public static int [] evenIndexScores(int [] classScores){
		int evenCounter = 0;

		for(int counter = 0; count < scores.length; counter++){
			if ((count + 1) % 2 == 0)
				evenCounter++;
		}

		int [] evenClassScore = new int[evenCounter];
		int inCount = 0;

		for (int count = 0; count < classScores.length; count++){
			
			if ((count+1) % 2 == 0){
					evenClassScore[inCount] = classScores[count];
					inCount++;
			}

		}

		return evenClassScore;

	}


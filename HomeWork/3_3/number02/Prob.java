package homework.day3_03.number02;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.Vector;

public class Prob {
	public static void main(String[] args) throws Exception {
		Prob p2 = new Prob();
		Vector scores = p2.getScore("./files/data.txt");
//		System.out.println(scores.size());
		for (int i = 0; i < scores.size(); i++) {
			Score score = (Score) scores.get(i);
			System.out.println(score.getName() + ":" + score.getKor() + " " + score.getEng() + " " + score.getMath() + " "
					+ score.getSum());
		}
	}	
	public Vector getScore(String fileName) throws Exception{
		BufferedReader br= new BufferedReader(new FileReader(fileName));
		Vector vector = new Vector();
		
		int total =0;
		String arr ="";
		while((arr=br.readLine())!=null) {
			String[] brr = arr.split("/");
			for(int i=1; i<brr.length; i++) {
				int num=Integer.parseInt(brr[i]);
				total +=num;
			}
//			System.out.println(total);
			Score score = new Score(brr[0],
			Integer.parseInt(brr[1]),
			Integer.parseInt(brr[2]),
			Integer.parseInt(brr[3]),
			total);
			total =0;
//			System.out.println(score.getName() + ":" + score.getKor() + " " + score.getEng() + " " + score.getMath() + " "
//					+ score.getSum());
			vector.add(score);
		}
//		System.out.println(arr);
		br.close();
		return vector;
	}
}// end of Prob2

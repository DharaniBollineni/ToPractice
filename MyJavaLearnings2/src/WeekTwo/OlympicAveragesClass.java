package WeekTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OlympicAveragesClass {

	public OlympicAveragesClass() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Double> olympicAverages(List<Double> input) {
		if(input.size() % 5 != 0) {
			System.out.println("Input has to be multiples of 5");
			return null;
		}
		ArrayList<Double> olympicAvgList = new ArrayList<>();
		System.out.println(input);
		for(int i = 0; i < input.size(); i = i+5) {
			List<Double> subList = input.subList(i, i+ 5);
			Collections.sort(subList);
			Double sum = 0.0d;
			olympicAvgList.add((subList.get(1) + subList.get(2) + subList.get(3))/3);
		}
		return olympicAvgList;
	}
	public static void main(String[] args) {
		OlympicAveragesClass olympicAvg = new OlympicAveragesClass();
		Double[] a= { 0.8, 51.7, 14.0, 32.1, 12.8,15.7, 22.0, 8.1, 84.8, 99.7};
		List<Double> output = olympicAvg.olympicAverages(Arrays.asList(a));
		System.out.println(output);
	}

}

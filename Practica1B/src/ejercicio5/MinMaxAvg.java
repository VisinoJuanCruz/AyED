package ejercicio5;

public class MinMaxAvg {

	static int min;
	static int max;
	static float avg;
	
	public  MinMaxAvg (int[] intArray) {
		min = intArray[0];
		max = intArray[0];
		int total = 0;
		for(int num: intArray) {
			total += num;
			if(min > num) {
				min = num;
			}
			if(max < num) {
				max = num;
			}
			
		}
		avg = total/intArray.length;
	}
	
	
	public MinMaxAvg(int min, int max, float avg) {
		MinMaxAvg.min = min;
		MinMaxAvg.max = max;
		MinMaxAvg.avg = avg;
	}
	
	public int getMin() {
		return MinMaxAvg.min;
	}
	
	public int getMax() {
		return MinMaxAvg.max;
	}
	
	public float getAvg() {
		return MinMaxAvg.avg;
	}
	
}

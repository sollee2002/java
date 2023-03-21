package arrayEx;

public class ArrayEx15 {
	
	public static void main(String[] args) {
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count =0;
		
		for(int i=0; i<array.length; i++) {
			int[] array2 = array[i];
			
			for(int j=0; j<array2.length; j++) {
				System.out.printf("[%d][%d] = %d ",i,j,array2[j]);
				sum += array[i][j];
				count++;
			}
			System.out.println();
		}
		avg = (double)sum/count;
		System.out.println("총합계: "+sum);
		System.out.println("평균: "+avg);
		
		
		
	}
	
	
	

}

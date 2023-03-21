package arrayEx_Home;

public class ArrayEx01_home {

	public static void main(String[] args) {
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count=0;
		
		for(int i=0; i<array.length; i++) {
			int[] point = array[i];
			
			for(int j=0; j<point.length; j++) {
				System.out.printf("[%d][%d] %d",i,j,point[j]);
				sum += point[j];
				count++;
			}
			System.out.println();
		}
		
		avg=(double)sum/count;
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
		
		
		
		

	}

}

package arrayEx;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		//2차원배열
		//마치 행과 열로 구성된 배열
		//타입[][] 변수명 =타입[행][열];
		int [][] scores = new int [2][3];
		
		//2차원 배열에 값 생성
		scores[0]=new int[] {1,2,3};
		scores[1]=new int[] {4,5,6};
		System.out.println("길이: "+scores.length); //2
		System.out.println("길이[0]: "+scores[0].length);
		System.out.println("길이[1]: "+scores[1].length);
		
		//2차원 배열 값 가져오기
		//변수이름 [몇행][몇열]
		System.out.println("==============");
		
		for(int i=0; i<scores.length; i++) {
			
			int[] points = scores[i];//방번호
			
			for(int j=0; j<points.length; j++) {
//				System.out.printf("[%d][%d]\n",i,j);
				System.out.printf("[%d][%d]: %d ",i,j,points[j]);
			}
			System.out.println();
		}
	}

}

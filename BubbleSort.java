
public class BubbleSort {

    static int[] Num1= {9,5,3,4,8,6,1,7,2};
	static int SmallNum,BigNum;
    public static int NNN=0;
	    	
	public static void main(String[] args) {
		
	
		SetSortBigToSmall(Num1);
		System.out.println("從大到小:");
		GetSort();
		SetSortSmallToBig(Num1);
		System.out.println("從小到大:");
		GetSort();
	    
	}
	
	
	private static void GetSort() {
		for(int i=0;i<Num1.length;i++) {
			System.out.println(Num1[i]);
		}
	}
	
	private static void SetSortBigToSmall(int[] BNum) {
		
		for(int i=0;i<BNum.length-1;i++) {
			
			for(int j=0;j<BNum.length-1;j++) {
				if(BNum[j]<BNum[j+1]) {
					SmallNum=BNum[j];
					BNum[j]=BNum[j+1];
					BNum[j+1]=SmallNum;			
				}
				else if(BNum[j]>=BNum[j+1]) {
					System.out.print("第"+i+"組第"+j+"次跳過");
				}
				else {
					System.out.println("有錯誤(A階段):");
				}			
			}
			System.out.println();
		}		
	
	
	}
	
    private static void SetSortSmallToBig(int[] SNum) {
		
        for(int i=0;i<SNum.length-1;i++) {
			
			for(int j=0;j<SNum.length-1;j++) {
				if(SNum[j]>SNum[j+1]) {
					SmallNum=SNum[j+1];
					SNum[j+1]=SNum[j];
					SNum[j]=SmallNum;			
				}
				else if(SNum[j]<=SNum[j+1]) {
					System.out.print("第"+i+"組第"+j+"次跳過");
				}
				else {
					System.out.println("有錯誤(A階段):");
				}			
			}
			System.out.println();
		}		
	}
    

}

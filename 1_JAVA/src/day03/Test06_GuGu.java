package day03;

public class Test06_GuGu {
	public static void main(String[] args) {
		
	OUT:for(int i=1;i<=9 ; i++) {
			for(int j=2;j<=9 ; j++) {
				//if(j==5) break;
				//if(j==5) continue;
				if(j==5) break OUT;
				
				System.out.printf("%d*%d=%2d|",j,i,i*j);
			}			
			System.out.println();
		}

	}
}

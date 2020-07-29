package 对象;

public class Test01 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				//System.out.print("*");
				//分支
				if(j>=2-i && j<=2+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//换行
			System.out.println();
		}	
	}
}


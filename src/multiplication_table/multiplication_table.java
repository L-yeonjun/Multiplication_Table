package multiplication_table;
import java.util.*;

public class multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int isum1, isum2, isum3;
		int total1=0, total2=0, total3=0;
		int i, j;
		
		System.out.printf("\t\t\t★★★구구단★★★\n\n");
		
		for(i=2; i<10; i=i+3) {
			if(i == 8) {
				System.out.printf("%d단\t\t\t%d단\n", i, i+1);
			}
			else {
			System.out.printf("%d단\t\t\t%d단\t\t\t%d단", i, i+1, i+2);
			System.out.println();
			}
			
			for(j=1; j<10; j++) {
				isum1 = i * j;
				isum2 = (i+1) * j;
				isum3 = (i+2) * j;
				if(i == 8) {
					System.out.printf("%d X %d = %d\t\t", i, j, isum1);
					System.out.printf("%d X %d = %d\n", i+1, j, isum2);
				}
				else {
					System.out.printf("%d X %d = %d\t\t", i, j, isum1);
					System.out.printf("%d X %d = %d\t\t", i+1, j, isum2);
					System.out.printf("%d X %d = %d\n", i+2, j, isum3);
				}
			
				
				total1 = total1 + isum1;
				total2 = total2 + isum2;
				total3 = total3 + isum3;
			}
				if(i == 8) {
					System.out.printf("%d단 총합계 = %d\t\t", i, total1);
					System.out.printf("%d단 총합계 = %d\n", i+1, total2);
				}
				else {
					System.out.printf("%d단 총합계 = %d\t\t", i, total1);
					System.out.printf("%d단 총합계 = %d\t\t", i+1, total2);
					System.out.printf("%d단 총합계 = %d\n", i+2, total3);
			 		System.out.println();
				}
		}
	}
}
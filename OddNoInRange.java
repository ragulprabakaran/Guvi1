import java.util.Scanner;

public class OddNoInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1+1;i<n2;i++) {
			if(i%2==1)
			System.out.print(i+" ");
		}

	}

}

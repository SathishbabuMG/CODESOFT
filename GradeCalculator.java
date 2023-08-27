package letStart;
import java.util.Scanner;
public class GradeCalculator {
	public static void main(String[]arg) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of subjects:");
		int numberOfSubject=sc.nextInt();
		int totalMark=0;
		for(int i=1;i<=numberOfSubject;i++) {
			System.out.print("Enter Mark Obtained in Subject"+i+":");
			int marks=sc.nextInt();
			totalMark=totalMark+marks;
			
		}
		double average=(double) totalMark/(numberOfSubject*100)*100;
		String grade;
		if(average>=90) {
			grade="A";
		}else if(average>=80) {
			grade="B";
		}else if(average>=70) {
			grade="c";
		}else if(average>=60) {
			grade="D";
		}else {
			grade="F";
		}
		System.out.println("Total Mark:"+totalMark);
		System.out.println("Average Percentage:"+average);
		System.out.println("Grade:"+grade);
		}

}

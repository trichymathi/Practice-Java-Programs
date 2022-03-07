
public class Fibonacci {

	public static void main(String[] args) {
	int a= 8;
	int firstNum = 0;
	System.out.println(firstNum);
	int secondNum = 1;
	System.out.println(secondNum);
	int sum;
	for(int i=3;i<=a;i++) {
		sum =firstNum+secondNum; // 1st itteration sum=0(firstnum)+1(secondNum)
		System.out.println(sum); //sum=1
		firstNum=secondNum;     //firstNum = 1
		secondNum=sum;	        //secondNum= 1
	}
	}

}

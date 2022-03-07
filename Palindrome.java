
public class Palindrome {

	public static void main(String[] args) {
		String name ="MATHI";
		String rev="";
		//System.out.println(name);
		for(int i=name.length()-1;i>=0;i--) {
			//name.charAt(i);
			//System.out.println(name);
			rev=rev+name.charAt(i); //1st itteration rev=""+[CharAt(4)]I;2nd itteration rev="I"+[CharAt(4)]H
			System.out.println(rev);//1st itteration =I;2nd itteration=IH
		}
		if(name.equals(rev)) {
			System.out.println("PALINDROME");
		}else {
			System.out.println("NOT A PALINDROME");
		}

	}

}

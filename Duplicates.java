
public class Duplicates {

	public static void main(String[] args) {
		String word ="We learn java basics as part of java sessions in java week1";
		String[] spl =word.split(" ");
		//System.out.println(spl);
		for(int i=0;i<spl.length;i++) {
			for(int j=i+1;j<spl.length;j++){
				if(spl[i].equals(spl[j])) {
					spl[j]=""; //remove the duplicate word whis is identify and replace with empty 
				}
			}
			System.out.print(spl[i]+" ");
		}
	}
}



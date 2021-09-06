import java.util.*;
public class dnaTranscription {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String dnaSequence = "";
		boolean breakLoop = true;
		while(breakLoop) {
			System.out.println("Enter DNA Sequence you would like to transcript. Make sure to use only A,G,T and C.");
			dnaSequence = reader.next();
			
			loop1: for(int i = 0; i < dnaSequence.length(); i++) {
				String check = dnaSequence.substring(i, i+1);
				if(!(check.equalsIgnoreCase("a") || check.equalsIgnoreCase("t") || check.equalsIgnoreCase("g") || check.equalsIgnoreCase("c"))) {
					System.out.println("Invalid sequence. You can only use A,T,G and C for your bases");
					break loop1;
				}
				breakLoop = false;
				
			}
		}
		
		System.out.println("mRNA Sequence: \n");
		for(int i = 0; i < dnaSequence.length(); i++) {
			String convert = dnaSequence.substring(i, i+1);
			if(convert.equalsIgnoreCase("A")) {
				System.out.print("U");
			}else if(convert.equalsIgnoreCase("T")) {
				System.out.print("A");
			}else if(convert.equalsIgnoreCase("G")) {
				System.out.print("C");
			}else {
				System.out.print("G");
			}
		}
		reader.close();
		return;

	}

}

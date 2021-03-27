package double_ended_linked_list;
import java.util.Scanner;

public class DL_App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		
		DL_Linked_List protein = new DL_Linked_List();
		
		protein.insertAtEnd("Q6GZX4","Frog virus 3 (isolate Goorha)", "MAFSAEDVLKEYDRRRRMEALLLSLYYPNDRKLLDYKEWSPPRVQVECPKAPVEWNNPPSEKGLIVGHFSGIKYKGEKAQASEVDVNKMCCWVSKFKDAMRRYQGIQTCKIPGKVLSDLDAKIKAYNLTVEGVEGFVRYSRVTKQHVAAFLKELRHSKQYENVNLIHYILTDKRVDIQHLEKDLVKDFKALVESAHRMRQGHMINVKYILYQLLKKHGHGPDGPDILTVKTGSKGVLYDDSFRKIYTDLGWKFTPL");
		protein.insertAtEnd("Q6GZX3","Frog virus 3 (isolate Goorha)","MSIIGATRLQNDKSDTYSAGPCYAGGCSAFTPRGTCGKDWDLGEQTCASGFCTSQPLCARIKKTQVCGLRYSSKGKDPLVSAEWDSRGAPYVRCTYDADLIDTQAQVDQFVSMFGESPSLAERYCMRGVKNTAGELVSRVSSDADPAGGWCRKWYSAHRGPDQDAALGSFCIKNPGAADCKCINRASDPVYQKVKTLHAYPDQCWYVPCAADVGELKMGTQRDTPTNCPTQVCQIVFNMLDDGSVTMDDVKNTINCDFSKYVPPPPPPKPTPPTPPTPPTPPTPPTPPTPPTPRPVHNRKVMFFVAGAVLVAILISTVRW");
		protein.insertAtEnd("Q197F8", "Invertebrate iridescent virus 3", "MASNTVSAQGGSNRPVRDFSNIQDVAQFLLFDPIWNEQPGSIVPWKMNREQALAERYPELQTSEPSEDYSGPVESLELLPLEIKLDIMQYLSWEQISWCKHPWLWTRWYKDNVVRVSAITFEDFQREYAFPEKIQEIHFTDTRAEEIKAILETTPNVTRLVIRRIDDMNYNTHGDLGLDDLEFLTHLMVEDACGFTDFWAPSLTHLTIKNLDMHPRWFGPVMDGIKSMQSTLKYLYIFETYGVNKPFVQWCTDNIETFYCTNSYRYENVPRPIYVWVLFQEDEWHGYRVEDNKFHRRYMYSTILHKRDTDWVENNPLKTPAQVEMYKFLLRISQLNRDGTGYESDSDPENEHFDDESFSSGEEDSSDEDDPTWAPDSDDSDWETETEEEPSVAARILEKGKLTITNLMKSLGFKPKPKKIQSIDRYFCSLDSNYNSEDEDFEYDSDSEDDDSDSEDDC");
		
		
		
		protein.display();
		
		System.out.println("1. Display sequence of specific SwissProt ID: ");
		System.out.println("2. Output to FASTA format file, list of sequences with a minimum length specified by user: ");
		System.out.println("3. Output to a CSV file a list of SwissProt ID and their organism (OS) sorted by organism then SwissProt ID ");
		System.out.println("0. Exit");
		System.out.println("Input choice: ");
		choice = input.nextInt();
		System.out.println("");
		
		while(choice != 0){
			switch(choice){
				case 1:{String buffer = input.nextLine();
						System.out.println("Input SwissProt ID: ");
						
						String spid = input.nextLine();
						protein.displayById(spid);
				}
				break;
				case 2:{System.out.println("Input minimum length desired of sequences: ");
						int mlen = input.nextInt();
						//outputFasta(mlen);
					
				}
				break;
				case 3:{//outputCSV();
					
				}
				break;
			}
			System.out.println("1. Display sequence of specific SwissProt ID: ");
			System.out.println("2. Output to FASTA format file, list of sequences with a minimum lenght specified by user: ");
			System.out.println("3. Output to a CSV file a list of SwissProt ID and their organism (OS) sorted by organism then SwissProt ID ");
			System.out.println("0. Exit");
			System.out.println("Input choice: ");
			choice = input.nextInt();
		}
	}
	
	public static void outputFasta(int mlen){
		
	}
	
	public static void outputCSV(){
		
	}

}

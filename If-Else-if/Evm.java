import java.util.Scanner;
public class Evm {
    public static void main(String[] args){
        int bj=0, con=0, shiv=0, aap=0, mns=0, nota=0;
        int opt;

        System.out.println("       Welcome      ");
        System.out.println("Enter the Population:");
        Scanner sc = new Scanner(System.in);
        int pop = sc.nextInt();

        System.out.println("\nList of Parties:");
        System.out.println("1 BJP");
        System.out.println("2 CONGRESS");
        System.out.println("3 SHIV SENA");
        System.out.println("4 AAP");
        System.out.println("5 MNS");
        System.out.println("6 NOTA\n");

        for (int i = 1; i <= pop; i++) {
            System.out.println("Enter the Option:");
            opt = sc.nextInt(); 

            if (opt < 1 || opt > 6) {
                i--; // Decrease i to not count invalid votes
                System.out.println("Invalid Option");
                continue;
            }

            // Correcting the vote counting
            if (opt == 1) {
                bj++;
                System.out.println("Ache din ayenge");
            }  if (opt == 2) {
                con++;
                System.out.println("Muze azad krdo");
            }  if (opt == 3) {
                shiv++;
                System.out.println("Jay Maharashtra");
            }  if (opt == 4) {
                aap++;
                System.out.println("AAP");
            }  if (opt == 5) {
                mns++;
                System.out.println("MNS");
            }  if (opt == 6) {
                nota++;
                System.out.println("You Are Educated");
            }
        }

        // Finding the winner
        if (bj >= con && bj >= shiv && bj >= aap && bj >= mns && bj >= nota) {
            System.out.println("BJP is the winner with " + bj + " votes.");
        }
        if (con >= bj && con >= shiv && con >= aap && con >= mns && con >= nota) {
            System.out.println("Congress is the winner with " + con + " votes.");
        }
        if (shiv >= bj && shiv >= con && shiv >= aap && shiv >= mns && shiv >= nota) {
            System.out.println("Shiv Sena is the winner with " + shiv + " votes.");
        }
        if (aap >= bj && aap >= con && aap >= shiv && aap >= mns && aap >= nota) {
            System.out.println("AAP is the winner with " + aap + " votes.");
        }
        if (mns >= bj && mns >= con && mns >= shiv && mns >= aap && mns >= nota) {
            System.out.println("MNS is the winner with " + mns + " votes.");
        }
        if (nota >= bj && nota >= con && nota >= shiv && nota >= aap && nota >= mns) {
            System.out.println("NOTA is the winner with " + nota + " votes.");
        }
    }
}

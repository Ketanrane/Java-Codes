import java.util.Scanner;

class VotingSystem {
    static int bjp, con, ss, mns, aap, nota;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("        WELCOME TO VOTING SYSTEM       ");
        System.out.println("======================================");
        System.out.print("Enter total number of voters: ");
        int pop = sc.nextInt();

        for (int i = 1; i <= pop; i++) {
            System.out.println();
            System.out.println("**** VOTER NO: " + i + " ****");
            System.out.println("1. BJP");
            System.out.println("2. CONGRESS");
            System.out.println("3. SHIVSENA");
            System.out.println("4. MNS");
            System.out.println("5. AAP");
            System.out.println("6. NOTA");
            System.out.print("Enter your vote (1-6): ");

            int option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.println("You voted for BJP - 'Sabka Sath Sabka Vikas'");
                    bjp++;
                    break;
                case 2:
                    System.out.println("You voted for Congress - 'Bharat Jodo'");
                    con++;
                    break;
                case 3:
                    System.out.println("You voted for Shiv Sena - 'Hum Hain Asli Shiv Sena'");
                    ss++;
                    break;
                case 4:
                    System.out.println("You voted for MNS - 'Jai Maharashtra'");
                    mns++;
                    break;
                case 5:
                    System.out.println("You voted for AAP - 'Aapka Ek Vote Badla La Sakta Hai'");
                    aap++;
                    break;
                case 6:
                    System.out.println("You chose NOTA - 'You are Educated'");
                    nota++;
                    break;
                default:
                    System.out.println("Invalid choice! Vote not counted.");
                    break;
            }
        }

        // Show results
        System.out.println("\n======================================");
        System.out.println("           VOTING RESULTS              ");
        System.out.println("======================================");
        System.out.println("BJP Votes      : " + bjp);
        System.out.println("Congress Votes : " + con);
        System.out.println("Shiv Sena Votes: " + ss);
        System.out.println("MNS Votes      : " + mns);
        System.out.println("AAP Votes      : " + aap);
        System.out.println("NOTA Votes     : " + nota);

        // Calculate winner
        int maxVotes = Math.max(bjp, Math.max(con, Math.max(ss, Math.max(mns, Math.max(aap, nota)))));

        System.out.println("--------------------------------------");
        System.out.print("WINNER: ");
        if (maxVotes == bjp)
            System.out.println("BJP 🏆");
        else if (maxVotes == con)
            System.out.println("Congress 🏆");
        else if (maxVotes == ss)
            System.out.println("Shiv Sena 🏆");
        else if (maxVotes == mns)
            System.out.println("MNS 🏆");
        else if (maxVotes == aap)
            System.out.println("AAP 🏆");
        else
            System.out.println("No clear winner (NOTA got the highest votes).");

        System.out.println("======================================");
        System.out.println("       THANK YOU FOR VOTING 🙏");
        System.out.println("======================================");

        sc.close();
    }
}

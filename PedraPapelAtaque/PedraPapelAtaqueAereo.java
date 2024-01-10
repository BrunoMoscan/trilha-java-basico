import java.util.Scanner;

public class PedraPapelAtaqueAereo {

    private final static String ATAQUE = "ataque";
    private final static String PAPEL = "papel";
    private final static String PEDRA = "pedra";
    private final static String P1_WIN = "Jogador 1 venceu";
    private final static String P2_WIN = "Jogador 2 venceu";
    private final static String BOTH_WIN = "Ambos venceram";
    private final static String NO_WINNER = "Sem ganhador";
    private final static String ANIQUILATION = "Aniquilacao mutua";

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();

        for ( int i=0; i < N; i++ ) {
            String p1 = sc.next();
            String p2 = sc.next();

            System.out.println( jokenpoWinner( p1, p2 ) );
        }
        sc.close();
	}

    /**
     * Check who is the winner of the game Jokenpo.
     */
    public static String jokenpoWinner(String p1, String p2) {
        String result = P2_WIN;

        if ( p1.equalsIgnoreCase( ATAQUE ) && p2.equalsIgnoreCase( ATAQUE ) ) {
            result = ANIQUILATION;
        } else if ( p1.equalsIgnoreCase( PEDRA ) && p2.equalsIgnoreCase( PEDRA ) ) {
            result = NO_WINNER;
        } else if ( p1.equalsIgnoreCase( PAPEL ) && p2.equalsIgnoreCase( PAPEL ) ) {
            result = BOTH_WIN;
        } else if ( p1.equalsIgnoreCase( ATAQUE ) && p2.equalsIgnoreCase( PEDRA ) || p2.equalsIgnoreCase( PAPEL ) ) {
            result = P1_WIN;
        } else if ( p1.equalsIgnoreCase( PEDRA ) && p2.equalsIgnoreCase( PAPEL ) ) {
            result = P1_WIN;
        }

        return result;
    }
}
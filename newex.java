import java.util.*;
public class newex {
    static int[] countvowels(String word){
        int counta = 0;
        int counte = 0;
        int counti = 0;
        int counto = 0;
        int countu = 0;
        int[] vowels = new int[5];
        word = word.toLowerCase();
        for(int i = 0; i<word.length(); i++){
           char a = word.charAt(i);
            switch (a){
                case 'a':
                    counta++;
                    break;
                case 'e':
                    counte++;
                    break;
                case 'i':
                    counti++;
                    break;
                case 'o':
                    counto++;
                    break;
                case 'u':
                    countu++;
                    break;
            }
        }
        vowels[0] = counta;
        vowels[1] = counte;
        vowels[2] = counti;
        vowels[3] = counto;
        vowels[4] = countu;
        return vowels;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word you want to count the vowels of: ");
        String word = scan.next();
        
        int vowelcount[] = countvowels(word);

        System.out.println("The number of A in this word is: "+ vowelcount[0]);
        System.out.println("The number of E in this word is: "+ vowelcount[1]);
        System.out.println("The number of I in this word is: "+ vowelcount[2]);
        System.out.println("The number of O in this word is: "+ vowelcount[3]);
        System.out.println("The number of U in this word is: "+ vowelcount[4]);
    }
}

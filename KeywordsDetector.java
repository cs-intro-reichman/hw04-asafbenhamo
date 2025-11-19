import javax.print.DocFlavor.STRING;

public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }
public static String [] changetoarr(String s) {
        // Replace this comment with your code
        String [] arr = new String[s.length()];
        String h = "";
        int j=0;
        for(int i =0; i<s.length() ; i++){
               if (s.charAt(i) != ' ') h = h + s.charAt(i);
               else {
                arr[j] = h;
                j++;
                h="";
               }
            }
            return arr;
        }
    

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        for(int i =0; i<sentences.length ; i++){
         String [] arr = new String[sentences[i].length()];
          arr = changetoarr(sentences[i]);
          for(int v =0; v<arr.length;v++){
            int m =0;
                for (int c= 0 ; c< keywords.length; c++){
               if ( arr[v] ==  keywords[c]) m++;
             }
             if (m>0) System.out.println(sentences[i]);
         }
        }
    }
}
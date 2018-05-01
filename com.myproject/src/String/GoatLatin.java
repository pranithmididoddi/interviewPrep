package String;

import java.util.ArrayList;
import java.util.List;

public class GoatLatin {

    /**
     * if the word starts with an vowel, append ma at the end
     * if the word starts with a consonant, append the start letter at the end and append ma
     * for every word, append a with incrementing the number**/

    public static void main(String[] args){

        String string=new GoatLatin().goatLatin("I speak Goat Latin");
        StringBuffer sb=new StringBuffer();
        int counter=0;


        for(String s : string.split(" ")) {
            counter++;
            int i=0;

            sb.append(s);
            while (i < counter) {
                sb.append('a');
                i++;
            }
        sb.append(" ");
        }

        System.out.println(sb.toString());
    }

    public String goatLatin(String s){

        String[] wordString=s.split(" ");
        List<Character> vowelList=new ArrayList<>();
        vowelList.add('a');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('o');
        vowelList.add('u');
        vowelList.add('A');
        vowelList.add('E');
        vowelList.add('I');
        vowelList.add('O');
        vowelList.add('U');


        StringBuffer stringBuffer=new StringBuffer();
        String newWord="";
        for(String word : wordString){
            if(vowelList.contains(word.charAt(0))){
                newWord=new GoatLatin().appendMa(word);
            }else{
                newWord=new GoatLatin().consonantConverter(word);
            }
            stringBuffer.append(newWord+" ");
        }
        return stringBuffer.toString();
    }

    public String appendMa(String word){
        StringBuffer stringBuffer=new StringBuffer(word);
        stringBuffer.append("ma");

        return stringBuffer.toString();
    }

    public String consonantConverter(String word){
        StringBuffer stringBuffer=new StringBuffer(word.substring(1,word.length()));
        stringBuffer.append(word.charAt(0));
        stringBuffer.append("ma");

        return stringBuffer.toString();
    }
}

package String;

public class DetectCapitalWords {

    public boolean detectCapitals(String word){
        if(word.toLowerCase().equals(word)) return true;
        if(word.toUpperCase().equals(word)) return true;
        if(word.substring(1).toLowerCase().equals(word.substring(1,word.length()))) return true;


    return false;
    }

    public static void main(String[] args){
      boolean value=  new DetectCapitalWords().detectCapitals("PranitH");
        System.out.println(value);
    }
}

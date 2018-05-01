package String;

public class StringImplementations {

    public String reverseString(String s) {

        char[] array=s.toCharArray();

        for(int i=0;i<array.length/2;i++){
            char temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }

        return String.valueOf(array);
    }

    public static void main(String[] args){

        StringImplementations stringImplementations=new StringImplementations();
        System.out.println(stringImplementations.reverseString("pranith"));

    }
}

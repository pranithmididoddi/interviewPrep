package String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class TestClass {

    public static void main(String[] args){

        String string="Bob. hIt, baLl";
        string=string.replaceAll("[^ a-zA-Z0-9]","").toLowerCase();
        System.out.println(string);
        List<String> bannedList=new ArrayList<>();
        bannedList.add("hit");
        bannedList.add("bob");

        String[] myarray=string.split(" ");

        Map<String,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(String s:myarray) {
            if (map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }

        for(Map.Entry<String,Integer> entry :map.entrySet()){
            if(!bannedList.contains(entry.getKey())){
                list.add(entry.getValue());
            }
        }

        Collections.sort(list);
        int value=list.get(list.size()-1);
        String mostCommonWord="";

       for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(Objects.equals(value,entry.getValue())){
                mostCommonWord=entry.getKey();
            }
        }

        System.out.println(mostCommonWord);

    }




}

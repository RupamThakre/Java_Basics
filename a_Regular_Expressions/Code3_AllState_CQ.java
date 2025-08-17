import java.util.stream.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Hello! Babu Bhaiya World is .",
                "Babu Bhaiya World$",
                "hello# Bhaiya is green!"
        );
        Map<String, Integer> map = new HashMap<>();

        for(String s : list){

            String[] str = s
                    .replaceAll("[^a-zA-Z0-9\\s]","")
                    .toLowerCase()
                    .split("\\s");

            for(String word : str){
                if(!word.isEmpty()){
                    map.put(word, map.getOrDefault(word,0)+1);
                }
            }

        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
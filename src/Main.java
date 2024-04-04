import javax.swing.*;
import java.util.*;
import java.util.stream.StreamSupport;
import java.util.LinkedHashMap;

import static java.lang.Long.reverse;

public class Main {





    /// Q3 )   ///////////////////////
    public static int wordsinstring(String str){

        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i = 0 ; i<str.length() ; i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i) , 1);
            } else {
                hm.put(str.charAt(i) , hm.get(str.charAt(i))+1);
            }
        }

        return hm.size();

    }



    ///// Q4) ////////      /////////////////////


    public static void duplicatecharacters(String str){
        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i = 0 ; i<str.length() ; i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i) , 1);
            } else {
                hm.put(str.charAt(i) , hm.get(str.charAt(i))+1);
            }
        }


        Set<Character> s1 = hm.keySet();
        for(Character see : s1){
            if(hm.get(see)>1){
                System.out.println(see);
            }
        }


    }




    public static void main(String[] args) {


        String str = "sarang palaskar";



        //// Q3
        System.out.println(wordsinstring(str));


        ////Q4
        duplicatecharacters(str);



    }
}
package com.platzi.functional._12_currying;

import javax.swing.text.html.Option;
import java.util.*;

public class Optionals {

    public static void main(String[] args) {
        List<String> names = getName();
        if(names != null){
            // Operar con nombres.
        }

        Optional<List<String>> optionalNames = getOptionalNames();
        if(optionalNames.isPresent()){

        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

        Optional<String> valuablePlayer = optionalValuablePlaeyer();

        String valuablePlayerName = valuablePlayer.orElseGet(()-> "No player.");
    }

    static List<String> getName() {
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mVP(){
        //return "";
        return null;
    }

    static int mostExpensiveItem(){
        return  -1;
    }

    static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();
        return Optional.of(namesList);
    }

    static Optional<String> optionalValuablePlaeyer(){
        //return Optional.ofNullable();
        try{
            //Accesos
            return Optional.of("Sinuhe");
        }catch(Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
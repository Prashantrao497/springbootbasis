//package com.example.auto1;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Restarent {
//	@Qualifier("chinis")
//	@Autowired
//private Imenu menu;
//	
//	
//	@Autowired	
//private Imenu indian;
//	
//	
//private Imenu italy;
//
//
//public Restarent(@Qualifier("italian")Imenu italy) {
//	super();
//	this.italy = italy;
//}
//public void  DisplayMenu(){
//	menu.itemAvl().forEach(System.out::println);
//	indian.itemAvl().forEach(System.out::println);
//	italy.itemAvl().forEach(System.out::println);
//}
//}
//
//
//
//
//
//




package com.example.auto1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restarent {

    @Autowired
    @Qualifier("chinis")
    private Imenu menu;

    @Autowired
    @Qualifier("indian")
    private Imenu indian;

    private Imenu italy;

    @Autowired
    public Restarent(@Qualifier("italian") Imenu italy) {
        this.italy = italy;
    }

    public List<String> DisplayMenu(String choice) {
        if (choice.equals("chinis")) {
            List<String> items = menu.itemAvl();
            items.forEach(System.out::println);
            return items;
        }
        if (choice.equals("indian")) {
            return indian.itemAvl();
        }
        if (choice.equals("italy")) {
            return italy.itemAvl();
        }
        return null;
    }
}


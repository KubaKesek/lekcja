import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class Klasa1 {
     public static void main(String[] arg) {
    	 
  	 List<Integer> lista = new ArrayList<Integer>();
   	 lista.add(65);
    	 lista.add(55);
    	 lista.add(21);
    	 
    	 
    	 
    	 
    	 System.out.println(lista.get(0));
    	 System.out.println(lista.size());
    	 
    	 for(int i=0;i<lista.size(); i++)
    	 {
    		 System.out.println(lista.get(i));
    	 }
    	 
    	 
    	 for(Integer i:lista) {
    		 System.out.println(i);
	  		 
    	 }
    	 
    	 
   	 user user1 = new user("Jan", "Kowalski", 22);
    	 user user2 = new user("Kasia", "Nowak", 21);
   	 System.out.println(user2);
  	 
   	 List<user> lista1 = new ArrayList<>(); 
    	 lista1.add(user1);
    	 lista1.add(user2);
    	 lista1.add(new user("Tomek", "Kos", 30));
    	 System.out.println(lista1.get(0));
	 Scanner scanner = new Scanner(System.in);
  	 String im,n;
  	 int w;
  	 
  	 
   	 for(int i=0;i<3;i++);
    	 { user.pokaz();
    	 im = scanner.next();
   	 n = scanner.next();
   	 w = scanner.nextInt();
   	 lista1.add(new user(im, n, w));
   	 }
    	 scanner.close();
   	 for(user u:lista1)
    	 {
   		 System.out.println(u);
   		 
   	 }
    	 
     user user3 = new user("Jan", "Kowalski", 22);   	 
     user user4 = new user("Kasia", "Nowak", 21);    	 
 	  	 szkola szkola = new szkola("TEB");
     }}
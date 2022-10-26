import java.util.*;  
class HashMap1{  
 public static void main(String args[]){  
    HashMap<Integer,String> hmap=new HashMap<Integer,String>();  
           hmap.put(1,"Ravi");  
           hmap.put(2,"Vijay");  
           hmap.put(1,"Ajay");  //duplicte key,so ravi replaced
             
          
          // Iterator<String> i=list.iterator();  
           //while(i.hasNext())  
           //{  
           //System.out.println(i.next());  
           //}
           System.out.println(hmap);  
 }  
}  
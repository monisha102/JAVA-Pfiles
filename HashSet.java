import java.util.*;  
class HashSet4{  
 public static void main(String args[]){  
    HashSet<String> set=new HashSet<String>();  
           set.add("Ravi");  
           set.add("Vijay");  
           set.add("Ajay");  
             
           ArrayList<String> list=new ArrayList(set);  
           list.add("Gaurav");  
           Iterator<String> i=list.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  
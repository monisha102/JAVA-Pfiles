import java.util.*;

class Main{

public static void main(String[] args){

Scanner s = new Scanner(System.in);
int t = s.nextInt();
String [] pair_left = new String[t];
String [] pair_right = new String[t];

for (int i = 0; i < t; i++) {
pair_left[i] = s.next();
pair_right[i] = s.next();

}

HashSet <String> hset = new HashSet<>();

String name;
int i;

for(i=0 ; i<t ; i++){

name=pair_left[i3] + " " + pair_right[i];
hset.add(name);

System.out.println(hset.size());

        }
    }
}

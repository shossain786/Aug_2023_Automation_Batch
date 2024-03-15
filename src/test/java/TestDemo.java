import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('a');
        arrayList.add('a');
        arrayList.add('c');
        arrayList.add('d');
        arrayList.add('d');
        arrayList.add('e');

        HashMap<Character, Integer> hashMap = new HashMap<>();

        HashSet<Character> hashSet = new HashSet<>();

        for (Character character : arrayList)
            hashSet.add(character);
        int count = 0;
        for (Character character : hashSet) {
            for (Character character1 : arrayList) {
                if (character.equals(character1))
                    count++;
            }

            hashMap.put(character, count);
            count =0;
        }


        System.out.println(hashMap.entrySet());
    }
}


/*
* List of characters list --> [a,b,a,a,c,d,d,e]   o/p: a-3,b-1,c-1,d-2,e-1
ArrayList<Characters> chList = [a,b,a,a,c,d,d,e];
Set<characters> hashSet = new HashSet<characters>();
for()
* [0,1,1,1,1,0,0,0,1,1,1]
*
* */
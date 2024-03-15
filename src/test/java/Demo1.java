import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(1);

        ArrayList<Integer> zeroList = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();

        for (Integer integer : arrayList) {
            if (integer == 0)
                zeroList.add(integer);
        }

        finalList.addAll(zeroList);

        for (Integer integer : arrayList)
            if (integer == 1)
                finalList.add(integer);
    }
}

/*
* [0,1,1,1,1,0,0,0,1,1,1]
* */
package s7.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.get(0).toLowerCase();

        boolean b = list instanceof List;

    }
}


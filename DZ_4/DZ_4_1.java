
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.


package DZ_4;

import java.util.LinkedList;

public class DZ_4_1 {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(23);
    list.add(45);
    list.add(67);
    list.add(3);
    list.add(5);
    list.add(12);
    revers(list); 
            
        
        
    }
    public static LinkedList revers(LinkedList<Integer> list){

        System.out.println(list);
        int count = list.size();
        while(count >= 0){
            int val = list.getFirst();
            list.add(count, val);
            list.removeFirst();
            count -= 1;
        }
        System.out.println(list);
        
        
        return list;
    }
        
    }


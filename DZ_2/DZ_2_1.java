// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.



package DZ_2;

import java.io.IOException;
import java.util.logging.*;

public class DZ_2_1 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[] {1,4,5,7,8,3,1,6,9,};
        Logger logg = Logger.getLogger(DZ_2_1.class.getName());
        FileHandler fh = new FileHandler("Log.txt");
        logg.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
    
    
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp; 

                                 
                                 StringBuilder result = new StringBuilder();
                                 for(int k = 0; k < n; k ++){
                                    result.append(arr[k]).append(" ");
                                 }
                                 logg.info("Поменяны местами  " + temp + " и " + arr[j - 1] + "\n" + result);
                         }  
                          
                 }
          
         }
    }
    }
    



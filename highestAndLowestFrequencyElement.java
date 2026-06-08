import java.util.*;
public class Main{
  public static int[] highLowFreq(int arr[])  {
    HashMap<Integer,Integer> freq= new HashMap<>();
    for (int num:arr){
      freq.put(num,freq.getOrDefault(num,0)+1);
    }
    int maxfreq=-1;
    int maxkey=-1;
    for (int key:freq.keySet()){
      int currentkey=key;
      int currentvalue=freq.get(key);
      if (currentvalue>maxfreq){
        maxfreq=currentvalue;
        maxkey=currentkey;
      }
    }
    int minfreq=Integer.MAX_VALUE;
    int minkey=-1;
    for (int key:freq.keySet()){
      int currentkey=key;
      int currentvalue=freq.get(key);
      if (currentvalue<minfreq){
        minfreq=currentvalue;
        minkey=currentkey;
      }
    }
    int ans[]={maxkey,minkey};
return ans;    
  }
  public static void main(String[] args){
    int arr[]={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
    int[] an=highLowFreq(arr);
    System.out.println(an[0]+" "+an[1]);

  }
}

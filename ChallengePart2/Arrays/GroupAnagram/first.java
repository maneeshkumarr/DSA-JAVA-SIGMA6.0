package ChallengePart2.Arrays.GroupAnagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class first {

  public static boolean isAnagram(String str1,String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            return true;
        }
        return false;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<String> set=new HashSet<>();
        List<List<String>> ans=new ArrayList<>();
        boolean flag=false;
        for(int i=0;i<strs.length;i++){
            char[] ch1=strs[i].toCharArray();
            Arrays.sort(ch1);
            List<String> list=new ArrayList<>();
            if(set.contains(ch1)){
                break;
            }else{
                set.add(ch1.toString());
                list.add(strs[i]);
            }
            for(int j=i+1;j<strs.length;j++){
                if(isAnagram(strs[i],strs[j])){
                    list.add(strs[j]);
                }
        }
        ans.add(list);
        }
        return ans;
    }
    public static void main(String[] args) {
    
    }
}


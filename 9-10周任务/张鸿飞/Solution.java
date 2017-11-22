package com.zhanghongfei;
import java.util.ArrayList;
import java.util.List;
//public class Solution {
//	public int[] intersection(int[] nums1,int[] nums2){
//		List<Integer> intersectionList =new ArrayList<Integer>();
//		for(int num:nums1) {    
//                intersectionList.add(num);  
//		}
//		List<Integer> result1 = new ArrayList<Integer>();
//		for(int b=0;b<nums2.length;b++) {
//			if(!intersectionList.contains(nums2[b])){  
//                result1.add(nums2[b]);
//                intersectionList.remove(intersectionList.indexOf(nums2[b])); 
//		}
//	}
//		int[]result2=new int[result1.size()];
//		int i=0;
//		for (int num:result1) {
//			result2[i++]=num;
//		}
//		return result2;
//}}
public class Solution {  
    public int[] intersect(int[] nums1, int[] nums2) {          
          
        List<Integer> list = new ArrayList<Integer>();  
        List<Integer> interList = new ArrayList<Integer>();  
          
        for(int num:nums1) {  
            list.add(num);  
        }  
          
        for(int i=0;i<nums2.length;i++) {  
            if(list.contains(nums2[i])) {  
                interList.add(nums2[i]);  
                list.remove(list.indexOf(nums2[i]));  
            }  
        } 
          
        int[] result = new int[interList.size()];  
        for(int a=0;a<interList.size();a++) {  
            result[a] = interList.get(a);  
        }  
          
        return result;  
    }  
    public String reverseString(String s) {
    	char[] c = new char[s.length()];
		int a=0;
		for(int b=s.length()-1;b>=0;b--) {
			c[a++]=s.charAt(b);
		}
		String str=new String(c);
		return str;
    }
}  

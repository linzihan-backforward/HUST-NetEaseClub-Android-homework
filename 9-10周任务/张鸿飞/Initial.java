package com.zhanghongfei;
import java.util.Arrays;
public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//��һ��
			int []nums1= {1,2,2,1};
			int []nums2= {2,2};
			Solution ac=new Solution();
			int []nums3=ac.intersect(nums1, nums2);
			System.out.println("�������ս��"+Arrays.toString(nums3));
			//�ڶ���
			String s="HELLO";
			Solution rs=new Solution();
			System.out.println(rs.reverseString(s));
			//������
			ListWay stu=new ListWay();
			stu.listFunction();;
			SetWay st=new SetWay();
			st.setFunction();
			MapWay mw=new MapWay();
			mw.mapFunction();
		}

}

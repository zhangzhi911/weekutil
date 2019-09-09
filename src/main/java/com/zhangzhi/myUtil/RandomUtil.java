package com.zhangzhi.myUtil;


import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
      //min =1  max =3 
	public static int random(int min, int max){
		Random r  = new Random();
	 return r.nextInt(max-min +1) +min;
	}	
	
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。
	//应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	//1~~10  
	public static int[] subRandom (int min, int max, int subs){
		//目标数组
		int dest[] =new int[subs];
		
		HashSet<Integer> set = new HashSet<Integer>();
		//循环产生随机数,直到集合满足个数
		while(set.size()!=subs) {
			set.add(random(min,max));
		}
		//遍历set放入数组
		int i=0;
		for (Integer integer : set) {
			dest[i]=integer;
			i++;
		}
		
		return dest;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length()-1));
		
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String str="";
		for(int i =0;i<length;i++) {
		 	str+=randomCharacter();
		}
		return str;
		
	}

}

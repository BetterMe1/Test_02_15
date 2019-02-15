package xust;

import java.util.Arrays;

/*
598. 范围求和 II
 给定一个初始元素全部为 0，大小为 m*n 的矩阵 M 以及在 M 上的一系列更新操作。
操作用二维数组表示，其中的每个操作用一个含有两个正整数 a 和 b 的数组表示，含义是将所有符合 0 <= i < a 以及 0 <= j < b 的元素 M[i][j] 的值都增加 1。
在执行给定的一系列操作后，你需要返回矩阵中含有最大整数的元素个数。

示例 1:
输入: 
m = 3, n = 3
operations = [[2,2],[3,3]]
输出: 4
解释: 
初始状态, M = 
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
执行完操作 [2,2] 后, M = 
[[1, 1, 0],
 [1, 1, 0],
 [0, 0, 0]]
执行完操作 [3,3] 后, M = 
[[2, 2, 1],
 [2, 2, 1],
 [1, 1, 1]]
M 中最大的整数是 2, 而且 M 中有4个值为2的元素。因此返回 4。
注意:
m 和 n 的范围是 [1,40000]。
a 的范围是 [1,m]，b 的范围是 [1,n]。
操作数目不超过 10000。
 */
/*
 * 分析：
 * 对矩阵的操作每次都是从0行到a行,从0列到b列的矩形区域，多次操作必定会重叠，因此只要计算出都重叠的部分即可，即找最小的a和最小的b，返回a*b。
 */
//public class Test_0215 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int m = 3;
//		int n = 3;
//		int[][] ops = {{2,2},{3,3}};
//		System.out.println(So.maxCount(m, n, ops));
//	}
//}
//class Solution {
//    public int maxCount(int m, int n, int[][] ops) {
//        if(ops.length ==0)
//        	return m*n;
//        int MinI = ops[0][0];
//        int MinJ = ops[0][1];
//        for(int i=1; i<ops.length; i++){
//        	MinI = Math.min(ops[i][0], MinI);
//        	MinJ = Math.min(ops[i][1], MinJ);
//        }
//        return MinI * MinJ;
//    }
//}
/*
628. 三个数的最大乘积
给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。

示例 1:
输入: [1,2,3]
输出: 6

示例 2:
输入: [1,2,3,4]
输出: 24
注意:
给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 */
/*
 * 分析：
 * 三个数得到最大乘积的情况有两种：一是最大数*第二大数*第三大数，二是最小数*第二小数*最大数（最小数、第二小数可能是负数，因此也可能得到最大乘积）。
 * 数组排序，返回两种情况下的最大数即可。
 */
//public class Test_0215 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] nums = {1,2,3,4};
//		System.out.println(So.maximumProduct(nums));
//	}
//}
//class Solution {
//    public int maximumProduct(int[] nums) {
//        if(nums.length  == 0)
//        	return -1;
//        Arrays.sort(nums);
//        return Math.max(nums[nums.length -1]*nums[nums.length -2]*nums[nums.length -3],
//        		nums[nums.length -1]*nums[0]*nums[1]);
//    }
//}
/*
633. 平方数之和
 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。

示例1:
输入: 5
输出: True
解释: 1 * 1 + 2 * 2 = 5

示例2:
输入: 3
输出: False
 */
/*
 * 分析：
 * 若非负整数 c是两数的平方数之和，那这两个数肯定不大于根号下c,i遍历0到根号c，计算是否存在sqrt(c-i*i)等于 (int)sqrt(c-i*i)，
 * 如果等于，说明c是两整数的平方之和，遍历完毕若不存在，说明c不是两整数的平方之和。
 */
public class Test_0215 {
	public static void main(String[] args) {
		Solution So = new Solution();
		int c = 3;
		System.out.println(So.judgeSquareSum(c));
	}
}
class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i=0; i<=(int)Math.sqrt(c);i++){
            if(Math.sqrt(c-i*i) == (int)Math.sqrt(c-i*i))
            	return true;  
        }
        return false;
    }
}
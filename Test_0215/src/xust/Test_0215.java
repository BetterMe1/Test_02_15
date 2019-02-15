package xust;

import java.util.Arrays;

/*
598. ��Χ��� II
 ����һ����ʼԪ��ȫ��Ϊ 0����СΪ m*n �ľ��� M �Լ��� M �ϵ�һϵ�и��²�����
�����ö�ά�����ʾ�����е�ÿ��������һ���������������� a �� b �������ʾ�������ǽ����з��� 0 <= i < a �Լ� 0 <= j < b ��Ԫ�� M[i][j] ��ֵ������ 1��
��ִ�и�����һϵ�в���������Ҫ���ؾ����к������������Ԫ�ظ�����

ʾ�� 1:
����: 
m = 3, n = 3
operations = [[2,2],[3,3]]
���: 4
����: 
��ʼ״̬, M = 
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
ִ������� [2,2] ��, M = 
[[1, 1, 0],
 [1, 1, 0],
 [0, 0, 0]]
ִ������� [3,3] ��, M = 
[[2, 2, 1],
 [2, 2, 1],
 [1, 1, 1]]
M ������������ 2, ���� M ����4��ֵΪ2��Ԫ�ء���˷��� 4��
ע��:
m �� n �ķ�Χ�� [1,40000]��
a �ķ�Χ�� [1,m]��b �ķ�Χ�� [1,n]��
������Ŀ������ 10000��
 */
/*
 * ������
 * �Ծ���Ĳ���ÿ�ζ��Ǵ�0�е�a��,��0�е�b�еľ������򣬶�β����ض����ص������ֻҪ��������ص��Ĳ��ּ��ɣ�������С��a����С��b������a*b��
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
628. �����������˻�
����һ���������飬���������ҳ�����������ɵ����˻������������˻���

ʾ�� 1:
����: [1,2,3]
���: 6

ʾ�� 2:
����: [1,2,3,4]
���: 24
ע��:
�������������鳤�ȷ�Χ��[3,104]�����������е�Ԫ�ط�Χ��[-1000, 1000]��
����������������������ĳ˻����ᳬ��32λ�з��������ķ�Χ��
 */
/*
 * ������
 * �������õ����˻�����������֣�һ�������*�ڶ�����*����������������С��*�ڶ�С��*���������С�����ڶ�С�������Ǹ��������Ҳ���ܵõ����˻�����
 * �������򣬷�����������µ���������ɡ�
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
633. ƽ����֮��
 ����һ���Ǹ����� c ����Ҫ�ж��Ƿ������������ a �� b��ʹ�� a2 + b2 = c��

ʾ��1:
����: 5
���: True
����: 1 * 1 + 2 * 2 = 5

ʾ��2:
����: 3
���: False
 */
/*
 * ������
 * ���Ǹ����� c��������ƽ����֮�ͣ������������϶������ڸ�����c,i����0������c�������Ƿ����sqrt(c-i*i)���� (int)sqrt(c-i*i)��
 * ������ڣ�˵��c����������ƽ��֮�ͣ���������������ڣ�˵��c������������ƽ��֮�͡�
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
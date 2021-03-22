package algorithm.leetcode;

import algorithm.ITestInterface;
import util.LogUtil;

import java.util.ArrayDeque;

/**
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * <p>
 * 示例 1:
 * <p>
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 示例 2:
 * <p>
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * 说明：
 * <p>
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 * 链接：https://leetcode-cn.com/problems/multiply-strings
 */
public class Leetcode43 implements ITestInterface {

    /**
     * 思路：根究乘法的规律，相乘结果的位数一定是两个数的位数相加或者相加位数-1，先找到两数相乘位数比较短的那个，把相应的位数的数字乘以短位数相加。
     */
    @Override
    public void test() {
//        LogUtil.d("62609910  --   " + multiply("92345", "678"));
        LogUtil.d("  --   " + multiply("97987987", "0"));
//        LogUtil.d("  --   " + multiply("123", "456"));
    }

    public String multiply(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        String minString = num1.length() < num2.length() ? num1 : num2;
        String maxString = minString == num1 ? num2 : num1;
        minString = getReverse(minString);
        maxString = getReverse(maxString);
        char[] min = minString.toCharArray();
        char[] max = maxString.toCharArray();

        int index = 0;
        int nextTmp = 0;
        while (index < min.length + max.length) {
            // 存储上一次循环大于10进位的结果，加到现在的结果里
            int tmp = nextTmp;
            for (int i = 0; i < min.length; i++) {
                LogUtil.d("--- a:" + getInt(max, index - i) + "   b:" + getInt(min[i]) + " c:" + (getInt(max, index - i) * getInt(min[i])) % 10);
                tmp += getInt(max, index - i) * getInt(min[i]);
            }
            if (tmp >= 10) {
                nextTmp = tmp / 10;
            } else {
                nextTmp = 0;
            }
            LogUtil.d("tmp:::" + tmp + "   nextTmp::" + nextTmp + "                " + (tmp % 10));
            deque.add(tmp % 10);
            index++;
        }
        while (deque.peekLast() != null && deque.peekLast() == 0) {
            deque.pollLast();
        }
        while (!deque.isEmpty()) {
            result.append(deque.pollLast());
        }
        if (result.length() == 0) {
            return "0";
        }
        return result.toString();
    }

    private String getReverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    private int getInt(char[] chars, int index) {
        if (index < 0 || index >= chars.length) {
            return 0;
        } else {
            return getInt(chars[index]);
        }
    }

    private int getInt(Character c) {
        return c - '0';
    }
}

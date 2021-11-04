package algorithm.leetcode;

import algorithm.ITestInterface;
import util.LogUtil;

/**
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 * <p>
 * 示例 1:
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
 * <p>
 * 示例 2:
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 解释: 7/-3 = truncate(-2.33333..) = -2
 * <p>
 * 提示：
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。本题中，如果除法结果溢出，则返回 2^31 − 1。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/divide-two-integers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode29 implements ITestInterface {
    @Override
    public void test() {
        int result = divide(Integer.MAX_VALUE, 1);
        LogUtil.d("result::" + result);
    }

    public int divide(int dividend, int divisor) {
        int num = 0;
        boolean isMinus = dividend < 0 || divisor < 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (++num < dividend) {
            int curr = sum(divisor, num);
            int next = sum(divisor, num + 1);
            LogUtil.d("curr::" + curr + " next::" + next + " dividend::" + dividend);
            if (curr <= dividend && next > dividend) {
                return isMinus ? -num : num;
            }
        }
        return Integer.MAX_VALUE;
    }

    private int sum(int x, int loop) {
        int result = 0;
        for (int i = 0; i < loop; i++) {
            result += x;
        }
        return result;
    }
}

package algorithm.DynamicProgramming;

import algorithm.ITestInterface;
import util.LogUtil;

public class ZeroOnePackage implements ITestInterface {
    @Override
    public void test() {
        int[] w = {1, 4, 3, 1};
        int[] v = {1500, 3000, 2000, 2000};
//        package01(4, w, v);
        longestCommonSubsequence("abcde","acdefg");
    }

    /**
     * 0-1背包问题：给定n种物品和一背包。物品 i 的重量为 wi，其价值为 vi，背包的容量为 c。问应该如何选择装入背包中的物品，使得装入背包中物品的总价值最大？
     * <p>
     * n: 3 i: 0 1 2
     * c: 4 j: 0 1 2 3
     * w: [1, 4, 3]
     * v: [1500, 3000, 2000]
     * 上一个单元格的最大值result[i-1][j]
     * 当前商品的价值+剩余weight的最大价值 = v[i] + result[i-1][j-v[i]]
     */
    public void package01(int c, int[] w, int[] v) {
        int n = w.length;
        int[][] result = new int[n][c];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 0) {
                    // 初始化第0行，背包能装得下第0件物品最大价值就是第0件物品，否则是0
                    result[i][j - 1] = w[i] <= j ? v[i] : 0;
                } else {
                    // 上一行的最大价值
                    int preBestValue = result[i - 1][j - 1];
                    int bestValue;
                    if (w[i] > j) {
                        // 当前行的物品重量大于当前可以携带的重量，最大价值还是上一行的
                        bestValue = preBestValue;
                    } else {
                        int curValue;
                        // 可携带重量减去当前物品重量之后还有剩余重量可以携带，就去找剩余重量可携带的最大价值
                        if (j - 1 - w[i] >= 0) {
                            curValue = v[i] + result[i - 1][j - 1 - w[i]];
                        } else {
                            curValue = v[i];
                        }
                        bestValue = Math.max(preBestValue, curValue);
                    }
                    result[i][j - 1] = bestValue;
                }
            }
        }
        printf(result);
    }

    public static void printf(int[][] result) {
        StringBuilder sb = new StringBuilder();
        for (int[] ints : result) {
            for (int anInt : ints) {
                sb.append(anInt).append(" ");
            }
            sb.append("\n");
        }

        LogUtil.Companion.d(sb.toString());
    }

    /**
     * 在计算机界中，我们总是追求用有限的资源获取最大的收益。
     * 现在，假设你分别支配着 m 个 0 和 n 个 1。另外，还有一个仅包含 0 和 1 字符串的数组。
     * 你的任务是使用给定的 m 个 0 和 n 个 1 ，找到能拼出存在于数组中的字符串的最大数量。每个 0 和 1 至多被使用一次。
     * 示例 1:
     *
     * 输入: strs = ["10", "0001", "111001", "1", "0"], m = 5, n = 3
     * 输出: 4
     * 解释: 总共 4 个字符串可以通过 5 个 0 和 3 个 1 拼出，即 "10","0001","1","0" 。
     * 示例 2:
     *
     * 输入: strs = ["10", "0", "1"], m = 1, n = 1
     * 输出: 2
     * 解释: 你可以拼出 "10"，但之后就没有剩余数字了。更好的选择是拼出 "0" 和 "1" 。
     *
     * 提示：
     *
     * 1 <= strs.length <= 600
     * 1 <= strs[i].length <= 100
     * strs[i] 仅由 '0' 和 '1' 组成
     * 1 <= m, n <= 100
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/ones-and-zeroes
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 动态规划之最长公共子序列
     * "abcde","acdefg"
     * @return
     */
    public static int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        char[] ch1 = text1.toCharArray();
        char[] ch2 = text2.toCharArray();

        //动态规划算法创建的二维数组一般都得多增一行一列，这是为了防止数组越界异常
        int[][] p = new int[len1 + 1][len2 + 1];

        //填表，第一行和第一列都为0，所以填表从下标为1的行和下标为1的列开始填
        for (int i = 1; i < p.length; i++) {
            for (int j = 1; j < p[0].length; j++) {
                if (ch1[i - 1] == ch2[j - 1]) {
                    p[i][j] = p[i - 1][j - 1] + 1;
                } else {
                    p[i][j] = Math.max(p[i - 1][j], p[i][j - 1]);
                }
            }
        }
        printf(p);
        return p[len1][len2];
    }

}

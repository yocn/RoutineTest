package algorithm;

import util.LogUtil;

import java.util.Arrays;

public class GreedyAlgorithm implements ITestInterface {

    @Override
    public void test() {
    }

    /**
     * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
     * 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[i]，
     * 我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
     * 链接：https://leetcode-cn.com/problems/assign-cookies
     */
    public static class shareCandy implements ITestInterface {

        @Override
        public void test() {
            int[] g1 = {1, 2};
            int[] s1 = {1, 2, 3};
            int[] g2 = {1, 2, 3};
            int[] s2 = {3};
            int children = findContentChildren(g2, s2);
            LogUtil.Companion.d("children:" + children);
        }

        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int result = 0;
            int minIndex = 0;
            int maxIndex = s.length;
            if (maxIndex < 1) {
                return 0;
            }
            for (int gg : g) {
                if (minIndex == maxIndex) {
                    break;
                }
                if (gg > s[maxIndex - 1]) {
                    break;
                }
                for (int i = minIndex; i < maxIndex; i++) {
                    if (s[i] >= gg) {
                        minIndex = i + 1;
                        result++;
                        break;
                    }
                }
            }
            return result;
        }

    }

    /**
     * 链接：https://leetcode-cn.com/problems/candy
     * <p>
     * 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
     * 你需要按照以下要求，帮助老师给这些孩子分发糖果：
     * 1: 每个孩子至少分配到 1 个糖果。
     * 2: 相邻的孩子中，评分高的孩子必须获得更多的糖果。
     * 那么这样下来，老师至少需要准备多少颗糖果呢？
     * <p>
     * 示例 1:
     * 输入: [1,0,2]
     * 输出: 5
     * 解释: 你可以分别给这三个孩子分发 2、1、2 颗糖果。
     * <p>
     * 示例 2:
     * 输入: [1,2,2]
     * 输出: 4
     * 解释: 你可以分别给这三个孩子分发 1、2、1 颗糖果。
     * 第三个孩子只得到 1 颗糖果，这已满足上述两个条件。
     * 3 2 1 0 1 2 3 2 1 1
     * 4 3 2 1 2 3 4 3 2 1
     */
    public static class shareCandy2 implements ITestInterface {

        @Override
        public void test() {

        }
    }


}

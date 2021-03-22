package algorithm.leetcode;

import algorithm.ITestInterface;
import util.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 * <p>
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 示例 2：
 * 输入：nums = [0]
 * 输出：[[],[0]]
 * 提示：
 * <p>
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * nums 中的所有元素 互不相同
 */
public class Leetcode78 implements ITestInterface {
    /**
     * 思路：普通的递归，其实可以把每个数字存在不存在写作0或1，存在是1，不存在是0
     * 所以就是正确输出000 001 010 011 100 101 110 111即可。
     * 所以可以画出来递归树，简单的递归就好了
     */

    @Override
    public void test() {
        int[] nums = new int[]{1, 2, 3};
        LogUtil.d(subsets(nums));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        set(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public void set(List<List<Integer>> result, List<Integer> current, int[] nums, int level) {
        if (level == nums.length) {
            result.add(current);
        } else {
            List<Integer> list1 = new ArrayList<>(current);
            list1.add(nums[level]);
            set(result, list1, nums, level + 1);
            set(result, new ArrayList<>(current), nums, level + 1);
        }
    }
}

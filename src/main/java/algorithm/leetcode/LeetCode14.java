package algorithm.leetcode;


import algorithm.ITestInterface;
import util.LogUtil;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *  
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 * 提示：
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 */
public class LeetCode14 implements ITestInterface {

    /**
     * 思路：暴力破解，循环看是否是结果开头的，其实可以做二分查找？
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String minString = strs[0];
        for (String str : strs) {
            if ("".equals(str)) {
                return "";
            }
            if (str.length() < minString.length()) {
                minString = str;
            }
        }
        int index = 1;
        for (int i = 0; i < strs.length; ++i) {
            if (index > minString.length()) {
                return minString;
            }
            String tar = minString.substring(0, index);
            LogUtil.d(i + " " + index + " " + strs[i] + "   ::" + tar);
            if (!strs[i].startsWith(tar)) {
                return tar.substring(0, tar.length() - 1);
            }
            if (i == strs.length - 1) {
                index++;
                i = -1;
            }
        }

        return minString;
    }


    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String minString = strs[0];
        for (String str : strs) {
            if ("".equals(str)) {
                return "";
            }
            if (str.length() < minString.length()) {
                minString = str;
            }
        }
        int index = 0;

        char c = strs[0].charAt(index);
        for (int i = 0; i < strs.length; ++i) {
            if (index == strs[i].length()) {
                return strs[i];
            }
            LogUtil.d("index:" + index + "  i:" + i + " c:" + c + "   tar:" + strs[i].charAt(index));
            if (c != strs[i].charAt(index)) {
                return strs[i].substring(0, index);
            }
            if (i == strs.length - 1) {
                if (++index == strs[0].length()) {
                    return strs[i].substring(0, index);
                }
                c = strs[0].charAt(index);
                i = -1;
            }
        }
        return strs[0];
    }

    @Override
    public void test() {
//        String[] strs = new String[]{"flaower", "flaow", "flaight"};
        String[] strs = new String[]{"a", "ac"};
//        String[] strs = new String[]{"flaw", "f"};
//        String[] strs = new String[]{"flaw", "fko"};
//        String[] strs = new String[]{"a"};
        LogUtil.d(">>" + longestCommonPrefix1(strs) + "<<");
    }
}

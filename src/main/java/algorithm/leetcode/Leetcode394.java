package algorithm.leetcode;

import algorithm.ITestInterface;
import util.LogUtil;

/**
 * 394. 字符串解码
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 * <p>
 * 示例 1：
 * 输入：s = "3[a]2[bc]"
 * 输出："aaabcbc"
 * 示例 2：
 * 输入：s = "3[a2[c]]"
 * 输出："accaccacc"
 * 示例 3：
 * 输入：s = "2[abc]3[cd]ef"
 * 输出："abcabccdcdcdef"
 * 示例 4：
 * 输入：s = "abc3[cd]xyz"
 * 输出："abccdcdcdxyz"
 */
public class Leetcode394 implements ITestInterface {
    @Override
    public void test() {
        LogUtil.d(decodeString("3[a]2[bc]"));
//        LogUtil.d(decodeString("3[a2[c]]"));
//        LogUtil.d(decodeString("a2[c]"));
        LogUtil.d(decodeString("abc3[cd]xyz"));
    }

    public String decodeString(String s) {
        return decodeRecursion(s);
    }

    /**
     * 思路：遍历，遇到[开始，遇到]结束，把中间的部分丢给递归方法。
     */
    public String decodeRecursion(String src) {
        int indexBegin = src.indexOf('[');
        if (indexBegin <= 0) {
            return src;
        }

        StringBuilder resultSb = new StringBuilder();
        StringBuilder preSb = new StringBuilder();
        StringBuilder numberSb = new StringBuilder();
        StringBuilder innerSb = new StringBuilder();
        int bracketNum = 0;
        for (int i = 0; i < src.length(); i++) {
            char curr = src.charAt(i);
            switch (curr) {
                case '[':
                    if (bracketNum++ > 0) {
                        innerSb.append(curr);
                    }
                    break;
                case ']':
                    if (--bracketNum == 0) {
                        int num = Integer.parseInt(numberSb.toString());
                        resultSb.append(preSb);
                        String exeString = decodeString(innerSb.toString());
                        while (num-- > 0) {
                            resultSb.append(exeString);
                        }
                        preSb.delete(0, preSb.length());
                        numberSb.delete(0, numberSb.length());
                        innerSb.delete(0, innerSb.length());
                    } else {
                        innerSb.append(curr);
                    }
                    break;
                default:
                    if (bracketNum == 0) {
                        if (curr >= '0' && curr <= '9') {
                            numberSb.append(curr);
                        } else {
                            preSb.append(curr);
                        }
                    } else {
                        innerSb.append(curr);
                    }
            }
        }
        if (preSb.length() > 0) {
            resultSb.append(preSb);
        }
        return resultSb.toString();
    }
}




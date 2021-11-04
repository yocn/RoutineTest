package algorithm.leetcode;

import algorithm.ITestInterface;
import util.LogUtil;

import java.util.*;

/**
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母都恰好只用一次。
 * <p>
 * 示例 1:
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * 示例 2:
 * 输入: strs = [""]
 * 输出: [[""]]
 * <p>
 * 示例 3:
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 *  
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] 仅包含小写字母
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/group-anagrams
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode49 implements ITestInterface {
    @Override
    public void test() {
        String[] ss = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
//        String[] ss = new String[]{"cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc"};
//        String[] ss = new String[]{"c", "ac"};
        groupAnagrams(ss);
    }

    // 思路1：所有的
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, LinkedList<String>> map = new HashMap<>();
        for (String s : strs) {
            String key = getKey(s);
            LogUtil.d(s + "::" + key);
            LinkedList<String> list = map.get(key);
            if (list == null) {
                list = new LinkedList<>();
            }
            list.add(s);
            map.put(key, list);
        }
        for (Map.Entry<String, LinkedList<String>> set : map.entrySet()) {
            result.add(set.getValue());
        }
        StringBuilder sb = new StringBuilder("[");
        for (List<String> list : result) {
            sb.append("[");
            for (String s : list) {
                sb.append(s).append(",");
            }
            sb.append("],");
        }
        sb.append("]");
        LogUtil.d("result::" + sb.toString());
        return result;
    }

    // aaaabbccc->a4b2c3
    private String getKey(String src) {
        char[] chars = src.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : chars) {
            int num = 0;
            if (map.containsKey(c)) {
                num = map.get(c);
            }
            map.put(c, ++num);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char index = (char) ('a' + i);
            if (map.containsKey(index)) {
                sb.append(index).append(map.get(index));
            }
        }
        return sb.toString();
    }

    // 思路1：所有的
    public List<List<String>> groupAnagrams1(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<Bean, LinkedList<Bean>> map = new HashMap<>();
        for (String str : strs) {
            Bean bean = new Bean(str);
            LinkedList<Bean> list = map.get(bean);
            if (list == null) {
                list = new LinkedList<>();
            }
            list.add(bean);
            map.put(bean, list);
        }
        for (Map.Entry<Bean, LinkedList<Bean>> set : map.entrySet()) {
            List<String> tmp = new ArrayList<>();
            for (Bean bean : set.getValue()) {
                tmp.add(bean.src);
            }
            result.add(tmp);
        }
        StringBuilder sb = new StringBuilder("[");
        for (List<String> list : result) {
            sb.append("[");
            for (String s : list) {
                sb.append(s).append(",");
            }
            sb.append("],");
        }
        sb.append("]");
        LogUtil.d("result::" + sb.toString());
        return result;
    }

    private static class Bean {
        public String src;
        public int easy;
//        public String full;

        public Bean(String src) {
            this.src = src;
            char[] chars = src.toCharArray();
            int[] fullChars = new int[26];
            for (char aChar : chars) {
                int index = aChar - 'a';
                LogUtil.d(aChar + " " + index);
                fullChars[index] = fullChars[index] + 1;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < fullChars.length; i++) {
                easy += fullChars[i] * (i + 1);
                sb.append(fullChars[i]).append("-");
            }
//            full = sb.toString();
//            LogUtil.d(src + " " + easy + " " + full);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bean bean = (Bean) o;
            if (easy != bean.easy) {
                return false;
            } else {
                return true;
            }
//            return full.equals(bean.full);
        }

        @Override
        public int hashCode() {
            return Objects.hash(easy);
        }
    }
}

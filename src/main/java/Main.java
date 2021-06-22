import algorithm.*;
import algorithm.DynamicProgramming.ZeroOnePackage;
import algorithm.PrefixSum.BestWorkTime;
import algorithm.PrefixSum.CommonPrefix;
import algorithm.PrefixSum.MinM;
import algorithm.leetcode.LeetCode14;
import algorithm.leetcode.Leetcode27;
import algorithm.leetcode.Leetcode394;
import algorithm.leetcode.Leetcode43;
import algorithm.monotoneStack.BadHairCows;
import algorithm.monotoneStack.MinLeftNum;
import algorithm.monotoneStack.StageWater;
import algorithm.other.HammingDistance;
import algorithm.other.SortArray;
import algorithm.stackQueue.Queue2Stack;
import algorithm.stackQueue.Stack2Queue;
import lock.ATestLock;
import lock.ProducerAndCustomer;
import structure.testLinkedList;
import testAQS.TestNumberIncrease;
import testAQS.TextMutexCustom;
import testAQS.TextPark;
import testJava.TestI;
import util.LogUtil;
import zipFileTest.testZipFile;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by yocn on 2018/12/4.
 * //
 */
public class Main {
    //    public static void main(String[] args) {
////        System.out.println("asdadsa");
////        AnnoParser parser = new AnnoParser();
////        parser.parse(IAlgoProxy.class);
////        int[] indexs = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
////        for (int i = 0; i < 10; ++i) {
////            System.out.println("i->" + i + " index->" + indexs[i]);
////        }
////        for (int i = 0; i < 10; i++) {
////            System.out.println("i->" + i + " index->" + indexs[i]);
////        }
//
////        LogUtil.Companion.d("yocn Function->" + Constant.ifInConstents(Constant.Function.class, 100));
//
////        LogUtil.Companion.d("yocn Function->" + Constant.Function.TYPE_TOAST);
////        LogUtil.Companion.d("yocn Function->" + Constant.Function.TYPE_SHOW_LOCAL_IMAGE_0);
//
////        ThreadLocal threadLocal;
////        LinkedHashMap ma;
////        String string = null;
////        HashMap<Integer, String> map = new HashMap<>();
////        map.put(null, "123");
////        System.out.println("0     ->" + map.get(null) + " v->" + hash(null));
////
////        System.out.println("1     ->" + map.hashCode() + " v->" + (map.hashCode() >>> 16) + " x->" + (map.hashCode() ^ (map.hashCode() >>> 16)));
//
////        new ATestLock().doTest();
////        new TestTreeMap().test();
//
//        Random random = new Random();
//        StringBuffer sb = new StringBuffer();
//        sb.append("{");
//        for (int i = 0; i < 47; i++) {
//            sb.append("x:").append(random.nextInt(10000)).append(",y:").append(random.nextInt(10000)).append("|");
//        }
//        sb.append("}");
//        try {
//            int srcLength = sb.toString().length();
//            byte[] dest = GZIPUtils.compress(sb.toString());
//            String ss = new String(dest, "utf-8");
//            LogUtil.Companion.d("" + ss);
//            e.printStackTrace();
//        }
//    }
//
//    static final int hash(Object key) {
//        int h;
//        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
//    }
//}

    public static void main(String[] args) throws IOException {
//        ZigzagConversion.test();
//        Palindromic.test();
//        LongestSubString.test();
//        IsPalindromic.test();
//        RegularExpressionMatching.test();
//        EightQueen.test();
//        new TraverseBinaryTree().test();
//        new SimpleDynamicProxy().test();
//        TestRetrofit.retrofitGetWeather();
//        TestOKHttp.test();
//        new TestRecursion(0).process();
//        testOKIO.test();
//        new GenerateParenttheses().test();
//        new ArrangeAllString().test();
//        new CombinationOfPhoneNumLetter().test();
//        new CombinationNum().test();
//        new CombinationNum2().test();
//        new Permutations().test();
//        new Fibonacci().test();
//        new TestAQS().test();
//        new SpiralMatrix().test();
//        new PascalTriangle().test();
//        new SprialMatrixII().test();
//        new LongestUnivaluePath().test();
//        new RomanToInteger().test();
//        new ReverseInteger().test();
//        new Sum3().test();
//        new SumOfLeftLeaves().test();
//        new Sum2().test();
//        new Atoi().test();
//        new ChainAdd().test();
//        new GetStep().test();
//        new BinarySearch().test();
//        ITestInterface test = new BubbleSort();
//        ITestInterface test = new BinaryTreeBFS();
//        test.test();

//        LogUtil.Companion.d(""+Math.pow(1.01,365));

//        String RC4Key = "1234567890Abcdef";
//        char[] chars = RC4Key.toCharArray();
//        int a1 = 0;
//        int[] tar = new int[4];
//        for (int i = 0; i < chars.length; i++) {
//            int digit = i % 4;
//            int real = chars[i] << 8 * digit;
//            LogUtil.Companion.d(i + " - " + real + " digit->" + digit);
//            a1 += real;
//            if (i % 4 == 3) {
//                tar[i / 4] = a1;
//                LogUtil.Companion.d("---------" + a1 + " i/4->" + (i / 4));
//                a1 = 0;
//            }
//        }
//        for (int i : tar) {
//            LogUtil.Companion.d("" + i);
//        }

//        int a = 3;
//        int b = 4;
//
//        add(a, b);
//        LogUtil.Companion.d(a);
//        LogUtil.Companion.d(b);
//
//        int[] aa = {1, 2};
//        int[] bb = {3, 4};
//        LogUtil.Companion.d(aa[0] + "|" + aa[1]);
//        LogUtil.Companion.d(bb[0] + "|" + bb[1]);
//
//        String sa = "12";
//        String sb = "12";
//        add(sa, sb);
//        LogUtil.Companion.d(sa);
//        LogUtil.Companion.d(sb);
//
//        Integer ai = Integer.parseInt("12");
//        Integer bi = Integer.parseInt("34");
//        add(ai, bi);
//        LogUtil.Companion.d(ai);
//        LogUtil.Companion.d(bi);
//
//        O ao = new O(1);
//        O bo = new O(2);
//        add(ao, bo);
//        LogUtil.Companion.d(ao.x);
//        LogUtil.Companion.d(bo.x);

//        ProductMethod.productMethod();
//        new testReflect().test();
//        new GenerateParenttheses().test();
//        new SortedArray().test();
//        new CountBinaryTreeNode().test();
//        new DepthOfBinaryTree().test();
//        new BinaryTreeBFS().test();
//        new LongestSubString().test();
//        new TrieTree().test();
//        new BinaryTreeMirror().test();
//        new CountingSort().test();
//        new BinarySearch().test();
//        new BinaryTreeBFS().test();
//        new BinaryTreeDFS().test();
//        new CompleteBinTreeAddNode().test();
//        new BubbleSort().bubbleSort(new int[]{1, 9, 2, 4, 7, 3, 7, 2, 7, 20, 1, 11, 12, 8});
//        LogUtil.Companion.d(new BinarySearch().binSearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9));
//        LogUtil.Companion.d(0 ^ 12);
//        BinaryTreeUtil.printBinTree(BinaryTreeUtil.prepareANode2());
//        new testStaticCodeLoad().testSingleTon();

//        new testArrayDeque().test();
//        new testThreadLocal().test();
//        new LongestChildString().test();
//        new FastSlowPointer().test();
//        LogUtil.Companion.d("" + (-1 % 8));
//        LogUtil.Companion.d("" + (-10 % 16));
//        LogUtil.Companion.d("" + (-10 & 15));
//        LogUtil.Companion.d("" + (6 & 15));
//        LogUtil.Companion.d("" + Integer.toBinaryString(6));
//        LogUtil.Companion.d("" + Integer.toBinaryString(-10));
//
//        LogUtil.Companion.d("" + Integer.toBinaryString(-1));
//        LogUtil.Companion.d("" + Integer.toBinaryString(-2));
//        LogUtil.Companion.d("" + Integer.toBinaryString(-3));
//        LogUtil.Companion.d("" + Integer.toBinaryString(-4));
//        LogUtil.Companion.d("" + Integer.toBinaryString(-5));
//        for (int i = -10; i <= 10; i++) {
//            LogUtil.Companion.d(i + "   " + Integer.toBinaryString(i));
//        }
//        new LongestChildString().test();
//        new QuickSort().test();
//        new MergeSort().test();
//        new XApple().test();
//        new Queue2Stack().test();
//        new Stack2Queue().test();
//        new ProducerAndCustomer().test();
//        new testLinkedList().test();
//        new CompleteBinTreeAddNode().test();
//        new MinStack().test();
//        new SingleLinkedList().test();
//        new HammingDistance().test();
//        new SortArray().test();
//        new MinLeftNum().test();
//        new BadHairCows().test();
//        new StageWater().test();
//        new CommonPrefix().test();
//        new MinM().test();
//        new BestWorkTime().test();
//        new testZipFile().test();
//        new ATestLock().doTest();
//        XApple();
//        new XApple().test();
//        LogUtil.Companion.d(getKidsModeEmailContentId("AggtCXIMrc9uqyGGhN6u0M7nwQB7F8BZl1fv3dWlLDvWthaXztII7GF/TsjEaRhF9Hl+os1Ht+jzVMm7q0egsg"));
//        new GreedyAlgorithm().test();
//        new ZeroOnePackage().test();
//        LogUtil.d("age::"+"A,B,C".toLowerCase());
//        LogUtil.d("age::"+"A,B,C".toUpperCase());
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement e : elements) {
//            LogUtil.d("e:::" + e.toString());
//        }
//        set(Atoii.class);
//        String PLACEHOLDER = "${PLACEHOLDER}";
//        String rawString = "WATCH AD-FREE WITH ${PLACEHOLDER}%s$d COINS";
//        int placeholderIndex = rawString.indexOf(PLACEHOLDER);
//        rawString = rawString.substring(0, placeholderIndex).concat(
//                rawString.substring(placeholderIndex + PLACEHOLDER.length()));
//        LogUtil.d(rawString);

//        String ss = "aaaa@";
//        String[] re = ss.split("@");
//
//        LogUtil.d("re:" + Arrays.asList(re).toString());
//        LogUtil.d("re:" + formatTosepara(1024134300));


//        ArrayList list = new ArrayList();
//        Thread thread1 = new Thread(() -> {
//            while(true){
//                try {
//                    Thread.sleep(900);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                LogUtil.d("add");
//            }
//        });
//        Thread thread2 = new Thread(() -> {
//            while(true){
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                LogUtil.d("remove");
//            }
//        });
//        thread1.run();
//        thread2.run();

//        String desc = "Ad-Free Viewing for 1 day";
//        String desc = "Ad-FreeViewingfor 1 day";

//        int lastFirst = desc.lastIndexOf(' ');
//        if (lastFirst > 0) {
//            String lastFirstString = desc.substring(0, lastFirst);
//            int lastSecond = lastFirstString.lastIndexOf(' ');
//            if(lastSecond>0){
//                desc = desc.substring(0, lastSecond).concat("\n").concat(desc.substring(lastSecond));
//                LogUtil.d("s:" + desc);
//            }
//        }
//        JumpSkip.test();
//        new TestI().testMethodA();
//        new TestI().testMethodB();
//        new TestI().testMethodC();
//        int[] arr = new int[]{29, 13, 55, 12, 67, 33, 25, 72, 73, 34, 12, 11, 8, 77, 65, 54, 72};
//
//        int[] arr1 = new int[]{29, 13, 55, 55};
//        LogUtil.d("::" + get(arr1));
//        HashMap<Key, String> map = new HashMap<>();
//        map.put(new Key("a", "a"), "value1");
//        map.put(new Key("a", "b"), "value2");
//        LogUtil.d(map.size());
//        for (Key key : map.keySet()) {
//            LogUtil.d(map.get(key));
//        }
//        /*
//         * 结果：
//         * value1
//         * value2
//         */
//        new Leetcode394().test();
//        Object animValue = null;
//        float value = animValue == null ? 0f : (float) animValue;
//        LogUtil.d(value);
//        LogUtil.d((float)animValue);
//        new Package01().test();
//        new Apple12().test();
//        new TextMutexCustom().test();
//        new TextPark().test();
        new TestNumberIncrease().test();
    }

    public static class Key {
        public String key = "";
        public String append = "";

        public Key(String key, String append) {
            this.key = key;
            this.append = append;
        }

        @Override
        public boolean equals(Object o) {
            Key key1 = (Key) o;
            return Objects.equals(key, key1.key) &&
                    Objects.equals(append, key1.append);
        }

        @Override
        public int hashCode() {
            return key != null ? key.hashCode() : 0;
        }
    }

    private static int get(int[] arr) {
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            m ^= arr[i] ^= i;
        }
        return m;
    }

    private static String getSubStr(String str, int num) {
        String result = "";
        int i = 0;
        while (i < num) {
            int lastFirst = str.lastIndexOf(' ');
            result = str.substring(lastFirst) + result;
            str = str.substring(0, lastFirst);
            i++;
        }
        return result.substring(1);
    }
//    public static String getCoinsString(int num) {
//        String raw = String.valueOf(num);
//        String result = raw;
//        if (num > 1000) {
//            result = result.substring()
//        }
//        return result;
//    }

    public static String formatTosepara(float data) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(data);
    }

    public static class Atoii extends Atoi {
    }


    public static void set(Class<? extends Atoi> clazz) {
        System.out.println(clazz.getTypeName());

//        ParameterizedType parameterizedType = (ParameterizedType) clazz.getGenericSuperclass();
//
//        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
//        for (Type actualTypeArgument : actualTypeArguments) {
//            System.out.println(actualTypeArgument);
//        }r
    }

    public static String getKidsModeEmailContentId(String encrypt) {
        // 33 is '!', char under 33 maybe cannot show normal, fake char must bigger than 33
        int base = (int) 33;
        char[] chars = encrypt.toCharArray();
        int length = chars.length;
        char[] targetChars = new char[length * 2];
        for (int i = 0; i < length; i++) {
            targetChars[i * 2] = chars[i];
            int half = chars[i] / 2;
            half = half < 33 ? half + (chars[i] - half) / 2 : half;
            targetChars[i * 2 + 1] = (char) half;
        }
        return String.valueOf(targetChars);
    }

    public static void XApple() {
        int apple = 10;
        XAppleInternal("", apple, 0, 0);
    }

    private static void XAppleInternal(String result, int remain, int eat, int days) {
        if (eat != 0) {
            result = result + " " + eat;
        }
        if (remain == 0) {
            LogUtil.Companion.d(days + " - " + result);
            return;
        }
        if (remain < 0) {
            return;
        }
        days++;
        XAppleInternal(result, remain - 1, 1, days);
        XAppleInternal(result, remain - 2, 2, days);
        XAppleInternal(result, remain - 3, 3, days);
    }

//    static class O {
//        public O(int x) {
//            this.x = x;
//        }
//
//        public int x;
//    }
//
//    public static void add(int x, int y) {
//        x++;
//        y++;
//    }
//
//    public static void add(Integer x, Integer y) {
//        x++;
//        y++;
//    }
//
//    public static void add(int[] x, int[] y) {
//        x[0] = 10;
//        y[0] = 10;
//    }
//
//    public static void add(String x, String y) {
//        x += "a";
//        y += "a";
//    }
//
//    public static void add(O x, O y) {
//        x.x++;
//        y.x++;
//    }
}
import algorithm.leetcode.LeetCode22;
import algorithm.leetcode.LeetCode29;
import algorithm.leetcode.LeetCode49;

import java.io.IOException;

/**
 * Created by yocn on 2018/12/4.
 * //
 */
public class Main {

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
//        JumpSkip.test();
//        new TestI().testMethodA();
//        new TestI().testMethodB();
//        new TestI().testMethodC();
//        int[] arr = new int[]{29, 13, 55, 12, 67, 33, 25, 72, 73, 34, 12, 11, 8, 77, 65, 54, 72};
//
//        int[] arr1 = new int[]{29, 13, 55, 55};
//        LogUtil.d("::" + get(arr1));
//        new Leetcode394().test();
//        Object animValue = null;
//        float value = animValue == null ? 0f : (float) animValue;
//        LogUtil.d(value);
//        LogUtil.d((float)animValue);
//        new Package01().test();
//        new Apple12().test();
//        new TextMutexCustom().test();
//        new TextPark().test();
//        new TestNumberIncrease().test();
//        new LeetCode49().test();
//        new LeetCode29().test();
        new LeetCode22().test();
    }

}
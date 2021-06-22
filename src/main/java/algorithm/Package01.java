package algorithm;

import util.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 我们有一个背包，背包总的承载重量是 Wkg。现在我们有 n 个物品，每个物品的重量不等，并且不可分割。我们现在期望选择几件物品，装载到背包中。在不超过背包所能装载重量的前提下，如何让背包中物品的总重量最大？
 */
public class Package01 implements ITestInterface {
    @Override
    public void test() {
        backTrace();
    }

    private void backTrace() {
        int weight = 100;
        int[] items = new int[]{20, 56, 10, 9, 28, 22, 19, 11, 11, 19, 9};
        trace(0, 0, weight, items, "");
    }

    private static int max = 0;

    private void trace(int i, int currWeight, int weight, int[] items, String tmp) {
        if (max < currWeight) {
            LogUtil.d("i:" + i + " currWeight:" + currWeight + " maxWeight:" + max + "  " + tmp);
            max = currWeight;
        }
        if (i == items.length) {
            LogUtil.d("i:" + i + " currWeight:" + currWeight + " maxWeight:" + max + "  " + tmp);
            return;
        }
        if (currWeight + items[i] > weight) {
            LogUtil.d("i:" + i + " currWeight:" + currWeight + " maxWeight:" + max + "  " + tmp);
            return;
        }
        trace(i + 1, currWeight, weight, items, tmp);
        tmp = tmp + items[i] + " ";
        trace(i + 1, currWeight + items[i], weight, items, tmp);
    }
}

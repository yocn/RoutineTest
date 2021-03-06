package algorithm;

import util.LogUtil;

import java.util.LinkedList;

public class JumpSkip {

    // 编号分别为1-108的108个人围成一个圈，这时候有一个徽章从1号手中开始传递，传递的逻辑是跳过右手边第一个人传递给右手边第二个人（即1号传递给3号，2号被调过），
    // 被调过的人从队伍中离开，请问最后剩下2个人的时候，徽章在几号的手上。

    public static void test() {
        skip();
    }

    public static class Bean {
        public int value;

        @Override
        public String toString() {
            return "" + value;
        }
    }

    public static void skip() {
        LinkedList<Bean> list = new LinkedList<>();
        for (int i = 1; i < 109; i++) {
            Bean bean = new Bean();
            bean.value = i;
            list.add(bean);
        }

        int index = 0;
        while (list.size() > 2) {
            int removeIndex = (index + 1) % list.size();
            LogUtil.d("removeIndex:" + removeIndex + "  remove:" + list.get(removeIndex).value + "   (index + 1):" + (index + 1));
            list.remove(removeIndex);
            if (index == list.size()) {
                index = (index) % list.size();
            } else {
                index = (index + 1) % list.size();
            }
            LogUtil.d("size:" + list.size() + "  当前:" + list.get(index).value + "   " + list.toString());
        }
    }
}

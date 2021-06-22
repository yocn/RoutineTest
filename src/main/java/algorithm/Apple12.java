package algorithm;

public class Apple12 {
    public void test() {
        eat(4, 0);
    }

    private void eat(int x, int day) {
        eatPerDay(x, 1, day);
        eatPerDay(x, 2, day);
    }

    private void eatPerDay(int left, int everyDay, int day) {
        left -= everyDay;
        if (left <= 0) {
            return;
        }
        eat(left, ++day);
    }

}

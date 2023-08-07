public class Container {
    private Integer count = 0;
    // Integer является объеком, следовательно по дефолту инициализируется как null, а значит ему просто нужно задать значение



    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}

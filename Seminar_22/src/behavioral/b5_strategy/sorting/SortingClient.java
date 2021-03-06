package behavioral.b5_strategy.sorting;

public class SortingClient {

    public static void main(String[] args) {
        double[] list = {1, 2.4, 7.9, 3.2, 1.2, 0.2, 10.2, 22.5, 19.6, 14, 12, 16, 17};
        SortingContext context = new SortingContext();

        context.setSorter(new QuickSort());
//        context.setSorter(new BubbleSort());

        context.sort(list);

        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

}

package by.sadovnick;

public class КвадратДвухНаибольшихЧиселВМассиве {
    public static void main(String[] args) {
        System.out.println(solution(6, 3, 2));
    }

    public static Integer solution(Integer a, Integer b, Integer c) {
        int[] array = new int[]{a, b, c};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max1) {
                max2 = max1;
                max1 = j;
            } else if (j > max2) {
                max2 = j;
            }
        }
        return (int) (Math.pow(max1, 2) + Math.pow(max2, 2));
    }
}

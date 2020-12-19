public class ArrayDemo {
    public static void main(String[] args) {
        int nums[] = new int[4];

        System.out.println("Initially by default value is " + nums[2]);

        nums[0] = 8;
        nums[1] = 12;
        nums[2] = 76;
        nums[3] = 54;
        System.out.println("Assigned value at index 2 is " + nums[2]);

        nums[2] = 99;

        System.out.println("Updated value at index 2 is " + nums[2]);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Below code will ArrayIndexOutOfBound Error
        // num[4] = 100;
        // System.out.println(nums[4]);
    }
}

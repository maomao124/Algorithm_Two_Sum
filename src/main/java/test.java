/**
 * Project name(项目名称)：算法_Two_Sum
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/12
 * Time(创建时间)： 21:29
 * Version(版本): 1.0
 * Description(描述)： 给定一个数组和一个目标和，从数组中找两个数字相加等于目标和，输出这两个数字的下标。
 */

public class test
{

    public int[] twoSum(int[] nums, int target)
    {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = (i + 1); j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        System.out.println("算法_Two_Sum");
        System.out.println("给定一个数组和一个目标和，从数组中找两个数字相加等于目标和，输出这两个数字的下标。");
        int nums[] = {2, 7, 11, 15};
        int target = 26;
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        test t = new test();
        int[] ans = t.twoSum(nums, target);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------

        System.out.println();
        test2.main(null);
        System.out.println();
        test3.main(null);
    }
}

import java.util.HashMap;
import java.util.Map;

/**
 * Project name(项目名称)：算法_Two_Sum
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/12
 * Time(创建时间)： 21:39
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test2
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++)
        {
            int sub = target - nums[i];
            if (map.containsKey(sub) && map.get(sub) != i)
            {
                return new int[]{i, map.get(sub)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args)
    {
        System.out.println("解法2：");
        int nums[] = {2, 7, 11, 15};
        int target = 26;
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        test2 t = new test2();
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
    }
}

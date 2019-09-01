/**
     * @Author jijl
     * @Description: 求100以内的质数
     * @Date 16:23 2018/9/19
     **/
public class ZhiShu100 {
    public static void main(String[] args) {
        //如果要求200以内的质数 将100改为两百即可
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            //每个数除以它之前的数，是否能整出
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;//可以省去，但是效率会下降
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
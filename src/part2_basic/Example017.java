package part2_basic;
/**
 * 
 * @ClassName: Example017 
 * @Description: 
 * @author: dong
 * @date: 2018年9月30日 下午2:28:04 
 * @keyword: 
 *
 */
public class Example017 {
    /**
     * 报数游戏，得到最后一个留下的人的原始位置
     * @param start 起始报数位置
     * @param total 总人数
     * @param number 所报的数
     * @return 最后一个留下的人的原始位置
     */
    public int getLastOne(int start, int total, int number) {
        int[] signArr = new int[total + 1]; // 标志数组
        int out = 0;    // 记录已退出人数
        for (int i = 0; i < signArr.length; i++) {
            signArr[i] = 1; // 全部就位
        }
        start--;    // 预备，下面从start位置开始
        while(out < total - 1) {    // 临界条件，最后两个人继续pick
            int currentNumber = 0;  // 当前所报的数
            while(currentNumber < number) {
                start ++;   // start指针
                if(start > total) {
                    start = 1;  // 重新回到原始起点
                }
                currentNumber += signArr[start];    // 报数+1
            }
            // 找到了这一轮该退出的一个
            signArr[start] = 0; // 标志退出
            out ++;
        }
        
        for (int i = 1; i < signArr.length; i++) {  // 返回最后一个没有报数的下标
            if(signArr[i] == 1) {
                return i;
            }
        }
        return 0;        
    }

    public static void main(String[] args) {

        Example017 ex17 = new Example017();
        System.out.println(ex17.getLastOne(83, 100, 10) + " 号，大吉大利，今晚吃鸡！");
        
    }

}

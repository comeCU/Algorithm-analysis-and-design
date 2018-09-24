package part2_basic;

import java.util.Stack;

/**
 * 
 * @ClassName: Example008 
 * @Description: 从“高位到低位”顺序输出整数各位数字
 * @author dong 
 * @date Sep 24, 2018 4:44:11 PM 
 * @keywords : 
 *
 */
public class Example008 {
    
    /**
     * answer 1 ： 循环
     * 从“高位到低位”顺序输出整数各位数字
     * @param n 正整数
     * @return stack 栈
     */
    /*public Stack<Integer> seqOutputInt(Integer n) {
        Stack<Integer> stack = new Stack<>();
        int temp = 0;
        while(n > 0) {
            temp = n % 10;
            stack.add(temp);
            n /= 10;
        }
        return stack;
    }
    
    *//**
     * 输出栈中元素
     * @param stack
     *//*
    public void printStackElements(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }*/
    
    /**
     * answer 2 : 递归  简单，可读性好
     * @param n 正整数
     */
    public void seqOutputInt(int n) {
        if(n < 10) {
            System.out.println(n);
        } else {
            seqOutputInt(n / 10);
            System.out.println(n % 10); // 输出操作是在回溯时完成
        }
    }
    
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Example008 ex008 = new Example008();
//        Stack<Integer> stack = ex008.seqOutputInt(12345);
//        ex008.printStackElements(stack);
        
        ex008.seqOutputInt(123545);
    }

}

package part2_basic;

import java.util.Stack;

/**
 * 
 * @ClassName: Example008 
 * @Description: �ӡ���λ����λ��˳�����������λ����
 * @author dong 
 * @date Sep 24, 2018 4:44:11 PM 
 * @keywords : 
 *
 */
public class Example008 {
    
    /**
     * answer 1 �� ѭ��
     * �ӡ���λ����λ��˳�����������λ����
     * @param n ������
     * @return stack ջ
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
     * ���ջ��Ԫ��
     * @param stack
     *//*
    public void printStackElements(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }*/
    
    /**
     * answer 2 : �ݹ�  �򵥣��ɶ��Ժ�
     * @param n ������
     */
    public void seqOutputInt(int n) {
        if(n < 10) {
            System.out.println(n);
        } else {
            seqOutputInt(n / 10);
            System.out.println(n % 10); // ����������ڻ���ʱ���
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

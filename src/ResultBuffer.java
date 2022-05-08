

import java.util.LinkedList;

public class ResultBuffer {    //结果缓冲建立
    final int maxBufferLength = 10;   //最大缓冲区长度
    int currentBufferLength = 0;      //当前缓冲区长度
    int pointer = -1;

    LinkedList<String> buffer = new LinkedList<>();

    public void addElement(String ele) {   //附加元素
        buffer.addFirst(ele);
        if (currentBufferLength < maxBufferLength) {
            currentBufferLength++;
        } else {
            buffer.removeLast(); //删除选项
        }
    }

    public String getElement() {     //获得要素
        return buffer.get(pointer);  //返回获取point值
    }

    public void increasePointer() {
        pointer = (pointer + 1) % currentBufferLength;
    }

    public void resetPointer() {
        pointer = 0;
    }
}

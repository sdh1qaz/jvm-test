package com.sudenghui.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName： HeapOOM
 * @Author: dhSu
 * @Description: java堆内存溢出异常测试
 * @Date:Created in 2018年3月18日
 */

public class HeapOOM {
	
    static class OOMObject{}
    
    public static void main(String[] args) {
    	List<OOMObject> list = new ArrayList<OOMObject>();
    	while(true) {
    		list.add(new OOMObject());
    		/*try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
    	}
    }
}

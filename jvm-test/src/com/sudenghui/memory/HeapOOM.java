package com.sudenghui.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName�� HeapOOM
 * @Author: dhSu
 * @Description: java���ڴ�����쳣����
 * @Date:Created in 2018��3��18��
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

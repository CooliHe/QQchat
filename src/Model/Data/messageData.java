package Model.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 *������Ϣ���������ѵĺ����ֵģ������ݹ�����
 */
    public class messageData {
	    public static Vector<Vector<String>> msg = new Vector<>(); //������Ϣ
        public static Map<String,Vector<String>> msgMap = new HashMap<>(); //���������Ϣ
        public static Vector<String> account = new Vector<>();  //��������˺�
        public static Map<String,Integer> msgTip = new HashMap<>(); //������Ϣ��ʾ����Ϣ����
}

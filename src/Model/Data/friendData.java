package Model.Data;

/**
 *�����б��������
 */
public class friendData {
	private String head; //����ͷ��
    private String account; //�����˺�

    /**
     * friendData�Ĺ��캯��
     * @param head
     * @param account
     */
    public friendData(String head,String account){
        this.head = head;
        this.account = account;
    }

    /**
     * friendData��set��get����
     */
    public void setHead(String head){
        this.head = head;
    }
    public void setAccount(String account){
        this.account = account;
    }
    public String getHead(){
        return head;
    }
    public String getAccount(){
        return account;
    }
}

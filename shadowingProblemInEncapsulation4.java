class Customer4
{
	private int cId;
	private String cName;
	private long cPhNo;
	public void setData(int cId,String cName, long cPhNo)
	{
		cId=cId;
		cName=cName;
		cPhNo=cPhNo;
	}
	public int getId()
	{
		return cId;
	}
	public String getName()
	{
		return cName;
	}
	public long getPhNo()
	{
		return cPhNo;
	}
}
public class shadowingProblemInEncapsulation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer4 c4=new Customer4();
		c4.setData(1, "ravi", 937028272L);
		System.out.println(c4.getId());
		System.out.println(c4.getName());
		System.out.println(c4.getPhNo());

	}

}

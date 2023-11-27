class Customer6
{
	private int cId;
	private String cName;
	private long cPhNo;
	public Customer6(int cId,String cName, long cPhNo)
	{
		this.cId=cId;
		this.cName=cName;
		this.cPhNo=cPhNo;
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
public class constructorInEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer6 c=new Customer6(2,"rajiv",8966686893L);
		//c.setData(1, "ravi", 937028272L);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPhNo());

	}

}

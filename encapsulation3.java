class Customer
{
	private int customerId;
	private String customerName;
	private long customerPhNo;
	public void setData(int x,String y, long z)
	{
		customerId=x;
		customerName=y;
		customerPhNo=z;
	}
	public int getId()
	{
		return customerId;
	}
	public String getName()
	{
		return customerName;
	}
	public long getPhNo()
	{
		return customerPhNo;
	}
}
public class encapsulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.setData(1, "Ravi", 7696932082L);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPhNo());
	}

}

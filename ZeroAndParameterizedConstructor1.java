class Customer7
{
	private int cId;
	private String cName;
	private long cPhNo;
	public Customer7()
	{
		cId=6;
		cName="Raju";
		cPhNo=877392020L;
	}
	public Customer7(int cId,String cName, long cPhNo)
	{
		this();
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
public class ZeroAndParameterizedConstructor1 {

	public static void main(String[] args) {
		Customer7 c = new Customer7(1,"alex",987654321L);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPhNo());
		

	}

}

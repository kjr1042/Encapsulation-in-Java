class Customer9
{
	private int cId;
	private String cName;
	private long cPhNo;
	public Customer9()
	{
		cId=9;
		cName="James";
		cPhNo=908686896L;
	}
	public Customer9(String cName)
	{
		this();
		this.cName=cName;
	}
	public Customer9(int cId, String cName, long cPhNo)
	{
		this(cName);
		/*this.cId=cId;
		this.cName=cName;
		this.cPhNo=cPhNo;*/
		
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
public class ZeroAndParameterizedConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer9 c=new Customer9(5,"Arul",87697870L);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPhNo());

	}

}

class Customer5
{
	private int cId;
	private String cName;
	private long cPhNo;
	public void setData(int cId,String cName, long cPhNo)
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
public class solvingShadowingProblemInEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer5 c5=new Customer5();
		c5.setData(1, "ramu", 9370282782L);
		System.out.println(c5.getId());
		System.out.println(c5.getName());
		System.out.println(c5.getPhNo());

	}

}

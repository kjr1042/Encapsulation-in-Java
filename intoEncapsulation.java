class BankAccount
{
	private int bal;
	
	public void setData(int a)
	{
		bal=a;
	}
	
	public int getData()
	{
		return bal;
	}
	
}
public class intoEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		ba.setData(20000);
		System.out.println(ba.getData());

	}

}

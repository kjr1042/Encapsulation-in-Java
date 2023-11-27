//In previous case we have option to add Negative values
// To overcome this i.e Adding only Positive values

class BankAccount1
{
	private float bal;
	public void setData(float x)
	{
		if(x>0)
		{
			bal = x;
		}
	}
	public float getData()
	{
		return bal;
	}
}
public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount1 ba = new BankAccount1();
		ba.setData(3500);
		System.out.println(ba.getData());

	}

}

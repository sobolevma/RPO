
public class Primes {
	
//����� �����������
public static void main(String[] args) 
{
	int n = 2;
	while(n<100)
	{
		if(isPrime(n))System.out.println(n);
		n++;
	}
}
//����� ������� �����
public static boolean isPrime(int numb)
{
	for(int i=2;i<=numb-1; i++)	
	{
		if(numb%i==0) return false;
	}
		
	return true;
}
}

public class Manager {
	
	CalculService calculService;
	
public Manager() {
		super();
	}

public int calculAchat(int prix, int ref) {
	
	if (ref !=0 && prix !=0)
return prix + 10;
	else if (ref !=0 && prix ==0)
		return 1;
	else
		return 0;
	
}

public int action(int x, int y) {
	
if (x==0)
throw new ArithmeticException();

return (x+y)/x;

}

public int calculAchatSolde(int prix,int pourcentage) {

	return action(calculService.solde(prix,pourcentage), calculService.solde(prix,pourcentage));

}

}

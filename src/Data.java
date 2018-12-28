
public class Data {

	private int chievre ; 
	private int loup ; 
	private int chou ; 
	private int man ; 
	
	public Data(int c,int l,int ch,int m) {
		this.chievre = c ; 
		this.loup = l ; 
		this.man = m ; 
		this.chou = ch ; 
	}
	public Boolean isValide() {
		if(chievre == 1 && chou == 1 && man == 0) {
			return false ; 
		}
		if(chievre == 0 && chou == 0 && man == 1) {
			return false ; 
		}
		if(chievre == 0 && loup == 0 && man == 1) {
			return false ; 
		}
		if(chievre == 1 && loup == 1 && man == 0) {
			return false ; 
		}
		return true ; 
	}
	public String toString() {
		return "(chievre,loup,chou,man) : ("+chievre+","+loup+","+chou+","+man+")" ;
	}
}

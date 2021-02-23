public ​​class ​​Contains​ {
    public​​ static ​​void ​main​(​String​[] ​args​) {

        int​[] ​num​ = [​1​, ​2​, ​3​, ​4​, ​5​];​
        int​​ toFind​ = ​3​;​
        boolean​​ found​ = False;​

        for​ (​int n​​:​ num) {​
		if​ (n == toFind) {
            		found = ​true​;​
			break;
		}       
	}​
		if​(found){
			​System.out.print​(toFind ​+ " is found."​);​
		else​
			System.out.print​(toFind + ​" is not found."​);    
	}
}
public​​class​​Contains​ {
    public​​ static ​​int ​main​(​String​[] ​args​) {

        int​[] ​num​ = [​1​, ​2​, ​3​, ​4​, ​5​];​
        int​​ toFind​ = ​3​;​
        boolean​​ found​ = ​True​;​

        for​ (​n​​:​ num) {​
		if​ (n == toFind) {
            		found = ​true​;​
			break
		}       
	}​
		if​(found){
			​print​(toFind ​" is found."​);​
		else​
			print​(toFind + ​" is not found."​);    
	}
}
class Main {
  public static void main(String[] args) {
    /* leave this main method blank but feel free to uncomment below lines 
    to test your code */
    System.out.println(isBalanced(")(") );

  }
  
    public static boolean isBalanced(String parantheses){
    int paraCount = 0;
    boolean balance = true;
    for(int i = 0; i < parantheses.length(); i++) {
    	if (parantheses.charAt(i)=='(') {
    		paraCount ++;
    	} else if(parantheses.charAt(i)==')'&& paraCount!=0) {
    		paraCount --;
    	} else if(parantheses.charAt(i)==')'&& paraCount==0){
    	  return false;
    	}
    	if (paraCount!=0) {
    		balance = false;
    	}else {
    		balance = true;
    	}
    }
    return balance;
  }
}
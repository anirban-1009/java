//the return type 2

class ex37{
	public static void main(String[ ] args){
		int res = max(7,42);
		System.out.println(res);
	}

	static int max(int a, int b){
		if(a > b){
			return a;
		}
		else{
			return b;
		}
	}
}
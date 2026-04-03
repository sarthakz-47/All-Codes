package DSA.Backtracking;
class FindSubsets{
    
    public static void findSubsets(String str, String ans, int i){
        // Base Class:
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        
        // Recursive Function:
        // If char at i says yes:
        findSubsets(str,ans+str.charAt(i),i+1);
        // If char at i says no:
        findSubsets(str,ans,i+1);
    }

	public static void main(String[] args){
        findSubsets("abc","",0);
	}
}
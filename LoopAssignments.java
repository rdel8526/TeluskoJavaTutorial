public class LoopAssignments {
	public static void main(String []args){
	
	for(int i = 1; i<=6; i++) {
		for(int j = 1; j <= i; j++) {
			System.out.print(j + " ");
		} System.out.println();
	}
	
	for(int q = 65; q <= 70; q++){
            for(int w = 65; w <= q; w++) {
                char ch = (char)w;
                System.out.print(ch + " ");
            } System.out.println();
	
	for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j ++) {
                if(i == 1 || i == 4 || j == 1 || j == 4) { 
                    System.out.print("*");
                }
                else {   
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
}

package String;

public class GymMembership {
    public static void main(String[] args) {
        String[][] Transaction={{"A","B","100","500"},{"A","B","120","200"},{"A","B","180","190"}};
        System.out.println(Transaction[1].length);
        for(int i=0;i<Transaction.length;i++){
            for(int j=0;j<2;j++){
                if(Transaction[i++][j]==(Transaction[i--][j])|| Integer.parseInt(Transaction[i][3])-Integer.parseInt(Transaction[i][2])<60){
                    System.out.println("Contains Duplicate");
                }
                //System.out.println(Integer.parseInt(Transaction[i][3])-Integer.parseInt(Transaction[i][2]));    
               
            }
        }
    }
}

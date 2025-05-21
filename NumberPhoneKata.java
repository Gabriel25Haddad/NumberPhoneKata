package Create_Phone_Number;

public class NumberPhoneKata{   
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,0};//Array de 10 números


        //Convertar os numero para String e formatar a impressão
        String convert= String.format("(%d%d%d) %d%d%d-%d%d%d%d", 
        num[0],num[1],num[2], //DDD
        num[3], num[4], num[5], //Primeira parte
        num[6], num[7], num[8], num[9]); //Segunda parte

        System.out.println(convert);

    }
} 

package com.chinasoft.utils;



public class TestPassword {
    private String a;

    private String[] arr = {
            "1","2","3","4","5","6","7","8","9"
            ,"1","2","3","4","5","6","7","8","9"
            ,"1","2","3","4","5","6","7","8","9"
            ,"1","2","3","4","5","6","7","8","9"
            ,"1","2","3","4","5","6","7","8","9"
            ,"1","2","3","4","5","6","7","8","9"
    };

    public void test(){

        count();

    }

    private void count() {
        int b = 6;
        for (int i = 0; i < 14000; i++) {
            //bz、rz、fz,任选其二，210步复原，全选252步复原
            //bnz、rnz、fnz,任选其二，210步复原，全选252步复原
            //bz、rz、fz、bnz、rnz、fnz,任选其四，420步复原，任选其五，90步复原，全选1404步复原

            //开始打乱数组
            if(i%b == 0){
                bz();
            }else if(i%b == 1){
                rz();
            }else if(i%b == 2){
                fz();
            }else if(i%b == 3){
                bnz();
            }else if(i%b == 4){
                rnz();
            } else if(i%b == 5){
                fnz();
            }

            //检验数组何时复原
            if (
                    (arr[0]=="1")&&(arr[8]=="9")&&(arr[5]=="6")&&(arr[19]=="2")
                            &&(arr[28]=="2")&&(arr[42]=="7")&&(arr[17]=="9")&&(arr[32]=="6")
                            &&(arr[24]=="7")&&(arr[46]=="2")&&(arr[16]=="8")&&(arr[27]=="1")
            ){
                System.out.println(i+1);
                break;
            }
        }
        //检验数组
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[count]+" ");
                count++;
            }
            System.out.println();
        }
    }



    //顶层顺时针
    private void bz() {
        a = arr[9];arr[9] = arr[15];arr[15] = arr[17];arr[17] = arr[11];arr[11] = a;
        a = arr[10];arr[10] = arr[12];arr[12] = arr[16];arr[16] = arr[14];arr[14] = a;

        a = arr[18];arr[18] = arr[27];arr[27] = arr[36];arr[36] = arr[45];arr[45] = a;
        a = arr[19];arr[19] = arr[28];arr[28] = arr[37];arr[37] = arr[46];arr[46] = a;
        a = arr[20];arr[20] = arr[29];arr[29] = arr[38];arr[38] = arr[47];arr[47] = a;
    }
    //顶层逆时针
    private void bnz() {
        a = arr[9];arr[9] = arr[11];arr[11] = arr[17];arr[17] = arr[15];arr[15] = a;
        a = arr[10];arr[10] = arr[14];arr[14] = arr[16];arr[16] = arr[12];arr[12] = a;

        a = arr[18];arr[18] = arr[45];arr[45] = arr[36];arr[36] = arr[27];arr[27] = a;
        a = arr[19];arr[19] = arr[46];arr[46] = arr[37];arr[37] = arr[28];arr[28] = a;
        a = arr[20];arr[20] = arr[47];arr[47] = arr[38];arr[38] = arr[29];arr[29] = a;
    }

    //右边顺时针
    private void rz() {
        a = arr[36];arr[36] = arr[42];arr[42] = arr[44];arr[44] = arr[38];arr[38] = a;
        a = arr[37];arr[37] = arr[39];arr[39] = arr[43];arr[43] = arr[41];arr[41] = a;

        a = arr[2];arr[2] = arr[51];arr[51] = arr[11];arr[11] = arr[29];arr[29] = a;
        a = arr[5];arr[5] = arr[48];arr[48] = arr[14];arr[14] = arr[32];arr[32] = a;
        a = arr[8];arr[8] = arr[45];arr[45] = arr[17];arr[17] = arr[35];arr[35] = a;
    }
    //右边逆时针
    private void rnz() {
        a = arr[36];arr[36] = arr[38];arr[38] = arr[44];arr[44] = arr[42];arr[42] = a;
        a = arr[37];arr[37] = arr[41];arr[41] = arr[43];arr[43] = arr[39];arr[39] = a;

        a = arr[2];arr[2] = arr[29];arr[29] = arr[11];arr[11] = arr[51];arr[51] = a;
        a = arr[5];arr[5] = arr[32];arr[32] = arr[14];arr[14] = arr[48];arr[48] = a;
        a = arr[8];arr[8] = arr[35];arr[35] = arr[17];arr[17] = arr[45];arr[45] = a;
    }
    //前面顺时针
    private void fz() {
        a = arr[27];arr[27] = arr[33];arr[33] = arr[35];arr[35] = arr[29];arr[29] = a;
        a = arr[28];arr[28] = arr[30];arr[30] = arr[34];arr[34] = arr[32];arr[32] = a;

        a = arr[20];arr[20] = arr[0];arr[0] = arr[42];arr[42] = arr[17];arr[17] = a;
        a = arr[23];arr[23] = arr[1];arr[1] = arr[39];arr[39] = arr[16];arr[16] = a;
        a = arr[26];arr[26] = arr[2];arr[2] = arr[36];arr[36] = arr[15];arr[15] = a;
    }
    //前面逆时针
    private void fnz() {
        a = arr[27];arr[27] = arr[29];arr[29] = arr[35];arr[35] = arr[33];arr[33] = a;
        a = arr[28];arr[28] = arr[30];arr[30] = arr[34];arr[34] = arr[32];arr[32] = a;

        a = arr[20];arr[20] = arr[17];arr[17] = arr[42];arr[42] = arr[0];arr[0] = a;
        a = arr[23];arr[23] = arr[16];arr[16] = arr[39];arr[39] = arr[1];arr[1] = a;
        a = arr[26];arr[26] = arr[15];arr[15] = arr[36];arr[36] = arr[2];arr[2] = a;
    }
}
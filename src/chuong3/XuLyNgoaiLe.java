/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong3;

import java.util.Scanner;

/**
 *
 * @author ngodinhtri
 * @date 12-11-2020
 * @viết xử lý ngoại lệ cho các bài tập trước.
 */
public class XuLyNgoaiLe {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k =0;
        
        boolean check = false;
        //Bắt lỗi nhập vào
        while (!check){
            System.out.print("Nhập số k: ");
            try {               
                k = input.nextInt();                         
            } catch (Exception e) {
                System.out.println("Xin nhập số nguyên từ [2-9]. Nhập lại!");
                input.nextLine();
            }
            
            if( k >=2 && k<=9)
            {
                check = true;
            }
            else{
                System.out.println("Nhập số từ 2 - 9");
            }
        }
        
        //In bảng cửu chương số k
        System.out.print("===BẢNG CỬU CHƯƠNG SỐ "+ k + "===\n");
        for(int i =1; i<=10;i++)
        {
            System.out.printf("%d * %d = %d\n",i,k,i*k);
        }
        
        //In bảng cửu chương số từ 2 - 9
        System.out.print("===BẢNG CỬU CHƯƠNG 2 - 9===\n");
        for(int i =1; i<=10;i++) //Lặp theo cột dọc (1 - 10)
        {
            for(int j=2;j<=9;j++) //Lặp theo hàng ngang (2 - 9)
            {
                if(j==9) //Nếu là 9 thì in kết quả sau đó xuống hàng
                {
                    System.out.printf("%d * %d = %d\n",j,i,i*j);
                    break;
                }
                System.out.printf("%d * %d = %d\t",j,i,i*j); // In phép tính nhân từ 2 - 9 với i từ trái qua.
            }
        }
    }
}


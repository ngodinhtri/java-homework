/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ngodi
 */
public class BoBai {
   private ArrayList<LaBai> bobai = new ArrayList<LaBai>(52);

    public BoBai() {
        //Lặp thứ tự
        for(int i = 2; i<=14;i++)
        {
            //Lặp loại
            for(int j = 1; j<=4;j++)
            {
                bobai.add(new LaBai(j, i));
            }
        }
    }

    @Override
    public String toString() {
        String sResult = "";
        
        for(LaBai lb : bobai)
        {
            if(lb == bobai.get(bobai.size()-1))
            {
                sResult+=lb.toString();
            }
            else{
                sResult+=lb.toString()+" -- ";
            }
        }
        return sResult;
    }
    
    public void tronBai()
    {
        Collections.shuffle(bobai);
    }
    
    public void sapXepTheoThuTuRoiLoai()
    {
        Collections.sort(bobai, new XepLaBaiTheoThuTu());
    }
    
    public void sapXepTheoLoaiRoiThuTu()
    {
        Collections.sort(bobai, new XepLaBaiTheoLoai());
    }
}

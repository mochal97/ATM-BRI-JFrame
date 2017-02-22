
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mochammad Alauddin
 */
class transfer {
    private int saldo;
    public void ambil (int tab, int t){
        if (t%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \n Silahkan ulangi lagi","Transfer Gagal", 0);
        else {
            if (t>tab)
                JOptionPane.showMessageDialog(null,"Saldo Anda tidak mencukupi \n Silahkan lakukan penyetoran","Transfer gagal",0);
            else if (t<10000)
                JOptionPane.showMessageDialog(null,"Besaran minimal transfer tunai adalah  Rp.10000", "Transaksi gagal", 0);
            else {
                saldo = tab-t;
                JOptionPane.showMessageDialog(null,"Anda berhasil transfer sebesar = "+t+"\nSaldo Anda saat ini sebesar = "+saldo,"CAUTION",2);
            }
        }
        
}
    public int getsaldo(){
    return saldo;
}
}

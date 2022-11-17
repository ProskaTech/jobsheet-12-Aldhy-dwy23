package L1_inheritance;
// Created by 21343017_Aldhy
public class rodaEmpat extends kendaraan{
    double NaikHargake=8;
    void hargaAkhir(){
        hargaDasar=hargaDasar+(hargaDasar+NaikHargake);
        System.out.println("seetlah di modifikasi ,harga mobil menjadi Rp. "+hargaDasar);
    }
}

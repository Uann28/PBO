
public class balikModal {

    private int modalAwal;
    private int keuntunganPerBulan;

    public balikModal(int modalAwal, int keuntunganPerBulan) {
        this.modalAwal = modalAwal;
        this.keuntunganPerBulan = keuntunganPerBulan;
    }

    public int hitungBalikModal() {
        int total = 0;
        int bulan = 0;

        while (total < modalAwal) {
            bulan++;
            total += keuntunganPerBulan;
        }

        return bulan;
    }

}

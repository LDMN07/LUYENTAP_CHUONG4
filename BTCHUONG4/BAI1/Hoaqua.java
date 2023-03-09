public class HoaQua {
   private double canNang;
   private String nguonGoc;
   private String ngayNhap;
   private int soLuong;

   public HoaQua(double canNang, String nguonGoc, String ngayNhap, int soLuong) {
      this.canNang = canNang;
      this.nguonGoc = nguonGoc;
      this.ngayNhap = ngayNhap;
      this.soLuong = soLuong;
   }
   public double getCanNang() {
      return canNang;
   }
   public void setCanNang(double canNang) {
      this.canNang = canNang;
   }

   public String getNguonGoc() {
      return nguonGoc;
   }
   public void setNguonGoc(String nguonGoc) {
      this.nguonGoc = nguonGoc;
   }

   public String getNgayNhap() {
      return ngayNhap;
   }
   public void setNgayNhap(String ngayNhap) {
      this.ngayNhap = ngayNhap;
   }

   public int getSoLuong() {
      return soLuong;
   }
   public void setSoLuong(int soLuong) {
      this.soLuong = soLuong;
   }
}
public class QuaCam extends HoaQua {
   private String mauSac;

   public QuaCam(double canNang, String nguonGoc, String ngayNhap, int soLuong, String mauSac) {
      super(canNang, nguonGoc, ngayNhap, soLuong);
      this.mauSac = mauSac;
   }
   public String getMauSac() {
      return mauSac;
   }
   public void setMauSac(String mauSac) {
      this.mauSac = mauSac;
   }
}
public class QuaTao extends HoaQua {
   private String loaiTao;

   public QuaTao(double canNang, String nguonGoc, String ngayNhap, int soLuong, String loaiTao) {
      super(canNang, nguonGoc, ngayNhap, soLuong);
      this.loaiTao = loaiTao;
   }
   public String getLoaiTao() {
      return loaiTao;
   }
   public void setLoaiTao(String loaiTao) {
      this.loaiTao = loaiTao;
   }
}
public class CamCaoPhong extends QuaCam {
   private boolean coHat;

   public CamCaoPhong(double canNang, String nguonGoc, String ngayNhap, int soLuong, String mauSac, boolean coHat) {
      super(canNang, nguonGoc, ngayNhap, soLuong, mauSac);
      this.coHat = coHat;
   }
   public boolean isCoHat() {
      return coHat;
   }
   public void setCoHat(boolean coHat) {
      this.coHat = coHat;
   }
}
public class CamSanh extends QuaCam {
   private String doNgot;

   public CamSanh(double canNang, String nguonGoc, String ngayNhap, int soLuong, String mauSac, String doNgot) {
      super(canNang, nguonGoc, ngayNhap, soLuong, mauSac);
      this.doNgot = doNgot;
   }
   public String getDoNgot() {
      return doNgot;
   }
   public void setDoNgot(String doNgot) {
      this.doNgot = doNgot;
   }
}
class Main {
    public static void main(String [] args){
    }
}
public class SoalArray3 {
    public static void main(String[] args) {
        String hewan[]={"ikan","musang","jerapah","hiu","ular","burung","sapi"};
        System.out.println("nama hewan memiliki  nama lebih dari 4 huruf:");

        //menampilkan hewan yang memiliki nama lebih dari 4 huruf
        for (int i = 0; i < hewan.length; i++) {
            if (hewan[i].length() > 4) {
                System.out.println(hewan[i]);
            }
     
        }
    }
}

public class SoalArray2 {
    public static void main(String[] args) {
        String mataPelajaran[] = new String[6];
        mataPelajaran[0] = "Matematika";
        mataPelajaran[1] = "Bahasa Indonesia";
        mataPelajaran[2] = "Bahasa Inggris";
        mataPelajaran[3] = "Fisika";
        mataPelajaran[4] = "Kimia";
        mataPelajaran[5] = "Biologi";

        System.out.println("Daftar Mata Pelajaran:");
        for (int i = 0; i < mataPelajaran.length; i++) {
            System.out.println((i + 1) + ". " + mataPelajaran[i]);
        }
    }
}

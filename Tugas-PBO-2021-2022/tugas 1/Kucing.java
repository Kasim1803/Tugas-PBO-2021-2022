class Kucing{
private static String jenis_hewan = "kucing";
private static int jumlah_kaki = 4;
private static String warna_hewan = "hitam";

public static String getJenisHewan(){
	return jenis_hewan;
}

public static int getJumlahKaki() {
	return jumlah_kaki;
}

public static String getWarnaHewan() {
	return warna_hewan;
}

private static void mengeong() {
	System.out.println("aku mengeong");
}

private static void melompat() {
	System.out.println("aku melompat");
}

private static void berlari() {
	System.out.println("aku berlari");
}

public static void main(String[]args) {
System.out.println(String.format("jenis hewan: %s", getJenisHewan()));

System.out.println(String.format("jumlah kaki: %s", getJumlahKaki()));

System.out.println(String.format("warna hewan: %s", getWarnaHewan()));

mengeong();
melompat();
berlari();
}
}

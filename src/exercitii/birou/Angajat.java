package exercitii.birou;

/**
 * Created by hp on 24.08.2017.
 */
public class Angajat {
        public String nume;
        private int CNP;
        private String adresa;
        private int salariu;



        public Angajat(String nume, int CNP, String adresa, int salariu) {
            this.nume = nume;
            this.CNP = CNP;
            this.adresa = adresa;
            this.salariu = salariu;
        }
        public void schimbaSalariu(int salariuNou) {
            this.salariu = salariuNou;
        }
        public void schimbaAdresa(String adresaNoua) {
            this.adresa = adresaNoua;
        }
        public void salariuAnual() {
            System.out.println("Salariul anual este " + this.salariu *12);
        }
        public void Informatii() {
            System.out.println("Numele este " + nume);
            System.out.println("CNP este " + CNP);
            System.out.println("Adresa este " + adresa);
            System.out.println("Salariul este " + salariu);
        }
}

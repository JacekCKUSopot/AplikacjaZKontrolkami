import javax.swing.*;
import java.awt.FlowLayout;

public class AplikacjaZKontrolkami {
    public static void main(String[] args) {
        JFrame ramka = new JFrame("Panel logowania");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 1. Tworzenie kontenera pośredniego JPanel
        JPanel panel = new JPanel();
        // FlowLayout jest domyślny dla JPanel
        panel.setLayout(new FlowLayout());
        // 2. Tworzenie i konfiguracja komponentów
        JLabel etykieta = new JLabel("Wprowadź imię:");
        JTextField poleTekstowe = new JTextField(15); // 15 kolumn szerokości
        JButton przycisk = new JButton("Zatwierdź");
        // 3. Dodawanie komponentów do Panelu
        panel.add(etykieta);
        panel.add(poleTekstowe);
        panel.add(przycisk);
        // 4. Dodanie Panelu do ramki
        ramka.add(panel);
        // 5. Dopasowanie rozmiaru ramki do komponentów
        ramka.pack();
        // 6. Wyśrodkowanie i widoczność
        ramka.setLocationRelativeTo(null);
        ramka.setVisible(true);
    }
}
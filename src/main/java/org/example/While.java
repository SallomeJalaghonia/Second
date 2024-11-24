package org.example;
// მეორე დავალება
public class While {
    public static void main(String[] args) {
        String s ="I love jazz ";
        int i = 3; // საწყისი ინდექსი, რათა დაბეჭდოს ყოველი მე-3
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            if (currentChar == 'z') { // შეამოწმე თუ z-ასოა ყოველი მესამე სიმბოლოდან რომელიმე
                break; // შეწყდება ციკლი
            }
            System.out.println(currentChar);
            i = i + 3; // გადავიდეს ყოველ მესამე სიმბოლოზე
        }
    }
}


/*
* HSG THPT Hải Phòng 2023 - Bài 2
*
*  Cho xâu kí tự
 chỉ bao gồm các ký tự chữ cái Latin in thường và ký tự chữ số. Viết chương trình đếm số lượng ký tự chữ số trong xâu
.
* Input
    Gồm 1 dòng duy nhất chứa xâu ký tự Độ dài xâu không vượt quá ký tự.

  Output
    Gồm một số nguyên duy nhất là số lượng ký tự chữ số trong xâu
.
* */

import java.util.Scanner;

public class hp_thpt_23_b {
    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = countDigits(str);
        System.out.println(count);
        scanner.close();
    }
}

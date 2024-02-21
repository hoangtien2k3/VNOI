/*
* HSG THPT Hải Phòng 2021 - Bài 1

    *
    * An soạn thảo văn bản chỉ gồm các chữ cái Latin không dấu sau đó lưu lại.
    * Sau vài ngày mở ra thì An phát hiện văn bản đã soạn không còn nguyên vẹn do virus
    * hoặc nguyên nhân nào đó. Lỗi bị chèn vào là các kí tự đặc biệt khác (không phải chữ cái Latin),
    * An rất tiếc công nên đã xóa các ký tự bị chèn vào theo cách thủ công nên mất thời gian,
    * dễ nhầm lẫn. An được biết trong tin học lập trình có thể thực hiện việc này rất nhanh và chính xác.

    Em hãy giúp An phục hồi lại văn bản ban đầu.
    *
    *
    Input
        Gồm một dòng chứa xâu
         cần phục hồi (độ dài xâu không quá
         ký tự gồm các chữ cái Latin, chữ số, dấu cách trống và ký tự đặc biệt).

    Output
        Gồm một dòng, in ra xâu đã phục hồi.
 * */

import java.util.Scanner;

public class hp_thpt_21_a {
    public static String restoreText(String text) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String result = restoreText(inputText);
        System.out.println(result);
        scanner.close();
    }
}

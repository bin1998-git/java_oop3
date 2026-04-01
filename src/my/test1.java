package my;

import java.util.Scanner;



   import java.util.Scanner;

    public class test1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final int PRICE_PER_CUP = 2500; // 아메리카노 단가

            int quantity = 0;

            // ✅ 요구사항 3: 예외 처리 - 0 또는 음수 입력 시 재입력
            while (true) {
                System.out.print("아메리카노 수량을 입력하세요: ");
                quantity = scanner.nextInt();

                if (quantity <= 0) {
                    System.out.println("⚠ 1잔 이상 주문해야 합니다.");
                } else {
                    break; // 유효한 값이면 루프 탈출
                }
            }

            // ✅ 요구사항 1 & 2: 총 금액 계산 및 출력
            int totalPrice = quantity * PRICE_PER_CUP;
            System.out.println("────────────────────────");
            System.out.println("주문 수량 : " + quantity + "잔");
            System.out.println("총  금액 : " + totalPrice + "원");
            System.out.println("────────────────────────");

            // ✅ 요구사항 2: 3잔 이상 시 이중 for문으로 3×3 스탬프 출력
            if (quantity >= 3) {
                System.out.println("★ 특별 스탬프가 발행되었습니다! ★");
                for (int i = 0; i < 3; i++) {       // 행 반복 (3번)
                    for (int j = 0; j < 3; j++) {   // 열 반복 (3번)
                        System.out.print("* ");
                    }
                    System.out.println(); // 줄바꿈
                }
            }

            scanner.close();
        }

}

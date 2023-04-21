package org.example;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("1. 리뷰 작성\n2. 종료");
        System.out.println("-".repeat(30));
        String review = sc.nextLine().trim();

        while (true) {
            if (review.equals("종료")) {
                return;
            } else if (review.equals("리뷰 작성")) {
                System.out.println("-".repeat(30));
                System.out.printf("별점을 입력해주세요\n>>");
                int star = sc.nextInt();
                sc.nextLine();
                System.out.printf("영화에 대한 솔직한 평가를 남겨주세요\n(스포 입력시 내용은 비공개 처리될 수 있습니다.)\n>>");
                String text = sc.nextLine().trim();
                System.out.println("-".repeat(30));
                System.out.println("재관람 의사\n Y / N");
                String rewatch= sc.nextLine().trim();
                    if(rewatch.equalsIgnoreCase("Y")){
                        System.out.println("=재관람 의사가 있습니다.=\n작성하신 리뷰가 등록되었습니다.\n소중한 리뷰 감사합니다");
                        return;
                    }else{
                        System.out.println("=재관람 의사가 없습니다.=\n작성하신 리뷰가 등록되었습니다.\n소중한 리뷰 감사합니다");
                        return;
                    }
            }
        }
    }
}
package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		 // Dogクラスを呼び出して変数に代入
        Dog myDog = new Dog("犬", 1);

        // 動物の名前をコンソールに出力
        System.out.println("動物の名前は" + myDog.getName() + "です。");
    
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        System.out.println("動物の数は" + myDog.getNumberOfDogs() + "匹です。");
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
     // 現在の日時を取得
        LocalDateTime currentDateTime = LocalDateTime.now();

        // 日時を指定したフォーマットに変換
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        String formattedDateTime = currentDateTime.format(formatter);

        // コンソールに出力
        System.out.println("現在の日時: " + formattedDateTime);
	}
}
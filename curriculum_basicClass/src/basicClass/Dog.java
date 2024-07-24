package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
		 private String name; // 動物の名前を保持する変数
		 private int numberOfDogs; // 動物の数を保持する変数
		  
		    // 動物の名前を取得するメソッド
		    public String getName() {
		        return name;
		    }
		// Q2：フィールドに動物の数の変数を定義してください。
		 // 動物の数を取得するメソッド
		    public int getNumberOfDogs() {
		        return numberOfDogs;
		    }
		// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
		    public Dog() {
		        this.name = "犬";
		    }

		// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		    // 引数を代入するコンストラクタ
			 public Dog(String name, int numberOfDogs) {
			        this.name = name;
			        this.numberOfDogs = numberOfDogs;
			    }
	}

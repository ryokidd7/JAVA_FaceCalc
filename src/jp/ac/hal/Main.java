package jp.ac.hal;

//抽象クラス
abstract class Figure{
	abstract void area(); //これが面積
	abstract void around(); //これが外周

	void measure() {
		area();
		around();
		System.out.println();
	}
}

//抽象クラスのサブクラス
class Square extends Figure{
	double side;
	double height;

	Square(double s){ //コンストラクタ
		side = height = s;
	}

	Square(double s, double h){
		side = s;
		height = h;
	}

	void area(){ //抽象メソッドのオーバーライド
		System.out.println("四角の面積:"+ (side * height));
	}

	void around(){ //抽象メソッドのオーバーライド
		System.out.println("四角の外周:"+ (2 * (side * height)));
	}
}

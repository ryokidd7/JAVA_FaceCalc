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

//抽象クラスのサブクラス
class Circle extends Figure{
	final double pi = 3.14;
	double radius;

	Circle(double r){//コンストラクタ
		radius = r;
	}

	void area() { //抽象メソッドのオーバーライド
		System.out,println("円の面積:" + (radius * radius * pi));
	}

	void around() { //抽象メソッドのオーバーライド
		System.out,println("円の外周:" + (2 * radius * pi));
	}
}

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

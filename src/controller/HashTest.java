package controller;

import util.PasswordUtil;

public class HashTest {

	public static void main(String[] args) {

		// 入力されたパスワードを想定
		String pass01 = "password";
		String pass02 = "possword";

		// 入力されたユーザー名を想定
		String user01 = "ts0818";
		String user02 = "Larry Wall";

		// パスワード、ユーザーがともに同一のパターン
		String hashedPass01 = PasswordUtil.getHashedPassword(pass01, user01);
		String hashedPass02 = PasswordUtil.getHashedPassword(pass01, user01);
		System.out.println(hashedPass01);
		System.out.println(hashedPass02);

		// パスワード、または、ユーザーが違うパターン
		String hashedPass03 = PasswordUtil.getHashedPassword(pass01, user02);
		String hashedPass04 = PasswordUtil.getHashedPassword(pass02, user01);
		System.out.println(hashedPass03);
		System.out.println(hashedPass04);
	}
}

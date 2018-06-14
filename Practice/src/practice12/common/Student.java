/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 1受講生ID */
	private int studentId;

	/** 2受講生氏名 */
	private String studentName;

	/** 3会社名 */
	private String companyName;

	/** 4教室名 */
	private String className;

	/** 5メールアドレス */
	private String mail;

	/** 6パスワード */
	private String password;

	//	getter
	/** 1受講生ID */
	public int getStudentId() {
		return studentId;
	}

	/** 2受講生氏名 */
	public String getStudentName() {
		return studentName;
	}

	/** 3会社名 */
	public String getCompanyName() {
		return companyName;

	}

	/** 4教室名 */
	public String getClassName() {
		return className;
	}

	/** 5メールアドレス */
	public String getMail() {
		return mail;
	}

	/** 6パスワード */
	public String getPassword() {
		return password;
	}

	//	setter
	/** 1受講生ID */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/** 2受講生氏名 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;

	}



	/** 3会社名 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;

	}

	/** 4教室名 */
	public void setClassName(String className) {
		this.className = className;
	}

	/** 5メールアドレス */

	public void setMail(String mail) {
		this.mail = mail;
	}
	/** 6パスワード */
	public void setPassword(String password) {
		this.password=password;

	}
}

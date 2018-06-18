package practice13.common;

public class Employee extends Person{
	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */

	String  departmentNm;

	int departmentCnt;

	public String getDepartmentNm() {
		return departmentNm;
	}

	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}

	public int getDepartmentCnt() {
		return departmentCnt;
	}

	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}


	//書き加え＠tomita

	public String dispBookInfo() {
		StringBuilder str = new StringBuilder();
		str.append("ユーザーID  　：");
		str.append(super.userId);
		str.append("\n");
		str.append("ユーザー名  　：");
		str.append(super.userNm);
		str.append("\n");
		str.append("Mailアドレス　：");
		str.append(super.mail);

		str.append("\n");
		str.append("パスワード  　：");
		str.append(super.password);

		str.append("\n");
		str.append("部署名     　 ：");
		str.append(this.departmentNm);
		str.append("\n");
		str.append("部署人数　　　：");
		str.append(this.departmentCnt);


		return str.toString();
		}



}

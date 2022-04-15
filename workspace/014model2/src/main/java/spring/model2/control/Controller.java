package spring.model2.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* filename : controller.java
 * -controller ��ü�� �Ϲ���, ������ ����(Method)�� ����, �����ϴ� interface
 * - Controller ��ü�� Control ���� �����ϴ� ������, �ٽ��� ������ ����
 * - Servlet API �ٽ�, �ֿ��� ��ü HttpServletRequest/ HttpServletResponse ���ڷ� ���޹���
 */
public interface Controller {
	//=======================================
	//==>�߰��� �κ�
	//==> Model/ View �߻�ȭ, ĸ��ȭ�� ModelAndView ��ü return
	//=======================================
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException;
}
